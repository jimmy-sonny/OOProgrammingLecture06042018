package it.polito.ooprog.main;

public class SpecialEdition extends Book {

	public SpecialEdition(String title, String author, double price) {
		super(title, author, price);
		this.price = this.price + this.price * 0.3;
	}

	@Override
	public String toString() {
		return "SpecialEdition [title=" + title + ", author=" + author + ", price:" + price + "]";
	}

	public boolean isSpecialEdition() {
		return true;
	}
}
