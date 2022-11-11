package cn.sheep.test;

import cn.sheep.bean.target_uv;
import cn.sheep.bean.target_xyz;
import cn.sheep.bean.view_target;
import cn.sheep.utils.ReadFile;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class getArrayListTest {
    @Test
    public void test1() throws Exception {
        //读取xml文件
        ArrayList<double[][]> arrayList = ReadFile.readFile();
/*        System.out.println("--------------------输出相机内参P矩阵：--------------------");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i+1+".xml");
            double[][] d1 = arrayList.get(i);
            for (int j = 0; j <d1.length ; j++) {
                for (int k = 0; k < d1[j].length; k++) {
                    System.out.print(d1[j][k]);
                    System.out.print("  ");
                }
                System.out.println();
            }
        }*/
        //构建被观测目标
        view_target viewTarget = new view_target();
        //构建计数映射表
        HashMap<target_xyz, Integer> map = new HashMap<>();
        //计算被观测目标量化值是否投影在在视野平面上
        for (int i = 0; i < arrayList.size(); i++) {
            int count=0;
            for (double x = viewTarget.tar1.x; x <=viewTarget.tar2.x ; x=x+10) {
                for (double y = viewTarget.tar1.y; y <=viewTarget.tar2.y; y=y+10) {
                    for (double z = viewTarget.tar1.z; z <=viewTarget.tar2.z; z=z+10) {
                        target_xyz targetxyz = new target_xyz(x, y, z);
                        target_uv tar_uv = targetxyz.target_xyzTouv(arrayList.get(i));
                        if (tar_uv.u<=1920&&tar_uv.v<=1080){
                            count++;
                            map.put(targetxyz,count);
                        }
                    }
                }
            }
        }
        System.out.println("--------------------目标最小量化单位被观测的次数：--------------------");
        System.out.println(map);

    }

}
