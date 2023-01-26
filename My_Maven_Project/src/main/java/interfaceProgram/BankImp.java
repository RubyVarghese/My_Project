package interfaceProgram;

public class BankImp implements Bank, Bank2 {
	public void credit() {
		System.out.println("Printing credit method");
	}

	public void debit() {
		System.out.println("Printing debit method");
	}

	public void loan() {
		System.out.println("Printing loan method");
	}

	public void carloan() {
		System.out.println("Printing car loan");
	}

	public void account() {
		System.out.println("Printing account method");
	}

	public static void main(String[] args) {
		BankImp b=new BankImp();
		b.account();
		b.carloan();b.credit();
		b.debit();
		b.loan();

	}

}
