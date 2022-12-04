import java.util.*;
class Modules{
	String[] Module=new String[7];
	int[] Credits={3,3,3,2,2,2,2};
	Modules(String a,String b, String c, String d, String e, String f,String g){
		Module[0]=a;
		Module[1]=b;
		Module[2]=c;
		Module[3]=d;
		Module[4]=e;
		Module[5]=f;
		Module[6]=g;
	}	
		
	String[] Marks={"A+","A","A-","B+","B","B-","C+","C"};
	double[] Value={4.2,4,3.7,3.3,3,2.7,2.3,2};
	String[] Results=new String[7];
}

class AGPA{
	public static void main(String args[]){
		Modules M=new Modules["Building Design and Construction I","Drawing and Design Appreciation","Professional Communication","Economics I","Construction Economics I","Fundamentals of Management","Management Accountancy"];
		Scanner input=new Scanner(System.in);
		int Total_Credits=0;
		double Total=0;
		int index=0;;
		for(int i=0;i<7;i++){
			Total_Credits+=Credits[i];
		}
		System.out.println("Input Marks,");
		String results;
		for(int i=0;i<7;i++){
			System.out.print("\t");
			System.out.print(Module[i]+": ");
			results=input.nextLine();
			Results[i]=results;
		}
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				if(Results[i].equals(Marks[j])){
					index=j;
				}
			}
			Total+=Value[index]*Credits[i];
		}
		double gpa=(Total/Total_Credits);
		System.out.println("\nYour GPA is: "+gpa);
	}
}
		

