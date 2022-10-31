package com.empresa.office.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.office.Entidade.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
    
}
