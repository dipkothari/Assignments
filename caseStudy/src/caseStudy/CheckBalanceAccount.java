package caseStudy;
class Account{
	private int accAmout;
	private int accNo;
	private String custName;
	public int getAccAmout() {
		return accAmout;
	}
	public void setAccAmout(int accAmout) {
		this.accAmout = accAmout;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
}
public class CheckBalanceAccount {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccNo(1231408);
		acc.setCustName("Deep");
		acc.setAccAmout(400);
		
		if(acc.getAccAmout()>=500) {
			System.out.println("Account NO:"+acc.getAccNo()+"\n"+
								"Account Name:"+acc.getCustName()+"\n"+
								"Account Amount:"+acc.getAccAmout());
		}
		else {
			System.out.println("Hello "+acc.getCustName()+ " the balance of account number "+acc.getAccNo()+" is low");
		}
	}
}
