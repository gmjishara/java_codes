import java.util.*;
class random{
	public static void main(String args[]){
		Random r=new Random();		
		for(int i=0;i<10;i++){
			int num=r.nextInt(100);	
			System.out.println(num);
		}
	}
}
		

