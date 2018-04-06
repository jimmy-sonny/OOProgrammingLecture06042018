package it.polito.ooprog.main;

public class PlatinumAccount extends PremiumAccount {

	public PlatinumAccount(String name, String surname, double initialBalance) {
		super(name, surname, initialBalance);
	}
	
	@Override
	public double getPenalty() {
		if (initialBalance <= 500) {
			return 0;
		} else {
			return initialBalance * 0.07;
		}
	}
	
	@Override
	public double getInterests() {
		return initialBalance * 0.07;
	}

}
