package com.ipn.escom.conversiones;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Rafael Landa
 */
@Stateless
@LocalBean
public class MySessionBean {

    public MySessionBean() {
    }

    public String getOk() {
        return "Ok, you did it!";
    }
    
}
