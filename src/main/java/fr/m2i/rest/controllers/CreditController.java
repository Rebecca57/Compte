package fr.m2i.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.m2i.rest.models.Compte;
import fr.m2i.rest.models.Credit;
import fr.m2i.rest.models.Debit;
import fr.m2i.rest.services.CreditService;
import fr.m2i.rest.services.DebitService;


@Controller
@RequestMapping("credit")
public class CreditController {
	
	@Autowired
	CreditService ds;
	
	@PostMapping(name="addCredit",value="/addCredit")
	public String addCredit(Model model, @ModelAttribute Credit creditA) {
		System.out.println(creditA.getTitre());
		//System.out.println(compte.getId());
		//System.out.println(model.getAttribute("compte"));
		ds.addCredit(creditA);
		return "redirect:/";
	}
	
	@PostMapping(name="deleteCredit",value="/deleteCredit")
	public String deleteCredit(Model model, @ModelAttribute Credit credit) {
		System.out.println(credit.getTitre());
		//System.out.println(compte.getId());
		//System.out.println(model.getAttribute("compte"));
		ds.deleteCredit(credit);
		return "redirect:/";
	}

	
	
	

}
