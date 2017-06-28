package reviewsPackage;

public class BusStops {
	
	private long id;
	private String title;
	private String imgURL;
	private String reviewCategory;
	private String season;



	public BusStops(long id, String title, String imgURL, String reviewCategory, String season) {
		this.id = id;
		this.title = title;
		this.imgURL = imgURL;
		this.reviewCategory = reviewCategory;
		this.season = season;
	}

	public long getId() {
		return id;
	}



	public String getTitle() {
		return title;
	}



	public String getImgURL() {
		return imgURL;
	}



	public String getReviewCategory() {
		return reviewCategory;
	}



	public String getSeason() {
		return season;
	}

}