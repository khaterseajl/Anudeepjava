package deposited_bank;
//generating interface class BankB from BANK
public class BankB implements BANK{
 
	@Override//method get overriden
	public int getbalance() { //method to getbalnce
		System.out.println("Bank B has deposited: 1500rs");
		return 0; //returning values
		
	}

}
