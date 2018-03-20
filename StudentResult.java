import java.util.*;
public class StudentResult {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int i,j;
	
	System.out.println("Enter the number of students:");
	int nStud=in.nextInt();
	
	System.out.println("Enter the number of questions: ");
	int nQues= in.nextInt();

	String[] key= new String[nQues];
	String[] name= new String[nStud];
	String choice[][] = new String[nStud][nQues];
	int count[]=new int[nQues];
	System.out.println("Enter the key (Answers)");
	for(i=0;i<nQues;i++)
	{
		key[i]=in.next();	
		count[i]=0;
	}
	
	
	for(i=0;i<nStud;i++)
	{
		System.out.println("Enter the name of student- "+(i+1));
		name[i]=in.next(	);
		System.out.println("Enter the choices of student- "+(i+1));

		for(j=0;j<nQues;j++)
		{
			choice[i][j]=in.next();
		}
	}
	
	for(i=0;i<nStud;i++)
	{
		for(j=0;j<nQues;j++)
		{
			if(choice[i][j].compareToIgnoreCase(key[j])==0)
				count[i]++;
		}
		
	}
	
	for(i=0;i<nStud;i++)
	{
		System.out.println(name[i]+" has correctly answered "+count[i]+" answers.");
	}
}
}

