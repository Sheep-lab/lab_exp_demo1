package cn.sheep.bean;

/**
 * 世界坐标类
 *
 * */
public class target_xyz {

    public double x;
    public double y;
    public double z;

    public target_xyz() {}

    public target_xyz(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public target_xyz(double[] doubles) {
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
        return "target_xyz{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    //世界坐标到像素坐标的转换
    public target_uv target_xyzTouv(double[][] pMatrix){
        target_uv uv = new target_uv();
        uv.u=pMatrix[0][0]*x+pMatrix[0][1]*y+pMatrix[0][2]*z;
        uv.v=pMatrix[1][0]*x+pMatrix[1][1]*y+pMatrix[1][2]*z;
        return uv;
    }

}
