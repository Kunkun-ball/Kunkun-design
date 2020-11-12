package com.hukun.graduation.model;

import java.math.BigDecimal;

public class StudentHealthInfoModel {
	
	private Long shid;
	private Long sid;
	private String sname;
	private String profession;
	private BigDecimal bodyTemperature;
	private Integer cough;
	private Integer vomit;
	private Integer diarrhea;
	public Long getShid() {
		return shid;
	}
	public void setShid(Long shid) {
		this.shid = shid;
	}
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public BigDecimal getBodyTemperature() {
		return bodyTemperature;
	}
	public void setBodyTemperature(BigDecimal bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}
	public Integer getCough() {
		return cough;
	}
	public void setCough(Integer cough) {
		this.cough = cough;
	}
	public Integer getVomit() {
		return vomit;
	}
	public void setVomit(Integer vomit) {
		this.vomit = vomit;
	}
	public Integer getDiarrhea() {
		return diarrhea;
	}
	public void setDiarrhea(Integer diarrhea) {
		this.diarrhea = diarrhea;
	}
	

}
