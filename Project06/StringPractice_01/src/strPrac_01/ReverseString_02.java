package strPrac_01;

public class ReverseString_02 
{
	public static void main(String[] args)
	{
		String str = "Programming is great";
		
		String[] strA = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=strA.length-1;i>=0;i--)
		{
			StringBuilder sb2 = new StringBuilder();
			sb2.append(strA[i]).reverse().append(" ");
			sb.append(sb2);
		    System.out.println(sb.toString()); 
		}
		
		String strResult = sb.toString().trim();
		System.out.println(strResult);
	}

}
