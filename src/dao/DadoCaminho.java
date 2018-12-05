/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author jhona
 */
public class DadoCaminho {
    
    private String caminho = System.getProperty("user.dir") + "\\caminho.txt";
    
    public BufferedReader lerCaminho() throws FileNotFoundException{
       BufferedReader buffRead = new BufferedReader(new FileReader(caminho));
       return buffRead;  
    }
    
}
