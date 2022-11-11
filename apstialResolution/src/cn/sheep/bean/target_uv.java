package cn.sheep.bean;

/**
 * 像素平面坐标类
 *
 *  */
public class target_uv {

    public double u;
    public double v;

    public target_uv() {}

    public target_uv(double u, double v) {
        this.u = u;
        this.v = v;
    }

    public double getU() {
        return u;
    }

    public void setU(double u) {
        this.u = u;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "target_uv{" +
                "u=" + u +
                ", v=" + v +
                '}';
    }
}
