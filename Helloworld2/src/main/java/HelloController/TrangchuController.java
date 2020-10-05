package HelloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TrangchuController {

	@RequestMapping("/")

	public String viewTrangchu() {
		
		return "index";
		
	}
	
	@RequestMapping("/login")
	@ResponseBody

	public String viewLogin() {
		
		return "Login";
		
	}
}
