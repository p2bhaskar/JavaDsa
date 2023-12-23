package prac_01;

public class CountAndSay
{

	public static void main(String[] args)
	{ 
	   String str = "ccaabbmmnnnnnnkkkkmmmm";
	   String[] arr = str.split("");
	   
	   StringBuilder sb = new StringBuilder();
	   int count = 1;
	   for(int i=0;i<arr.length-1;i++)
	      { 

	       
	        
	       if(!(arr[i].equals(arr[i+1])))
	        {
	           sb.append(arr[i]).append(count);
	           count=1;
	        }
	       else
	       {
	         count++;
	         
	       }
		   
		  // System.out.print(arr[i]+" ");
	       
	         
	      }
	      String s = sb.toString();
	      System.out.println(s);//c2a2b2m2
	   
	}

}
