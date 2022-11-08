import java.io.File;
import java.util.ArrayList;

public class ReadFile {
    public static ArrayList<double[]> readFile() throws Exception {
        ArrayList<double[]> arrayList = new ArrayList<>();
        String dirName = "D:\\Document\\Code\\lab_exp_demo1\\xml";
        File file = new File(dirName);
        if (file.isDirectory()) {
            System.out.println("正在读取" + dirName + "目录....");
            String[] list = file.list();
            for (int i = 0; i < list.length; i++) {
                String name = dirName + "\\" + list[i];
                double[] doubles = GetArrayList.getarraylist(name);
                arrayList.add(doubles);
            }
        }
        return arrayList;
    }
}
