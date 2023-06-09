package com.DesafioDigix.Desafio.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DesafioDigix.Desafio.models.Familia;

@Repository
public interface FamiliaRepository extends CrudRepository<Familia, Long> {
    List<Familia> findByNomeContaining(String nomeResposavel);

    public List<Familia> findAll();
}