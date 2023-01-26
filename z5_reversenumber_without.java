package logical_programe;

public class z5_reversenumber_without 
{
public static void main(String[] args) {
	
	
	
	int num=98501111;
	int n=0;
	
	
	
	for(int i=num; i>0;i=i/10)
	{
		
		int c=i%10;
		
		
		n=n*10+c;
	}
	
	System.out.println(n);
	
	
}
}
