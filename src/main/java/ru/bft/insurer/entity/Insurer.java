package ru.bft.insurer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Insurer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String regNum;
    private String regNumPf;
    private String state;
    private String fssDepartmentCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}
