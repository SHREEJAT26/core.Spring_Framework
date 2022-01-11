package com.ObjectInjection.di;

public class Student
{
    //MathCheat math = new MathCheat();
    private MathCheat math;
    Integer id;
    public void setId(Integer id) {
        this.id = id;
    }
    public void setMath(MathCheat math) {
        this.math = math;
    }

    public void cheating()
    {
        math.mathCheat();
        System.out.println("My chit number is : "+id);
    }
}
