package com.dsa.task_23_09_2026;

class Payment {

	void hello() {
		System.out.println("Hello from payment");
	}
	void pay() {
		System.out.println("Processing payment");
		hello();
	}
}

class UPI extends Payment {

	@Override
	void pay() {
		System.out.println("Payment through UPI");
	}
}

class CreditCard extends Payment {

	@Override
	void pay() {
		System.out.println("Payment through Credit Card");
		this.hello();
		
	}
}

class NetBanking extends Payment {

	@Override
	void pay() {
		System.out.println("Payment through Net Banking");
	}
}

public class Main {

	public static void main(String[] args) {

		Payment p;

		p = new UPI();
		p.pay();

		p = new CreditCard();
		p.pay();

		p = new NetBanking();
		p.pay();
	}
}