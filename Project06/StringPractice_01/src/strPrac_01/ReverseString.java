package strPrac_01;

public class ReverseString 
{
   public static void main(String[] args)
   {
	   String str = "programming is great";
	   String[] strA = str.split(" "); 
//	   int end =strA.length-1;
//	   int start = 0;
//	   while(start<=end)
//	   {
//		   
//		   String temp = strA[start];
//		   strA[start] = strA[end];
//		   strA[end] = temp;
//		   
//		   start++;
//		   end--;
//	   }
//	 String s = String.join("", strA);
//	 System.out.println(s);
	   
	   StringBuilder sb = new StringBuilder();
//	   for(String s:strA) 
//	   {
//		   StringBuilder sbIn = new StringBuilder(s);
//		   
//		   sbIn.append(s);
//		   sbIn.reverse().append(" ");
//		   sb.append(sbIn);
//	   }
//	   	   
//	   
//	   String s = sb.toString();
//	   System.out.println(s);
	  
	   String s = String.join("*", strA);
	   
	   char[] c = s.toCharArray();
	   
	   for(int i=c.length-1;i>=0;i--) {
		   sb.append(c[i]);
	   }
	  
	   
	   String s2 = sb.toString();
	   
	   String[] s3 = s2.split("\\*+");
	   
 //	   String s4 = String.join(" ", s3);
//	   System.out.print(s4);
	   StringBuilder sb2 = new StringBuilder(); 
       for(String s5:s3) {
    	  sb2.append(s5.substring(0, 1).toUpperCase()).append(s5.substring(1)).append(" ");
       }
       System.out.println("-------------------------------------------------");
       
       System.out.println(sb2.toString());
	   
	   }
}
