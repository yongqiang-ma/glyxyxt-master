package com.eight.glyxyxt.dataobject;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Xlyy {
	// id ：
	private Integer id;
	// name ：
	private String name;
	// sid ：
	private String sid;
	// one ：
	private String one;
	// two ：
	private String two;
	// phone ：
	private String phone;
	// time ：
	private Timestamp time;
	// state ：
	private Integer state;
	// xq ：
	private String xq;
	// bj ：
	private String bj;
	// ly ：
	private String ly;

	// 无参构造器
	public Xlyy() {
	}

	// 有参构造器，进行属性值的初始化
	public Xlyy(Integer id, String name, String sid, String one, String two, String phone, Timestamp time, Integer state, String xq, String bj, String ly) {
		this.id = id;
		this.name = name;
		this.sid = sid;
		this.one = one;
		this.two = two;
		this.phone = phone;
		this.time = time;
		this.state = state;
		this.xq = xq;
		this.bj = bj;
		this.ly = ly;
	}

	// 获取 id 的属性值
	public Integer getId() {
		return id;
	}

	// 设置 id 的属性值
	public void setId(Integer id) {
		this.id = id;
	}

	// 获取 name 的属性值
	public String getName() {
		return name;
	}

	// 设置 name 的属性值
	public void setName(String name) {
		this.name = name;
	}

	// 获取 sid 的属性值
	public String getSid() {
		return sid;
	}

	// 设置 sid 的属性值
	public void setSid(String sid) {
		this.sid = sid;
	}

	// 获取 one 的属性值
	public String getOne() {
		return one;
	}

	// 设置 one 的属性值
	public void setOne(String one) {
		this.one = one;
	}

	// 获取 two 的属性值
	public String getTwo() {
		return two;
	}

	// 设置 two 的属性值
	public void setTwo(String two) {
		this.two = two;
	}

	// 获取 phone 的属性值
	public String getPhone() {
		return phone;
	}

	// 设置 phone 的属性值
	public void setPhone(String phone) {
		this.phone = phone;
	}

	// 获取 time 的属性值
	public Timestamp getTime() {
		return time;
	}

	// 设置 time 的属性值
	public void setTime(Timestamp time) {
		this.time = time;
	}

	// 获取 state 的属性值
	public Integer getState() {
		return state;
	}

	// 设置 state 的属性值
	public void setState(Integer state) {
		this.state = state;
	}

	// 获取 xq 的属性值
	public String getXq() {
		return xq;
	}

	// 设置 xq 的属性值
	public void setXq(String xq) {
		this.xq = xq;
	}

	// 获取 bj 的属性值
	public String getBj() {
		return bj;
	}

	// 设置 bj 的属性值
	public void setBj(String bj) {
		this.bj = bj;
	}

	// 获取 ly 的属性值
	public String getLy() {
		return ly;
	}

	// 设置 ly 的属性值
	public void setLy(String ly) {
		this.ly = ly;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Xlyy {" + 
				", id='" + id + '\'' + 
				", name='" + name + '\'' + 
				", sid='" + sid + '\'' + 
				", one='" + one + '\'' + 
				", two='" + two + '\'' + 
				", phone='" + phone + '\'' + 
				", time='" + time + '\'' + 
				", state='" + state + '\'' + 
				", xq='" + xq + '\'' + 
				", bj='" + bj + '\'' + 
				", ly='" + ly + '\'' + 
				"}";
	}
}