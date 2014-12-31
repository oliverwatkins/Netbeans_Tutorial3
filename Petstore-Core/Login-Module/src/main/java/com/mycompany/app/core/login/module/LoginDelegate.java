/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.core.login.module;

import com.huw.almexoffice.RolesBO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author lauren
 */
public class LoginDelegate {
    
    private LoginDelegate() {
    }

    public static LoginDelegate getInstance() {
        return AlmexDelegateHolder.INSTANCE;
    }

    private static class AlmexDelegateHolder {
        private static final LoginDelegate INSTANCE = new LoginDelegate();
    }

    private static List<RolesBO> roles;

    
//    JFrame frame = new JFrame();
//    
//    public void setFrame(JFrame frame) {
//        this.frame = frame;
//    }
    
    





    public static boolean login(String userName, String password) {

        System.out.println("before");

        com.huw.almexoffice.LoginWS_Service service = new com.huw.almexoffice.LoginWS_Service();
        com.huw.almexoffice.LoginWS port = service.getLoginWSPort();

        try {

            BindingProvider prov = (BindingProvider) port;
            prov.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "myusername");
            prov.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "mypassword");

            roles = port.login(userName, password);

//            port.call();
//            
        } catch (Exception ex) {
            Logger.getLogger(LoginDelegate.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("after ");

        return true;
    }

    public static List<RolesBO> getRoles() {
        return roles;
    }
}
