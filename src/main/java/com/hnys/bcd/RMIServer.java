package com.hnys.bcd;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("message_service",new MessageImpl());

            System.out.println("RMI server started...");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
