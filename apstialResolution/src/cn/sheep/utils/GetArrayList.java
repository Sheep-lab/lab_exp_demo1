package cn.sheep.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 将xml中相机内参p矩阵取出 存为3*3的二维数组
 * 返回含有多相机内参的链表
 * */
public class GetArrayList {
    public static double[][] getarraylist(String XmlName) throws Exception{
        // 创建一个DocumentBuilderFactory对象
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // 创建一个DocumentBuilder对象
        DocumentBuilder db = dbf.newDocumentBuilder();
        // 使用parse方法解析xml文件
        Document document = db.parse(XmlName);
        NodeList nl = document.getElementsByTagName("P");
        // 通过item(i)获取一个P节点
        Node t = nl.item(0);
        // 获取t节点的子节点
        NodeList childNodes = t.getChildNodes();
        // 获取子节点的data数据
        String value = childNodes.item(7).getFirstChild().getNodeValue();
        String valueSub00=value.substring(4, 14);//9
        String valueSub01=value.substring(20, 30);//7
        String valueSub02=value.substring(36,46);//21
        String valueSub10=value.substring(65, 74);
        String valueSub11=value.substring(81, 90);
        String valueSub12=value.substring(97,106);
        String valueSub20=value.substring(126, 135);
        String valueSub21=value.substring(142, 151);
        String valueSub22=value.substring(158,167);
        double[][] doubles = new double[3][3];
        doubles[0][0]= Double.parseDouble(valueSub00.trim());
        doubles[0][1]= Double.parseDouble(valueSub01.trim());
        doubles[0][2]= Double.parseDouble(valueSub02.trim());
        doubles[1][0]= Double.parseDouble(valueSub10.trim());
        doubles[1][1]= Double.parseDouble(valueSub11.trim());
        doubles[1][2]= Double.parseDouble(valueSub12.trim());
        doubles[2][0]= Double.parseDouble(valueSub20.trim());
        doubles[2][1]= Double.parseDouble(valueSub21.trim());
        doubles[2][2]= Double.parseDouble(valueSub22.trim());
        return doubles;
    }
}
