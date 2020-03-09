// if (arg1 * arg2 * arg3 < arg4) {
// 	arg4 = arg1 * arg2 * arg3 * arg4
//}
sig num {
	arg1: Int,
	arg2: Int,
	arg3: Int,
	arg4: Int
}

fun multiplyConditional (nums : num) : num {
	{ v: num |
		v.arg1 = (nums.arg1) and v.arg2 = (nums.arg2) and v.arg3 = (nums.arg3) 
		and v.arg4 = ((mul[mul[nums.arg1, nums.arg2], nums.arg3] < nums.arg4) =>
		mul[mul[nums.arg1, nums.arg2], mul[nums.arg3, nums.arg4]] else nums.arg4)
	}
}  


pred s1 [pre_num1, pre_num2, pre_num3, pre_num4, post_num1, post_num2, post_num3, post_num4 : Int] {
	{v:num | v.arg1 = post_num1 and v.arg2 = post_num2 and v.arg3 = post_num3 and v.arg4 = post_num4} = 
	multiplyConditional[{v: num | v.arg1 = pre_num1 and v.arg2 = pre_num2 and v.arg3 = pre_num3 and v.arg4 = pre_num4}]
}

assert multiplication {
	all n: num | mul[mul[n.arg1, n.arg2], n.arg3] < n.arg4 => s1[n.arg1, n.arg2, n.arg3, n.arg4, n.arg1, n.arg2, n.arg3, mul[mul[n.arg1, n.arg2], mul[n.arg3, n.arg4]]] else s1[n.arg1, n.arg2, n.arg3, n.arg4, n.arg1, n.arg2, n.arg3, n.arg4]
}

check multiplication
