/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwag.almexoffice.client.module.user.delegate;

//import com.huw.almexoffice.GroupBO;
//import com.huw.almexoffice.UserBO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CustomerDelegate {
    
    private CustomerDelegate() {
    }

    public static CustomerDelegate getInstance() {
        return AlmexDelegateHolder.INSTANCE;
    }

    private static class AlmexDelegateHolder {
        private static final CustomerDelegate INSTANCE = new CustomerDelegate();
    }

//    public void createUser(UserBO user) {
//
//        try {
//            com.huw.almexoffice.UserWS_Service service = new com.huw.almexoffice.UserWS_Service();
//            com.huw.almexoffice.UserWS port = service.getUserWSPort();
//
//            port.createUser(user);
//        
//        }catch(Exception e) {
//            
//            JOptionPane pane = new JOptionPane(e.getMessage(), JOptionPane.ERROR);
//            pane.setVisible(true);
//        }
//    }
//
//    public void createGroup(GroupBO u) {
//        
//        com.huw.almexoffice.UserWS_Service service = new com.huw.almexoffice.UserWS_Service();
//        com.huw.almexoffice.UserWS port = service.getUserWSPort();
//
//        port.createGroup(u);
//    }
//    
//    public void createGroup2(GroupBO u) {
//        
//        try {
//        
//            com.huw.almexoffice.UserWS_Service service = new com.huw.almexoffice.UserWS_Service();
//            com.huw.almexoffice.UserWS port = service.getUserWSPort();
//
//            port.createGroup2(u);
//        
//        }catch(Exception e) {
//            
//            Logger.getLogger(CustomerDelegate.class.getName()).log(Level.SEVERE, null, e);
//            throw new RuntimeException(e);
//        }
//    }
//    
//    public List<UserBO> getUsers() {
//
//        com.huw.almexoffice.UserWS_Service service = new com.huw.almexoffice.UserWS_Service();
//        com.huw.almexoffice.UserWS port = service.getUserWSPort();
//
//        try {
//
//            List<UserBO> users = port.getAllUsers();
//            return users;
//
//        } catch (Exception ex) {
//            Logger.getLogger(CustomerDelegate.class.getName()).log(Level.SEVERE, null, ex);
//            throw new RuntimeException(ex);
//        }
//    }


}
