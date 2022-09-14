package fr.m2i.rest.controllers;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.m2i.rest.models.Compte;
import fr.m2i.rest.models.Credit;
import fr.m2i.rest.models.Debit;
import fr.m2i.rest.services.CompteService;
import fr.m2i.rest.services.CreditService;
import fr.m2i.rest.services.DebitService;

@Controller
public class CompteController {
	
	@Autowired
	private CompteService cs;
	
	@Autowired
	private DebitService ds;
	
	@Autowired
	private CreditService cres;
	
	@GetMapping(name="home",value="/")
	public String getHome(Model model) {

		model.addAttribute("compte",(Compte) cs.getCompte().get(0));
		model.addAttribute("listeDebits",ds.getDebits());
		model.addAttribute("debitA",new Debit());
		model.addAttribute("listeCredits",cres.getCredits());
		model.addAttribute("creditA",new Credit());
		
		return "home";
	}
	
	
	@PostMapping(name="changeSalaire",value="/changeSalaire")
	public String changeSalaire(Model model, @ModelAttribute Compte compte) {
		System.out.println(compte.getSalaire());
		System.out.println(compte.getId());
		//System.out.println(model.getAttribute("compte"));
		cs.changeSalaire(compte);
		return "redirect:/";
	}

}
