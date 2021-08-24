package com.eight.glyxyxt.dataobject;




/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Jdr {
	// 易班id
	private String ybid;
	// 工号
	private String gh;
	// 姓名
	private String xm;
	// 手机
	private String sj;
	// 邮箱
	private String yx;
	// 1在职，2休假，3离职
	private String state;
	// （业务范围）1,2,4,8,16,32,64
	private String ywfw;

	// 无参构造器
	public Jdr() {
	}

	// 有参构造器，进行属性值的初始化
	public Jdr(String ybid, String gh, String xm, String sj, String yx, String state, String ywfw) {
		this.ybid = ybid;
		this.gh = gh;
		this.xm = xm;
		this.sj = sj;
		this.yx = yx;
		this.state = state;
		this.ywfw = ywfw;
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

	// 获取 手机 的属性值
	public String getSj() {
		return sj;
	}

	// 设置 手机 的属性值
	public void setSj(String sj) {
		this.sj = sj;
	}

	// 获取 邮箱 的属性值
	public String getYx() {
		return yx;
	}

	// 设置 邮箱 的属性值
	public void setYx(String yx) {
		this.yx = yx;
	}

	// 获取 1在职，2休假，3离职 的属性值
	public String getState() {
		return state;
	}

	// 设置 1在职，2休假，3离职 的属性值
	public void setState(String state) {
		this.state = state;
	}

	// 获取 （业务范围）1,2,4,8,16,32,64 的属性值
	public String getYwfw() {
		return ywfw;
	}

	// 设置 （业务范围）1,2,4,8,16,32,64 的属性值
	public void setYwfw(String ywfw) {
		this.ywfw = ywfw;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Jdr {" + 
				", ybid='" + ybid + '\'' + 
				", gh='" + gh + '\'' + 
				", xm='" + xm + '\'' + 
				", sj='" + sj + '\'' + 
				", yx='" + yx + '\'' + 
				", state='" + state + '\'' + 
				", ywfw='" + ywfw + '\'' + 
				"}";
	}
}