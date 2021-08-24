package com.eight.glyxyxt.dataobject;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Qdb {
	// id ：
	private Integer id;
	// 签到时间
	private Timestamp qdsj;
	// 审核员id
	private String shyid;
	// 校区
	private String xq;
	// 1签到，2签退
	private Integer state;

	// 无参构造器
	public Qdb() {
	}

	// 有参构造器，进行属性值的初始化
	public Qdb(Integer id, Timestamp qdsj, String shyid, String xq, Integer state) {
		this.id = id;
		this.qdsj = qdsj;
		this.shyid = shyid;
		this.xq = xq;
		this.state = state;
	}

	// 获取 id 的属性值
	public Integer getId() {
		return id;
	}

	// 设置 id 的属性值
	public void setId(Integer id) {
		this.id = id;
	}

	// 获取 签到时间 的属性值
	public Timestamp getQdsj() {
		return qdsj;
	}

	// 设置 签到时间 的属性值
	public void setQdsj(Timestamp qdsj) {
		this.qdsj = qdsj;
	}

	// 获取 审核员id 的属性值
	public String getShyid() {
		return shyid;
	}

	// 设置 审核员id 的属性值
	public void setShyid(String shyid) {
		this.shyid = shyid;
	}

	// 获取 校区 的属性值
	public String getXq() {
		return xq;
	}

	// 设置 校区 的属性值
	public void setXq(String xq) {
		this.xq = xq;
	}

	// 获取 1签到，2签退 的属性值
	public Integer getState() {
		return state;
	}

	// 设置 1签到，2签退 的属性值
	public void setState(Integer state) {
		this.state = state;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Qdb {" + 
				", id='" + id + '\'' + 
				", qdsj='" + qdsj + '\'' + 
				", shyid='" + shyid + '\'' + 
				", xq='" + xq + '\'' + 
				", state='" + state + '\'' + 
				"}";
	}
}