class Multiple {
	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.getSum();
	}
	
	public void getSum() {
		int sum = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0)
				sum += i;
			else if (i % 5 == 0)
				sum += i;
			else {}
		}
		
		System.out.println("Sum = " + sum);
	}
}