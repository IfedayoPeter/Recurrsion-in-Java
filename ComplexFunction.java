package com.project.recurrsion;

class ComplexFunction {
//	recurrsion is the phenomena of a method calling itself
//	whatever is defined in a method goes onto a stack
//	always write an exit condition in recurrsion to prevent infinite loop
//	the use case of recurrsion is when an operation is being repeated again and again in the whole sequence

	int CalculateFactorial(int n) {
//		this if statement is the exit condition
//		once the if statement becomes true, the stack begins to unpack itself(Last in First out)
		if (1 == n) {
			return 1;
		} else {
			return (n * CalculateFactorial(n - 1));
		}
	}
//	if n is 5, factorial(5)
//					factorial(4)
//				 		factorial(3)
//				  			factorial(2)
//								factorial(1)
//									return 1
//								return 2*1=2 (factorial of 2 is 2* factorial of 1)
//							return 3*2=6 (factorial of 3 is 3* factorial of 2)
//						return 4*6=24
//					return 5*24=120

}
