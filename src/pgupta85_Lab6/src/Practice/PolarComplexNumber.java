package pgupta85_Lab6.src.Practice;

public class PolarComplexNumber {
    private final double magnitude;
    private final double angle;

    public PolarComplexNumber(){
        magnitude = 0;
        angle = 0;
    }

    public PolarComplexNumber(double mag, double ang){
        magnitude = mag;
        angle = ang;
    }

    public double getRealValue(){
        return (magnitude *Math.cos(Math.toRadians(angle)));
    }

    public double getImaginaryValue(){
        return (magnitude*Math.sin(Math.toRadians(angle)));
    }
}
