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

	public Menu() {
	}

	public Menu(int menuId, String menuNm, int sort, int uprMenuId, String url, String regiUser) {
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

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public void setMenuNm(String menuNm) {
		this.menuNm = menuNm;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public void setUprMenuId(int uprMenuId) {
		this.uprMenuId = uprMenuId;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public void setRegiUser(String regiUser) {
		this.regiUser = regiUser;
	}

	public void setRegiDt(LocalDateTime regiDt) {
		this.regiDt = regiDt;
	}

	public void setUpdaUser(String updaUser) {
		this.updaUser = updaUser;
	}

	public void setUpdaDt(LocalDateTime updaDt) {
		this.updaDt = updaDt;
	}
}
