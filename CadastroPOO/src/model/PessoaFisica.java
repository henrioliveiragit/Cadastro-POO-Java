package model;
import java.io.Serializable;

public class PessoaFisica extends Pessoa implements Serializable{
    
    private int idade;
    private String cpf;
    
    public PessoaFisica(String nome, int id, int idade, String cpf)
    {
        super(nome, id);
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void exibir()
    {
        System.out.println("NOME: " + super.getNome() + "\nID: " + super.getId());
        System.out.println("CPF: " + this.cpf + "\nIDADE: " + this.idade);
    }
    
}
