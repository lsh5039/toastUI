package com.toast.grid;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.toast.grid.service.EmployeeSerivce;
import com.toast.grid.vo.EmployeeVO;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	//toastDataList
	//toastList
	
	@Autowired
	private EmployeeSerivce employeeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@GetMapping("join")
	public String goJoin(Model model) {
		model.addAttribute("employeeVO", EmployeeVO.builder().build());
		
		
		return "join";
	}
	
	@PostMapping("doJoin")
	public String doJoin(EmployeeVO employeeVO) {
		
		log.info("employeeVO ::: "+employeeVO.getEmpNo());
		log.info("employeeVO ::: "+employeeVO.getEmpName());
		log.info("employeeVO ::: "+employeeVO.getEmpSex());
		log.info("employeeVO ::: "+employeeVO.getEmpAge());
		log.info("========================================");
		int result = employeeService.doJoin(employeeVO);
		log.info("result :: "+result);

		
		return "redirect:/search";
	}
	
	@GetMapping("search")
	public String doSearch() {
		return "search";
	}
	
	
	
}
