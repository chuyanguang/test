package cn.pojo;

import javax.persistence.Column;
import javax.persistence.*;


@Entity
@Table(name="user")
public class User {
	
	@Id
	private Integer Id;
	
	@Column(name="name")
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	
}
