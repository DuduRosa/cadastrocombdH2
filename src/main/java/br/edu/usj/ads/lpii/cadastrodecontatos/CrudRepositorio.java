package br.edu.usj.ads.lpii.cadastrodecontatos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface CrudRepositorio extends CrudRepository<Dados, Long> {

    List<Dados> findAll();

    //H2 Banco

}