package com.ObjectInjection.di;

public class Student2
{
    private MathCheat math;

    public void setMath(MathCheat math) {
        this.math = math;
    }

    public void startCheacting()
    {
        math.mathCheat();
    }

}
