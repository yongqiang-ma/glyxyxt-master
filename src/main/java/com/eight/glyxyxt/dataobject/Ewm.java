package com.eight.glyxyxt.dataobject;




/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Ewm {
	// id ：
	private Integer id;
	// 区域id
	private Integer qid;
	// 二维码详细地点（不等于报修的详细地点）
	private String xxdd;

	// 无参构造器
	public Ewm() {
	}

	// 有参构造器，进行属性值的初始化
	public Ewm(Integer id, Integer qid, String xxdd) {
		this.id = id;
		this.qid = qid;
		this.xxdd = xxdd;
	}

	// 获取 id 的属性值
	public Integer getId() {
		return id;
	}

	// 设置 id 的属性值
	public void setId(Integer id) {
		this.id = id;
	}

	// 获取 区域id 的属性值
	public Integer getQid() {
		return qid;
	}

	// 设置 区域id 的属性值
	public void setQid(Integer qid) {
		this.qid = qid;
	}

	// 获取 二维码详细地点（不等于报修的详细地点） 的属性值
	public String getXxdd() {
		return xxdd;
	}

	// 设置 二维码详细地点（不等于报修的详细地点） 的属性值
	public void setXxdd(String xxdd) {
		this.xxdd = xxdd;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Ewm {" + 
				", id='" + id + '\'' + 
				", qid='" + qid + '\'' + 
				", xxdd='" + xxdd + '\'' + 
				"}";
	}
}