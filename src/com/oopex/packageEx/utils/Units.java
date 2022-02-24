package com.oopex.packageEx.utils;

public class Units {
    public Units(){
    }

    public static double TransformKilometersToNm(double kilometers){
        return (kilometers *  0.539957d);
    }

    public static double TransformNauticalMilesToKm(double nauticalMiles){
        return (nauticalMiles * 1.852);
    }
}
