package com.bayeesoft.AccFinService;


import com.bayeesoft.AccFinService.dto.AccStmtRequest;
import com.bayeesoft.AccFinService.stub.*;
import com.bayeesoft.AccFinService.util.DataConverterXmlGre;
import com.bayeesoft.AccFinService.util.DateConverter;
import com.bayeesoft.AccFinService.util.DateConverter2;
import com.bayeesoft.AccFinService.util.FlexcubeDateUtil;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class AccFinServiceClient {
    @Autowired
    private Jaxb2Marshaller marshaller ;
    private WebServiceTemplate template ;




    public REQUESTACCSTMTIOFSRES CustStatement (AccStmtRequest accstmtrequest) throws Exception {
        REQUESTACCSTMTIOFSREQ fcubsMainHeader = new REQUESTACCSTMTIOFSREQ();
        FCUBSHEADERType fcubsheader = new FCUBSHEADERType();
        fcubsheader.setSOURCE("FCAT");
        fcubsheader.setUBSCOMP(UBSCOMPType.FCUBS);
        fcubsheader.setMSGID("");
        fcubsheader.setCORRELID(null);
        fcubsheader.setUSERID("TAKEON02");
        fcubsheader.setPASSWORD("Oracle@2");
        fcubsheader.setBRANCH("100");
        fcubsheader.setMODULEID("");
        fcubsheader.setSERVICE("FCUBSAccFinService");
        fcubsheader.setOPERATION("RequestAccStmt");
        fcubsMainHeader.setFCUBSHEADER(fcubsheader);

        XMLGregorianCalendar fromdate;
        XMLGregorianCalendar todate;
       fromdate = DataConverterXmlGre.convertToXmlCalendar(accstmtrequest.getFrmdt());
        todate = DataConverterXmlGre.convertToXmlCalendar(accstmtrequest.getTodt());

        AdhocStmtReqType adhocstmtreqtype = new AdhocStmtReqType();
        adhocstmtreqtype.setACC(accstmtrequest.getAcc());
        adhocstmtreqtype.setBRN(accstmtrequest.getBrn());
        adhocstmtreqtype.setFRMDT(fromdate);
        adhocstmtreqtype.setTODT(todate);
      //  adhocstmtreqtype.setFRMDT(fromdate);
     //   adhocstmtreqtype.setTODT(todate);
        System.out.println("From date passed  is :" +fromdate);
        System.out.println("to date passed  is :" +todate );
        adhocstmtreqtype.setXREF(accstmtrequest.getXref());
        adhocstmtreqtype.setAPPLYCHG(YesNoType.N);
        adhocstmtreqtype.setBALANCETYPE(BalanceType.B);
        adhocstmtreqtype.setSTMTTYPE(StmtType.D);
        REQUESTACCSTMTIOFSREQ.FCUBSBODY flexbosy = new REQUESTACCSTMTIOFSREQ.FCUBSBODY();
        flexbosy.setCustAccStmtAdhocRequest(adhocstmtreqtype);
        fcubsMainHeader.setFCUBSBODY(flexbosy);

        template = new WebServiceTemplate(marshaller);
        REQUESTACCSTMTIOFSRES response = (REQUESTACCSTMTIOFSRES)  template.marshalSendAndReceive("http://10.1.12.71:8101/FCUBSAccFinService/FCUBSAccFinService",fcubsMainHeader);
        return response ;
    }


}
