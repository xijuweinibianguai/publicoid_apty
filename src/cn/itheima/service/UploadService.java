package cn.itheima.service;

import cn.itheima.domain.NodeInfo;

public interface UploadService {

	void save(NodeInfo f);

	void update(int  userid, String nodeoid);


}
