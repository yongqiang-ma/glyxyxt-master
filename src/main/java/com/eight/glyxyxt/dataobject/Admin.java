package com.eight.glyxyxt.dataobject;




/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Admin {
	// id ：
	private Integer id;
	// account ：
	private String account;
	// password ：
	private String password;

	// 无参构造器
	public Admin() {
	}

	// 有参构造器，进行属性值的初始化
	public Admin(Integer id, String account, String password) {
		this.id = id;
		this.account = account;
		this.password = password;
	}

	// 获取 id 的属性值
	public Integer getId() {
		return id;
	}

	// 设置 id 的属性值
	public void setId(Integer id) {
		this.id = id;
	}

	// 获取 account 的属性值
	public String getAccount() {
		return account;
	}

	// 设置 account 的属性值
	public void setAccount(String account) {
		this.account = account;
	}

	// 获取 password 的属性值
	public String getPassword() {
		return password;
	}

	// 设置 password 的属性值
	public void setPassword(String password) {
		this.password = password;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Admin {" + 
				", id='" + id + '\'' + 
				", account='" + account + '\'' + 
				", password='" + password + '\'' + 
				"}";
	}
}