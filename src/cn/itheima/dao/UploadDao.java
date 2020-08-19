package cn.itheima.dao;

import cn.itheima.domain.NodeInfo;

public interface UploadDao {

	void save(NodeInfo f);

	void update(int  userid, String nodeoid);

}
