package MutiThread.com;


	public class MainFriends extends Thread{
		public static void main(String args[]) {
			Friendship frd= new Friendship();
			MyThread mt= new MyThread(frd , " ");
			System.out.println("My Friends...... ");
			
			mt.start();	
			
		}
		
		}
