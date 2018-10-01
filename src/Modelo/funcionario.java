/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author danny
 */
public class funcionario {
    
    int codigo;
    String apelido;
    String nomeCompleto;
    Date data;
    int numero_Bi;
    String email;
    boolean estadoCivil;
    String endereco;
    double salario;
    String naturalidade;
    boolean sexo;
    long contacto;

    public funcionario(int codigo, String apelido, String nomeCompleto, Date data, int numero_Bi, String email, boolean estadoCivil, String endereco, double salario, String naturalidade, boolean sexo, long contacto) {
        this.codigo = codigo;
        this.apelido = apelido;
        this.nomeCompleto = nomeCompleto;
        this.data = data;
        this.numero_Bi = numero_Bi;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
        this.salario = salario;
        this.naturalidade = naturalidade;
        this.sexo = sexo;
        this.contacto = contacto;
    }
    
    
    
    
}
