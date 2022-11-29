import java.util.*;
class Demo{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer: ");
		int number=input.nextInt();	
		int sum=0;
		while(number>=10){
			sum+=number%10;
			number=number/10;	
		}
		sum=sum+number;
		System.out.println("The sum of the digits is:"+sum);
	}
}

