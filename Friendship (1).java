package MutiThread.com;
class Friendship{
	synchronized public void classroom(String friendsName ) {
		String[] strArray = new String[] {"Jinesha", "Prachi", "sejal", "shrii", "Shital", 
				                          "priya", "rutuja", "neha", "payal", "maniii"};
	        for (String s:strArray) {  
	        System.out.println(s);  
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}


