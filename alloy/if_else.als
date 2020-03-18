sig num{
	arg1:Int,
	arg2:Int
}

fun addOneConditional (x,y : Int) : num{
	{ v : num | 
	    v.arg1 = ((x> y) => x.add[1] else x)
	    and v.arg2= ((x <= y) => y.add[1] else y)
	}
}

pred addOneConditionalEnsure [x_pre,y_pre : Int , x_post, y_post : Int] {
	{v:num | v.arg1 =x_post and v.arg2 =y_post} = addOneConditional[x_pre,y_pre]
}

assert conditional {
	NAME = NAME_old * NAME2
	if_ensure ( ((x>y) and  (x = x_old+1 and y=y_old)) or ((x<=y) and  (x = x_old and y = y_old+1)))
	all n: num | (n.arg1 > 0) => ((n.arg1 > n.arg2 and addOneConditionalEnsure[n.arg1,n.arg2,n.arg1.add[1],n.arg2])  or (n.arg1 <= n.arg2 and addOneConditionalEnsure[n.arg1,n.arg2,n.arg1,n.arg2.add[1]]))
}

check conditional