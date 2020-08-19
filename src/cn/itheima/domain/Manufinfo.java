package cn.itheima.domain;

public class Manufinfo {
	/*
	 CREATE TABLE `oid_manufinfo` (
  `manuf_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '厂商编号(主键)',
  `manuf_name` varchar(30) NOT NULL COMMENT '公司全名',
  `manuf_addrs` varchar(40) NOT NULL COMMENT '厂商地址',
  `manuf_serverip` varchar(32) NOT NULL,
  `manuf_linkman` varchar(15) NOT NULL COMMENT '联系人',
  `manuf_tel` varchar(15) NOT NULL COMMENT '联系电话',
  `manuf_email` varchar(40) NOT NULL COMMENT '厂商ip地址',
  PRIMARY KEY (`manuf_id`),
  UNIQUE KEY `manuf_name` (`manuf_name`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

	 */
	
	private Long manuf_id;
	private String manuf_name;
	private String manuf_addrs;
	private String manuf_serverip;
	private String manuf_linkman;
	private String manuf_tel;
	private String manuf_email;
	
	public Long getManuf_id() {
		return manuf_id;
	}

	public void setManuf_id(Long manuf_id) {
		this.manuf_id = manuf_id;
	}

	public String getManuf_name() {
		return manuf_name;
	}

	public void setManuf_name(String manuf_name) {
		this.manuf_name = manuf_name;
	}

	public String getManuf_addrs() {
		return manuf_addrs;
	}

	public void setManuf_addrs(String manuf_addrs) {
		this.manuf_addrs = manuf_addrs;
	}

	public String getManuf_serverip() {
		return manuf_serverip;
	}

	public void setManuf_serverip(String manuf_serverip) {
		this.manuf_serverip = manuf_serverip;
	}

	public String getManuf_linkman() {
		return manuf_linkman;
	}

	public void setManuf_linkman(String manuf_linkman) {
		this.manuf_linkman = manuf_linkman;
	}

	public String getManuf_tel() {
		return manuf_tel;
	}

	public void setManuf_tel(String manuf_tel) {
		this.manuf_tel = manuf_tel;
	}

	public String getManuf_email() {
		return manuf_email;
	}

	public void setManuf_email(String manuf_email) {
		this.manuf_email = manuf_email;
	}

	@Override
	public String toString() {
		return "Manufinfo [manuf_id=" + manuf_id + ", manuf_name=" + manuf_name + "]";
	}
			
}
