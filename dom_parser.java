package com.company;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Main {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException, TransformerException {
        try {
        File xmlFile = new File("C:\\Users\\marius.nicolae1\\IntelliJIDEAProjects\\SAXparsingXML\\data\\file.xml");
        File newXmlFile = new File("C:\\Users\\marius.nicolae1\\IntelliJIDEAProjects\\SAXparsingXML\\data\\newfile.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document document = dBuilder.parse(xmlFile);
        document.getDocumentElement().normalize();
        System.out.println("Root element :" + document.getDocumentElement().getNodeName());
        //NodeList nList = document.getElementsByTagName("ns2:Workflow");

        //TASK AREA
        NodeList nTask = document.getElementsByTagName("ns2:Task");
        for (int i = 0; i < nTask.getLength(); i++) {
            Node nNTask = nTask.item(i);
            System.out.println("\nCurrent Element: " + nNTask.getNodeName());
            if (nNTask.getNodeType() == Node.ELEMENT_NODE) {
                Element eElementTask = (Element) nNTask;

                //find the status: E
                if (eElementTask.getElementsByTagName("ns2:status")
                        .item(0)
                        .getTextContent().equalsIgnoreCase("e")){
                    System.out.println("aici am gasit un eronat --- E --- ");

                    //set the status from E to I (initiate)
                    eElementTask.getElementsByTagName("ns2:status").item(0).setTextContent("I");
//                    eElementTask.getElementsByTagName("ns2:status").item(0).setNodeValue("I");
                    System.out.println("Status schimbat este: " +
                            eElementTask.getElementsByTagName("ns2:status")
                                    .item(0)
                                    .getTextContent());

                    // writing the content into xml file
                    TransformerFactory factory = TransformerFactory.newInstance();
                    Transformer transformer = factory.newTransformer();
                    DOMSource source = new DOMSource(document);
                    StreamResult result = new StreamResult(new File(String.valueOf(newXmlFile)));
                    transformer.transform(source, result);

//                    Field[] reflectedClass = TransformerFactory.class.getDeclaredFields();
//                    for (Field field : reflectedClass) {
//                        int mod = field.getModifiers();
//                        System.out.println(mod);
//                    }
                    System.out.println("Done");
                }

//                eElementTask.getElementsByTagName("ns2:name").item(0).setTextContent("schimbat by tao");
//                System.out.println("Task Name: " +
//                        eElementTask.getElementsByTagName("ns2:name")
//                                .item(0)
//                                .getTextContent());
//                System.out.println("Processor: " +
//                        eElementTask.getElementsByTagName("ns2:taskProcessor")
//                                .item(0)
//                                .getTextContent());
//                System.out.println("Status initial: " +
//                        eElementTask.getElementsByTagName("ns2:status")
//                                .item(0)
//                                .getTextContent());//setTextContent to edit
            }
        }

        //WORKFLOW AREA
//        System.out.println("---------------------------");
//        for (int temp = 0; temp < nList.getLength(); temp++){
//                Node nNode = nList.item(temp);
//
//                System.out.println("\nCurrent Element: " + nNode.getNodeName());
//
//            if (nNode.getNodeType() == Node.ELEMENT_NODE){
//                Element eElement = (Element) nNode;
//
//                System.out.println("Service\\Task type: " +
//                        eElement.getElementsByTagName("ns2:name")
//                                .item(0)
//                                .getTextContent());
//                System.out.println("Status is: " +
//                        eElement.getElementsByTagName("ns2:status")
//                                .item(0)
//                                .getTextContent());
//                System.out.println("Rollback status: " +
//                        eElement.getElementsByTagName("ns2:rollback")
//                                .item(0)
//                                .getTextContent());
//                System.out.println("Cancelation status: " +
//                        eElement.getElementsByTagName("ns2:cancellationMilestone")
//                                .item(0)
//                                .getTextContent());
//                System.out.println("Critical status: " +
//                        eElement.getElementsByTagName("ns2:critical")
//                                .item(0)
//                                .getTextContent());
//                System.out.println("Created: " +
//                        eElement.getElementsByTagName("ns2:createdDate")
//                                .item(0)
//                                .getTextContent());
//                System.out.println("Modified: " +
//                        eElement.getElementsByTagName("ns2:modifiedDate")
//                                .item(0)
//                                .getTextContent());//setTextContent to edit
//            }
        }
        catch (ParserConfigurationException e){
        e.printStackTrace();
        }
    }
//        NodeList generatedId = document.getElementsByTagName("ns2:generatedBy");
//        Node iDnode = generatedId.item(0);
//        System.out.println("\n" + "Generated by instanceID: " +
//                iDnode.getTextContent());
    }
//}
