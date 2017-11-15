import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class EtterTestModul {

	public static void main(String[] args) {

		Dates date = new Dates();

		System.out.println("Året er: " + date.getYear());

		System.out.println("Måned er: " + date.getMonth());

		System.out.println("Dag er: " + date.getDay());

		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		date.setTimeMillis(1000000000L);
		System.out.println("Datoen er: " + format.format(date.getTimeMillis()));
		date.setTimeMillis(10000000000L);
		System.out.println("Datoen er: " + format.format(date.getTimeMillis()));
		date.setTimeMillis(1000000000000L);
		System.out.println("Datoen er: " + format.format(date.getTimeMillis()));
		date.setTimeMillis(10000000000000L);
		System.out.println("Datoen er: " + format.format(date.getTimeMillis()));
		date.setTimeMillis(100000000000000L);
		System.out.println("Datoen er: " + format.format(date.getTimeMillis()));
	}
}

class Dates {
	public long TimeMillis;
	GregorianCalendar dateCreated = (GregorianCalendar) GregorianCalendar.getInstance();

	public Dates() {

	}

	public String getYear() {
		DateFormat formatYear = new SimpleDateFormat("yyyy");
		return formatYear.format(dateCreated.getTime());
	}

	public String getMonth() {
		DateFormat formatMonth = new SimpleDateFormat("MM");
		return formatMonth.format(dateCreated.getTime());

	}

	public String getDay() {
		DateFormat formatDay = new SimpleDateFormat("dd");
		return formatDay.format(dateCreated.getTime());

	}

	public void setTimeMillis(long milliseconds) {
		this.TimeMillis = milliseconds;

	}

	public long getTimeMillis() {
		return this.TimeMillis;

	}

}