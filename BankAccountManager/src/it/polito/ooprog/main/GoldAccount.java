package it.polito.ooprog.main;

public class GoldAccount extends PremiumAccount {

	public GoldAccount(String name, String surname, double initialBalance) {
		super(name, surname, initialBalance);
	}

	@Override
	public double getPenalty() {
		if (initialBalance <= 250) {
			return 0;
		} else {
			return initialBalance * 0.05;
		}
	}

	@Override
	public double getInterests() {
		return initialBalance * 0.04;
	}
}
