class Grade{
	char result;
	char computeGrade(double score){
		if(90<= score && score <=100){
			result = 'A';
			return result;
		}
		else if(80<= score && score <90){
			result = 'B';
			return result;
		}
		else if(70<= score && score <80){
			result = 'C';
			return result;		}
		else if(60<= score && score <70){
			result = 'D';
			return result;
		}
		else{
			result = 'F';
			return result;
		}
	}
	void sayGrade(char x){
		System.out.println("Grade is "+x);
	}
	public static void main(String[] args){
		Grade g = new Grade();
		double[] marks = {95.0, 83.0, 75.0, 61.0, 55.0};
		for(double m:marks){
			char r = g.computeGrade(m);
			g.sayGrade(r);
		}
	}
}
