package logical_programe;

public class z3_space_count 
{
public static void main(String[] args) {
	
	
	String a="aksh    sh   ytr            aerg                      qearg";
	
	
	int count=0;
	
	
	for(int i=1; i<=a.length()-1; i++)
	{
		
		char yy = a.charAt(i);
		
	
	
	if(yy==' ')
	{
		
		count++;
	}
	
	
	
	}
	System.out.println(count);
}}
