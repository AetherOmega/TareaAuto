/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.piezas;

public class llanta {
    private int anioFabricacion;
    private float diametro;
    private float ancho;

    public llanta(int anioFabricacion, float diametro, float ancho) {
        this.anioFabricacion = anioFabricacion;
        this.diametro = diametro;
        this.ancho = ancho;
    }

    public llanta() {
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
    public void encender(){
        System.out.println("Encendiendo...");
    }
    public void apagar(){
        System.out.println("Apagando...");
    }
    
    
}