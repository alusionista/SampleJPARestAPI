package com.alusionista.Atividade05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class MainController {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping("/departamento")
    public List<Departamento> getDepartamentos(){
        return departamentoRepository.findAll();
    }

    @GetMapping("/funcionario")
    public List<Funcionario> getFuncionarios(){ return funcionarioRepository.findAll(); }

}
