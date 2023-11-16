package com.example.praticaapi;

import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
  List<Funcionario> findById(int id);

// List<Funcionario> deleteByDataAdmissao(Timestamp dataAdmissao);
}
