package com.example.Lab06_AMQ.entity;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "mssv", "hoTen", "ngaySinh" })
public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long mssv;
	private String hoTen;
	private Date ngaySinh;

	public Person(long mssv, String hoten, Date ngaysinh) {
		this.mssv = mssv;
		this.hoTen = hoten;
		this.ngaySinh = ngaysinh;
	}

	public Person() {
	}

	public long getMssv() {
		return mssv;
	}

	public void setMssv(long mssv) {
		this.mssv = mssv;
	}

	public String getHoten() {
		return hoTen;
	}

	public void setHoten(String hoten) {
		this.hoTen = hoten;
	}

	public Date getNgaysinh() {
		return ngaySinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaySinh = ngaysinh;
	}

	@Override
	public String toString() {
		return mssv + "\t" + hoTen + "\t" + ngaySinh;
	}
}