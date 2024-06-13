package com.test.menu.dto;

public class UpdateRequest {

	private int menuId;
	private String menuNm;
	private int sort;
	private int uprMenuId;
	private String url;
	private String updaUser;
	private String useYn;

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

	public String getUpdaUser() {
		return updaUser;
	}

	public String getUseYn() {
		return useYn;
	}
}
