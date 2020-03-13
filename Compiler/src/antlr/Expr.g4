grammar Expr;
/* The grammar name and file name must be the same*/

@header {
        package antlr;
}

// start variable
prog: (declaration | statement)+ EOF # Program
    ;

declaration: VARIABLE ID                   		# VariableDeclaration
    		| VARIABLE ID '=' ConstantValue  	# VariableInitializationConstant
    		| VARIABLE ID '=' ID 			 	# VariableInitializationID
    		;

statement: assertedConditional   	# AssertedConditionalStatement
		 | assignment				# AssignmentStatement
		 | conditional				# ConditionalStatement
		 ;

assertedConditional: 'if_require' '(' expression ')' conditional	'if_ensure' '(' expression ')' # ConditionalAssertionStatement
		;


// if and else statements can't have empty bodies
conditional: 'if' '(' logicalOp ')' '{' conditional '}'	elseIf							# IfElseIfConditional
		   | 'if' '(' logicalOp ')' '{' withElse '}' elseIf 'else' '{' conditional '}' 	# IfElseIfElseConditional
		   | assignment																	# IfElseAssignment
		   ;
		   
withElse: 'if' '(' logicalOp ')' '{' withElse '}' 'else' '{' withElse '}'  # WithElseConditional
	    | assignment													   # WithElseAssignment
	    ;

elseIf: 'else' 'if' '(' logicalOp ')' '{' assignment '}' elseIf		# ElseIfConditional
	  |  /* epsilon	*/								# EpsilonConditional
	  ;
	    
assignment: expression				# AssignExpression
		  | ID '=' expression  		# AssignAssignment
		  ;		 

expression: arithmeticOp			# ArithmeticOperation
		  | relationalOp			# RelationalOperation
		  | logicalOp				# LogicalOpteration
		  | '(' expression ')'		# ParanthesesExpression
		  ;

arithmeticOp: arithmeticOp '*' arithmeticOp		# MultiplicationArithmetic
			| arithmeticOp '/' arithmeticOp		# DivisionArithmetic
			| arithmeticOp '%' arithmeticOp		# ModuloArithmetic 
			| arithmeticOp '+' arithmeticOp 	# AdditionArithmetic
			| arithmeticOp '-' arithmeticOp		# SubtractionArithmetic
			| ID								# VariableArithmetic
			| IntConstant						# IntegerConstant
			| '-' IntConstant					# NegativeIntegerConstant
			;
			
relationalOp: arithmeticOp '<' arithmeticOp			# LessRelational
			| arithmeticOp '<=' arithmeticOp		# LessEqualRelational
			| arithmeticOp '>' arithmeticOp			# GreaterRelational 
			| arithmeticOp '>=' arithmeticOp		# GreaterEqualRelational 
			| arithmeticOp '==' arithmeticOp		# EqualityRelational
			| arithmeticOp '!=' arithmeticOp		# InequivalenceRelational 
			;

logicalOp: '!' logicalOp						# NegationLogical
		 | '(' logicalOp ')'					# ParenthesesLogical
		 | logicalOp '&&' logicalOp				# ConjunctionLogical
		 | logicalOp '||' logicalOp				# DisjunctionLogical
		 | logicalOp '=>' logicalOp				# ImplicationLogical
		 | logicalOp '<=>' logicalOp			# EquivalenceLogical
		 | relationalOp							# RelationalOpLogical
		 | ID									# VariableLogical
		 | BoolConstant							# BooleanConstant
		 ;

/* Tokens */
VARIABLE: IntID | BoolID;
IntID: 'int';
IntConstant: [0-9]+;
BoolID: 'bool';
BoolConstant: 'true' | 'false';
ConstantValue: IntConstant | BoolConstant;
ID: [a-z][a-zA-Z0-9_]*;
COMMENT: '//' ~[\r\n]* -> skip;
WS : [ \t\n\r]+ -> skip ;