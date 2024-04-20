/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author henrique
 */
public class PessoaJuridica extends Pessoa implements Serializable{
   
    private String cnpj;
    
    public PessoaJuridica(String nome, int id, String cnpj)
    {
        super(nome, id);
        this.cnpj = cnpj;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public void exibir()
    {
        System.out.println("NOME: " + super.getNome() + "\nID: " + super.getId());
        System.out.println("CNPJ: " + this.cnpj);
    }
    
}