

public class Palindromeword {	 
	    public boolean isPolyndrom(String original){
	    	  String reverse = "";
	 
	      int length = original.length();
	 if(original==null)
		 return false;
	 else{
		 
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         return true;
	      else 
	    	  return false;
	 }
	   }
}
