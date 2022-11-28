import java.util.*;
class Example{
	public static void main(String args[]){
		int[] ar={25,12,35,60,30,80,55,42,59,94};
		for(int j=0;j<ar.length-1;j++){
			int max=ar[0];
			int index=0;
			for(int i=1;i<ar.length-j;i++){
				if(ar[i]>max){
					max=ar[i];
					index=i;
				}
			}	
			ar[index]=ar[ar.length-(j+1)];
			ar[ar.length-(j+1)]=max;
		}	
		System.out.println(Arrays.toString(ar));
	}
}
	


				




		










	
	
	





	 
		 
		 
		 
		
		

	  
 
		
 
	 		 
	 		 		


