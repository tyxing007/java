package com.github.hualuomoli.demo.entity;

import java.util.Date;
import java.util.List;

import com.github.hualuomoli.base.annotation.entity.EntityColumn;
import com.github.hualuomoli.base.annotation.entity.EntityColumnType;
import com.github.hualuomoli.base.annotation.entity.EntityQuery;
import com.github.hualuomoli.base.annotation.entity.EntityTable;
import com.github.hualuomoli.base.annotation.entity.EntityUnique;
import com.github.hualuomoli.base.entity.CommonField;

@SuppressWarnings("serial")
@EntityTable(name = "t_demo", comment = "测试demo", pre = true)
@EntityUnique(columnNmaes = { "name" })
public class Demo extends CommonField {

	@EntityQuery(leftLike = true, rightLike = true, bothLike = true, inArray = true)
	private String name;
	@EntityColumn(type = EntityColumnType.CHAR, length = 1)
	private String sex;
	@EntityColumn(precision = 8, scale = 3, comment = "工资")
	@EntityQuery(greaterThan = true, greaterEqual = true, lessThan = true, lessEqual = true, inArray = true)
	private Double salary;
	@EntityColumn(precision = 3, defaultValue = "20", comment = "年龄")
	@EntityQuery(greaterThan = true, greaterEqual = true, lessThan = true, lessEqual = true, inArray = true)
	private Integer age;
	@EntityColumn(type = EntityColumnType.DATE, comment = "生日")
	@EntityQuery(greaterThan = true, greaterEqual = true, lessThan = true, lessEqual = true)
	private Date birthDay;
	@EntityColumn(type = EntityColumnType.CLOB)
	private String remarks;
	@EntityColumn(comment = "用户", relation = "username")
	@EntityQuery(inArray = true)
	private User user;
	private Region region;
	// 不会使用
	private List<Address> address;

	public Demo() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

}
