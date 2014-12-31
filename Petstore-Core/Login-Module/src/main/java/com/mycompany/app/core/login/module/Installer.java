/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app.core.login.module;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JButton;
import org.openide.DialogDisplayer;
import org.openide.LifecycleManager;
import org.openide.NotifyDescriptor;
import org.openide.modules.ModuleInstall;

public class Installer extends ModuleInstall {

    LoginPanel formPanel = new LoginPanel();

    public void restored() {
        createLoginDialog();
    }

    private void createLoginDialog() {
        NotifyDescriptor nd = new NotifyDescriptor.Confirmation(formPanel, "Login");

        JButton ok = new JButton();
        ok.setText("OK");
        JButton cancel = new JButton();
        cancel.setText("Cancel");

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                //close whole application
            }
        });

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                authenticate();
            }
        });

        nd.setOptions(new Object[]{ok, cancel});
        DialogDisplayer.getDefault().notifyLater(nd);

        nd.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                if (NotifyDescriptor.CLOSED_OPTION.equals(evt.getNewValue())) {
                    exit();
                }
            }
        });
    }

    private void authenticate() {
        
        LoginDelegate.getInstance().login(this.formPanel.getUsername(), this.formPanel.getPassword());

        
//        if (NbPreferences.forModule(LoginPanel.class).get("user", "").equals(this.formPanel.getUsername())) {
//            try {
//                char[] passwordFromForm = null;
////                char[] passwordFromPref = NbPreferences.forModule(LoginPanel.class).get("pass", "").toCharArray();
//
//                
//                
//                
//                String passwordPref = new String(this.formPanel.getPassword());
//                
//                
//                MessageDigest md5 = MessageDigest.getInstance("MD5");
//                
//                byte[] tmp = passwordPref.getBytes();
//                
//                md5.update(tmp);
//                
//                passwordFromForm = byteArrToString(md5.digest()).toCharArray();
//                
//                
                
//                
//                int correctCount = 0;
//                if (passwordFromForm.length != passwordFromPref.length) {
//                    exit();
//                }
//                for (int i = 0; i < passwordFromPref.length; i++) {
//                    if (passwordFromPref[i] == passwordFromForm[i]) {
//                        correctCount++;
//                    }
//                }
//                if (passwordFromPref.length == correctCount) {
//                    //do nothing here
//                } else {
//                    exit();
//                }
//            } catch (NoSuchAlgorithmException ex) {
//                Exceptions.printStackTrace(ex);
//            }
//        } else {
//            exit();
//        }
    }
    
    
    public void asdf() {
        
        LoginDelegate.getInstance().login(null, null);
        
        
    }

    private static String byteArrToString(byte[] b) {
        String res = null;
        StringBuffer sb = new StringBuffer(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            int j = b[i] & 0xff;
            if (j < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(j));
        }
        res = sb.toString();
        return res.toUpperCase();
    }

    final private void exit() {
        LifecycleManager.getDefault().exit();
    }

}
