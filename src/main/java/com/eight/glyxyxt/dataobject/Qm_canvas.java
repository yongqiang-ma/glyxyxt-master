package com.eight.glyxyxt.dataobject;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Qm_canvas {
	// id ：
	private Integer id;
	// bid ：
	private Integer bid;
	// sid ：
	private String sid;
	// name ：
	private String name;
	// xy ：
	private String xy;
	// zy ：
	private String zy;
	// bj ：
	private String bj;
	// pic ：
	private String pic;
	// time ：
	private Timestamp time;

	// 无参构造器
	public Qm_canvas() {
	}

	// 有参构造器，进行属性值的初始化
	public Qm_canvas(Integer id, Integer bid, String sid, String name, String xy, String zy, String bj, String pic, Timestamp time) {
		this.id = id;
		this.bid = bid;
		this.sid = sid;
		this.name = name;
		this.xy = xy;
		this.zy = zy;
		this.bj = bj;
		this.pic = pic;
		this.time = time;
	}

	// 获取 id 的属性值
	public Integer getId() {
		return id;
	}

	// 设置 id 的属性值
	public void setId(Integer id) {
		this.id = id;
	}

	// 获取 bid 的属性值
	public Integer getBid() {
		return bid;
	}

	// 设置 bid 的属性值
	public void setBid(Integer bid) {
		this.bid = bid;
	}

	// 获取 sid 的属性值
	public String getSid() {
		return sid;
	}

	// 设置 sid 的属性值
	public void setSid(String sid) {
		this.sid = sid;
	}

	// 获取 name 的属性值
	public String getName() {
		return name;
	}

	// 设置 name 的属性值
	public void setName(String name) {
		this.name = name;
	}

	// 获取 xy 的属性值
	public String getXy() {
		return xy;
	}

	// 设置 xy 的属性值
	public void setXy(String xy) {
		this.xy = xy;
	}

	// 获取 zy 的属性值
	public String getZy() {
		return zy;
	}

	// 设置 zy 的属性值
	public void setZy(String zy) {
		this.zy = zy;
	}

	// 获取 bj 的属性值
	public String getBj() {
		return bj;
	}

	// 设置 bj 的属性值
	public void setBj(String bj) {
		this.bj = bj;
	}

	// 获取 pic 的属性值
	public String getPic() {
		return pic;
	}

	// 设置 pic 的属性值
	public void setPic(String pic) {
		this.pic = pic;
	}

	// 获取 time 的属性值
	public Timestamp getTime() {
		return time;
	}

	// 设置 time 的属性值
	public void setTime(Timestamp time) {
		this.time = time;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Qm_canvas {" + 
				", id='" + id + '\'' + 
				", bid='" + bid + '\'' + 
				", sid='" + sid + '\'' + 
				", name='" + name + '\'' + 
				", xy='" + xy + '\'' + 
				", zy='" + zy + '\'' + 
				", bj='" + bj + '\'' + 
				", pic='" + pic + '\'' + 
				", time='" + time + '\'' + 
				"}";
	}
}