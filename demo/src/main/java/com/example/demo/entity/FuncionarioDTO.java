package com.example.demo.entity;

public class FuncionarioDTO {
    private Integer salario;

    public FuncionarioDTO(Integer salario) {
        this.salario = salario;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
}
