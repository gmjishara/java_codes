import java.util.*;
class Example{
	public static void main(String args[]){ 
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num=input.nextInt();
		int reverse=0;
		while(num!=0){
			reverse*=10;
			reverse+=(num%10);
			num=num/10;         
		}
		System.out.println("reverse of Digits: "+reverse);
	    System.out.println(reverse+10);
	}
}

//1234
	
	
	





	 
		 
		 
		 
		
		

	  
 
		
 
	 		 
	 		 		


