package ru.bft.insurer.model;

import javax.xml.bind.annotation.*;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInsurerDataResponse", propOrder = { "regNum", "regNumPf", "state", "fssDepartmentCode", "errorText" })
public class GetInsurerDataResponse {
    @XmlElement(name = "regNum", required = true)
    protected String regNum;
    @XmlElement(name = "regNumPf", required = true)
    protected String regNumPf;
    @XmlElement(name = "state", required = true)
    protected String state;
    @XmlElement(name = "fssDepartmentCode", required = true)
    protected String fssDepartmentCode;
    @XmlElement(name = "errorText", required = false)
    protected String errorText;

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getRegNumPf() {
        return regNumPf;
    }

    public void setRegNumPf(String regNumPf) {
        this.regNumPf = regNumPf;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFssDepartmentCode() {
        return fssDepartmentCode;
    }

    public void setFssDepartmentCode(String fssDepartmentCode) {
        this.fssDepartmentCode = fssDepartmentCode;
    }

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }
}
