/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Esta clase contiene los atributos y metodos de las excepciones que vamos a utilizar.
 * @author mark_
 */
public class CampoVacio extends Exception{
    /**
     * Metodo que hereda el campo vacio.
     */
     public CampoVacio(){
        super("Por favor, rellene todos los campos.");
    }
}
