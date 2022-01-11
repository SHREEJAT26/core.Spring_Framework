package com.AutowiringQualifier;

public class Heart
{
    private String nameofAnimal;
    private Integer noofHearts;

    public String getNameofAnimal() {
        return nameofAnimal;
    }

    public void setNameofAnimal(String nameofAnimal) {
        this.nameofAnimal = nameofAnimal;
    }

    public Integer getNoofHearts() {
        return noofHearts;
    }

    public void setNoofHearts(Integer noofHearts) {
        this.noofHearts = noofHearts;
    }

    public void pump()
    {
        System.out.println("Heart is pumping");
        System.out.println("I am alive");
    }
}
