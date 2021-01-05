package myPackage;

public class Movie {
	private String name;
	private String mpaa;
	private int rate1;
	private int rate2;
	private int rate3;
	private int rate4;
	private int rate5;
	private double average;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMpaa() {
		return mpaa;
	}
	public void setMpaa(String mpaa) {
		this.mpaa = mpaa;
	}
	public void addRating(int rate) {
		if(rate==1)
			rate1++;
		else if(rate==2)
			rate2++;
		else if(rate==3)
			rate3++;
		else if(rate==4)
			rate4++;
		else if(rate==5)
			rate5++;
		else
			System.out.println("Enter the 1~5");
		
	}
	public double getAverage() {
		average = (double)(rate1 + (rate2 * 2) + (rate3 * 3) + (rate4 * 4) + (rate5 * 5))/(rate1+rate2+rate3+rate4+rate5);
		return average;
	}
    public boolean equals(Movie movie) {
        return this.name.equals(movie.name) &&
            this.mpaa.equals(movie.mpaa) &&
            this.rate1 == movie.rate1 &&
            this.rate2 == movie.rate2 &&
            this.rate3 == movie.rate3 &&
            this.rate4 == movie.rate4 &&
            this.rate5 == movie.rate5;
    }
}
