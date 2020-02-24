/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.Auto;

import ico.fes.piezas.chasis;
import ico.fes.piezas.llanta;
import ico.fes.piezas.motor;

/**
 * Fecha de creación: 18-feb-2020
 * @author jesushc
 */
public class Auto {
    private String marca;
    private String modelo;
    private String color;
    private chasis estructura;
    private llanta rueda;
    private motor impulsor;

    public Auto() {
    }

    public Auto(String marca, String modelo, String color, chasis estructura, llanta rueda, motor impulsor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.estructura = estructura;
        this.rueda = rueda;
        this.impulsor = impulsor;
    }


    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    public void encender(){
        System.out.println("Encendiendo el auto marca:"+this.marca);
    }
    
    public void apagar(){
        System.out.println("Apagando el auto marca:"+this.marca);
    }

    public chasis getEstructura() {
        return estructura;
    }

    public void setEstructura(chasis estructura) {
        this.estructura = estructura;
    }

    public llanta getRueda() {
        return rueda;
    }

    public void setRueda(llanta rueda) {
        this.rueda = rueda;
    }

    public motor getImpusor() {
        return impulsor;
    }

    public void setImpulsor(motor impulsor) {
        this.impulsor = impulsor;
    }

}