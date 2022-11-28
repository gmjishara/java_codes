import java.util.*;
class Example{
	public static int[] createAnArray(int N){
		int [] marks=new int[N];
		return marks;
	}	
	public static void readMarks(int[] marks){
		Random r=new Random();
		for(int i=0;i<marks.length;i++){
			marks[i]=r.nextInt(100);
		}
	}
	public static int findTotal(int[] marks){
		int Total=0;
		for(int i=0;i<marks.length;i++){
			Total=Total+marks[i];
		}
		return Total;
	}
	public static int findMax(int[] marks){
		int Max=marks[0];
		for(int i=0;i<marks.length;i++){
			if(marks[i]>Max){
				Max=marks[i];
			}
		}
		return Max;
	}
	public static int findMin(int[] marks){
		int Min=marks[0];
		for(int i=0;i<marks.length;i++){
			if(marks[i]<Min){
				Min=marks[i];
			}
		}
		return Min;
	}
	public static void printMarks(int[] marks){
		System.out.print("[");
		for(int i=0;i<marks.length;i++){
			System.out.print(marks[i]+",");
		}
		System.out.println("\b]");
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input no of students : ");
		final int N=input.nextInt();
		int[] marks=createAnArray(N);	
		readMarks(marks);
		int total=findTotal(marks);
		int max=findMax(marks);
		int min=findMin(marks);
		printMarks(marks);			
		System.out.println("Total   : "+total);
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);		
	}
}
				




		










	
	
	





	 
		 
		 
		 
		
		

	  
 
		
 
	 		 
	 		 		


