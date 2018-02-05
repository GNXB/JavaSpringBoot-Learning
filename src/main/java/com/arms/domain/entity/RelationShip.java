package com.arms.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "relation_ship")
public class RelationShip implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8226065125125436214L;

	@Id
	@GeneratedValue
	private int id;
	
	private int userId;
	private int followerId;
	
	
	
}
