grammar Expr;
/* The grammar name and file name must be the same*/

@header {
        package antlr;
}

// start variable
prog: (statement)+ EOF # Program
    ;

statement: declaration
         | assignment
         | conditional
         | assertedConditional
         ;

declaration: VARIABLE ID                   		# VariableDeclaration
    		| VARIABLE ID '=' ConstantValue  	# VariableInitializationConstant
    		| VARIABLE ID '=' ID 			 	# VariableInitializationCopy
    		;

//statement: (assignment)+			# AssignmentStatement
//		 | conditional				# ConditionalStatement
//		 | assertedConditional   	# AssertedConditionalStatement
//		 ;
//
assertedConditional: 'if_require' '(' expression ')' conditional 'if_ensure' '(' expression ')' # ConditionalAssertionStatement
		;

// if and else statements can't have empty bodies
conditional: 'if' '(' logicalOp ')' '{' (statement)+ '}' elseIf		# IfConditional
		   ;

elseIf: 'else' 'if' '(' logicalOp ')' '{' (statement)+ '}'	elseIf		# ElseIfConditional
	  | 'else' '{' (statement)+ '}'									# ElseConditional
	  |  /* epsilon	*/												# EpsilonConditional
	  ;

assignment: expression				# AssignExpression
		  | ID '=' expression  		# AssignAssignment
		  ;

//multAssig: (assignment)+			# MultipleAssignments
//		;
//
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
			| '-' IntConstant					# NegationIntegerConstant
			;

relationalOp: arithmeticOp '<' arithmeticOp			# LessRelational
			| arithmeticOp '<=' arithmeticOp		# LessEqualRelational
			| arithmeticOp '>' arithmeticOp			# GreaterRelational
			| arithmeticOp '>=' arithmeticOp		# GreaterEqualRelational
			| arithmeticOp '==' arithmeticOp		# EqualityRelational
			| arithmeticOp '!=' arithmeticOp		# InequivalenceRelational
			;

logicalOp: '!' logicalOp						# NegationLogical
		 | logicalOp '&&' logicalOp				# ConjunctionLogical
		 | logicalOp '||' logicalOp				# DisjunctionLogical
		 | logicalOp '=>' logicalOp				# ImplicationLogical
		 | logicalOp '<=>' logicalOp			# EquivalenceLogical
		 | relationalOp							# RelationalOpLogical
		 | ID									# VariableLogical
		 | BoolConstant							# BooleanConstant
		 ;

/* Tokens */
//IntID: 'int';
//BoolID: 'bool';
//VARIABLE: IntID | BoolID;
VARIABLE: 'int' | 'bool';
IntConstant: [1-9][0-9]*;
BoolConstant: 'true' | 'false';
ConstantValue: IntConstant | BoolConstant;
ID: [a-z][a-zA-Z0-9_]*;
COMMENT: '//' ~[\r\n]* -> skip;
WS : [ \t\n\r]+ -> skip ;