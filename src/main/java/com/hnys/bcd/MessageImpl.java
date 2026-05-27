package com.hnys.bcd;

import com.hnys.bcd.client.Message;
import com.hnys.bcd.model.Data;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImpl extends UnicastRemoteObject implements Message {
    protected MessageImpl() throws RemoteException {
    }

    @Override
    public String hello() throws RemoteException {
        return "hello";
    }

    @Override
    public Data getData() throws RemoteException {
        return new Data(10, "App Version");
    }

    @Override
    public String getResult(int num1, int num2) throws RemoteException {
        return "Result is : "+ String.valueOf(num1 + num2);
    }
}
