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


declaration: VARIABLE ID                   	# VariableDeclaration
            | VARIABLE ID '=' ID            # VariableInitializationConstantCopy
    		| VARIABLE ID '=' expression  	# VariableInitializationConstant
    		;


assertedConditional: 'if_require' '(' logicalOp ')' conditional 'if_ensure' '(' logicalOp ')' # ConditionalAssertionStatement
		;

// if and else statements can't have empty bodies
conditional: 'if' '(' logicalOp ')' '{' multAssig '}' (elseIf)*	(finaElse)?				# IfConditional
		   ;

elseIf: 'else' 'if' '(' logicalOp ')' '{' multAssig '}'				# ElseIfConditional
	  ;	  

finaElse:  'else' '{' multAssig '}'									# ElseConditional
	;

multAssig: (assignment)+			# MultipleAssignments
		;

assignment: expression				# AssignExpression
		  | ID '=' ID  				# IDAssignment
		  | ID '=' expression  		# AssignAssignment
		  | conditional             # AssignConditional
		  | assertedConditional     # AssignAssertedConditional
		  ;

expression: arithmeticOp			# ArithmeticOperation
		  | relationalOp			# RelationalOperation
		  | logicalOp				# LogicalOpteration
		  | '(' expression ')'		# ParanthesesExpression
		  ;

arithmeticOp: '(' arithmeticOp ')'              # ParanthesesArithmetic
            | arithmeticOp '*' arithmeticOp		# MultiplicationArithmetic
			| arithmeticOp '/' arithmeticOp		# DivisionArithmetic
			| arithmeticOp '%' arithmeticOp		# ModuloArithmetic
			| arithmeticOp '+' arithmeticOp 	# AdditionArithmetic
			| arithmeticOp '-' arithmeticOp		# SubtractionArithmetic
			| ID								# VariableArithmetic
			| IntConstant						# IntegerConstant
			| '-' IntConstant					# NegationIntegerConstant
			;

relationalOp: '(' relationalOp ')'                  # ParanthesesRelational
            | arithmeticOp '<' arithmeticOp			# LessRelational
			| arithmeticOp '<=' arithmeticOp		# LessEqualRelational
			| arithmeticOp '>' arithmeticOp			# GreaterRelational
			| arithmeticOp '>=' arithmeticOp		# GreaterEqualRelational
			| arithmeticOp '==' arithmeticOp		# EqualityRelational
			| arithmeticOp '!=' arithmeticOp		# InequivalenceRelational
			;

logicalOp: '(' logicalOp ')'                    # ParanthesesLogical
         | '!' logicalOp						# NegationLogical
		 | logicalOp '&&' logicalOp				# ConjunctionLogical
		 | logicalOp '||' logicalOp				# DisjunctionLogical
		 | logicalOp '=>' logicalOp				# ImplicationLogical
		 | logicalOp '<=>' logicalOp			# EquivalenceLogical
		 | relationalOp							# RelationalOpLogical
		 | ID									# VariableLogical
		 | BoolConstant							# BooleanConstant
		 ;



/* Tokens */
VARIABLE: 'int' | 'bool';
IntConstant : [0-9]+;
BoolConstant: 'true' | 'false';
ConstantValue: IntConstant | BoolConstant;
ID: [a-z][a-zA-Z0-9_]*;
COMMENT: '//' ~[\r\n]* -> skip;
WS : [ \t\n\r]+ -> skip ;