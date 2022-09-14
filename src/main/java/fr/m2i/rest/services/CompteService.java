package fr.m2i.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.m2i.rest.models.Compte;
import fr.m2i.rest.repository.CompteRepository;
import lombok.Data;

@Service
@Data
public class CompteService {

	@Autowired
	CompteRepository cr;
	
	public List<Compte> getCompte(){
		return cr.findAll();
	}
	
	public void changeSalaire(Compte compte) {
		System.out.println("chjangeSalaire");
		cr.changeSalaire(compte.getId(),compte.getSalaire());
	}
	
	
}
