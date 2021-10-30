package recursion;

public class Solution {

	public int fact(int n) {
		if(n==0)
			return 1;
		else 
			return n*fact(n-1);
	}
	
	public int factTailRecursive(int n,int val) {
		if(n==0)
			return val;
		else 
			return factTailRecursive(n-1,n*val);
	}
	
	
	public void recursionDemo(int n) {
		if(n<1)
			return;
		else {
			System.out.println(n);
			recursionDemo(n-1);
			System.out.println(n);
		}
	}
	
	public void towerOfHanoi(int n, char from_rod,char to_rod,char aux_rod) {
		if(n==1) {
			System.out.println("Move Disk1 from " +from_rod +" to " + to_rod);
			return;
		}
		towerOfHanoi(n-1,from_rod,aux_rod,to_rod);
		System.out.println("Move Disk"+ n +" from " +from_rod +" to " + to_rod);
		towerOfHanoi(n-1,aux_rod,to_rod,from_rod);
		
	}
	
	public void printNto1(int n) {
		if(n<1) 
			return;
		System.out.println(n);
		printNto1(n-1);
	}
	public void print1toN(int n) {
		if(n<1) 
			return;
		print1toN(n-1);
		System.out.println(n);

	}
	
	//tail recursive to make the program faster
	public void print1toNTailRecursive(int n,int k) {
		if(n<1) 
			return;
		print1toNTailRecursive(n-1,k+1);
		System.out.println(n);

	}
	
}
