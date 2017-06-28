package reviewsPackage;
import reviewsPackage.BusStops;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController extends ReviewRepository {

@Resource
ReviewRepository repository;
	
	@RequestMapping("/reviews")
	public String fetchBusReviews(Model model) {
		model.addAttribute("stopsAsCollection", repository.findAll());
		return "busReviews";
	}

	/*@RequestMapping("/hello")
	public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting";
	} */

}
