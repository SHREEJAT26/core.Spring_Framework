package com.IOC.SpringIOC;

public class Jio implements Sim{
    @Override
    public void outgoing() {
        System.out.println("Outgoing using Jio");
    }

    @Override
    public void incoming() {

        System.out.println("Incoming using Jio");
    }
}
