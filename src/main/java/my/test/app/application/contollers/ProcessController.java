package my.test.app.application.contollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import my.test.app.application.services.ProcessMgmtService;

@RestController
public class ProcessController {

	@Autowired
	private ProcessMgmtService processMgmtService;
	
	@PostMapping("/startProcess")
	public void startProcess() {
		processMgmtService.startProcess();
	}
}
