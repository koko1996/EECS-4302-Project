sig loopInvariant {
	current: Int,
	length: Int
}

fun incrementCurrent(li : loopInvariant) : loopInvariant {
	{resultli : loopInvariant | resultli.current = li.current.add[1] and resultli.length = li.length}
}

pred loopPredicate [li, postli  : loopInvariant] {
	incrementCurrent[li] = postli
}

fact curNeverGTlength {
	loopInvariant.current <= loopInvariant.length
}

fact curNeverLTOne {
	loopInvariant.current >= 1
}

//fact connectedSequentially {
//	all v: loopInvariant | one next: loopInvariant | v.current < v.length and next.current = v.current.add[1]
//}

assert loopChecker {
	all v, next: loopInvariant | v.current < v.length and next.current = v.current.add[1] and next.length = v.length and loopPredicate[v, next]
}

check loopChecker
