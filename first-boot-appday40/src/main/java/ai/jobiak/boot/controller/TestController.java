package ai.jobiak.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String test(@RequestParam(name="loc" ,defaultValue="Boston",required=false)String Ioc,Model model) {
		model.addAttribute("com", "jobiak");
		model.addAttribute("ho", Ioc);
		model.addAttribute("add", "Vishakapatanam");
		model.addAttribute("address", "Hydrebad");
		return "Success";
	}
}
