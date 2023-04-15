
package javaapplication15;

import java.time.LocalDate;

public class Juridico extends Pessoa{
    
   private String cnpj;
   private String inscricaoEstadual;
   private LocalDate dataInicio;
   private LocalDate dataTermino;
   private double valorContrato;

    public Juridico() {
    }

    public Juridico(String cnpj, String inscricaoEstadual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato, int id, String nome, Genero genero, Endereco endereco) {
        super(id, nome, genero, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }


    @Override
    public String toString() {
        return "\n ID:" + super.id +
                "\n Nome: " + super.nome +
                "\n Logradouro: " + super.endereco.logradouro +
                "\n Número: " + super.endereco.numero +
                "\n Complemento: " + super.endereco.complemento +
                "\n CEP: " + super.endereco.cep +
                "\n Cidade " + super.endereco.cidade +
                "\n UF: " + super.endereco.uf +
                "\n CNPJ: " + this.cnpj +
                "\n Inscrição Estadual: " + this.inscricaoEstadual +
                "\n Data Início: " + Util.formatDate(dataInicio) + 
                "\n Data Termino: " + Util.formatDate(dataTermino) +
                "\n Valor do Contrato: " + this.valorContrato;
                
    }
    
    

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }
   
   
}
