package com.hnys.bcd;

import com.hnys.bcd.client.Message;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImpl extends UnicastRemoteObject implements Message {
    protected MessageImpl() throws RemoteException {
    }

    @Override
    public String hello() throws RemoteException {
        return "hello";
    }
}
