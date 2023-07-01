/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.recuperacao;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO("Masculino",'M'),
     
    FEMININO("Feminino",'F');
    
    
    protected String texto;
    
    protected char caracter;

    private Genero(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }
    
    
    
}
