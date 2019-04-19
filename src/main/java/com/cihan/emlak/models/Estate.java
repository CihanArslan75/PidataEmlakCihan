package com.cihan.emlak.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estate")
public class Estate extends BaseEntity{
	
	private int id ;
	private RealEstateAgent realEstateAgent ;
	private Customer customer ;
	private EstateType estateType;  // (KONUT 0 , ISYERI 1)  ENUM
	private EstateState estateState; //(SATILIK 0 , KIRALIK 1) ENUM
	private int size ;    //(metrekate)
	private String roomNumber  ;
	private String floor ;
	private WarmingType  warmingType ; //(MERKEZI 0,DOGALGAZ 1, KAT KALORIFERI 2) ENUM
	private DeedType deedType ; //(KAT MULKIYETI 0,KAT IRTIFAKI 1,TAPUSUZ 2)  ENUM 
	private State elevator  ; // (VAR , YOK) ENUM
	private String address  ;
	private int province;
	private int district ;
	private String  coordinateX  ;
	private String coordinateY;
	private BuildingType  buildingType;  // (BETONARME 0,KARKAS 1, AHŞAP 2 ),  ENUM
	private String  buildingAge ;
	
	@Id
	@SequenceGenerator(name = "seq_estate", allocationSize = 1, sequenceName = "seq_estate")
	@GeneratedValue(generator = "seq_estate", strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public RealEstateAgent getRealEstateAgent() {
		return realEstateAgent;
	}
	public void setRealEstateAgent(RealEstateAgent realEstateAgent) {
		this.realEstateAgent = realEstateAgent;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Column(name = "estatetype")
	public EstateType getEstateType() {
		return estateType;
	}
	public void setEstateType(EstateType estateType) {
		this.estateType = estateType;
	}
	@Column(name = "estatestate")
	public EstateState getEstateState() {
		return estateState;
	}
	public void setEstateState(EstateState estateState) {
		this.estateState = estateState;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	@Column(name = "warmingtype")
	public WarmingType getWarmingType() {
		return warmingType;
	}
	public void setWarmingType(WarmingType warmingType) {
		this.warmingType = warmingType;
	}
	@Column(name = "deedtype")
	public DeedType getDeedType() {
		return deedType;
	}
	public void setDeedType(DeedType deedType) {
		this.deedType = deedType;
	}
	
	public State getElevator() {
		return elevator;
	}
	public void setElevator(State elevator) {
		this.elevator = elevator;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getProvince() {
		return province;
	}
	public void setProvince(int province) {
		this.province = province;
	}
	
	public int getDistrict() {
		return district;
	}
	public void setDistrict(int district) {
		this.district = district;
	}
	
	public String getCoordinateX() {
		return coordinateX;
	}
	public void setCoordinateX(String coordinateX) {
		this.coordinateX = coordinateX;
	}
	
	public String getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(String coordinateY) {
		this.coordinateY = coordinateY;
	}
	
	public BuildingType getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(BuildingType buildingType) {
		this.buildingType = buildingType;
	}
	
	public String getBuildingAge() {
		return buildingAge;
	}
	public void setBuildingAge(String buildingAge) {
		this.buildingAge = buildingAge;
	}
	
	
	
	
	

}
