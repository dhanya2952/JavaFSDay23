package com.graymatter.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Orders {
	
	@Id
	private int ordId;
	private Date orderDate;
	@ManyToMany
	@JoinTable(joinColumns= @JoinColumn(name="itemId"),inverseJoinColumns = @JoinColumn(name="orderId")	)
	private List<Items> itemList;

}
