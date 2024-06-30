package org.patterns;

import sun.nio.ch.Net;

//when there is some heavy processing happens, when creating an object
//then prototype model comes into picture so that processing part could get reduced
//make a copy of previously created object and return it using cloning
public class PrototypeDesignPattern {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        System.out.println("creating object from prototype design pattern");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("123.43.5.6");
        networkConnection.loadData();
        System.out.println(networkConnection);

        NetworkConnection obj2 = (NetworkConnection) networkConnection.clone();
        System.out.println(obj2);

    }

}