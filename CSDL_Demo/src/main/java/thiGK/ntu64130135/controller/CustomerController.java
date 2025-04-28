package thiGK.ntu64130135.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import thiGK.csdl_demo.entities.Customer;
import thiGK.csdl_demo.respositories.CustomerRepository;
import ThiGK.csdl_demo.services.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("customer/all")
	public String getAll(ModelMap m) {
		List<Customer> dsKHs= new ArrayList<Customer>();
		dsKHs = customerService.allKH();
		m.addAttribute("dsKH",dsKHs);
		return "dskh";
	}
}