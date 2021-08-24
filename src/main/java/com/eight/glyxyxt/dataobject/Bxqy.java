package com.eight.glyxyxt.dataobject;




/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Bxqy {
	// id ：
	private Integer id;
	// 区域名称
	private String qy;
	// 区域类别
	private String qylb;
	// 校区
	private String xq;
	// 后台管理x坐标
	private String x;
	// 后台管理Y坐标
	private String y;

	// 无参构造器
	public Bxqy() {
	}

	// 有参构造器，进行属性值的初始化
	public Bxqy(Integer id, String qy, String qylb, String xq, String x, String y) {
		this.id = id;
		this.qy = qy;
		this.qylb = qylb;
		this.xq = xq;
		this.x = x;
		this.y = y;
	}

	// 获取 id 的属性值
	public Integer getId() {
		return id;
	}

	// 设置 id 的属性值
	public void setId(Integer id) {
		this.id = id;
	}

	// 获取 区域名称 的属性值
	public String getQy() {
		return qy;
	}

	// 设置 区域名称 的属性值
	public void setQy(String qy) {
		this.qy = qy;
	}

	// 获取 区域类别 的属性值
	public String getQylb() {
		return qylb;
	}

	// 设置 区域类别 的属性值
	public void setQylb(String qylb) {
		this.qylb = qylb;
	}

	// 获取 校区 的属性值
	public String getXq() {
		return xq;
	}

	// 设置 校区 的属性值
	public void setXq(String xq) {
		this.xq = xq;
	}

	// 获取 后台管理x坐标 的属性值
	public String getX() {
		return x;
	}

	// 设置 后台管理x坐标 的属性值
	public void setX(String x) {
		this.x = x;
	}

	// 获取 后台管理Y坐标 的属性值
	public String getY() {
		return y;
	}

	// 设置 后台管理Y坐标 的属性值
	public void setY(String y) {
		this.y = y;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Bxqy {" + 
				", id='" + id + '\'' + 
				", qy='" + qy + '\'' + 
				", qylb='" + qylb + '\'' + 
				", xq='" + xq + '\'' + 
				", x='" + x + '\'' + 
				", y='" + y + '\'' + 
				"}";
	}
}