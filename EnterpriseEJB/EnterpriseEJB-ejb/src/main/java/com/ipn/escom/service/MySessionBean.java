package com.ipn.escom.service;

import javax.ejb.Stateless;

/**
 *
 * @author Rafael Landa
 */
@Stateless
public class MySessionBean implements MySessionBeanRemote {

    public MySessionBean() {
        
    }

    @Override
    public String getOkString() {
        return "Ok, you got it!";
    }

    @Override
    public String getCancelString() {
        return "Cancel";
    }
    
}
