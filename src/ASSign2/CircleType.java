package CSWsortingMerQui.src.ASSign2;

public class CircleType extends PointType {
    int center;
    double radius;

    public void setCenter(int center) {
        this.center = center;
    }
    public int GetCenter(){
        return center;
    }

    public double GetRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double Area(){
        return 3.14*radius*radius;
    }

}