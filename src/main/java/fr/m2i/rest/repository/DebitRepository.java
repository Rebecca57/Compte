package fr.m2i.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.m2i.rest.models.Debit;

@Repository
public interface DebitRepository extends JpaRepository<Debit,Double>{

}
