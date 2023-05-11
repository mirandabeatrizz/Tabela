/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabela.validation;

import com.mycompany.tabela.model.Contato;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class Tabela {
    static List<Contato> listaContatos = new ArrayList<Contato>();

    public Tabela() {
        /*contato1 = new Contato("Ana Monteiro", "48 9923-7898", "ana.monteiro@gmail.com");
        contato2 = new Contato("João da Silva", "48 8890-3345", "joaosilva@hotmail.com");
        contato3 = new Contato("Pedro Cascaes", "48 9870-5634", "pedrinho@gmail.com");
        listaContatos.add(contato1);
        listaContatos.add(contato2);
        listaContatos.add(contato3);*/
    }

    public static List<Contato> getListaDeContatos() {
        return listaContatos;
    }
    
    public static void setListaDeContatos(Contato ct) {
         listaContatos.add(ct);
    }

}
