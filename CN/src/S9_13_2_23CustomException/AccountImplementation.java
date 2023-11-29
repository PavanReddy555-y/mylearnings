package S9_13_2_23CustomException;

public class AccountImplementation implements Account {
	private double avlblance=2000;
	
	public double getAvlblance() {
		return avlblance;
	}


	public void setAvlblance(double avlblance) {
		this.avlblance = avlblance;
	}


	@Override
	public void blance() {
		System.out.println("Available Ammount : "+ this.getAvlblance());
		
	}


	@Override
	public void deposite(double depositamt) {
		System.out.println("Deposited amount : "+ depositamt);

		System.out.println("Available Amount is : "+(this.getAvlblance()+depositamt ));
		
		this.setAvlblance(this.getAvlblance()+depositamt );
	}

	@Override
	public void withDraw(double withdraAmt) throws InSufficientAmountException {
		if(avlblance<withdraAmt) {
			throw new InSufficientAmountException("WithDraw amount is Greater than Available Amount");
		}
		else {
			System.out.println("Available Amount : "+ (this.getAvlblance()-withdraAmt));
			this.setAvlblance(avlblance-withdraAmt);
		}
		
		
	}

}
