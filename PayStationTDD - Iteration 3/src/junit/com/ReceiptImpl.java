package junit.com;

public class ReceiptImpl implements Receipt {
	int value;
	
	public ReceiptImpl() {
		value = 0;
	}
	@Override
	public int value() {
		// TODO Auto-generated method stub	
		return this.value;
	}
	public void changeValue(int readDisplay) {
		this.value = readDisplay;
	}

}
