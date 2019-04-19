package com.cihan.emlak.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "districts")
public class Districts {
	private int id;
	private int districtCode; 
	private Provinces province;
	private String districtName;

	

}
