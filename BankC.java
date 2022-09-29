package deposited_bank;
//generating interface class BankC from BANK 
public class BankC implements BANK{

	@Override// method overriden
	public int getbalance() { // method to getbalance
		System.out.println("Bank C has deposited: 2000rs");
		return 0;//returning values
	}

}
