
public class Main {
	public static void main(String args[]) {
		Date dayPuclish = new Date(17,12,2022);
		Brand myBrand = new Brand("BaoStudio", "VietNam");
		Movie myMovie = new Movie("Doraemon", 2021, myBrand, 200000, dayPuclish);
	
		System.out.println(myMovie.getPriceAfterPromotion(10));
	}
}