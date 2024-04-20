/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropoo;

import model.PessoaFisica;
import model.PessoaFisicaRepo;
import model.PessoaJuridica;
import model.PessoaJuridicaRepo;



/**
 *
 * @author henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
        
        PessoaFisica pf1 = new PessoaFisica("Henrique", 1, 20, "156.895.666-59");
        PessoaFisica pf2 = new PessoaFisica("Maria", 2, 76, "756.666.666-59");
        
        repo1.inserir(pf1);
        repo1.inserir(pf2);
        repo1.persistir("pessoasfisicas");
        
        PessoaFisicaRepo repo2 = new PessoaFisicaRepo();
        
        repo2.recuperar("pessoasfisicas");
        repo2.obterTodos();
        
        PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
        
        PessoaJuridica pj1 = new PessoaJuridica("Jaime", 3, "7361723");
        PessoaJuridica pj2 = new PessoaJuridica("Vanessa", 4, "545645");
        
        repo3.inserir(pj1);
        repo3.inserir(pj2);
        repo3.persistir("pessoasjuridicas");
        
        PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();
        
        repo4.recuperar("pessoasjuridicas");
        repo4.obterTodos();
        
       

       


        
        
        
        
        
       
        
       
    }
    
}
