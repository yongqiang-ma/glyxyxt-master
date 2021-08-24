package com.eight.glyxyxt.dataobject;




/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Hc {
	// id ：
	private Integer id;
	// 材料名称
	private String mc;
	// 价格
	private Double jg;
	// 单位
	private String dw;
	// 库存
	private Integer kc;
	// 耗材类别
	private String lb;
	// 耗材型号
	private String xh;

	// 无参构造器
	public Hc() {
	}

	// 有参构造器，进行属性值的初始化
	public Hc(Integer id, String mc, Double jg, String dw, Integer kc, String lb, String xh) {
		this.id = id;
		this.mc = mc;
		this.jg = jg;
		this.dw = dw;
		this.kc = kc;
		this.lb = lb;
		this.xh = xh;
	}

	// 获取 id 的属性值
	public Integer getId() {
		return id;
	}

	// 设置 id 的属性值
	public void setId(Integer id) {
		this.id = id;
	}

	// 获取 材料名称 的属性值
	public String getMc() {
		return mc;
	}

	// 设置 材料名称 的属性值
	public void setMc(String mc) {
		this.mc = mc;
	}

	// 获取 价格 的属性值
	public Double getJg() {
		return jg;
	}

	// 设置 价格 的属性值
	public void setJg(Double jg) {
		this.jg = jg;
	}

	// 获取 单位 的属性值
	public String getDw() {
		return dw;
	}

	// 设置 单位 的属性值
	public void setDw(String dw) {
		this.dw = dw;
	}

	// 获取 库存 的属性值
	public Integer getKc() {
		return kc;
	}

	// 设置 库存 的属性值
	public void setKc(Integer kc) {
		this.kc = kc;
	}

	// 获取 耗材类别 的属性值
	public String getLb() {
		return lb;
	}

	// 设置 耗材类别 的属性值
	public void setLb(String lb) {
		this.lb = lb;
	}

	// 获取 耗材型号 的属性值
	public String getXh() {
		return xh;
	}

	// 设置 耗材型号 的属性值
	public void setXh(String xh) {
		this.xh = xh;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Hc {" + 
				", id='" + id + '\'' + 
				", mc='" + mc + '\'' + 
				", jg='" + jg + '\'' + 
				", dw='" + dw + '\'' + 
				", kc='" + kc + '\'' + 
				", lb='" + lb + '\'' + 
				", xh='" + xh + '\'' + 
				"}";
	}
}