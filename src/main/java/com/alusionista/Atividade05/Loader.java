package com.alusionista.Atividade05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Loader implements CommandLineRunner {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public void run(String... args) {

        Departamento dep1 = new Departamento();
        dep1.setCodigo(101);
        dep1.setNome("Recursos Humanos");

        Departamento dep2 = new Departamento();
        dep2.setCodigo(201);
        dep2.setNome("Financeiro");

        Departamento dep3 = new Departamento();
        dep3.setCodigo(301);
        dep3.setNome("Vendas");

        departamentoRepository.save(dep1);
        departamentoRepository.save(dep2);
        departamentoRepository.save(dep3);

        Funcionario func1 = new Funcionario();
        func1.setCodigo(1001);
        func1.setNome("João da Silva");
        func1.setQuantidadeDependentes(2);
        func1.setSalario(5000.0);
        func1.setCargo("Analista");
        func1.setDepartamento(dep1);

        Funcionario func2 = new Funcionario();
        func2.setCodigo(1002);
        func2.setNome("Maria Souza");
        func2.setQuantidadeDependentes(1);
        func2.setSalario(4500.0);
        func2.setCargo("Assistente");
        func2.setDepartamento(dep2);

        Funcionario func3 = new Funcionario();
        func3.setCodigo(1003);
        func3.setNome("Pedro Santos");
        func3.setQuantidadeDependentes(3);
        func3.setSalario(6000.0);
        func3.setCargo("Gerente");
        func3.setDepartamento(dep2);

        Funcionario func4 = new Funcionario();
        func4.setCodigo(1004);
        func4.setNome("Ana Oliveira");
        func4.setQuantidadeDependentes(0);
        func4.setSalario(3800.0);
        func4.setCargo("Analista");
        func4.setDepartamento(dep3);

        funcionarioRepository.save(func1);
        funcionarioRepository.save(func2);
        funcionarioRepository.save(func3);
        funcionarioRepository.save(func4);
    }
}
