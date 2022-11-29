import java.util.*;
class Similarity{
	public static void main(String arg[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input the first number : ");
		int a=input.nextInt();	
		System.out.print("Input the second number: ");
		int b=input.nextInt();	
		boolean logic=false;
		int count_a=1;
		int c=a;
		int d=b;
		while(a>9){
			a=a/10;
			count_a++;
		}	
		int count_b=1;
		while(b>9){
			b=b/10;
			count_b++;
		}		
		int[] ar_a=new int[count_a];
		int[] ar_b=new int[count_b];
		for(int i=0;i<ar_a.length;i++){
			ar_a[i]=c%10;
			c=c/10;
		}
		for(int i=0;i<ar_b.length;i++){
			ar_b[i]=d%10;
			d=d/10;
		}
		for(int i=0;i<ar_a.length;i++){
			for(int j=0; j<ar_b.length;j++){
				if(ar_a[i]==ar_b[j]){
					logic=true;
					break;
				}
			}
		}
		System.out.println("Result:"+logic);
		
	}
}

