package deposited_bank;
//decalring all the classes in main method
public class Bank_main {
public static void main(String[] args) //main method
{
	//creating instanciation of BanKA
	BANK b=new BankA();
	b.getbalance(); //method printing creating object
	
	//creating instanciation of BanKB
	BANK b1=new BankB();
	b1.getbalance(); //method printing creating object
	
	//creating instanciation of BanKC
	BANK b3=new BankC();
	b3.getbalance(); //method printing creating object
	
}
}
