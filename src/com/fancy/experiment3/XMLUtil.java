package com.fancy.experiment3;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLUtil {
    public static FishFarm getBean() {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/com/fancy/experiment3/config.xml"));
            NodeList nodeList = document.getElementsByTagName("farm");
//           获取第四个标签：
            String farmName = nodeList.item(3).getTextContent();

            if (farmName.equals("CarpFarm")) {
                return new CarpFarm();
            } else if (farmName.equals("CatfishFarm")) {
                return new CatfishFarm();
            } else if (farmName.equals("GrassCarpFarm")) {
                return new GrassCarpFarm();
            }else if (farmName.equals("CrucianFarm")) {
                return new CrucianFarm();
            }else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
