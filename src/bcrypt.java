/*
Becrypt - A simple yet effective cryptography program.
@author - Arun George



*/
	   
	   public static void encrypt() {
	    
	        // encrypt data
	        StringBuffer data = new StringBuffer("Hello");
	         
	        for (int i=0; i<data.length(); i++) {
	             
	            int temp = 0; // temporary value placeholder
	            temp = (int) data.charAt(i);
	            temp = temp*9;
	             
	            data.setCharAt(i, (char)temp);
	        }
	         
	            System.out.println(data.toString());

	   }
	   
	   public static void decrypt () {
	     
	        // decrypt data
	        StringBuffer data = new StringBuffer("ʈ΍όόϧ");
	         
	        for (int i=0; i<data.length(); i++) {
	             
	            int temp = 0; // temporary value placeholder
	            temp = (int) data.charAt(i);
	            temp = temp/9;
	             
	            data.setCharAt(i, (char)temp);
	        }
	         
	            System.out.println(data.toString());
	   }
