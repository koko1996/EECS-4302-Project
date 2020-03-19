sig num{
    arg1: Int,
    arg2:Int
}


//y=2
//if (x>y){
//x=y+ 1
//y = 3
//    
//} else {
//    y=y+1
//}


fun addOneConditional (x,y : Int) : num{
	{ v : num | 
        v.arg1 = ((x> y) => field.arg1_1 else x)
        and v.arg2= ((x > y) => field.arg2_1 else y)
	}
}


assert conditional {
    all n: num | (n.arg1 = 3 and n.arg2 = 2) => (n.arg1 > n.arg2 ) =>
							 (all field: addOneConditional[n.arg1,n.arg2] | { field.arg1 =n.arg1 and field.arg1 =1 }  and 
								all field: addOneConditional[n.arg1,n.arg2] | { field.arg2 = n.arg2  })  
							else (all field: addOneConditional[n.arg1,n.arg2] | { field.arg1 = n.arg1  } and  
								all field: addOneConditional[n.arg1,n.arg2] | { field.arg2 = n.arg2 }) 
}


check conditional