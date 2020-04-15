abstract sig Bool{}

one sig True extends Bool {}
one sig False extends Bool {}

sig stateInternal {
	bool1: Bool,
	bool2: Bool,
	bool3: Bool
}

fun andGate (x, y: Bool) : Bool {
	{(((x in True) and (y in True)) => True else False)}
}

fun orGate (x, y: Bool) : Bool {
	{(((x in True) or (y in True)) => True else False)}
}

fun notGate (x : Bool): Bool {
	{(x in True => False else True)} 
}

