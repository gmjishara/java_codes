import java.util.*;
class Equal{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		int Count=0;
		int[] ar=new int[4];
		for(int i=0;i<4;i++){
			System.out.print("Input integer "+(i+1)+": ");
			ar[i]=input.nextInt();
		}
		for(int i=1;i<4;i++){
			if(ar[i]==ar[0]){
				Count++;
			}
		}
		switch(Count){
			case 3:System.out.print("Numbers are equal!");break;
			default: System.out.print("Numbers are not equal!");
		}			
	}
}

