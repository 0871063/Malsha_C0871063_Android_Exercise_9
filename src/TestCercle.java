public class TestCercle {
    private double radius;

    double x;
    double y;
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(double x , double y) {
        this.x = x;
        this.y = y;
    }

    public TestCercle() {
    }

    public double surface(){
        return Math.PI * radius;
    }

    public boolean isInternal (double x, double y) {
        double dx = (x - this.x) * (x - this.x);
        double dy = (y - this.y) * (y - this.y);
        if ( dx + dy <= radius * radius)
            return true;
        else
            return false;
    }
}
