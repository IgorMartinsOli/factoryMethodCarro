/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethodmarcas;

/**
 *
 * @author igor_
 */
public class Umbro extends FabricaCamisa{
    public Umbro(){
    }
    
    @Override
    public Camisa novaCamisa() {
        return new Fluminense();
    }
}
