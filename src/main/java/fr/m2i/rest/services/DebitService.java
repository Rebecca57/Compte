package fr.m2i.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.m2i.rest.models.Debit;
import fr.m2i.rest.repository.DebitRepository;
import lombok.Data;

@Service
@Data
public class DebitService {
	
	@Autowired
	DebitRepository dr;
	
	public List<Debit> getCompte(){
		return dr.findAll();
	}

	public List<Debit> getDebits() {
		return dr.findAll();
	}

	public void addDebit(Debit debitA) {
		dr.save(debitA);
	}

	public void deleteDebit(Debit debit) {
		dr.delete(debit);
	}

}
