/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author campitos
 */
public class ProbarEncapsulamiento {

 
    public static void main(String[] args) throws Exception {
        Usuario u1=new Usuario();
        u1.setEdad(-42);
        System.out.println("Tu edad es:"+u1.getEdad()); 
     
    }
    
}
