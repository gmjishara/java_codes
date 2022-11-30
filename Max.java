import java.util.*;
class Max{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		int[] ar=new int[3];
		for(int i=0;i<ar.length;i++){
			System.out.print("Input number "+(i+1)+": ");
			ar[i]=input.nextInt();
		}
		int max=ar[0];
		for(int i=1;i<ar.length;i++){
			if(ar[i]>max){
				max=ar[i];
			}
		}	
		System.out.println("The Large Number is:"+max);	
	}
}

