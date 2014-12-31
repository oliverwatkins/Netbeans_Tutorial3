/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huwag.almexoffice.client.module.user.delegate;

//import com.huw.almexoffice.UserBO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CustomerTableModel extends AbstractTableModel {

    private List<Object> users = new ArrayList<Object>();

    public String getColumnName(int i) {

        switch (i) {
            case 0:
                return "Benutzername";
            case 1:
                return "Vorname";
            case 2:
                return "Nachname";
            case 3:
                return "PersonID";
            case 4:
                return "Passwort";
            case 5:
                return "Gese..";
            case 6:
                return "An..";
            case 7:
                return "Zusa..";
            case 8:
                return "Letzte Anmeldung";
        }
        return "";
    }        

    
    
    
    
   
    
     
    

    public CustomerTableModel(List<Object> users) {
        this.users = users;
    }

    public int getRowCount() {

        return this.users.size();
    }

    public int getColumnCount() {

        return 9;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {

        Object u = this.users.get(rowIndex);

        switch (columnIndex) {
            case 0:
//                return u.get
                return "TODO";
            case 1:
                return u.getFirstName();
            case 2:
                return u.getLastName();
            case 3:
                return "TODO";

        }
        return null;

    }

}
