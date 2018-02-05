package com.arms.domain.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class User {

	// @Id
	// @GeneratedValue
	private int id;

	private String name;
	private String email;
	private String password;
	private Date created;
	private Date updated;
	private List<Micropost> micropostList;
	private String avatar;

	@Id
	@GeneratedValue
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	public List<Micropost> getMicropostList() {
		return micropostList;
	}

	public void setMicropostList(List<Micropost> micropostList) {
		this.micropostList = micropostList;
	}

	@Basic
	@Column(name = "avatar")
	public String getAvatar() {
		return "http://secure.gravatar.com/avatar/" + avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
}
