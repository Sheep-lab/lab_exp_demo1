import java.util.ArrayList;
import java.util.List;

public class aveSpherical {
    public static double[] aveSpherical(ArrayList<targetSpherical> list){
        if (list==null)
            return new double[0];
        if (list.size()==1){
            targetSpherical sph = list.get(0);
            double[] sphNum = new double[2];
            sphNum[0]=sph.a;
            sphNum[1]=sph.b;
            return sphNum;
        }
        double[][] nums = new double[list.size()-1][2];
        for (int i = 1; i < list.size(); i++) {
            targetSpherical spherical = list.get(i);
             nums[i-1]= spherical.diffTargetSpherical(list.get(i - 1));
        }
        double aSum=0;
        double bSum=0;
        for (int i = 0; i <nums.length ; i++) {
            aSum+=nums[i][0];
            bSum+=nums[i][1];
        }
         double[]res= new double[2];
         res[0]=aSum/res.length;
         res[1]=bSum/res.length;
         return res;
    }
}
