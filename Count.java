import java.util.*;
class Count{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer: ");
		int number=input.nextInt();	
		int count=1;
		while(number>1){
			number=number/10;
			count++;	
		}
		System.out.println("The number of the digits is:"+count);
	}
}

