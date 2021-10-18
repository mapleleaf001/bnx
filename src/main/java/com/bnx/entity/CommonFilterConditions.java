package com.bnx.entity;

//抢购过滤条件	
public class CommonFilterConditions {
	private String role;//0:黑奴，1：盗，2：法师，3：战士，4：游侠
	
	private String conditions ;/*//{
	strength>= 86;//力量
	agility;//敏捷
	physique;>= 61//体质
	volition;//意志
	brains;//智力
	charm;//精神
	total;//总属性
	level;//
	price <= 1
	}
	
*/
	//是否
	private String isValid;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getIsValid() {
		return isValid;
	}

	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}
	
	
}
