package com.empresa.office.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.office.Entidade.Funcionario;
import com.empresa.office.Repositorios.FuncionarioRepository;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioRepository repository;

    @GetMapping
    public List<Funcionario> findAll() {
        List<Funcionario> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/id")
    public Funcionario findById(Long id) {
        Funcionario result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public Funcionario insert(@RequestBody Funcionario funcionario) {
        Funcionario result = repository.save(funcionario);
        return result;
    }

}
