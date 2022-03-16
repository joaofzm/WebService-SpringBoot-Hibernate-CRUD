package br.com.joaofzm15.crud.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.joaofzm15.crud.entities.primaryKeys.OrderItemPrimaryKey;

@Entity
@Table (name = "tb_order_item")
public class OrderItem implements Serializable{
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderItemPrimaryKey orderItemPKThatActsAsId;
	
	private Integer quantity;
	
	private Double price;
	
	public OrderItem() {
		orderItemPKThatActsAsId = new OrderItemPrimaryKey();
	}

	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		orderItemPKThatActsAsId = new OrderItemPrimaryKey();
		orderItemPKThatActsAsId.setOrder(order);
		orderItemPKThatActsAsId.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	
	@JsonIgnore
	public Order getOrder() {
		return orderItemPKThatActsAsId.getOrder();
	}
	
	public void setOrder(Order order) {
		orderItemPKThatActsAsId.setOrder(order);
	} 
	
	public Product getProduct() {
		return orderItemPKThatActsAsId.getProduct();
	}
	
	public void setProduct(Product product) {
		orderItemPKThatActsAsId.setProduct(product);
	} 

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderItemPKThatActsAsId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(orderItemPKThatActsAsId, other.orderItemPKThatActsAsId);
	}

	
	
}
