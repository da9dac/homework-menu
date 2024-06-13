package com.test.menu.service;

import static com.test.menu.model.QMenu.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.test.menu.dto.DeleteRequest;
import com.test.menu.dto.RegiRequest;
import com.test.menu.dto.SideMenuResponse;
import com.test.menu.dto.UpdateRequest;
import com.test.menu.model.Menu;
import com.test.menu.repository.MenuRepository;

import jakarta.persistence.EntityManager;

@Service
@Transactional(readOnly = true)
public class MenuService {

	private MenuRepository menuRepository;
	@Autowired
	private EntityManager em;

	public MenuService(MenuRepository menuRepository, EntityManager em) {
		this.menuRepository = menuRepository;
		this.em = em;
	}

	public List<SideMenuResponse> findSideMenuList() {
		JPAQueryFactory query = new JPAQueryFactory(em);

		return query.select(
			Projections.constructor(
				SideMenuResponse.class,
				menu.menuId,
				menu.menuNm,
				menu.sort,
				menu.uprMenuId,
				menu.url,
				menu.useYn
			)
		)
			.from(menu)
			.fetch();
	}

	public List<Menu> findMenuList() {
		return menuRepository.findAll();
	}

	@Transactional
	public void createMenu(RegiRequest request) {
		Menu menu = new Menu(
			request.getMenuId(),
			request.getMenuNm(),
			request.getSort(),
			request.getUprMenuId(),
			request.getUrl(),
			request.getRegiUser()
		);

		menuRepository.save(menu);
	}

	@Transactional
	public void updateMenu(UpdateRequest request) {
		Menu menu = menuRepository.findById(request.getMenuId()).orElseThrow(RuntimeException::new);

		if (request.getMenuId() != 0) menu.setMenuId(request.getMenuId());
		if (!request.getMenuNm().isEmpty()) menu.setMenuNm(request.getMenuNm());
		if (request.getSort() != 0) menu.setSort(request.getSort());
		if (request.getUprMenuId() != 0) menu.setUprMenuId(request.getUprMenuId());
		if (!request.getUrl().isEmpty()) menu.setUrl(request.getUrl());
		if (!request.getUseYn().isEmpty()) menu.setUseYn(request.getUseYn());
		if (!request.getUpdaUser().isEmpty()) menu.setUpdaUser(request.getUpdaUser());

		menuRepository.save(menu);
	}

	@Transactional
	public void deleteMenu(DeleteRequest request) {
		menuRepository.updateUseYnAndUpdaUserByMenuIdIn(request.getMenuIds(), request.getUpdaUser());
	}
}