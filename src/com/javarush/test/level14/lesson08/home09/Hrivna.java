package com.javarush.test.level14.lesson08.home09;

/**
 * Created by user on 25.06.2015.
 */
public class Hrivna extends Money
{
    private double count;
public Hrivna(double count)
{
    super(count);
    this.count = count;
}
    public double getAmount()
    {
        return count ;
    }


    public String getCurrencyName()
    {
        return "HRN";
    }
}
