package com.hycms.cms.manager.main;

import com.hycms.cms.entity.main.Content;
import com.hycms.cms.entity.main.ContentTxt;

public interface ContentTxtMng {
	public ContentTxt save(ContentTxt txt, Content content);

	public ContentTxt update(ContentTxt txt, Content content);
}