package vlab.tech.hcm;

import android.location.Location;

public class MainActivity {
    public static float getDistance(double a, double b, double c, double d){
        float[] result = new float[0];
        Location.distanceBetween(a,b,c,d,result);
        return result[0]/1000;
    }
}
