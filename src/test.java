import org.junit.Test;

import java.util.ArrayList;

public class test {
    @Test
    public void testdome(){
        targetSpherical target3d = new target3d(1, 2, 3).target3dToSpherical();
        targetSpherical target3d1 = new target3d(4, 5, 6).target3dToSpherical();
        targetSpherical target3d2 = new target3d(7, 8, 9).target3dToSpherical();
        ArrayList<targetSpherical> list = new ArrayList<targetSpherical>();
        list.add(target3d);
        list.add(target3d1);
        list.add(target3d2);
        aveSpherical aveSpherical = new aveSpherical();
        double[] doubles = aveSpherical.aveSpherical(list);
        System.out.println(doubles[0]+"  "+doubles[1]);

    }
}
