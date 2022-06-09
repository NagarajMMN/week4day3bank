package week4day3Assign;

public class AxisBank extends BankInfo {

	@Override
	public void savings() {
		System.out.println("this is savings account");
		
	}

	@Override
	public void fixed() {
		System.out.println("the fixed value is ");
		
	}

	@Override
	public void deposit() {
		System.out.println("the deposit is ");
		
	}
	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.savings();
		obj.fixed();
		obj.deposit();
		
		
	}

}
