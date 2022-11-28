import java.util.*;
class Example{
	public static void main(String args[]){ 
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer: ");
		int num=input.nextInt();
		String reverse="";
		while(num!=0){
			reverse+=(num%10);
			num=num/10;         
		}
		System.out.println("reverse of Digits: "+reverse);
	}
}


	
	
	





	 
		 
		 
		 
		
		

	  
 
		
 
	 		 
	 		 		


