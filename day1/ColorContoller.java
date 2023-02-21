package day1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorContoller {
	@RequestMapping(value="/color/{color}",method = RequestMethod.GET)
	public String getColor(@PathVariable String color) {
		return "My favourite color is " + color;
	}

}
