package my.test.app.application.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.test.app.application.services.DashboardService;

@RestController
public class DashboardController {

	@Autowired
	private DashboardService dashboardService;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello";
	}
	
	@GetMapping("/getAll")
	public List<String> getAllProcessInstances(@RequestParam String name){
		
		return dashboardService.getAllProcessInstances(null);
	}
	
}
