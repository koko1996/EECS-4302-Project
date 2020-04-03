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
            | VARIABLE ID '=' ID  SEMICOLON         	# VariableInitializationConstantCopy 	// singleParameter can be used here
    		| VARIABLE ID '=' expression  SEMICOLON		# VariableInitializationConstant
    		;

// function can't have empty bodies
// function can have zero or more arguments
// function has to have a return type (it makes sense because there are no objects and everything is pass by value)
// maybe add capability to declare local variables later
function: 'fun' VARIABLE ID '(' parameters ')' '{' 'fun_require' '(' logicalOp ')' multAssig  'return' ID ';' 'fun_ensure' '(' logicalOp ')' '}' 	# FunctionConditional
		   ;

parameters: (parameterVariable COMMA)* parameterVariable # ParameterArguments
		|									#ParameterEmpty
		;

parameterVariable: VARIABLE ID # ParameterArgumentVariable
	;
	
// funName(parameters)
functionCall: ID '(' functionCallParameter ')'  # FunctionCallStatment
	;
	
functionCallParameter: ( (singleParameter COMMA)* singleParameter )		# functionCallParameters 
					  |													# functionCallParametersEpsilon 
					  ; 

singleParameter: ID					#SingleParameterID
				| expression 		#SingleParameterExpression
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

multAssig: (assignment|conditional)+			# MultipleAssignments
		;

assignment: ID	SEMICOLON					# IDExpression
		  | ID '=' ID  SEMICOLON			# IDAssignment			// singleParameter can be used here
		  | ID '=' expression  SEMICOLON	# AssignAssignment
		  | expression	SEMICOLON			# AssignExpression
		  ;

expression: arithmeticOp			# ArithmeticOperation
		  | logicalOp				# LogicalOpteration
		  | relationalOp			# RelationalOperation
		  | functionCall			# FunctionReturnOperation
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
	