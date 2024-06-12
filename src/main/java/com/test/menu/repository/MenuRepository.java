package com.test.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.menu.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
