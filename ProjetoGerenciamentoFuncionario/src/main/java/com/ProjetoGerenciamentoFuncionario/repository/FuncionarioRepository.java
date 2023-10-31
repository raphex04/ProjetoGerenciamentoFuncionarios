package com.ProjetoGerenciamentoFuncionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoGerenciamentoFuncionario.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Long>{

}