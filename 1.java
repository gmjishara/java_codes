import java.util.*;
class Example{
	public static void main(String args[]){ 
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num=input.nextInt();
		int sum=0;
		while(num!=0){
			sum=sum+(num%10);
			num=num/10;         
		}
		System.out.println("Sum of Digits :"+sum);
	}
}


	
	
	





	 
		 
		 
		 
		
		

	  
 
		
 
	 		 
	 		 		


