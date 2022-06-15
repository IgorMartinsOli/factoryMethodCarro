/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethodmarcas;

/**
 *
 * @author igor_
 */
public class Puma extends FabricaCamisa{
    public Puma(){
    }
    
    @Override
    public Camisa novaCamisa() {
        return new Botafogo();
    }
}
