import java.util.*;
class Between{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input first number: ");
		double a=input.nextDouble();
		System.out.print("Input Second number: ");
		double b=input.nextDouble();
		boolean logic=false;
		if(a<1&a>0&b<1&b>0){
			logic=true;
		}
		System.out.print(logic);			
	}
}

