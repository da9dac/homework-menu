package com.test.menu.dto;

public class SideMenuResponse {
	private int menuId;
	private String menuNm;
	private int sort;
	private int uprMenuId;
	private String url;
	private String useYn;

	public SideMenuResponse(int menuId, String menuNm, int sort, int uprMenuId, String url, String useYn) {
		this.menuId = menuId;
		this.menuNm = menuNm;
		this.sort = sort;
		this.uprMenuId = uprMenuId;
		this.url = url;
		this.useYn = useYn;
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

	public String getUseYn() {
		return useYn;
	}
}
