/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author campitos
 */
public class FinDeCuatri {
    
    public static void main(String[] args){
        
        //Creamos un objeto de tipo  Examen parcial
        ExamenParcial eParcial=new ExamenParcial();
                      eParcial.setCalificacion(4);
                      eParcial.setPorcentaje(0.4f);
                      
       ExamenFinal eFinal =new ExamenFinal();
                   eFinal.setCalificacion(8);
                   eFinal.setPorcentaje(0.7f);
      //Creamos el modelo
                   ModeloEvaluacion modelo=new ModeloEvaluacion();
                   
        try {
            System.out.println( modelo.evaluar(eParcial, eFinal));
        } catch (ProcentajesException ex) {
            
        }
                   
                      
    }
    
}
