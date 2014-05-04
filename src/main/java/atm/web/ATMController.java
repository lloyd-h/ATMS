package atm.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import atm.service.ATMManager;

@Controller
public class ATMController {
	
	private final ATMManager atmManager;
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	public ATMController(ATMManager atmManager){
		this.atmManager = atmManager;
	}

	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
		
		//TODO This should return the withdraw form view
		String currentTime = (new Date()).toString();
		logger.info("returning hello view with " + currentTime);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", currentTime);
		
		return new ModelAndView("hello"); 
	}
	
	/**
	 * This handles the withdraw requests
	 * @return
	 */
	@RequestMapping("/withdraw")
    public ModelAndView withdrawHandler(int amount) {
		
		//TODO call the withdraw method of the atmManager and show result
		boolean result = atmManager.withdraw(amount);
        return new ModelAndView("result");
    }
	
	

}
