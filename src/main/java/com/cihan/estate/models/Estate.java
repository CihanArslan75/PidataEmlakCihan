package com.cihan.estate.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	private Provinces province;
	private Districts district ;
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
	@ManyToMany  //bir emlak birden fazla emlakçıda olabilir.Bir emlakçının birden fazla ev ilanı olabilir.
	@JoinColumn(name = "agentid", referencedColumnName = "id")
	public RealEstateAgent getRealEstateAgent() {
		return realEstateAgent;
	}
	public void setRealEstateAgent(RealEstateAgent realEstateAgent) {
		this.realEstateAgent = realEstateAgent;
	}
	@ManyToOne   //emlak çok müşteri tek . Bir müşterinin birden fazla evi olabilir.bir ev bir müşteriye ait olabilir
	@JoinColumn(name = "customerid", referencedColumnName = "id")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Column(name = "estatetype")
    @Enumerated
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
	@Column(name = "size")
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Column(length = 50, name = "roomNumber")
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	@Column(length = 20, name = "roomNumber")
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	@Column(name = "warmingtype")
    @Enumerated
	public WarmingType getWarmingType() {
		return warmingType;
	}
	public void setWarmingType(WarmingType warmingType) {
		this.warmingType = warmingType;
	}
	@Column(name = "deedtype")
    @Enumerated
	public DeedType getDeedType() {
		return deedType;
	}
	public void setDeedType(DeedType deedType) {
		this.deedType = deedType;
	}
	@Column(name = "elevator")
	public State getElevator() {
		return elevator;
	}
	public void setElevator(State elevator) {
		this.elevator = elevator;
	}
	@Column(length = 1000, name = "address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@ManyToOne  // birden çok emlak bir ile bağlanabilir.
	@JoinColumn(name = "provinceid", referencedColumnName = "id")
	public Provinces getProvince() {
		return province;
	}
	public void setProvince(Provinces province) {
		this.province = province;
	}
	@ManyToOne // birden çok emlak bir ilçeye bağlanabilir.
	@JoinColumn(name = "districtid", referencedColumnName = "id")
	public Districts getDistrict() {
		return district;
	}
	public void setDistrict(Districts district) {
		this.district = district;
	}
	@Column(length = 20, name = "coordinatex")
	public String getCoordinateX() {
		return coordinateX;
	}
	public void setCoordinateX(String coordinateX) {
		this.coordinateX = coordinateX;
	}
	@Column(length = 20, name = "coordinatey")
	public String getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(String coordinateY) {
		this.coordinateY = coordinateY;
	}
	@Column(name = "buildingtype")
    @Enumerated
	public BuildingType getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(BuildingType buildingType) {
		this.buildingType = buildingType;
	}
	@Column(length = 50, name = "buildingage")
	public String getBuildingAge() {
		return buildingAge;
	}
	public void setBuildingAge(String buildingAge) {
		this.buildingAge = buildingAge;
	}
	
	
	
	
	

}
