package com.techstack.corebanking;


import com.techstack.corebanking.dto.AccStmtRequest;
import com.techstack.corebanking.stub.REQUESTACCSTMTIOFSRES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccFinServiceController {
    @Autowired
    private AccFinServiceClient accfinserviceclient ;


    @PostMapping("api/v1/QueryCustomerStatement")
    public REQUESTACCSTMTIOFSRES Statement (@RequestBody AccStmtRequest accstmtrequest) throws Exception {
        REQUESTACCSTMTIOFSRES responseMsg = accfinserviceclient.CustStatement(accstmtrequest);
        System.out.println(""+responseMsg.getFCUBSBODY());
        return responseMsg;

    }

}
