package fr.m2i.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.m2i.rest.models.Credit;
import fr.m2i.rest.models.Debit;

@Repository
public interface CreditRepository extends JpaRepository<Credit,Double>{

	@Transactional
	List<Credit> findAll();
}
