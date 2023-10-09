import java.util.Date;
public class Birthday {
	private int month, day, year;
	
	public Birthday(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Birthday [month=" + month + ", day=" + day + ", year=" + year + "]";
	}
}
