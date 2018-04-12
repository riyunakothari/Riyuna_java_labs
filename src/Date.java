

public class Date {
	private long day;
	private long month;
	private long year;

	
public Date(long day,long month,long year){
	this.day = day;
	this.month = month;
	this.year = year;
}

public String getdateinformat(){
	String dateinformat =  day + "/"+ month + "/"+ year;
	return dateinformat;
}


@Override
public String toString() {
	return getdateinformat();
}


}
