package hu.atsoft.playground.sfgpetclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.atsoft.playground.sfgpetclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
	
	@Autowired
	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
		System.out.println("new owner service");
	}

	@RequestMapping({ "", "index", "index.html" })
	public String listOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		
		return "owners/index";
	}
}
