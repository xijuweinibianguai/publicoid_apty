package cn.itheima.domain;

public class NodeInfo {
	private String node_oid;
	private double manuf_id;
	private String usr_id;
	private Manufinfo manufinfo;//表示多对一关系
	private Usrinfo usrinfo;//表示多对一关系
	
	public String getNode_oid() {
		return node_oid;
	}

	public void setNode_oid(String node_oid) {
		this.node_oid = node_oid;
	}

	

	public double getManuf_id() {
		return manuf_id;
	}

	public void setManuf_id(double manuf_id) {
		this.manuf_id = manuf_id;
	}

	public String getUsr_id() {
		return usr_id;
	}

	public void setUsr_id(String usr_id) {
		this.usr_id = usr_id;
	}

	public Manufinfo getManufinfo() {
		return manufinfo;
	}

	public void setManufinfo(Manufinfo manufinfo) {
		this.manufinfo = manufinfo;
	}
	
	public Usrinfo getUsrinfo() {
		return usrinfo;
	}

	public void setUsrinfo(Usrinfo usrinfo) {
		this.usrinfo = usrinfo;
	}

	@Override
	public String toString() {
		return "NodeInfo [node_oid=" +  node_oid +"]";
	}
}
