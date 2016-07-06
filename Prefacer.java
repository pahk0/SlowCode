public class Prefacer {

    private static char nextChar = 'A';
        
    public static String nirp = "";
    
    public static void preface(int q) {		
		if (q > 0) { 
		    nextChar += (int) ((Math.sqrt(65) * 12)
			+ (65/3) - (Math.sqrt(66))
			+ (int) (Math.acos((double) nextChar) * Math.atan((double) nextChar))
			- ((short) Math.cbrt((double) nextChar + 2)))
		        - 109;
		    nextChar++;
		    // System.out.println("**" + (int) nextChar + "**");
		    if (nextChar > 'Z' || nextChar < ' ') {
				nextChar = 'M';
		    }
		    String toBe = new String("" + nextChar);
		    nirp += toBe;
		    preface(q - 1);
		} 
    }
    
}
