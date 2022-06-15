/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.factorymethodmarcas;

/**
 *
 * @author igor_
 */
public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nike nike1 = new Nike();
        Camisa camisa1 = nike1.novaCamisa();
        
        camisa1.exibirInfo();
        
        Adidas adidas1 = new Adidas();
        Camisa camisa2 = adidas1.novaCamisa();
        
        camisa2.exibirInfo();
        
        Puma puma1 = new Puma();
        Camisa camisa3 = puma1.novaCamisa();
        
        camisa3.exibirInfo();
        
        Umbro umbro1 = new Umbro();
        Camisa camisa4 = umbro1.novaCamisa();
        
        camisa4.exibirInfo();
        
        Kappa kappa1 = new Kappa();
        Camisa camisa5 = kappa1.novaCamisa();
        
        camisa5.exibirInfo();
    }
}
