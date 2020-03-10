package com.epam.designPrinciples;

import com.epam.srp.*;
import com.epam.statePattern.*;
import com.epam.abstractFactory.*;
import com.epam.builderPattern.*;
import com.epam.chainOfResponsibilities.*;
import com.epam.proxyPattern.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("\n***** Design Principles *****");
        System.out.println("\n***** Single Responsibility Principle *****");
        CalorieTracker calorieTracker = new CalorieTracker(1000);
        calorieTracker.trackCalories(2000);
        calorieTracker.trackCalories(3000);
        System.out.println("\n***** Abstract Factory Pattern *****");
        System.out.println("\nTiger and Buffalo implements Animals");
        Tiger Tiger = new Tiger();
        Tiger.foodLs();
        Tiger.producedSound();
        Tiger.Rests();
        Buffalo Buffalo = new Buffalo();
        Buffalo.foodLs();
        Buffalo.producedSound();
        Buffalo.Rests();
        System.out.println("\n***** Builder Pattern *****");
        Building Building = new Building(true, true, true, false, false, true);
        Building.detailsOfBuilding();
        System.out.println("\n***** -State Pattern *****");
        Phone phone = new Phone();
        phone.makeCallTo("9294097012");
        System.out.println("\n***** Proxy Pattern *****");
        Client client = new Client();
        client.connectTo("instagram.com");
        client.connectTo("geeksforgeeks.com");
        System.out.println("\n***** Chain Of Responsibilites Pattern *****");
        LoginUser login = new LoginUser("prakash","prakash123");
        login = new LoginUser("gadf","gadf234");
        
    }
}
