abstract sig Bool{}

one sig True extends Bool {}
one sig False extends Bool {}

sig state {
	arg1: Bool,
	arg2: Bool,
	arg3: Bool
}

fun andGate (x, y: Bool) : state {
	{v: state | v.arg1 = x and v.arg2 = y and v.arg3 = (((x in True) and (y in True)) => True else False)}
}

fun orGate (x, y: Bool) : state {
	{v: state | v.arg1 = x and v.arg2 = y and v.arg3 = (((x in True) or (y in True)) => True else False)}
}

fun xorGate (x, y: Bool): state {
	{v: state | v.arg1 = x and v.arg2 = y and v.arg3 = ((andGate[x, y].arg3 in False) and (orGate[x, y].arg3 in True) => True else False)}
}

pred andCheck [preval1, preval2, preresult, postval1, postval2, postresult: Bool] {
	{v: state | v.arg1 = postval1 and v.arg2 = postval2 and v.arg3 = postresult} = andGate[preval1, preval2]
}

pred orCheck [preval1, preval2, preresult, postval1, postval2, postresult : Bool] {
	{v: state | v.arg1 = postval1 and v.arg2 = postval2 and v.arg3 = postresult} = orGate[preval1, preval2]
}

pred xorCheck [preval1, preval2, preresult, postval1, postval2, postresult : Bool] {
	{v: state | v.arg1 = postval1 and v.arg2 = postval2 and v.arg3 = postresult} = xorGate[preval1, preval2]
}

assert logicAnd {
	all v: state | (v.arg1 in True and v.arg2 in True) => andCheck[v.arg1, v.arg2, v.arg3, v.arg1, v.arg2, True] else andCheck[v.arg1, v.arg2, v.arg3, v.arg1, v.arg2, False]
}

assert logicOr {
	all v: state | (v.arg1 in True or v.arg2 in True) => orCheck[v.arg1, v.arg2, v.arg3, v.arg1, v.arg2, True] else orCheck[v.arg1, v.arg2, v.arg3, v.arg1, v.arg2, False]
}

assert logicXor {
	all v: state | ((v.arg1 in True and v.arg2 in False) or (v.arg1 in False and v.arg2 in True)) => xorCheck[v.arg1, v.arg2, v.arg3, v.arg1, v.arg2, True] else xorCheck[v.arg1, v.arg2, v.arg3, v.arg1, v.arg2, False]
}

check logicAnd
check logicOr
check logicXor
