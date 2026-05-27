package com.hnys.bcd;

import com.hnys.bcd.model.User;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RMIServer {

    static Map<Integer,User> users = new HashMap<>();

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("message_service",new MessageImpl());
            registry.bind("user_service",new UserServiceImpl());

            System.out.println("RMI server started...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
