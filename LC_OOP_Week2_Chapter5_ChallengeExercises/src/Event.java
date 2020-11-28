
public class Event {

	public final static double LowPrice = 32;
	public final static double HighPrice = 35;
	public int NumOfGuest;
	public int NumOfEvent;
	public double PricePP;
	public double PricePE;
	
	public Event(int NumOfGuest, int NumOfEvent) {
		
		this.setNumOfGuest(NumOfGuest);
		this.setNumOfEvent(NumOfEvent);
		
	}
	
	public int getNumOfGuest() {
		return NumOfGuest;
	}
	
	public double getPricePP() {
		return PricePP;
	}
	
	public double getPricePE() {
		return PricePE;
	}
	
	public boolean isLargeEvent() {
		
		if (NumOfGuest >= 50) {
			return true;
		} else {
			return false;
		}
			
	}
	
	public void setNumOfEvent(int number) {
		NumOfEvent = number;
	}
	
	public void setNumOfGuest(int number) {
		NumOfGuest = number;
		if(isLargeEvent())
	      {
	         PricePP = LowPrice;
	         PricePE = NumOfGuest * LowPrice;
	      }
	      else
	      {
	    	  PricePP = HighPrice;
		      PricePE = NumOfGuest * HighPrice;
	      }
	}

}
