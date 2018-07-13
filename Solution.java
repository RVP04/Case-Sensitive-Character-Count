import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int position = sc.nextInt();
	    String letterCase = sc.next();
	    int count = 0;
	    
	    String[] characterArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	    
	    String checkAlphabet = characterArray[position-1];
	    
	    for(int i =0;i<input.length();i++)
	    {
	         if(letterCase.equals("l")||letterCase.equals("L"))
	         {
	             if(String.valueOf(input.charAt(i)).equals(checkAlphabet))
	                count++;
	         }
	         else
	         {
	             if(Character.isUpperCase(input.charAt(i))&&String.valueOf(input.charAt(i)).equals(checkAlphabet.toUpperCase()))
	                count++;
	         }
	    }
	    if(count==0)
	        count=-1;
	        
	    System.out.println(count);

	}
}
