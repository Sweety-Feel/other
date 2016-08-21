package com.filter;

import org.nutz.json.JsonFormat;
import org.nutz.mvc.ActionContext;
import org.nutz.mvc.ActionFilter;
import org.nutz.mvc.View;
import org.nutz.mvc.view.ServerRedirectView;
import org.nutz.mvc.view.UTF8JsonView;

import com.base.ComRename;

public class ComFilter implements ActionFilter {

	@Override
	public View match(ActionContext actionContext) {
		// TODO Auto-generated method stub
		return null;
	}
  private View homeview = new ServerRedirectView(ComRename.home_path);
  private View redirectview =new ServerRedirectView(ComRename.login_path);
  private View jsonview = new UTF8JsonView(JsonFormat.compact()).setData(ComRename.login_path);
}
