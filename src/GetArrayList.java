import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class GetArrayList {
    public static double[] getarraylist(String XmlName) throws Exception{
        // 创建一个DocumentBuilderFactory对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // 创建一个DocumentBuilder对象
        DocumentBuilder db = dbf.newDocumentBuilder();
        // 使用parse方法解析xml文件
        Document document = db.parse(XmlName);
        NodeList nl = document.getElementsByTagName("t");
        // 通过item(i)获取一个t节点
        Node t = nl.item(0);
        // 获取t节点的子节点
        NodeList childNodes = t.getChildNodes();
        // 获取子节点的data数据
        String value = childNodes.item(7).getFirstChild().getNodeValue();
        String valueSub0=value.substring(0, 20);
        String valueSub1=value.substring(20, 35);
        String valueSub2=value.substring(35);
        double[] doubles = new double[3];
        doubles[0]= Double.parseDouble(valueSub0);
        doubles[1]= Double.parseDouble(valueSub1);
        doubles[2]= Double.parseDouble(valueSub2);
        return doubles;
    }
}
