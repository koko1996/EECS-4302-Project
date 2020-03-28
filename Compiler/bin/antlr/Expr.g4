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
         | function
         ;


declaration: VARIABLE ID  SEMICOLON                 	# VariableDeclaration
            | VARIABLE ID '=' ID  SEMICOLON         	# VariableInitializationConstantCopy
    		| VARIABLE ID '=' expression  SEMICOLON		# VariableInitializationConstant
    		;

// function can't have empty bodies
// function can have zero or more arguments
// function has to have a return type (it makes sense because there are no objects and everything is pass by value)
// maybe add capability to declare local variables later
function: 'fun' VARIABLE ID '(' ((VARIABLE ID COMMA)* VARIABLE ID)? ')' '{' 'fun_require' '(' logicalOp ')' multAssig  'return' (ID|arithmeticOp|logicalOp)';' 'fun_ensure' '(' logicalOp ')' '}' 	# FunctionConditional
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

assignment: ID	SEMICOLON					# IDExpression
		  | ID '=' ID  SEMICOLON			# IDAssignment			// must come first
		  | ID '=' expression  SEMICOLON	# AssignAssignment
		  | expression	SEMICOLON			# AssignExpression
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

//VARIABLE: 'int' | 'bool';
//ID: [a-z][a-zA-Z0-9_]*;
//IntConstant : [0-9][1-9]*;
//WS : [ \t\n\r]+ -> skip;
	/* Tokens */
    VARIABLE: 'int' | 'bool';
	IntConstant : [0-9]+;
	BoolConstant: 'true' | 'false';
	ConstantValue: IntConstant | BoolConstant;
	ID: [a-z][a-zA-Z0-9_]*;
	COMMENT: '//' ~[\r\n]* -> skip;
	WS : [ \t\n\r]+ -> skip ;
	SEMICOLON: ';';
	COMMA: ',';
	