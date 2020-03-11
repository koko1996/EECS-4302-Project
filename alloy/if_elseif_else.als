sig num {
	arg1: Int,
	arg2: Int
}

fun addOneConditional (x,y:Int): num {
	{ v : num | 
	    v.arg1 = ((x> y) => x.add[1] else ((x = y) => x else x))
	    and v.arg2 = ((x> y) => y else ((x = y) => y.add[1] else y))
	}
}

pred addOneConditionalEnsure[x_pre,y_pre:Int,x_post,y_post:Int] {
	{v:num | v.arg1 = x_post and v.arg2=y_post} = addOneConditional[x_pre,y_pre]
}

assert conditional  {
	all n: num | n.arg1 > n.arg2 => addOneConditionalEnsure[n.arg1,n.arg2,n.arg1.add[1],n.arg2] else ((n.arg1 = n.arg2) => addOneConditionalEnsure[n.arg1,n.arg2,n.arg1,n.arg2.add[1]] else addOneConditionalEnsure[n.arg1,n.arg2,n.arg1,n.arg2])
}

check conditional

