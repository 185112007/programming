package nestedclasses;

import java.util.HashMap;

public class BankWithNonStaticInner {
	public class Account {
		private String id;
		private String name;
		private int money;
		
		public Account(String id, String name, int amount) {
			this.id = id;
			this.name = name;
			this.money = amount;
		}
		
		public void open() {
			accounts.put(id, this);
		}
		
		public void close() {
			accounts.remove(id);
		}
	}

	public static class Banker {
		public BankWithNonStaticInner createBank() {
			return new BankWithNonStaticInner();
		}
	}

	private BankWithNonStaticInner() {
		
	}

	private HashMap<String, Account> accounts = new HashMap<>();

	public void putMoney(String id, int amount) {
		Account account = accounts.get(id);
		if (account == null) {
			return;
		}

		account.money += amount;
	}

	public void getMoney(String id, int amount) {
		Account account = accounts.get(id);
		if (account == null) {
			return;
		}

		account.money -= amount;
	}
}
