package com.example.demo.entity;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String nome;
        private Integer idade;
        private String cpf;
        private Integer salario;
        private Integer mesesTrabalhadosNoAno;
        private Integer bonusPorIdade;
        private Integer decimoTerceiro;
        private Integer salarioTotal;

    public Funcionario(Long id, String nome, Integer idade, String cpf, Integer salario, Integer mesesTrabalhadosNoAno, Integer bonusPorIdade, Integer decimoTerceiro, Integer salarioTotal) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.mesesTrabalhadosNoAno = mesesTrabalhadosNoAno;
        this.bonusPorIdade = bonusPorIdade;
        this.decimoTerceiro = (salario/12)*mesesTrabalhadosNoAno;;
        this.salarioTotal = bonusPorIdade+salario;
    }

    public Funcionario() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Integer getMesesTrabalhadosNoAno() {
        return mesesTrabalhadosNoAno;
    }

    public void setMesesTrabalhadosNoAno(Integer mesesTrabalhadosNoAno) {
        this.mesesTrabalhadosNoAno = mesesTrabalhadosNoAno;
    }

    public Integer getBonusPorIdade() {
        return bonusPorIdade;
    }

    public void setBonusPorIdade(Integer bonusPorIdade) {
        this.bonusPorIdade = bonusPorIdade;
    }

    public Integer getDecimoTerceiro() {
        return decimoTerceiro;
    }

    public void setDecimoTerceiro(Integer decimoTerceiro) {
        this.decimoTerceiro = (salario/12)*mesesTrabalhadosNoAno;


    }

    public Integer getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(Integer salarioTotal) {
        this.salarioTotal = bonusPorIdade+salario;

    }

}
