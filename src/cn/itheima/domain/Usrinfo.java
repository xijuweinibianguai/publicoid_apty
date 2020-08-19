package cn.itheima.domain;
//联系人实体
public class Usrinfo {
	/*
CREATE TABLE `oid_usrinfo` (
  `usr_id` bigint(32) NOT NULL AUTO_INCREMENT,
  `usr_name` varchar(30) NOT NULL,
  `usr_addrs` varchar(40) NOT NULL,
  `usr_serverip` varchar(32) NOT NULL,
  `usr_linkman` varchar(15) NOT NULL,
  `usr_tel` varchar(15) NOT NULL,
  `usr_email` varchar(40) NOT NULL,
  PRIMARY KEY (`usr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=225 DEFAULT CHARSET=utf8;
	 */
		
	private Long usr_id;
	private String usr_name;
	private String usr_addrs;
	private String usr_serverip;
	private String usr_linkman;
	private String usr_tel;
	private String usr_email;	

	public Long getUsr_id() {
		return usr_id;
	}



	public void setUsr_id(Long usr_id) {
		this.usr_id = usr_id;
	}



	public String getUsr_name() {
		return usr_name;
	}



	public void setUsr_name(String usr_name) {
		this.usr_name = usr_name;
	}



	public String getUsr_addrs() {
		return usr_addrs;
	}



	public void setUsr_addrs(String usr_addrs) {
		this.usr_addrs = usr_addrs;
	}



	public String getUsr_serverip() {
		return usr_serverip;
	}



	public void setUsr_serverip(String usr_serverip) {
		this.usr_serverip = usr_serverip;
	}



	public String getUsr_linkman() {
		return usr_linkman;
	}



	public void setUsr_linkman(String usr_linkman) {
		this.usr_linkman = usr_linkman;
	}



	public String getUsr_tel() {
		return usr_tel;
	}



	public void setUsr_tel(String usr_tel) {
		this.usr_tel = usr_tel;
	}



	public String getUsr_email() {
		return usr_email;
	}



	public void setUsr_email(String usr_email) {
		this.usr_email = usr_email;
	}



	@Override
	public String toString() {
		return "UsrInfo [usr_name=" + usr_name + ", usr_addrs=" + usr_addrs + "]";
	}
	
	/*//表达多对一关系
	private Manufinfo manufinfo ;
	
	//----------------------------------------------
	//不与数据库中的列对应,只为了接收表单参数
	private Long manuf_id;

	public Long getusr_id() {
		return node_id;
	}

	public void setNode_id(Long node_id) {
		this.node_id = node_id;
	}

	public String getNode_oid() {
		return node_oid;
	}

	public void setNode_oid(String node_oid) {
		this.node_oid = node_oid;
	}

	public String getusr_coding() {
		return node_coding;
	}

	public void setNode_coding(String node_coding) {
		this.node_coding = node_coding;
	}

	public String getNode_versn() {
		return node_versn;
	}

	public void setNode_versn(String node_versn) {
		this.node_versn = node_versn;
	}

	public String getNode_manuf() {
		return node_manuf;
	}

	public void setNode_manuf(String node_manuf) {
		this.node_manuf = node_manuf;
	}

	public Long getNode_manuf_id() {
		return node_manuf_id;
	}

	public void setNode_manuf_id(Long node_manuf_id) {
		this.node_manuf_id = node_manuf_id;
	}

	public Manufinfo getManufinfo() {
		return manufinfo;
	}

	public void setManufinfo(Manufinfo manufinfo) {
		this.manufinfo = manufinfo;
	}

	public Long getManuf_id() {
		return manuf_id;
	}

	public void setManuf_id(Long manuf_id) {
		this.manuf_id = manuf_id;
	}*/

	
	
	
	
	
}
