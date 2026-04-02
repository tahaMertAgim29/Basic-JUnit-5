package com.example.junit2;

public class Geometry {

    
    public double externalAngle(int n) throws IllegalAccessException {
        if(n < 3)
            throw new IllegalAccessException("Polygon must have at least 3 sides");

        return 360 / n;
    } 

    public double internalAngle(int n) throws IllegalAccessException {
        if(n < 3)
            throw new IllegalAccessException("Polygon must have at least 3 sides");
        
        return 180 - externalAngle(n);
    }

    public double totalInternalAngle(int n) throws IllegalAccessException {
        if(n < 3)
            throw new IllegalAccessException("Polygon must have at least 3 sides");

        return (n-2) * 180;
    }

    
   


}
