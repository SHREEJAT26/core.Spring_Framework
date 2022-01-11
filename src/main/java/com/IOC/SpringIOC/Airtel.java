package com.IOC.SpringIOC;

public class Airtel implements Sim{
    public Airtel() {
        System.out.println("Airtel Class Loaded");
    }

    @Override
    public void outgoing() {
        System.out.println("Outgoing using Airtel");
    }

    @Override
    public void incoming() {
        System.out.println("Incoming using Airtel");

    }
}
