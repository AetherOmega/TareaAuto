/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2;

import ico.fes.piezas.chasis;
import ico.fes.Auto.Auto;

public class TestAuto {

    
    public static void main(String[] args) {
        
        Auto carro1= new Auto();
        carro1.setMarca("Tesla Model 3");
        carro1.setEstructura(new chasis (2.3f,"monocasco","autoportante"));
        
 
        carro1.getEstructura().setPeso(3.1f);
        System.out.println("Velocidad del procesador:"+carro1.getEstructura().getPeso());
    }
    
}