//******************************************
//Lecture Activities Week 3
//Author: Suzanne Kaufman
//Class for program LA315TestTriangle
//Date: 4/1/18
//******************************************

import java.lang.*;

public class LA315Triangle {

    private double sideA, sideB;

    public LA315Triangle()
    {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHypotenuse()
    {
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return hypotenuse;
    }

   public double getAlpha()
   {
       double radians = Math.atan(sideA / sideB);
       double alpha = Math.toDegrees(radians);
       return alpha;
    }
}
