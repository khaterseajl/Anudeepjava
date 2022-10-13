package Com.Invalidmail;

public class InvalidmailID extends Exception{ //create our own exception by simply extending exception parent class

	public InvalidmailID()  //defualt constructor
	{
		super();
	}
	
	public InvalidmailID(String msg)  //parameterized constructor
	{
		super(msg);
	}
}
