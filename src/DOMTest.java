import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.sun.org.apache.bcel.internal.classfile.Code;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liu
 * @version 创建时间：2018年3月24日 下午7:32:02
 * 使用DOM读取XML文件的内容 DOMTest.java
 */
public class DOMTest {
    public static void main(String[] args) throws Exception {
        ArrayList<double[]> arrayList = ReadFile.readFile();
        ArrayList<targetSpherical> resArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            target3d target3d = new target3d(arrayList.get(i));
            targetSpherical targetspherical = target3d.target3dToSpherical();
            resArrayList.add(targetspherical);
        }
        double[] res = aveSpherical.aveSpherical(resArrayList);
        System.out.println("情况一：三层分布,300台相机");
        System.out.println("多相机联合空间分辨率：{"+res[0]+","+res[1]+"}");
    }
}

