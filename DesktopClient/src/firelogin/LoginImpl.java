/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firelogin;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Microsoft
 */
public class LoginImpl extends UnicastRemoteObject implements LoginInter {

    public LoginImpl()throws RemoteException {
        super();
    }
    
    
    @Override
    public boolean getlogin(int username, int password) throws RemoteException {
              try {
            if (username == 1234 && password == 1234) {
            
            return true;
        }
       
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return false;
        

    }
    
}
