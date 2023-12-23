package prac_01;

public class CharacterCount {

	public static void main(String[] args)
    {
       String str = "Hello how Re you ?";
       String[] strArr = str.split(" ");
       String newStr = String.join("",strArr);
      
       int[] arr = CharacterCount.countChars(newStr);
       StringBuilder sb = new StringBuilder();
       
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i]>0)
           {
                  char c =(char) i;
                  System.out.println("Character "+c+" appears "+arr[i]+" no. of times");
                  sb.append(c).append(arr[i]);
                  
           }
         
        
       }
       String str1 = sb.toString();
       System.out.println(str1);


    }

	static int[] countChars(String str) {
		int[] Arr = new int[256];

		for (char c : str.toCharArray()) {
			Arr[(int) c]++;
		}
		return Arr;

	}

}
