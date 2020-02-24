/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.piezas;

public class motor {

    private int caballosDeFuerza;
    private String marca;
    private String modelo;

    public motor() {
    }

    public motor(int caballosDeFuerza, String marca, String modelo) {
        this.caballosDeFuerza = caballosDeFuerza;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(int caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void leer(int dir) {
        System.out.println("Leyendo la direccion:" + dir);
    }
    
    public void escribir(String datos, int direccion){
        System.out.println("Escribir los datos:"+ datos+ "en la direccion:" +direccion);
    }
    
}