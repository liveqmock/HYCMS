package com.hycms.cms.dao.main;

import java.util.List;

import com.hycms.cms.entity.main.Channel;
import com.hycms.common.hibernate3.Updater;
import com.hycms.common.page.Pagination;

public interface ChannelDao {
	public List<Channel> getTopList(Integer siteId, boolean hasContentOnly,
			boolean displayOnly, boolean cacheable);

	public Pagination getTopPage(Integer siteId, boolean hasContentOnly,
			boolean displayOnly, boolean cacheable, int pageNo, int pageSize);

	public List<Channel> getTopListByRigth(Integer userId, Integer siteId,
			boolean hasContentOnly);

	public List<Channel> getChildList(Integer parentId, boolean hasContentOnly,
			boolean displayOnly, boolean cacheable);

	public Pagination getChildPage(Integer parentId, boolean hasContentOnly,
			boolean displayOnly, boolean cacheable, int pageNo, int pageSize);

	public List<Channel> getChildListByRight(Integer userId, Integer parentId,
			boolean hasContentOnly);

	public Channel findByPath(String path, Integer siteId, boolean cacheable);

	public Channel findById(Integer id);

	public Channel save(Channel bean);

	public Channel updateByUpdater(Updater<Channel> updater);

	public Channel deleteById(Integer id);
}