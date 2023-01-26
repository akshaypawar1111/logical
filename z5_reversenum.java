package logical_programe;

public class z5_reversenum 
{
public static void main(String[] args) {
	
	
	int num=14564526;
	
	String oo = Integer.toString(num);
	String p="";
	
	for(int i=oo.length()-1; i>=0;i--)
	{
		
		p=p+oo.charAt(i);
		
	}
	
	int rr = Integer.parseInt(p);
	
	
	
	System.out.println(rr);
	
	
	
	
}
}
