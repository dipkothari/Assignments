package caseStudy;

 class demo {
	private char modeOfTravel;
	private int noOfTickets;
	private double amount;
	public char getModeOfTravel() {
		return modeOfTravel;
	}
	public void setModeOfTravel(char modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}

class Travel{
	
	
	public static void main(String[] args) {
		int TotalServiceCharge ;
		demo t = new demo();
		String s = args[0];
		t.setModeOfTravel(s.charAt(0));
		t.setNoOfTickets(Integer.parseInt(args[1]));
		if(t.getModeOfTravel()=='F') {
			TotalServiceCharge = 500;
			TotalServiceCharge = TotalServiceCharge * t.getNoOfTickets();
			t.setAmount(TotalServiceCharge);
			System.out.println("Travel Mode "+t.getModeOfTravel()+"\n"+
								"Total no of tickect "+t.getNoOfTickets()+"\n"+
								"Total Amount :"+t.getAmount());
		}
		else if(t.getModeOfTravel()=='T') {
			TotalServiceCharge = 100;
			TotalServiceCharge = TotalServiceCharge * t.getNoOfTickets();
			t.setAmount(TotalServiceCharge);
			System.out.println("Travel Mode "+t.getModeOfTravel()+"\n"+
								"Total no of tickect "+t.getNoOfTickets()+"\n"+
								"Total Amount :"+t.getAmount());
		}
		else if(t.getModeOfTravel()=='B') {
			TotalServiceCharge = 50;
			TotalServiceCharge = TotalServiceCharge * t.getNoOfTickets();
			t.setAmount(TotalServiceCharge);
			System.out.println("Travel Mode "+t.getModeOfTravel()+"\n"+
								"Total no of tickect "+t.getNoOfTickets()+"\n"+
								"Total Amount :"+t.getAmount());
		}
	}
}
