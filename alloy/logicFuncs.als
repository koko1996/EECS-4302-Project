abstract sig Bool{}

one sig True extends Bool {}
one sig False extends Bool {}

sig stateInternal {
	arg1: Bool,
	arg2: Bool,
	arg3: Bool
}

fun andGate (x, y: Bool) : stateInternal {
	{v: stateInternal | v.arg1 = x and v.arg2 = y and v.arg3 = (((x in True) and (y in True)) => True else False)}
}

fun orGate (x, y: Bool) : stateInternal {
	{v: stateInternal | v.arg1 = x and v.arg2 = y and v.arg3 = (((x in True) or (y in True)) => True else False)}
}

fun xorGate (x, y: Bool): stateInternal {
	{v: stateInternal | v.arg1 = x and v.arg2 = y and v.arg3 = ((andGate[x, y].arg3 in False) and (orGate[x, y].arg3 in True) => True else False)}
}

pred andCheck [preval1, preval2, preresult, postval1, postval2, postresult: Bool] {
	{v: stateInternal | v.arg1 = postval1 and v.arg2 = postval2 and v.arg3 = postresult} = andGate[preval1, preval2]
}

pred orCheck [preval1, preval2, preresult, postval1, postval2, postresult : Bool] {
	{v: stateInternal | v.arg1 = postval1 and v.arg2 = postval2 and v.arg3 = postresult} = orGate[preval1, preval2]
}

pred xorCheck [preval1, preval2, preresult, postval1, postval2, postresult : Bool] {
	{v: stateInternal | v.arg1 = postval1 and v.arg2 = postval2 and v.arg3 = postresult} = xorGate[preval1, preval2]
}
