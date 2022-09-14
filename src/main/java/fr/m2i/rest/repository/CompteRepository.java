package fr.m2i.rest.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.m2i.rest.models.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Double>{
	
	/**@Transactional
	@Modifying
	@Query("update compte c set c.salaire = ?1 where c.id = ?2")
	void changeSalaire(Long id, double salaire);
	**/
	
	@Transactional
	@Modifying
	@Query("update Compte c set c.salaire = ?2 where c.id = ?1")
	void changeSalaire(Long id, double s);
}