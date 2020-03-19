sig num{
    arg1: Int,
    arg2:Int
}


//y=2
//if (x>y){	
	y=y+3  
	x=x+1
} else {
   	y=y+1
}


fun addOneConditional (x,y : Int) : num{
	{ v : num | 
        v.arg1 = ((x> y) => x.add[1] else x)
        and v.arg2= ((x > y) => y.add[3] else y)
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