package strPrac_01;

public class RandomPractice 
{
   public static void main(String[] args) 
   {
	  String str = "AbbbcVVddMMLAAAAAAA";
	  int[] arr = new int[256];
	  
	  StringBuilder sb = new StringBuilder();
	  
	  for(char c:str.toCharArray())
	  {
		  arr[(int)c]++;
	  } 
	  
	  for(int i=0;i<=arr.length-1;i++)
	  {
		  if(arr[i] > 0) 
		  {
			  sb.append((char)i).append(arr[i]);
		  }
	  }
	  System.out.println(sb.toString());
	  
   }
}
