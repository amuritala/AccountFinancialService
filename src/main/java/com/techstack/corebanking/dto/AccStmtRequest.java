package com.techstack.corebanking.dto;

import com.techstack.corebanking.stub.BalanceType;
import com.techstack.corebanking.stub.StmtType;
import com.techstack.corebanking.stub.YesNoType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccStmtRequest {
    private String xref;
    private String acc;
    private String brn;
    private XMLGregorianCalendar frmdt;
    private XMLGregorianCalendar todt;
    private StmtType stmttype;
    private BalanceType balancetype;
    private YesNoType applychg;
}
