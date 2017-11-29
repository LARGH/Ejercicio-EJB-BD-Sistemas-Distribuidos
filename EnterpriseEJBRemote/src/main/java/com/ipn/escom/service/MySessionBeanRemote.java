package com.ipn.escom.service;

import javax.ejb.Remote;

/**
 *
 * @author rafal
 */
@Remote
public interface MySessionBeanRemote {
    public String getOkString();
}