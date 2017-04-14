
public class Swap {
	
	
	public static int[] swapnum1(int a,int b){
	a = a*b; //now a is 30 and b is 20
	b = a/b; //now a is 30 but b is 10 (original value of a)
	a = a/b; //now a is 20 and b is 10, numbers are swapped

	System.out.println("result after swapping a:"+a+"b:"+b);
	int[] swappedNumbers=new int[2];
	swappedNumbers[0]=a;
	swappedNumbers[1]=b;
	return swappedNumbers;

	

	}
}
