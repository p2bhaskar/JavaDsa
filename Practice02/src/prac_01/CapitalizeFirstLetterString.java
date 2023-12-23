package prac_01;

public class CapitalizeFirstLetterString 
{

	public static void main(String[] args) 
	{
		String str = "my name is something vf sd     gh ?";
		
		String[] strArr = str.split("\\s+");
		 StringBuilder sb = new StringBuilder();
		for(String s:strArr)
		{
			 sb.append(s.substring(0,1).toUpperCase()).append(s.substring(1)).append(" ");
			//System.out.print(Character.toUpperCase(s.charAt(0)));
		}
        
		//String joinedStr = String.join(" ",strArr);
		//System.out.println(joinedStr);
        
       // System.out.println(result);
	}

}
