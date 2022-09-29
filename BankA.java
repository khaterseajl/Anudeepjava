package deposited_bank;
//generating interface class BankA using implement keyword
public class BankA implements BANK {

	@Override //method overriden
	public int getbalance() {//printing getbalance method 
		System.out.println("Bank A has deposited: 1000rs");
		return 0;//returning values
		
	}

}
