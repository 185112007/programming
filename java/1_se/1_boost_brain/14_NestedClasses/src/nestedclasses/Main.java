package nestedclasses;

public class Main {

	public static void main(String[] args) {
		Bank.Banker banker = new Bank.Banker();
		Bank bank = banker.createBank();
		
		
		BankWithNonStaticInner.Banker banker2 = new BankWithNonStaticInner.Banker();
		BankWithNonStaticInner bank2 = banker2.createBank();
		BankWithNonStaticInner.Account account = bank2.new Account("wqe", "Boost", 10000);
		
		account.open();
		
		bank2.putMoney("qwe", 500);
		bank2.getMoney("qwe", 200);
		
		account.close();
	}

}
