package com.test.menu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.test.menu.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
	@Modifying
	@Transactional
	@Query("UPDATE Menu m SET m.useYn = 'N', m.updaDt = CURRENT_TIMESTAMP, m.updaUser = :updaUser WHERE m.menuId IN :menuIds")
	void updateUseYnAndUpdaUserByMenuIdIn(@Param("menuIds") List<Integer> menuIds, String updaUser);
}
