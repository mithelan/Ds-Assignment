/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firelogin;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Microsoft
 */
public class LoginServer {
   public static void main (String args[]){
       try{
       Registry reg=LocateRegistry.createRegistry(1099);
       reg.rebind("login", new LoginImpl());
       System.out.println("Server is ready");
       }
       catch(Exception e){
           e.printStackTrace();
           
       }
       
   } 
}
