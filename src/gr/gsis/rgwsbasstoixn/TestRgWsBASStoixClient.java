/*
 * Copyright Neurocom 2011
 *
 */
package gr.gsis.rgwsbasstoixn;

import gr.gsis.rgwsbasstoixn.rgwsbasstoixn.wsdl.RgWsBasStoixN;
import gr.gsis.rgwsbasstoixn.rgwsbasstoixn.wsdl.RgWsBasStoixN_Service;
import gr.gsis.rgwsbasstoixn.rgwsbasstoixn_wsdl.types.GenWsErrorRtUser;
import gr.gsis.rgwsbasstoixn.rgwsbasstoixn_wsdl.types.RgWsBasStoixNRtUser;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;

import javax.xml.ws.Holder;

import org.junit.Test;

/**
 * A JUnit test showcasing invocation of web service defined in
 * 
 * https://www1.gsis.gr/wsgsis/RgWsBasStoixN/RgWsBasStoixNSoapHttpPort?wsdl.
 * 
 * We supply a local wsdl file to the service with the correct  
 * soap address location.
 * 
 * @author Spyros Oikonomopoulos
 */
public class TestRgWsBASStoixClient {

    @Test
    public void testServiceInvocation() throws Exception {
        
        URL wsdlURL = new URL("file:\\" + new File(".").getAbsolutePath() + "\\RgWsBasStoixNSoapHttpPort.wsdl");
        
        Holder<RgWsBasStoixNRtUser> pBasStoixNRecOut = new Holder<RgWsBasStoixNRtUser>(new RgWsBasStoixNRtUser());
        Holder<BigDecimal> pCallSeqIdOut = new Holder<BigDecimal>(new BigDecimal(0));
        Holder<GenWsErrorRtUser> pErrorRecOut = new Holder<GenWsErrorRtUser>(new GenWsErrorRtUser());
        
        RgWsBasStoixN_Service service = new RgWsBasStoixN_Service(wsdlURL);
        RgWsBasStoixN port = service.getRgWsBasStoixNSoapHttpPort();
        port.rgWsBasStoixN("998773380", pBasStoixNRecOut, pCallSeqIdOut,
                pErrorRecOut);

        GenWsErrorRtUser genWsErrorRtUser = pErrorRecOut.value;
        if (genWsErrorRtUser.getErrorCode() != null) {
            throw new Exception("Error " + genWsErrorRtUser.getErrorCode()
                    + ": " + genWsErrorRtUser.getErrorDescr());
        }
        
        System.out.println();
        System.out.println("Call sequence id is: " + pCallSeqIdOut.value.longValue());
        System.out.println();
        RgWsBasStoixNRtUser rgWsBaasStoixNRtUser = pBasStoixNRecOut.value;  
        System.out.println("************* Busines information *************" );
        System.out.println();
        System.out.println("AFM: " + rgWsBaasStoixNRtUser.getAfm());
        System.out.println("Doy: " + rgWsBaasStoixNRtUser.getDoy());
        System.out.println("Doy Descr: " + rgWsBaasStoixNRtUser.getDoyDescr());
        System.out.println("Onomasia: " + rgWsBaasStoixNRtUser.getOnomasia());
        System.out.println("Commercial Title: " + rgWsBaasStoixNRtUser.getCommerTitle());
        System.out.println("Activity: " + rgWsBaasStoixNRtUser.getActLongDescr());        
        System.out.println("Phone: " + rgWsBaasStoixNRtUser.getFirmPhone());
        if (rgWsBaasStoixNRtUser.getFirmFax() != null) {
            System.out.println("Fax: " + rgWsBaasStoixNRtUser.getFirmFax());
        }
        System.out.println();
        System.out.println("*** Postal Address ***");
        System.out.print(rgWsBaasStoixNRtUser.getPostalAddress());
        if (!"0".equals(rgWsBaasStoixNRtUser.getPostalAddressNo().trim())) {
            System.out.print(" " + rgWsBaasStoixNRtUser.getPostalAddressNo());
        } else {
            System.out.print("\n");
        }
        System.out.println(rgWsBaasStoixNRtUser.getPostalZipCode());        
        System.out.println(rgWsBaasStoixNRtUser.getParDescription());        
    }

}
