sig loopInvariant {
	current: Int,
	length: Int
}

fun incrementCurrent(li : loopInvariant) : loopInvariant {
	{resultli : loopInvariant | resultli.current = li.current.add[1] and resultli.length = li.length}
}

pred loopPredicate [li, lastli  : loopInvariant] {
	(li.current < li.length) => loopPredicate[{newli : loopInvariant | newli.current = li.current.add[1] and li.length = newli.length}, lastli] else (li.current = li.length) => li = lastli else 1 = 0
}

assert loopChecker {
	all cur, last: loopInvariant | cur.length = last.length and cur.current <= last.current and loopPredicate[cur, last]
}

check loopChecker
