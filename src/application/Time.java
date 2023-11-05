package application;

public class Time {
	private int hour,minute,second;
	
	public Time(int hour,int minute,int second) {
		this.hour=hour;this.minute=minute;this.second=second;
	}
	public Time() {this(0,0,0);}
	
	public Time(String ct) {
		String[] time=ct.split(":");
		hour=Integer.parseInt(time[0]);
		minute=Integer.parseInt(time[1]);
		second=Integer.parseInt(time[2]);
	}
	
	public void resetTime() {
		this.hour=0;this.minute=0;this.second=0;
	}
	
	public String getCurrentTime() {
		return hour +":"+ minute +":"+second;
	}
	
	public void oneSecondPassed() {
		second++;
		if(second==60) {
			minute++;
			second=0;
			if(minute==60) {
				hour++;
				minute=0;
				if(hour==24) {
					hour=0;
					//Next day
				}
			}
		}
	}
	
}
