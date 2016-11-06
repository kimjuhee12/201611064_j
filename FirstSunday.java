import java.util.Calendar;

class FirstSunday {
	int sYear, eYear, times;
	
	public FirstSunday() {
		sYear = 1901;
		eYear = 2000;
		times = 0;
	}
	
	public void computeSunday() {
		for (int i = sYear; i <= eYear; i++) {
			for (int j = 0; j < 12; j++) {
				Calendar c = Calendar.getInstance();
				c.set(i, j, 1);							
				if (c.get(Calendar.DAY_OF_WEEK) == 1)	
					times++;
			}
		}
		System.out.println("The First Sunday in 20th century is" + times + "times");
	}
	
	public static void main(String[] args) {
		FirstSunday fd = new FirstSunday();
		fd.computeSunday();
	}
}