package Problems;

import recursion.Solution;

public class InteviewQuestion {

	public static void main(String[] args) {
		Solution sol=new Solution();
		
		
		//1.Factorial of a number 
		//System.out.println("Factorial of 4 is : " + sol.fact(4));
		
		//1.1Factorial of a number (tail recursive)
		System.out.println("Factorial of 4 is : " + sol.factTailRecursive(4,1));
		
		//2.recursionDemo to show how recursion works
		//sol.recursionDemo(7);
		
		
		//3.Towers of Hanoi
		//sol.towerOfHanoi(3, 'A', 'B', 'C');

		//4.print n to 1
		//System.out.println("PRINT N to 1: 5");
		//sol.printNto1(5);
		
		//5.print 1 to n
		//System.out.println("PRINT 1 to N: 5");
		//sol.print1toN(5);
		
		//6.print 1 to n faster (tail recursive way
		//System.out.println("PRINT 1 to N: 5");
		//sol.print1toNTailRecursive(5,1);
		
	}

}
