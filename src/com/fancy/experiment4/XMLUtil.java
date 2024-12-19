package com.fancy.experiment4;

import com.fancy.experiment3.*;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static CourseFactory getBean() {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/com/fancy/experiment4/config.xml"));
            NodeList courseFactoryList = document.getElementsByTagName("course");
//           获取一个第一个course对象JavaCourseFactory
            String onlineCourseItem = courseFactoryList.item(2).getTextContent();
            if (onlineCourseItem.equals("JavaCourseFactory")) {
                return new JavaCourseFactory();
            } else if (onlineCourseItem.equals("PatternCourseFactory")) {
                return new PatternCourseFactory();
            } else if (onlineCourseItem.equals("DataCourseFactory")) {
                return new DataCourseFactory();
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
