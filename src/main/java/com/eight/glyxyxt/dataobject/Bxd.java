package com.eight.glyxyxt.dataobject;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-24 17:29:42
 * @Version 1.0
 */
public class Bxd {
	// id ：
	private Integer id;
	// 申报时间
	private Timestamp sbsj;
	// eid ：
	private Integer eid;
	// 详细地点
	private String xxdd;
	// 预约时间（不是具体时间，是字符串）公共区域不用
	private String yysj;
	// 报修类别
	private String bxlb;
	// 报修内容
	private String bxnr;
	// 视频（视频地址）
	private String sp;
	// 图片（图片地址）
	private String tp;
	// 申报人
	private String sbr;
	// 0未审核，1审核通过，2审核未通过
	private Integer shy1state;
	// 申报人学号
	private String sbrxh;
	// 耗材使用
	private String hc;
	// 工时
	private String gs;
	// 接单人ybid
	private String jid;
	// shy1 ：
	private String shy1;
	// 申报人手机号码
	private String sbrsj;
	// shy2 ：
	private String shy2;
	// 0未审核，1审核通过，2审核未通过
	private Integer shy2state;
	// 维修时间(或者是撤销时间）
	private Timestamp wxsj;
	// 撤销事由
	private String cxsy;
	// 评价星际
	private String pj;
	// 评价内容
	private String pjnr;
	// 评价追加
	private String pjzj;
	// 1已派单，2已维修，3撤销单，4已验收，5不通过验收
	private Integer state;
	// 返工天数
	private Integer fgts;
	// jdsj ：
	private Timestamp jdsj;
	// yssj ：
	private Timestamp yssj;

	// 无参构造器
	public Bxd() {
	}

	// 有参构造器，进行属性值的初始化
	public Bxd(Integer id, Timestamp sbsj, Integer eid, String xxdd, String yysj, String bxlb, String bxnr, String sp, String tp, String sbr, Integer shy1state, String sbrxh, String hc, String gs, String jid, String shy1, String sbrsj, String shy2, Integer shy2state, Timestamp wxsj, String cxsy, String pj, String pjnr, String pjzj, Integer state, Integer fgts, Timestamp jdsj, Timestamp yssj) {
		this.id = id;
		this.sbsj = sbsj;
		this.eid = eid;
		this.xxdd = xxdd;
		this.yysj = yysj;
		this.bxlb = bxlb;
		this.bxnr = bxnr;
		this.sp = sp;
		this.tp = tp;
		this.sbr = sbr;
		this.shy1state = shy1state;
		this.sbrxh = sbrxh;
		this.hc = hc;
		this.gs = gs;
		this.jid = jid;
		this.shy1 = shy1;
		this.sbrsj = sbrsj;
		this.shy2 = shy2;
		this.shy2state = shy2state;
		this.wxsj = wxsj;
		this.cxsy = cxsy;
		this.pj = pj;
		this.pjnr = pjnr;
		this.pjzj = pjzj;
		this.state = state;
		this.fgts = fgts;
		this.jdsj = jdsj;
		this.yssj = yssj;
	}

	// 获取 id 的属性值
	public Integer getId() {
		return id;
	}

	// 设置 id 的属性值
	public void setId(Integer id) {
		this.id = id;
	}

	// 获取 申报时间 的属性值
	public Timestamp getSbsj() {
		return sbsj;
	}

	// 设置 申报时间 的属性值
	public void setSbsj(Timestamp sbsj) {
		this.sbsj = sbsj;
	}

	// 获取 eid 的属性值
	public Integer getEid() {
		return eid;
	}

	// 设置 eid 的属性值
	public void setEid(Integer eid) {
		this.eid = eid;
	}

	// 获取 详细地点 的属性值
	public String getXxdd() {
		return xxdd;
	}

	// 设置 详细地点 的属性值
	public void setXxdd(String xxdd) {
		this.xxdd = xxdd;
	}

	// 获取 预约时间（不是具体时间，是字符串）公共区域不用 的属性值
	public String getYysj() {
		return yysj;
	}

	// 设置 预约时间（不是具体时间，是字符串）公共区域不用 的属性值
	public void setYysj(String yysj) {
		this.yysj = yysj;
	}

	// 获取 报修类别 的属性值
	public String getBxlb() {
		return bxlb;
	}

	// 设置 报修类别 的属性值
	public void setBxlb(String bxlb) {
		this.bxlb = bxlb;
	}

	// 获取 报修内容 的属性值
	public String getBxnr() {
		return bxnr;
	}

	// 设置 报修内容 的属性值
	public void setBxnr(String bxnr) {
		this.bxnr = bxnr;
	}

	// 获取 视频（视频地址） 的属性值
	public String getSp() {
		return sp;
	}

	// 设置 视频（视频地址） 的属性值
	public void setSp(String sp) {
		this.sp = sp;
	}

	// 获取 图片（图片地址） 的属性值
	public String getTp() {
		return tp;
	}

	// 设置 图片（图片地址） 的属性值
	public void setTp(String tp) {
		this.tp = tp;
	}

	// 获取 申报人 的属性值
	public String getSbr() {
		return sbr;
	}

	// 设置 申报人 的属性值
	public void setSbr(String sbr) {
		this.sbr = sbr;
	}

	// 获取 0未审核，1审核通过，2审核未通过 的属性值
	public Integer getShy1state() {
		return shy1state;
	}

	// 设置 0未审核，1审核通过，2审核未通过 的属性值
	public void setShy1state(Integer shy1state) {
		this.shy1state = shy1state;
	}

	// 获取 申报人学号 的属性值
	public String getSbrxh() {
		return sbrxh;
	}

	// 设置 申报人学号 的属性值
	public void setSbrxh(String sbrxh) {
		this.sbrxh = sbrxh;
	}

	// 获取 耗材使用 的属性值
	public String getHc() {
		return hc;
	}

	// 设置 耗材使用 的属性值
	public void setHc(String hc) {
		this.hc = hc;
	}

	// 获取 工时 的属性值
	public String getGs() {
		return gs;
	}

	// 设置 工时 的属性值
	public void setGs(String gs) {
		this.gs = gs;
	}

	// 获取 接单人ybid 的属性值
	public String getJid() {
		return jid;
	}

	// 设置 接单人ybid 的属性值
	public void setJid(String jid) {
		this.jid = jid;
	}

	// 获取 shy1 的属性值
	public String getShy1() {
		return shy1;
	}

	// 设置 shy1 的属性值
	public void setShy1(String shy1) {
		this.shy1 = shy1;
	}

	// 获取 申报人手机号码 的属性值
	public String getSbrsj() {
		return sbrsj;
	}

	// 设置 申报人手机号码 的属性值
	public void setSbrsj(String sbrsj) {
		this.sbrsj = sbrsj;
	}

	// 获取 shy2 的属性值
	public String getShy2() {
		return shy2;
	}

	// 设置 shy2 的属性值
	public void setShy2(String shy2) {
		this.shy2 = shy2;
	}

	// 获取 0未审核，1审核通过，2审核未通过 的属性值
	public Integer getShy2state() {
		return shy2state;
	}

	// 设置 0未审核，1审核通过，2审核未通过 的属性值
	public void setShy2state(Integer shy2state) {
		this.shy2state = shy2state;
	}

	// 获取 维修时间(或者是撤销时间） 的属性值
	public Timestamp getWxsj() {
		return wxsj;
	}

	// 设置 维修时间(或者是撤销时间） 的属性值
	public void setWxsj(Timestamp wxsj) {
		this.wxsj = wxsj;
	}

	// 获取 撤销事由 的属性值
	public String getCxsy() {
		return cxsy;
	}

	// 设置 撤销事由 的属性值
	public void setCxsy(String cxsy) {
		this.cxsy = cxsy;
	}

	// 获取 评价星际 的属性值
	public String getPj() {
		return pj;
	}

	// 设置 评价星际 的属性值
	public void setPj(String pj) {
		this.pj = pj;
	}

	// 获取 评价内容 的属性值
	public String getPjnr() {
		return pjnr;
	}

	// 设置 评价内容 的属性值
	public void setPjnr(String pjnr) {
		this.pjnr = pjnr;
	}

	// 获取 评价追加 的属性值
	public String getPjzj() {
		return pjzj;
	}

	// 设置 评价追加 的属性值
	public void setPjzj(String pjzj) {
		this.pjzj = pjzj;
	}

	// 获取 1已派单，2已维修，3撤销单，4已验收，5不通过验收 的属性值
	public Integer getState() {
		return state;
	}

	// 设置 1已派单，2已维修，3撤销单，4已验收，5不通过验收 的属性值
	public void setState(Integer state) {
		this.state = state;
	}

	// 获取 返工天数 的属性值
	public Integer getFgts() {
		return fgts;
	}

	// 设置 返工天数 的属性值
	public void setFgts(Integer fgts) {
		this.fgts = fgts;
	}

	// 获取 jdsj 的属性值
	public Timestamp getJdsj() {
		return jdsj;
	}

	// 设置 jdsj 的属性值
	public void setJdsj(Timestamp jdsj) {
		this.jdsj = jdsj;
	}

	// 获取 yssj 的属性值
	public Timestamp getYssj() {
		return yssj;
	}

	// 设置 yssj 的属性值
	public void setYssj(Timestamp yssj) {
		this.yssj = yssj;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "Bxd {" + 
				", id='" + id + '\'' + 
				", sbsj='" + sbsj + '\'' + 
				", eid='" + eid + '\'' + 
				", xxdd='" + xxdd + '\'' + 
				", yysj='" + yysj + '\'' + 
				", bxlb='" + bxlb + '\'' + 
				", bxnr='" + bxnr + '\'' + 
				", sp='" + sp + '\'' + 
				", tp='" + tp + '\'' + 
				", sbr='" + sbr + '\'' + 
				", shy1state='" + shy1state + '\'' + 
				", sbrxh='" + sbrxh + '\'' + 
				", hc='" + hc + '\'' + 
				", gs='" + gs + '\'' + 
				", jid='" + jid + '\'' + 
				", shy1='" + shy1 + '\'' + 
				", sbrsj='" + sbrsj + '\'' + 
				", shy2='" + shy2 + '\'' + 
				", shy2state='" + shy2state + '\'' + 
				", wxsj='" + wxsj + '\'' + 
				", cxsy='" + cxsy + '\'' + 
				", pj='" + pj + '\'' + 
				", pjnr='" + pjnr + '\'' + 
				", pjzj='" + pjzj + '\'' + 
				", state='" + state + '\'' + 
				", fgts='" + fgts + '\'' + 
				", jdsj='" + jdsj + '\'' + 
				", yssj='" + yssj + '\'' + 
				"}";
	}
}