
package javaapplication15;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Funcionario extends Pessoa{
    
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String cpf, String rg, LocalDate dataNascimento, double salario, int id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n ID:" + super.id +
                "\n Nome: " + super.nome +
                "\n Genêro: " + super.genero +
                "\n Logradouro: " + super.endereco.logradouro +
                "\n Número: " + super.endereco.numero +
                "\n Complemento: " + super.endereco.complemento +
                "\n CEP: " + super.endereco.cep +
                "\n Cidade " + super.endereco.cidade +
                "\n UF: " + super.endereco.uf +
                "\n CPF: " + this.cpf +
                "\n RG: " + this.rg + 
                "\n Data Nascimento: " + Util.formatDate(dataNascimento) +
                "\n Salário: " + this.salario;
    }
    
    

    public String getCpf() {
        return cpf;
    }
    

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getIdade(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(date);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSalario(double value) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(value);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
