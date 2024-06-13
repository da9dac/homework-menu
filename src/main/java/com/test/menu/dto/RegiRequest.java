package com.test.menu.dto;

public class RegiRequest {

	private int menuId;
	private String menuNm;
	private int sort;
	private int uprMenuId;
	private String url;
	private String regiUser;

	public RegiRequest(int menuId, String menuNm, int sort, int uprMenuId, String url, String regiUser) {
		this.menuId = menuId;
		this.menuNm = menuNm;
		this.sort = sort;
		this.uprMenuId = uprMenuId;
		this.url = url;
		this.regiUser = regiUser;
	}

	public int getMenuId() {
		return menuId;
	}

	public String getMenuNm() {
		return menuNm;
	}

	public int getSort() {
		return sort;
	}

	public int getUprMenuId() {
		return uprMenuId;
	}

	public String getUrl() {
		return url;
	}

	public String getRegiUser() {
		return regiUser;
	}
}
