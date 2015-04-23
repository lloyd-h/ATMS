package atm.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import atm.data.WithdrawForm;
import atm.service.ATMManager;

@Controller
public class ATMController {
	
	private final ATMManager atmManager;
	
	//protected final Log logger = LogFactory.getLog(getClass());
	protected static final Logger logger = LoggerFactory.getLogger(ATMController.class);
	
	@Autowired
	public ATMController(ATMManager atmManager){
		this.atmManager = atmManager;
	}
	
	@ModelAttribute
	public WithdrawForm addWithdrawForm(){
		return atmManager.getForm();
	}

	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String handleRequest() throws Exception {
		
		//This should return the withdraw form view
		String currentTime = (new Date()).toString();
		logger.info("returning hello view with " + currentTime);
		
		return "withdrawForm"; 
	}
	
	/**
	 * This handles the withdraw requests
	 * @return
	 */
	@RequestMapping(value="/welcome", method = RequestMethod.POST)
    public String withdrawHandler(@RequestParam int amount, Model model) {
		
		//call the withdraw method of the atmManager and show result
		boolean result = atmManager.withdraw(amount);
		if(result){
			model.addAttribute("result", "Successful");
			model.addAttribute("amount", amount);
		}
		else{
			model.addAttribute("result", "unsuccessful");
			model.addAttribute("amount", 0);
		}
		return "result";
    }
	
	

}
