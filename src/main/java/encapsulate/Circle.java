package encapsulate;

public class Circle {
    private double radius=1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        radius = 1.0;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }

    double getCircumference(){
        return 2*radius*Math.PI;
    }

    public String toString(){
        return ("Circle[radius = "+radius+"]");
    }

}
