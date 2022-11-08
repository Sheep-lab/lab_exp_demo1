public class target3d {

    public double x;
    public double y;
    public double z;

    public target3d() {}

    public target3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public target3d(double[] doubles) {
        this.x=doubles[0];
        this.y=doubles[1];
        this.z=doubles[2];
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "target3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public targetSpherical target3dToSpherical(){
        targetSpherical targetSpherical = new targetSpherical();
        targetSpherical.r=Math.sqrt(x*x+y*y+z*z);
        targetSpherical.a=Math.toDegrees(Math.atan(y/x));
        targetSpherical.b=Math.toDegrees(Math.atan((Math.sqrt(x*x+y*y))/z));
        return targetSpherical;
    }

}
