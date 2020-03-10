//If  y < z
//    X = x+1
//    Y = y +1
//Else
//    X = x+3
//    Z= z+5

sig vals {
	val1: Int, //x
	val2: Int, //y
	val3: Int  //z
}

fun multipleStatementConditional (v : vals) : vals {
	{res : vals | res.val1 = ((v.val2 < v.val3) => v.val1.add[1] else v.val1.add[3]) and
		res.val2 = ((v.val2 < v.val3) => v.val2.add[1] else v.val2) and
		res.val3 = ((v.val2 < v.val3) => v.val3 else v.val3.add[5])
	}
}

pred s1 [prevals, postvals : vals] {
	multipleStatementConditional[prevals] = postvals
}

assert mulState {
	all v: vals | v.val2 < v.val3 => s1[v, {post: vals | post.val1 = v.val1.add[1] and post.val2 = v.val2.add[1] and post.val3 = v.val3}] else 
		s1[v, {post: vals | post.val1 = v.val1.add[3] and post.val2 = v.val2 and post.val3 = v.val3.add[5]}]	
}

check mulState

