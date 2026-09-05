package com.techstack.corebanking;

import com.techstack.corebanking.dto.AccStmtRequest;
import com.techstack.corebanking.stub.*;
import com.techstack.corebanking.util.DataConverterXmlGre;
import com.techstack.corebanking.util.RequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.datatype.XMLGregorianCalendar;

@Service
public class AccFinServiceClient {

    @Autowired
    private Jaxb2Marshaller marshaller;

    @Autowired
    private RequestUtil requestUtil;

    @Value("${fcubs.account-service-url}")
    private static String ACCOUNT_SERVICE_URL;

    private WebServiceTemplate template ;

    public REQUESTACCSTMTIOFSRES CustStatement (AccStmtRequest accstmtrequest) throws Exception {
        REQUESTACCSTMTIOFSREQ fcubsMainHeader = new REQUESTACCSTMTIOFSREQ();

        FCUBSHEADERType fcubsHeader = requestUtil.createHeader();

        XMLGregorianCalendar fromdate;
        XMLGregorianCalendar todate;
        fromdate = DataConverterXmlGre.convertToXmlCalendar(accstmtrequest.getFrmdt());
        todate = DataConverterXmlGre.convertToXmlCalendar(accstmtrequest.getTodt());

        AdhocStmtReqType adhocstmtreqtype = new AdhocStmtReqType();
        adhocstmtreqtype.setACC(accstmtrequest.getAcc());
        adhocstmtreqtype.setBRN(accstmtrequest.getBrn());
        adhocstmtreqtype.setFRMDT(fromdate);
        adhocstmtreqtype.setTODT(todate);
        adhocstmtreqtype.setXREF(accstmtrequest.getXref());
        adhocstmtreqtype.setAPPLYCHG(YesNoType.N);
        adhocstmtreqtype.setBALANCETYPE(BalanceType.B);
        adhocstmtreqtype.setSTMTTYPE(StmtType.D);
        REQUESTACCSTMTIOFSREQ.FCUBSBODY flexbosy = new REQUESTACCSTMTIOFSREQ.FCUBSBODY();
        flexbosy.setCustAccStmtAdhocRequest(adhocstmtreqtype);
        fcubsMainHeader.setFCUBSBODY(flexbosy);

        template = new WebServiceTemplate(marshaller);
        REQUESTACCSTMTIOFSRES response = (REQUESTACCSTMTIOFSRES)  template.marshalSendAndReceive(ACCOUNT_SERVICE_URL,fcubsMainHeader);
        return response ;
    }
}
