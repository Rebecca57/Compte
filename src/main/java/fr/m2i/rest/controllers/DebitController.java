package fr.m2i.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.m2i.rest.models.Compte;
import fr.m2i.rest.models.Debit;
import fr.m2i.rest.services.DebitService;


@Controller
@RequestMapping("debit")
public class DebitController {
	
	@Autowired
	DebitService ds;
	
	@PostMapping(name="addDebit",value="/addDebit")
	public String addDebit(Model model, @ModelAttribute Debit debitA) {
		System.out.println(debitA.getTitre());
		//System.out.println(compte.getId());
		//System.out.println(model.getAttribute("compte"));
		ds.addDebit(debitA);
		return "redirect:/";
	}
	
	@PostMapping(name="deleteDebit",value="/deleteDebit")
	public String deleteDebit(Model model, @ModelAttribute Debit debit) {
		System.out.println(debit.getTitre());
		//System.out.println(compte.getId());
		//System.out.println(model.getAttribute("compte"));
		ds.deleteDebit(debit);
		return "redirect:/";
	}

	
	
	

}
