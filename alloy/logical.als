abstract sig Bool{}

one sig True extends Bool {}
one sig False extends Bool {}

sig vals {
	val1: Bool,
	val2: Bool,
	result: Bool
}

fun andGate (arg1, arg2: Bool) : vals {
	{v: vals | v.val1 = arg1 and v.val2 = arg2 and v.result = (((arg1 in True) and (arg2 in True)) => True else False)}
}

fun orGate (arg1, arg2: Bool) : vals {
	{v: vals | v.val1 = arg1 and v.val2 = arg2 and v.result = (((arg1 in True) or (arg2 in True)) => True else False)}
}

fun xorGate (arg1, arg2: Bool): vals {
	{v: vals | v.val1 = arg1 and v.val2 = arg2 and v.result = ((andGate[arg1, arg2].result in False) and (orGate[arg1, arg2].result in True) => True else False)}
}

pred andCheck [preval1, preval2, preresult, postval1, postval2, postresult: Bool] {
	{v: vals | v.val1 = postval1 and v.val2 = postval2 and v.result = postresult} = andGate[preval1, preval2]
}

pred orCheck [preval1, preval2, preresult, postval1, postval2, postresult : Bool] {
	{v: vals | v.val1 = postval1 and v.val2 = postval2 and v.result = postresult} = orGate[preval1, preval2]
}

pred xorCheck [preval1, preval2, preresult, postval1, postval2, postresult : Bool] {
	{v: vals | v.val1 = postval1 and v.val2 = postval2 and v.result = postresult} = xorGate[preval1, preval2]
}

assert logicAnd {
	all v: vals | (v.val1 in True and v.val2 in True) => andCheck[v.val1, v.val2, v.result, v.val1, v.val2, True] else andCheck[v.val1, v.val2, v.result, v.val1, v.val2, False]
}

assert logicOr {
	all v: vals | (v.val1 in True or v.val2 in True) => orCheck[v.val1, v.val2, v.result, v.val1, v.val2, True] else orCheck[v.val1, v.val2, v.result, v.val1, v.val2, False]
}

assert logicXor {
	all v: vals | ((v.val1 in True and v.val2 in False) or (v.val1 in False and v.val2 in True)) => xorCheck[v.val1, v.val2, v.result, v.val1, v.val2, True] else xorCheck[v.val1, v.val2, v.result, v.val1, v.val2, False]
}
check logicAnd
check logicOr
check logicXor
