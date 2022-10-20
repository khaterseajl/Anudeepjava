package MutiThread.com;
class Friendship{
	synchronized public void classroom(String friendsName ) {
		String[] strArray = new String[] {"vikas", "Prachi", "sejal", "shri", "omkar", 
				                          "rutu", "mansi", "amena", "pratik", "shiva"};
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


