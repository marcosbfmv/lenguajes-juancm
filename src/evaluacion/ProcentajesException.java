/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

/**
 *
 * @author campitos
 */
public class ProcentajesException extends Exception {
    public ProcentajesException(){
    super ("Tus porcentajes no suman 100%, revisalos");
    }
}
