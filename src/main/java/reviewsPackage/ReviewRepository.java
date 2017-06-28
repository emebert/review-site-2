package reviewsPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import reviewsPackage.BusStops;

@Component
public class ReviewRepository {

		public Map<Long, BusStops> stops = new HashMap<>();
	
	public ReviewRepository() {
		BusStops neil = new BusStops(1,"Neil Ave. & Wilber Ave.", "src/main/resources/static/images/neil.png", "COTA lines","summer");
		stops.put(1L, neil);
		
		BusStops mound = new BusStops (2, "Mound Ave. & Grant Ave.", "src/main/resources/static/images/mound.png", "COTA lines", "summer");
		stops.put(2L, mound);
		
		BusStops high = new BusStops (3, "High St. & Buttles Ave", "src/main/resources/static/images/high.png", "COTA lines", "summer");
		stops.put(3L, high);
	}
	
	public Collection<BusStops> findAll(){
		return stops.values();
	}
	
	public BusStops findOne(Long id){
		return null;
	}
	
}