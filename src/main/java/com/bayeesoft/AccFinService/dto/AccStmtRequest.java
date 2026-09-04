package com.bayeesoft.AccFinService.dto;

import com.bayeesoft.AccFinService.stub.BalanceType;
import com.bayeesoft.AccFinService.stub.StmtType;
import com.bayeesoft.AccFinService.stub.YesNoType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

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

    //   private Date frmdt;
    //   private Date  todt;

}
