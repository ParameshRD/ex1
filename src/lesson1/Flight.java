package lesson1;

public class Flight implements Comparable<Flight>{
	
	
	private int flightnum;
	private String sourcecity;
	private String destcity;
	private int fare;
	private int duration;
	
	
	public Flight(int flightnum, String sourcecity, String destcity, int fare, int duration) {
		super();
		this.flightnum = flightnum;
		this.sourcecity = sourcecity;
		this.destcity = destcity;
		this.fare = fare;
		this.duration = duration;
	}


	public int getFlightnum() {
		return flightnum;
	}


	public void setFlightnum(int flightnum) {
		this.flightnum = flightnum;
	}


	public String getSourcecity() {
		return sourcecity;
	}


	public void setSourcecity(String sourcecity) {
		this.sourcecity = sourcecity;
	}


	public String getDestcity() {
		return destcity;
	}


	public void setDestcity(String destcity) {
		this.destcity = destcity;
	}


	public int getFare() {
		return fare;
	}


	public void setFare(int fare) {
		this.fare = fare;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "Flight [flightnum=" + flightnum + ", sourcecity=" + sourcecity + ", destcity=" + destcity + ", fare="
				+ fare + ", duration=" + duration + "]";
	}

	@Override
	public int compareTo(Flight cost) {
		// TODO Auto-generated method stub
		
		if(this.getFare() > cost.getFare())
			
			return 1;
		else
			
			return -1 ;
	}
	
	
	
	

}
