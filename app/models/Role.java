package models;

import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class Role extends Model {

	@Id
	public Long id;
	
	public String name;
	
	public String description;

	public int ballot;
	
	public static Finder<Long, Role> find = new Finder<Long, Role>(Long.class, Role.class);
	
	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	public Role(String name, String description, int ballot) {
		this.name = name;
		this.description = description;
		this.ballot = ballot;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getBallot() {
		return ballot;
	}

	public void setBallot(int ballot) {
		this.ballot = ballot;
	}
	
}
