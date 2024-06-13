package com.test.menu.dto;

import java.util.ArrayList;

public class DeleteRequest {

	private ArrayList<Integer> menuIds;
	private String updaUser;

	public DeleteRequest(ArrayList<Integer> menuIds, String updaUser) {
		this.menuIds = menuIds;
		this.updaUser = updaUser;
	}

	public ArrayList<Integer> getMenuIds() {
		return menuIds;
	}

	public String getUpdaUser() {
		return updaUser;
	}
}
