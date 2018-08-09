package com.javasampleapproach.jpapostgresqlangular4.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tdm")
public class Tdm  implements Serializable{
	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tdmId;

	@Column(name = "terminalCode")
	private String terminalCode;

	@Column(name = "bookingCode")
	private String bookingCode;
	
	@Column(name = "windowNo")
	private int windowNo;
	
	@Column(name = "terminalType")
	private String terminalType;
	
	@Column(name = "terminalIp")
	private String terminalIp;
	
	@Column(name = "posTid")
	private String posTid;
	
	@Column(name = "bankName")
	private String bankName;
	
	@Column(name = "serviceProvider")
	private String serviceProvider;
	
	@Column(name = "posVersionCode")
	private String posVersionCode;
	
	@Column(name = "appterType")
	private String appterType;
	
	@Column(name = "termParameter")
	private String termParameter;
	
	@Column(name = "termOperType1")
	private String termOperType1;
	
	@Column(name = "termOperType2")
	private String termOperType2;
	
	@Column(name = "termOperType3")
	private String termOperType3;
	
	@Column(name = "termOperType4")
	private String termOperType4;
	
	@Column(name = "macAddress")
	private String macAddress;
	
	@Column(name = "stationServerId")
	private String stationServerId;

	

	public Tdm() {
		
	}
	

	public Integer getTdmId() {
		return tdmId;
	}

	public void setTdmId(Integer tdmId) {
		this.tdmId = tdmId;
	}

	public String getTerminalCode() {
		return terminalCode;
	}

	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}

	public String getBookingCode() {
		return bookingCode;
	}
	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}
	
	public int getWindowNo() {
		return windowNo;
	}

	public void setWindowNo(int windowNo) {
		this.windowNo = windowNo;
	}

	public String getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}
	
	public String getTerminalIp() {
		return terminalIp;
	}
	public void setTerminalIp(String terminalIp) {
		this.terminalIp= terminalIp;
	}
	public String getPosTid() {
		return posTid;
	}
	public void setPosTid(String posTid) {
		this.posTid= posTid;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getPosVersionCode() {
		return posVersionCode;
	}
	public void setPosVersionCode(String posVersionCode) {
		this.posVersionCode = posVersionCode;
	}
	public String getAppterType() {
		return appterType;
	}
	public void setAppterType(String appterType) {
		this.appterType = appterType;
	}
	public String getTermParameter() {
		return termParameter;
	}
	public void setTermParameter(String termParameter) {
		this.termParameter = termParameter;
		
	}public String getTermOperType1() {
		return termOperType1;
	}
	public void setTermOperType1(String termOperType1) {
		this.termOperType1 = termOperType1;
	}

	public String getTermOperType2() {
		return termOperType2;
	}
	public void setTermOperType2(String termOperType2) {
		this.termOperType2 = termOperType2;
	}
	
	public String getTermOperType3() {
		return termOperType3;
	}
	public void setTermOperType3(String termOperType3) {
		this.termOperType3 = termOperType3;
	}
	
	public String getTermOperType4() {
		return termOperType4;
	}
	public void setTermOperType4(String termOperType4) {
		this.termOperType4 = termOperType4;
	}
	
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	public String getStationServerId() {
		return stationServerId;
	}
	public void setStationServerId(String stationServerId) {
		this.stationServerId= stationServerId;
	}


	@Override
	public String toString() {
		return "Tdm [tdmId=" + tdmId + ", terminalCode=" + terminalCode + ", bookingCode=" + bookingCode + ", windowNo="
				+ windowNo + ", terminalType=" + terminalType + ", terminalIp=" + terminalIp + ", posTid=" + posTid
				+ ", bankName=" + bankName + ", serviceProvider=" + serviceProvider + ", posVersionCode="
				+ posVersionCode + ", appterType=" + appterType + ", termParameter=" + termParameter
				+ ", termOperType1=" + termOperType1 + ", termOperType2=" + termOperType2 + ", termOperType3="
				+ termOperType3 + ", termOperType4=" + termOperType4 + ", macAddress=" + macAddress
				+ ", stationServerId=" + stationServerId + "]";
	}


	public Tdm(Integer tdmId, String terminalCode, String bookingCode, int windowNo, String terminalType,
			String terminalIp, String posTid, String bankName, String serviceProvider, String posVersionCode,
			String appterType, String termParameter, String termOperType1, String termOperType2, String termOperType3,
			String termOperType4, String macAddress, String stationServerId) {
		super();
		this.tdmId = tdmId;
		this.terminalCode = terminalCode;
		this.bookingCode = bookingCode;
		this.windowNo = windowNo;
		this.terminalType = terminalType;
		this.terminalIp = terminalIp;
		this.posTid = posTid;
		this.bankName = bankName;
		this.serviceProvider = serviceProvider;
		this.posVersionCode = posVersionCode;
		this.appterType = appterType;
		this.termParameter = termParameter;
		this.termOperType1 = termOperType1;
		this.termOperType2 = termOperType2;
		this.termOperType3 = termOperType3;
		this.termOperType4 = termOperType4;
		this.macAddress = macAddress;
		this.stationServerId = stationServerId;
	}
	
	
	
	
}
