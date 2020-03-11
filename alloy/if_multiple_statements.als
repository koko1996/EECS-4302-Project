sig num {
	arg1: Int, //x
	arg2: Int, //y
	arg3: Int  //z
}

fun multipleStatementConditional (v : num) : num {
	{res : num | res.arg1 = ((v.arg2 < v.arg3) => v.arg1.add[1] else v.arg1.add[3]) and
		res.arg2 = ((v.arg2 < v.arg3) => v.arg2.add[1] else v.arg2) and
		res.arg3 = ((v.arg2 < v.arg3) => v.arg3 else v.arg3.add[5])
	}
}

pred multipleStatementConditionalEnsure [prevals, postvals : num] {
	multipleStatementConditional[prevals] = postvals
}

assert mulState {
	all v: num | v.arg2 < v.arg3 => multipleStatementConditionalEnsure[v, {post: num | post.arg1 = v.arg1.add[1] and post.arg2 = v.arg2.add[1] and post.arg3 = v.arg3}] else 
		multipleStatementConditionalEnsure[v, {post: num | post.arg1 = v.arg1.add[3] and post.arg2 = v.arg2 and post.arg3 = v.arg3.add[5]}]	
}

check mulState

