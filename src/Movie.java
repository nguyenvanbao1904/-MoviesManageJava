
public class Movie {
	private String name;
	private int yearProduce;
	private Brand brand;
	private double priceTicket;
	private Date dayPuclish;
	
	public Movie(String name, int yearProduce, Brand brand, double priceTicket, Date dayPuclish) {
		this.name = name;
		this.yearProduce = yearProduce;
		this.brand = brand;
		this.priceTicket = priceTicket;
		this.dayPuclish = dayPuclish;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearProduce() {
		return yearProduce;
	}

	public void setYearProduce(int yearProduce) {
		this.yearProduce = yearProduce;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public double getPriceTicket() {
		return priceTicket;
	}

	public void setPriceTicket(double priceTicket) {
		this.priceTicket = priceTicket;
	}

	public Date getDayPuclish() {
		return dayPuclish;
	}

	public void setDayPuclish(Date dayPuclish) {
		this.dayPuclish = dayPuclish;
	}
	
	public boolean checkCheaperPrice(Movie otherMoive) {
		return this.priceTicket < otherMoive.priceTicket;
	}
	
	public String getBrandName() {
		return this.brand.getName();
	}
	
	public double getPriceAfterPromotion(double percentPromotion) {
		return this.priceTicket - (percentPromotion / 100 * this.priceTicket);
	}

}
