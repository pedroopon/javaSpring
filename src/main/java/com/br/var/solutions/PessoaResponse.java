package com.br.var.solutions;

public class PessoaResponse {
    public String nome;
    public String sobrenome;
    public int idade;
    public String imc;
    public String classificaçãoIMC;
    public String irrf;
    public String aliquota;
    public String saldoEmDolar;

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    public String getClassificaçãoIMC() {
        return classificaçãoIMC;
    }

    public void setClassificaçãoIMC(String classificaçãoIMC) {
        this.classificaçãoIMC = classificaçãoIMC;
    }

    public String getIrrf() {
        return irrf;
    }

    public void setIrrf(String irrf) {
        this.irrf = irrf;
    }

    public String getAliquota() {
        return aliquota;
    }

    public void setAliquota(String aliquota) {
        this.aliquota = aliquota;
    }

    public String getSaldoEmDolar() {
        return saldoEmDolar;
    }

    public void setSaldoEmDolar(String saldoEmDolar) {
        this.saldoEmDolar = saldoEmDolar;
    }

    public String endereco;

    public double peso;
    public double altura;
    public double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
