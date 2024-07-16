package me.dio.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_card")
public class Card implements Serializable{
	private static final long serialVersionUID = 1L;
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(unique = true)
	    private String number;

	    @Column(name = "available_limit", precision = 13, scale = 2)
	    private BigDecimal limit;
	    
	public Card() {
		
	}	
	
	public Card(Long id, String number, BigDecimal limit) {
		super();
		this.id = id;
		this.number = number;
		this.limit = limit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public BigDecimal getLimit() {
		return limit;
	}

	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}


	@Override
	public String toString() {
		return "Card [id=" + id + ", number=" + number + ", limit=" + limit + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(id, other.id);
	}
	
}
