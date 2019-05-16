package com.qf.dto;

import com.qf.pojo.Project;

import java.io.Serializable;
import java.util.Date;

public class Uproject implements Serializable {
    private Integer proinfoid;
    private Integer projectid;
    private Integer userid;
    private Integer proinfonumber;
    private int proinfolsnumber;
    private String proinfodailiren;
    private String proinfoinfo;
    private Date proinfofabiaodate;
    private Date proinfodaoqidate;
    private Date proinfochujiedate;
    private Double proinfomoney;
    private String proinfostate;
    private String proinfotoujindu;
    private String proinfoshishou;
    private String proinfohuankuantype;
    private String proinfohetong;

    @Override
    public String toString() {
        return "Uproject{" +
                "proinfoid=" + proinfoid +
                ", projectid=" + projectid +
                ", userid=" + userid +
                ", proinfonumber=" + proinfonumber +
                ", proinfolsnumber='" + proinfolsnumber + '\'' +
                ", proinfodailiren='" + proinfodailiren + '\'' +
                ", proinfoinfo='" + proinfoinfo + '\'' +
                ", proinfofabiaodate=" + proinfofabiaodate +
                ", proinfodaoqidate=" + proinfodaoqidate +
                ", proinfochujiedate=" + proinfochujiedate +
                ", proinfomoney=" + proinfomoney +
                ", proinfostate='" + proinfostate + '\'' +
                ", proinfotoujindu='" + proinfotoujindu + '\'' +
                ", proinfoshishou='" + proinfoshishou + '\'' +
                ", proinfohuankuantype='" + proinfohuankuantype + '\'' +
                ", proinfohetong='" + proinfohetong + '\'' +
                '}';
    }

    public Integer getProinfoid() {
        return proinfoid;
    }

    public void setProinfoid(Integer proinfoid) {
        this.proinfoid = proinfoid;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getProinfonumber() {
        return proinfonumber;
    }

    public void setProinfonumber(Integer proinfonumber) {
        this.proinfonumber = proinfonumber;
    }

    public int getProinfolsnumber() {
        return proinfolsnumber;
    }

    public void setProinfolsnumber(Integer proinfolsnumber) {
        this.proinfolsnumber = proinfolsnumber;
    }

    public String getProinfodailiren() {
        return proinfodailiren;
    }

    public void setProinfodailiren(String proinfodailiren) {
        this.proinfodailiren = proinfodailiren;
    }

    public String getProinfoinfo() {
        return proinfoinfo;
    }

    public void setProinfoinfo(String proinfoinfo) {
        this.proinfoinfo = proinfoinfo;
    }

    public Date getProinfofabiaodate() {
        return proinfofabiaodate;
    }

    public void setProinfofabiaodate(Date proinfofabiaodate) {
        this.proinfofabiaodate = proinfofabiaodate;
    }

    public Date getProinfodaoqidate() {
        return proinfodaoqidate;
    }

    public void setProinfodaoqidate(Date proinfodaoqidate) {
        this.proinfodaoqidate = proinfodaoqidate;
    }

    public Date getProinfochujiedate() {
        return proinfochujiedate;
    }

    public void setProinfochujiedate(Date proinfochujiedate) {
        this.proinfochujiedate = proinfochujiedate;
    }

    public Double getProinfomoney() {
        return proinfomoney;
    }

    public void setProinfomoney(Double proinfomoney) {
        this.proinfomoney = proinfomoney;
    }

    public String getProinfostate() {
        return proinfostate;
    }

    public void setProinfostate(String proinfostate) {
        this.proinfostate = proinfostate;
    }

    public String getProinfotoujindu() {
        return proinfotoujindu;
    }

    public void setProinfotoujindu(String proinfotoujindu) {
        this.proinfotoujindu = proinfotoujindu;
    }

    public String getProinfoshishou() {
        return proinfoshishou;
    }

    public void setProinfoshishou(String proinfoshishou) {
        this.proinfoshishou = proinfoshishou;
    }

    public String getProinfohuankuantype() {
        return proinfohuankuantype;
    }

    public void setProinfohuankuantype(String proinfohuankuantype) {
        this.proinfohuankuantype = proinfohuankuantype;
    }

    public String getProinfohetong() {
        return proinfohetong;
    }

    public void setProinfohetong(String proinfohetong) {
        this.proinfohetong = proinfohetong;
    }
}
