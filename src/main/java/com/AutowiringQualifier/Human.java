package com.AutowiringQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human
{
    //Autowire before the dependency also works, even after removing Constructors and Setter methods
    @Autowired
    @Qualifier("heartHuman")
    private Heart heart;

  /*
    public Human() {
    }

    //@Autowired
    public Human(Heart heart) {
        this.heart = heart;
    }

    //@Autowired
    //@Qualifier("heartHuman")
    //@Qualifier("heartOctopus")
    public void setHeart(Heart heart) {
        this.heart = heart;
        System.out.println("Setter method called");
    }
 */


    public void startPumping()
    {
        if(heart!=null) {
            heart.pump();
            System.out.println("Name of the animal is : "+heart.getNameofAnimal()+
                    " and no.of hearts are : "+heart.getNoofHearts());
        }
        else
        {
            System.out.println("I am dead");
        }
    }
}
