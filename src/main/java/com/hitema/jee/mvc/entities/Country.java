package com.hitema.jee.mvc.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
	@Table(name="country")
public class Country {

	@Id
		@Column(name="country_id")
			@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long id;
	
	private String country;
	
	@Column(name="last_update")
	private LocalDateTime lastUpdate;

	@OneToMany(mappedBy = "country")
	private List<City> cities;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", country=" + country + ", lastUpdate=" + lastUpdate + "]";
	}
	

}
