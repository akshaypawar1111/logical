package logical_programe;

public class z1_reverse2
{
public static void main(String[] args) {
	
	
	
	String a="madam";
	
	String b="";
	
	
	
	for(int i=a.length()-1; i>=0; i--)
	{
		
		
		b=b+a.charAt(i);
		
	}
	
	System.out.println(b);
	
	
	
	if(b.equals(a))
	{
		
		System.out.println("pallindrome");
		
	}
	
	
	else
{
		
		System.out.println("NOT pallindrome");
		
	}
	
	
	
	
}
}
