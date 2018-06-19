package br.jus.trf1.aletheia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.jus.trf1.aletheia.model.Demanda;

@Repository
public interface Demandas extends JpaRepository<Demanda, Long> {

}