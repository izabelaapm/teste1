package com.example.praticaapi;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Funcionario {
    @Id
    private int id;
    private String nome;
    private String cargo;
    @Column(name="data_admissao")
    private Date dataAdmissao;
    private double salario;
    @Column(name="departamento")
    private String departamento;

    public Funcionario(int id, String nome, String cargo, Date dataAdmissao, double salario, String departamento) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Funcionario(){}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}