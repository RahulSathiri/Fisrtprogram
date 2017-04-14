
public class Worddup {

	 public StringBuilder dup(String s1){
	      String name=s1;
	      StringBuilder sb=new StringBuilder(name);
	      		for(int i=0;i<name.length();i++){
	      				for(int j=i+1;j<name.length();j++){
	      						if(name.charAt(i)==name.charAt(j)){
	      								sb.deleteCharAt(j);
 
	      						}
	      				}
	      		}
	     
	      
return sb;
	    }
}

