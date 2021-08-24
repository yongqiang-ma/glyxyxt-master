package com.eight.glyxyxt.dataobject;




/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Cet {
	// id ：
	private Integer id;
	// sid ：
	private String sid;
	// name ：
	private String name;
	// examid ：
	private String examid;
	// allgrade ：
	private Integer allgrade;
	// lisen ：
	private Integer lisen;
	// read ：
	private Integer read;
	// write ：
	private Integer write;
	// time ：
	private String time;

	// 无参构造器
	public Cet() {
	}

	// 有参构造器，进行属性值的初始化
	public Cet(Integer id, String sid, String name, String examid, Integer allgrade, Integer lisen, Integer read, Integer write, String time) {
		this.id = id;
		this.sid = sid;
		this.name = name;
		this.examid = examid;
		this.allgrade = allgrade;
		this.lisen = lisen;
		this.read = read;
		this.write = write;
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

	// 获取 examid 的属性值
	public String getExamid() {
		return examid;
	}

	// 设置 examid 的属性值
	public void setExamid(String examid) {
		this.examid = examid;
	}

	// 获取 allgrade 的属性值
	public Integer getAllgrade() {
		return allgrade;
	}

	// 设置 allgrade 的属性值
	public void setAllgrade(Integer allgrade) {
		this.allgrade = allgrade;
	}

	// 获取 lisen 的属性值
	public Integer getLisen() {
		return lisen;
	}

	// 设置 lisen 的属性值
	public void setLisen(Integer lisen) {
		this.lisen = lisen;
	}

	// 获取 read 的属性值
	public Integer getRead() {
		return read;
	}

	// 设置 read 的属性值
	public void setRead(Integer read) {
		this.read = read;
	}

	// 获取 write 的属性值
	public Integer getWrite() {
		return write;
	}

	// 设置 write 的属性值
	public void setWrite(Integer write) {
		this.write = write;
	}

	// 获取 time 的属性值
	public String getTime() {
		return time;
	}

	// 设置 time 的属性值
	public void setTime(String time) {
		this.time = time;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Cet {" + 
				", id='" + id + '\'' + 
				", sid='" + sid + '\'' + 
				", name='" + name + '\'' + 
				", examid='" + examid + '\'' + 
				", allgrade='" + allgrade + '\'' + 
				", lisen='" + lisen + '\'' + 
				", read='" + read + '\'' + 
				", write='" + write + '\'' + 
				", time='" + time + '\'' + 
				"}";
	}
}