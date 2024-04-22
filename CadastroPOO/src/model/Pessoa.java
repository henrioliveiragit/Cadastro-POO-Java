package model;
import java.io.Serializable;

public class Pessoa implements Serializable{
    
    private int id;
    private String nome;
    
    public Pessoa(String nome, int id)
    {
        this.nome = nome;
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void exibir()
    {
        System.out.println("NOME: " + this.nome + "\nID: " + this.id);
    }
    
}
