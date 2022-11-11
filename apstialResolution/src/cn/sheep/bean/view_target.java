package cn.sheep.bean;

/**
 * 观测目标类
 * 八个顶点的世界坐标
 * */
public class view_target {

    public target_xyz tar1;
    public target_xyz tar2;
    public target_xyz tar3;
    public target_xyz tar4;
    public target_xyz tar5;
    public target_xyz tar6;
    public target_xyz tar7;
    public target_xyz tar8;

    public view_target() {
         tar1 = new target_xyz(0, 0, 0);
         tar2  = new target_xyz(1000, 0, 0);
         tar3  = new target_xyz(0, 1000, 0);
         tar4  = new target_xyz(1000, 1000, 0);
         tar5 = new target_xyz(0, 0, 1000);
         tar6  = new target_xyz(1000, 0, 1000);
         tar7  = new target_xyz(0, 1000, 1000);
         tar8  = new target_xyz(1000, 1000, 1000);
    }
}
