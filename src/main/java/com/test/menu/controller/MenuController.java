package com.test.menu.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.menu.dto.DeleteRequest;
import com.test.menu.dto.RegiRequest;
import com.test.menu.dto.SideMenuResponse;
import com.test.menu.dto.UpdateRequest;
import com.test.menu.model.Menu;
import com.test.menu.service.MenuService;

@RestController
@RequestMapping("/bi/menu")
public class MenuController {

	private MenuService menuService;

	public MenuController(MenuService menuService) {
		this.menuService = menuService;
	}

	@GetMapping("/side")
	public ResponseEntity<List<SideMenuResponse>> getSide() {
		List<SideMenuResponse> responses = menuService.findSideMenuList();

		return new ResponseEntity<>(responses, HttpStatus.OK);
	}

	@GetMapping("/table")
	public ResponseEntity<List<Menu>> getTable() {
		return new ResponseEntity<>(menuService.findMenuList(), HttpStatus.OK);
	}

	@PostMapping("/regi")
	public void createMenu(@RequestBody RegiRequest request) {
		menuService.createMenu(request);
	}

	@PostMapping("/update")
	public void updateMenu(@RequestBody UpdateRequest request) {
		menuService.updateMenu(request);
	}

	@PostMapping("delete")
	public void deleteMenu(@RequestBody DeleteRequest request) {
		menuService.deleteMenu(request);
	}
}
