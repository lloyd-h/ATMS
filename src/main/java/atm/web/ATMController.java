package atm.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import atm.service.ATMManager;

public class ATMController implements Controller {
	
	private ATMManager atmManager;
	
	protected final Log logger = LogFactory.getLog(getClass());

	public void setAtmManager(ATMManager atmManager) {
		this.atmManager = atmManager;
	}

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		String currentTime = (new Date()).toString();
		logger.info("returning hello view with " + currentTime);
		
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", currentTime);
		
		return new ModelAndView("hello", "myModel", myModel); 
	}
	
	

}
