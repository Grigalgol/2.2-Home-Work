import java.util.Locale;

public class Vector2D {
    double vX, vY;
    public static int count = 0;
    public Vector2D() {
        vX=1;
        vY=1;
        count++;
    }
    public Vector2D(double vX, double vY) {
        count++;
        this.vX = vX;
        this.vY = vY;
    }
    public Vector2D(Vector2D other) {
        vX = other.vX;
        vY = other.vY;
        count++;
    }
    public double length() {
        double q = (Math.sqrt((vX) * vX + vY * vY));
        return q;
    }
    public void add(Vector2D v) {
        vX+=v.vX;
        vY+=v.vY;
    }
    public void sub(Vector2D v) {
        vX-=v.vX;
        vY-=v.vY;
    }
    public void scale(double scaleFactor) {
       vX*=scaleFactor; vY*=scaleFactor;
    }
    public void normalized() {
        double length = length();
        this.vX /= length;
        this.vY /= length;
    }
    public double dotProduct(Vector2D v) {
        return vX*v.vX+vY*v.vY;
    }

    public void print() {
        System.out.println(String.format(Locale.US, "(%.2f, %.2f)", vX, vY));
    }
}
