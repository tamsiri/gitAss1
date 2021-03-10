package gitAss1;

public class swappingFirstLastLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str="java";
	System.out.println(reverseFirstLast( str));
			
	 }

	public static String reverseFirstLast(String str) {
	char[] ch= str.toCharArray();
	
   if(str.length()<2) {
	 return str;
   }
 char temp=ch[0];
 ch[0]=ch[ch.length-1];
	ch[ch.length-1]=temp;	 
	return String.valueOf(ch);	
	}
}




	