import java.util.*;
class Avarage{
	public static void main(String arg[]){
		int[] ar={1, 4, 17, 7, 25, 3, 100};
		int Total=0;
		int count=0;
		for(int i=0;i<ar.length;i++){
			Total+=ar[i];
		}
		double avg=Total/ar.length;
		for(int i=0;i<ar.length;i++){
			if(ar[i]>avg){
				count++;
				method(ar[i],count);
			}
		}
		System.out.println("The average of the said array is: "+avg);
		System.out.print("The numbers in the said array that are greater than the average are: ");
		for(int i=0;i<cr.length;i++){
			System.out.print(cr[i]+", ");
		}
		System.out.println("\b\b ");
	}
	
	public static int[] cr=new int[0];
	public static void method(int a,int b){
		int[] br=new int[cr.length+1];
		for(int i=0;i<cr.length;i++){
			br[i]=cr[i];
		}
		cr=br;
		cr[b-1]=a;
	}
				
}

