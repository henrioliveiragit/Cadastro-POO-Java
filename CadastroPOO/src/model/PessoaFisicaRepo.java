/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author henrique
 */
public class PessoaFisicaRepo {

    private List<PessoaFisica> pessoas;
    
    public PessoaFisicaRepo() {
        pessoas = new ArrayList<>();
    }
    
    public void inserir(PessoaFisica pessoa) {
        pessoas.add(pessoa);
    }
    
    public void alterar(int id, PessoaFisica pessoa) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == id) {
                pessoas.set(i, pessoa);
                break;
            }
        }
    }
    
    public void excluir(int id) {
        Iterator<PessoaFisica> iterator = pessoas.iterator();
        while (iterator.hasNext()) {
            PessoaFisica pessoa = iterator.next();
            if (pessoa.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }
     
    public PessoaFisica obter(int id) {
        for (PessoaFisica pessoa : pessoas) {
            if (pessoa.getId() == id) {
                System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("ID: " + pessoa.getId());
            System.out.println(); 
            }
        }
        return null; // Retorna null se não encontrar
    }
    
     public void obterTodos() {
        for (PessoaFisica pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("CPF: " + pessoa.getCpf());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("ID: " + pessoa.getId());
            System.out.println(); 
        }
        
    }
     
    public void persistir(String nomeArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(pessoas);
            System.out.println("Dados persistidos no arquivo " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Erro ao persistir os dados: " + e.getMessage());
        }
    }
    
    public void recuperar(String nomeArquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            pessoas = (List<PessoaFisica>) ois.readObject();
            System.out.println("Dados recuperados do arquivo " + nomeArquivo);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao recuperar os dados: " + e.getMessage());
        }
    }
     
     
    
}
