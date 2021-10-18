package com.bnx.entity;


public class Card {
    
	private String order_id;//"134993"
	private String name;//力67/敏53/体42/意20/智46/精56
	private String price;// 价格"480000000000000000"
	private String buyer;//""
	private String seller;//"0x04f78859F471080dd4683364B7d7948838E3f798"
	private String pay_addr;//bnx:"0x8C851d1a123Ff703BD1f9dabe631b69902Df5f97" gold:0xb3a6381070B1a15169DEA646166EC0699fDAeA79
	
	//"战士：0x22F3E436dF132791140571FC985Eb17Ab1846494 盗贼：0xaF9A274c9668d68322B0dcD9043D79Cd1eBd41b3  
	//游侠：0xF31913a9C8EFE7cE7F08A1c08757C166b572a937" 法师：0xC6dB06fF6e97a6Dc4304f7615CdD392a9cF13F44
	private String career_address;//职业："0x22F3E436dF132791140571FC985Eb17Ab1846494"
	private String role ; //角色:  mage Thief
	private String token_id;//"31208163774883321495714449573707363023336611403415389408428149268509213694824"
	private Long block_number;//11872308
	private Integer strength;//力量 67
	private Integer agility;//敏捷53
	private Integer physique;//体质42
	private Integer volition;//意志20
	private Integer brains;//智力46
	private Integer charm;//精神56
	private Integer total;//总属性 284
	private Integer level;//等级1
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public String getPay_addr() {
		return pay_addr;
	}
	public void setPay_addr(String pay_addr) {
		this.pay_addr = pay_addr;
	}
	public String getCareer_address() {
		return career_address;
	}
	public void setCareer_address(String career_address) {
		this.career_address = career_address;
	}
	public String getToken_id() {
		return token_id;
	}
	public void setToken_id(String token_id) {
		this.token_id = token_id;
	}
	public Long getBlock_number() {
		return block_number;
	}
	public void setBlock_number(Long block_number) {
		this.block_number = block_number;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getAgility() {
		return agility;
	}
	public void setAgility(Integer agility) {
		this.agility = agility;
	}
	public Integer getPhysique() {
		return physique;
	}
	public void setPhysique(Integer physique) {
		this.physique = physique;
	}
	public Integer getVolition() {
		return volition;
	}
	public void setVolition(Integer volition) {
		this.volition = volition;
	}
	public Integer getBrains() {
		return brains;
	}
	public void setBrains(Integer brains) {
		this.brains = brains;
	}
	public Integer getCharm() {
		return charm;
	}
	public void setCharm(Integer charm) {
		this.charm = charm;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
