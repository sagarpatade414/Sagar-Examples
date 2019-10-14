public class DefangingIPAddress {
	
     public static void main(String[] args) {
    	 
    	 //String address = "1.1.1.1";
    	 String address = "255.100.50.0";
    	 String defangIPaddr = defangIPaddr(address);
    	 System.out.print("defang IP addr : " + defangIPaddr);
    	 
     }
	
	 public static String defangIPaddr(String address) {
		 
		 StringBuilder defangIpAddress = new StringBuilder();
		 
		 for(int i=0; i<address.length(); i++) {
			 
			 char current = address.charAt(i);
			 
			 
			 if(current == '.' ) {
				 defangIpAddress.append("[.]");
			 }else {
				 defangIpAddress.append(current);
			 }
		 }
		 
		 return defangIpAddress.toString();
		 
	 }
	
}
