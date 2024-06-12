package com.test.menu.service;

import static com.test.menu.model.QMenu.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.test.menu.dto.SideMenuResponse;
import com.test.menu.model.Menu;
import com.test.menu.repository.MenuRepository;

import jakarta.persistence.EntityManager;

@Service
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
}