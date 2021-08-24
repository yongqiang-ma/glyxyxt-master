package com.eight.glyxyxt.dataobject;

import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Qm_book {
	// id ：
	private Integer id;
	// title ：
	private String title;
	// xq ：
	private String xq;
	// time ：
	private Timestamp time;

	// 无参构造器
	public Qm_book() {
	}

	// 有参构造器，进行属性值的初始化
	public Qm_book(Integer id, String title, String xq, Timestamp time) {
		this.id = id;
		this.title = title;
		this.xq = xq;
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

	// 获取 title 的属性值
	public String getTitle() {
		return title;
	}

	// 设置 title 的属性值
	public void setTitle(String title) {
		this.title = title;
	}

	// 获取 xq 的属性值
	public String getXq() {
		return xq;
	}

	// 设置 xq 的属性值
	public void setXq(String xq) {
		this.xq = xq;
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
		return "Qm_book {" + 
				", id='" + id + '\'' + 
				", title='" + title + '\'' + 
				", xq='" + xq + '\'' + 
				", time='" + time + '\'' + 
				"}";
	}
}