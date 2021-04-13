/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setter.dan.getter;

/**
 *
 * @author Syahren Maulana
 */
public class SetterDanGetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek
        suhaz evos = new suhaz();
        //menggunakan method setter
        evos.setUsername("Syahren");
        evos.setEmail("syahren.maulana.29rpl@gmail.com");
        evos.setPassword("12345");
        //menggunakan method getter
        System.out.println("Username : "+evos.getUsername());
        System.out.println("Email : "+evos.getEmail());
        System.out.println("Password : "+evos.getPassword());
        
        
    }
    
}
