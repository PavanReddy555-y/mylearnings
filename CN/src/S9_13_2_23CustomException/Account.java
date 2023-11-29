package S9_13_2_23CustomException;

public interface Account {
	
	void blance();
	void deposite(double depositamt);
	void withDraw(double withdraAmt) throws Exception;
	

}
