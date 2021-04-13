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
public class suhaz {
    
    private String username;
    private String email;
    protected String password;
    
    //method setter
    public void setUsername(String username){
        this.username = username;
    }    
    public void setEmail(String email){
        this.email = email;
    }   
     public void setPassword(String password){
        this.password = password;
    }
     
     //method getter
     public String getUsername(){
       return username; 
    }
      public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    
}
