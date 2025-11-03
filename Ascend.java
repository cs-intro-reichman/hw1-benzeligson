 // Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) 
	{
		int lim = Integer.parseInt(args[0]);
		//ensures the limit is a positive number, if not - will use zero
		lim = Math.max(lim,0);
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
		int smallest = Math.min(Math.min(a,b),c);
		int biggest = Math.max(Math.max(a,b),c);
		//finds the smaller between the 3 pairs of a, b, c
		//which will give us the smallest in two candidates 
		//and the middle in the other one
		int candidate1 = Math.min(a,b);
		int candidate2 = Math.min(c,b);
		int candidate3 = Math.min(a,c);
		//the biggest of the three candidates will always be the medium
		int middle = Math.max(Math.max(candidate1,candidate2),candidate3);
		System.out.println(a + " " + b + " " + c);
		System.out.println(smallest + " " + middle + " " + biggest);
	}
}
