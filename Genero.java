
package javaapplication15;

public enum Genero {
    MASCULINO('M', "masculino"),
    FEMININO('F', "feminino");
    
    private char Valor;
    private String texto;

    private Genero(char Valor, String texto) {
        this.Valor = Valor;
        this.texto = texto;
    }

    public char getValor() {
        return Valor;
    }

    public String getTexto() {
        return texto;
    }

    
    
    
}
