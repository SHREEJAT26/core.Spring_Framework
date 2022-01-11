package com.SpringLooseCoupling.di;

public class Student
{
    private Cheat cheating;

    public void setCheating(Cheat cheating) {
        this.cheating = cheating;
    }

    public void cheating()
    {
        cheating.cheat();

    }
}
