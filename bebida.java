package Entidades;

public class Bebida extends Produto{
    private String tipo;

    public Bebida(int codigo, String nome, String tipo){
        super(codigo, nome)
        this.tipo;
    }

    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        tipo = this.tipo;
    }
}