package fr.m2i.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.m2i.rest.models.Credit;
import fr.m2i.rest.models.Debit;
import fr.m2i.rest.repository.CreditRepository;
import fr.m2i.rest.repository.DebitRepository;
import lombok.Data;

@Service
@Data
public class CreditService {
	
	@Autowired
	CreditRepository dr;
	
	public List<Credit> getCompte(){
		return dr.findAll();
	}

	public List<Credit> getCredits() {
		return dr.findAll();
	}

	public void addCredit(Credit creditA) {
		dr.save(creditA);
	}

	public void deleteCredit(Credit credit) {
		dr.delete(credit);
	}

}
