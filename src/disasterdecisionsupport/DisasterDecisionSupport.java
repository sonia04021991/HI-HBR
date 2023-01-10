/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disasterdecisionsupport;

//import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;

import disasterdecisionsupport.disaster.Earthquake;
import disasterdecisionsupport.disaster.Earthquake_Handler;
import disasterdecisionsupport.server.MyIMAPServer;
import java.util.Iterator;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.Model;

//import java.io.IOException;
//import java.io.OutputStream;
//import java.net.InetSocketAddress;

//import com.sun.net.httpserver.HttpExchange;
//import com.sun.net.httpserver.HttpHandler;
//import com.sun.net.httpserver.HttpServer;
//import disasterdecisionsupport.disaster.Earthquake_Handler;
//import disasterdecisionsupport.server.MyHTTPServer;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.InputStream;
//import java.io.StringWriter;
//import java.util.Date;
//import java.util.Iterator;
//import sun.misc.IOUtils;
//import org.apache.commons.io.IOUtils;
//import org.apache.jena.datatypes.xsd.XSDDateTime;
//import org.apache.jena.ontology.Individual;
//import org.apache.jena.ontology.OntClass;
//import org.apache.jena.ontology.OntModel;
//import org.apache.jena.rdf.model.Model;
//
//import org.json.*;

/**
 *
 * @author Classified
 */
public class DisasterDecisionSupport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        //MyIMAPServer email = new MyIMAPServer();
        //System.out.println(HelperFunctions.getCity(18.9220, 72.8347));
        //email.startEmailListener();
        //email.listEmails();
        
        DisasterOntology ont = new DisasterOntology();
        Earthquake eq = new Earthquake(null, "India", "Koynanagar",7, 19.0760, 72.8777, 10, "08/04/2017", "23:30:30");
        //ont.addEarthquake(eq);
        //System.out.println(ont.getOntURI());
        Earthquake_Handler eh = new Earthquake_Handler(ont);
        eh.processData(eq);
        


        
        
        
//        Earthquake_Handler eh =  new Earthquake_Handler(ont);
//        eh.accessAPI("us1000876f");
//        MyHTTPServer server = new MyHTTPServer(ont);
 
//        Model baseModel = ont.getBaseModel();
//        OntModel ontModel = ont.getOntModel();
//        OntClass country = ontModel.getOntClass(ont.getOntURI()+"#"+"Country");
//
//        Iterator iter = country.listInstances();
//        while(iter.hasNext()){
//            System.out.println(iter.next());
//        }
        
    }
}
