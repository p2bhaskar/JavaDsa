package prac_01;

public class ArrayPrblm_2
{

   public static void main(String [] args)
   {
       
  
     String str = "my name is something";
      
     //String[] strArr = str.split(" ");
     String[] strArr = str.split("\\s+");
     
     StringBuilder sb = new StringBuilder();
    
      for(String s:strArr) 
     {
    	  if(!s.isEmpty()) {
    		  sb.append(s.substring(0,1)).append(s.substring(1,2).toUpperCase()).append(s.substring(2)).append(" ");
    	  }
    	
    	 
     }
     
      String result = sb.toString().trim();
      System.out.println(result);

   }
 

    
}





