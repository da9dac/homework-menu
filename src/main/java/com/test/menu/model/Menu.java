package com.test.menu.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "TEST_DA9DAC_MENU")
public class Menu {

	@Id
	@Column(name = "MENU_ID")
	private int menuId;

	@Column(name = "MENU_NM")
	private String menuNm;

	@Column(name = "SORT")
	private int sort;

	@Column(name = "UPR_MENU_ID")
	private int uprMenuId;

	@Column(name = "URL")
	private String url;

	@ColumnDefault("Y")
	@Column(name = "USE_YN")
	private String useYn = "Y";

	@Column(name = "REGI_USER")
	private String regiUser;

	@CreatedDate
	@Column(name = "REGI_DT", updatable = false)
	private LocalDateTime regiDt;

	@Column(name = "UPDA_USER")
	private String updaUser;

	@LastModifiedDate
	@Column(name = "UPDA_DT", insertable = false)
	private LocalDateTime updaDt;

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

	public String getRegiUser() {
		return regiUser;
	}

	public LocalDateTime getRegiDt() {
		return regiDt;
	}

	public String getUpdaUser() {
		return updaUser;
	}

	public LocalDateTime getUpdaDt() {
		return updaDt;
	}
}
