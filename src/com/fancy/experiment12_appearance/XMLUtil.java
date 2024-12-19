package com.fancy.experiment12_appearance;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.lang.reflect.*;

public class XMLUtil {

    public static Object getBean() {
        try {
            // 创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src//com//fancy//experiment12_appearance//config.xml"));

            // 获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            // 获取学生姓名
            NodeList nameList = doc.getElementsByTagName("name");
            Node nameNode = nameList.item(0).getFirstChild();
            String name = nameNode.getNodeValue();

            // 通过类名生成实例对象并将其返回
            Class<?> c = Class.forName(cName);
            Constructor<?> constructor = c.getConstructor(String.class);  // 获取带有一个 String 参数的构造器
            Object obj = constructor.newInstance(name);  // 传入 name 参数实例化对象

            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
