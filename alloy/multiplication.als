sig num {
	arg1: Int,
	arg2: Int,
	arg3: Int
}

fun multiplyConditional (nums : num) : num {
	{ v: num |
		v.arg1 = (nums.arg1) and v.arg2 = (nums.arg2) and v.arg3 = ((nums.arg2 < nums.arg3) =>mul[nums.arg1, nums.arg2] else nums.arg3)
	}
}  


pred multiplyConditionalEnsure [pre_num1, pre_num2, pre_num3, post_num1, post_num2, post_num3: Int] {
	{v:num | v.arg1 = post_num1 and v.arg2 = post_num2 and v.arg3 = post_num3 } = 
	multiplyConditional[{v: num | v.arg1 = pre_num1 and v.arg2 = pre_num2 and v.arg3 = pre_num3}]
}

assert multiplication {
	all n: num |  n.arg2 < n.arg3 => multiplyConditionalEnsure[n.arg1, n.arg2, n.arg3, n.arg1, n.arg2, mul[n.arg1, n.arg2]] else multiplyConditionalEnsure[n.arg1, n.arg2, n.arg3, n.arg1, n.arg2, n.arg3]
}

check multiplication