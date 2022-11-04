import java.util.ArrayList;
import java.util.List;

public class targetSpherical {
    public double r;
    public double a;
    public double b;

    public targetSpherical() {}

    public targetSpherical(double r, double a, double b) {
        this.r = r;
        this.a = a;
        this.b = b;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "targetSpherical{" +
                "r=" + r +
                ", a=" + a +
                ", b=" + b +
                '}';
    }

    public double[] diffTargetSpherical (targetSpherical spherical){
        ArrayList<double[]> list = new ArrayList<>();
        double[] diff = new double[2];
        diff[0] = this.a - spherical.a;
        diff[1] = this.b - spherical.b;
        return diff;
    }
}
