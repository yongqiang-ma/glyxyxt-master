package com.eight.glyxyxt.dataobject;




/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Shy {
	// 易班id
	private String ybid;
	// 工号
	private String gh;
	// 姓名
	private String xm;
	// 1普通职员，2高级职员
	private Integer zw;
	// 当前校区
	private String xq;
	// X坐标
	private String x;
	// Y坐标
	private String y;

	// 无参构造器
	public Shy() {
	}

	// 有参构造器，进行属性值的初始化
	public Shy(String ybid, String gh, String xm, Integer zw, String xq, String x, String y) {
		this.ybid = ybid;
		this.gh = gh;
		this.xm = xm;
		this.zw = zw;
		this.xq = xq;
		this.x = x;
		this.y = y;
	}

	// 获取 易班id 的属性值
	public String getYbid() {
		return ybid;
	}

	// 设置 易班id 的属性值
	public void setYbid(String ybid) {
		this.ybid = ybid;
	}

	// 获取 工号 的属性值
	public String getGh() {
		return gh;
	}

	// 设置 工号 的属性值
	public void setGh(String gh) {
		this.gh = gh;
	}

	// 获取 姓名 的属性值
	public String getXm() {
		return xm;
	}

	// 设置 姓名 的属性值
	public void setXm(String xm) {
		this.xm = xm;
	}

	// 获取 1普通职员，2高级职员 的属性值
	public Integer getZw() {
		return zw;
	}

	// 设置 1普通职员，2高级职员 的属性值
	public void setZw(Integer zw) {
		this.zw = zw;
	}

	// 获取 当前校区 的属性值
	public String getXq() {
		return xq;
	}

	// 设置 当前校区 的属性值
	public void setXq(String xq) {
		this.xq = xq;
	}

	// 获取 X坐标 的属性值
	public String getX() {
		return x;
	}

	// 设置 X坐标 的属性值
	public void setX(String x) {
		this.x = x;
	}

	// 获取 Y坐标 的属性值
	public String getY() {
		return y;
	}

	// 设置 Y坐标 的属性值
	public void setY(String y) {
		this.y = y;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Shy {" + 
				", ybid='" + ybid + '\'' + 
				", gh='" + gh + '\'' + 
				", xm='" + xm + '\'' + 
				", zw='" + zw + '\'' + 
				", xq='" + xq + '\'' + 
				", x='" + x + '\'' + 
				", y='" + y + '\'' + 
				"}";
	}
}