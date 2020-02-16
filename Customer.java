
public class Customer {

	private int arrivalTime;
	private int transactionTime;
	private int customerNumber;
	
/**
 * Constructor
 * @param clock
 * @param transaction
 * @param num
 */
	public Customer(int clock, int transaction, int num) {
		arrivalTime = clock;
		transactionTime = transaction;
		customerNumber = num;
	}

	public int getTransactionTime() {
	 return transactionTime;
	
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

}
