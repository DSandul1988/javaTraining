package arrays;

import java.util.Arrays;

public class codewars {
	public  static String areYouPlayingBanjo(String name) {
		   char i = name.toLowerCase().charAt(0);
		    if (i=='r')
		      return name +" plays banjo" ;
		    else 
		      return name + " does not play banjo";
		  }
	public static int[] reverse(int n){
		 int []k = new int[n];
		    for(int i= 0; i<n;i++){
		   {
		    	k[i]=n-i;
		    }
		      }
		    
		     
		    return k;
		  }

	public static String smash(String [] words) {
		
		 return String.join(" ", words);
	
	    }
	public static String dnaToRna(String dna) {
		
		
        return dna.toUpperCase().replace('U', 'L');  // Do your magic!
    } 
	public static String abbrevName(String name) {
	   String[] a= name.split(" ");
	    String b = String.valueOf(a[0].charAt(0));
	    String c = String.valueOf(a[1].charAt(0));
	    
	    return b.toUpperCase() + "." + c.toUpperCase() + ".";
	    
	    } 

	public static void main(String[] args) {
		System.out.println(dnaToRna("UUUU"));
		
}
	public static String correct(String string) {
	   
		
		return string.toUpperCase().replace('S', '5');
	  }
}