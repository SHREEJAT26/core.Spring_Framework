package com.IOC.SpringIOC;

public class Vodaphone implements Sim{

    @Override
    public void outgoing()
    {
        System.out.println("Outgoing using Vodaphone");
    }

    @Override
    public void incoming()
    {
        System.out.println("Incoming using Vodaphone");

    }
}
