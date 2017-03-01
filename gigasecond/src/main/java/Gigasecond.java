import java.time.*;

public class Gigasecond{
	public static final long gs = 1000000000;//in secs
	public static final double min = (double)(gs/60); //in min
	public static final double hr = min/60; //in hours
	public static final double days = hr/60;  //in days
	public static final double yrs = days/365;
	public final LocalDateTime date;
	
	public Gigasecond(LocalDateTime date){
		this.date=date;
	}
	
	public Gigasecond(LocalDate date){
		this(date.atStartOfDay());
	}
	
	public LocalDateTime getDate(){
		return date.plusSeconds(gs);
	}
	
}