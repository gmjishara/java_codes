import java.util.*;
class Factorial{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer: ");
		int a=input.nextInt();
		long fact=1;
		for(int i=a;i>0;i--){
			fact*=i;
		}
		System.out.println("The Factorial of "+a+" is: "+fact);
	}
}

