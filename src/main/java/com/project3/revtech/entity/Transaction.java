package com.project3.revtech.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "transaction_details")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private int transactionId;

	@NotNull
	@Column(name = "transaction_date")
	private Timestamp transactionDate;

	@Column(name = "cart_id")
	private int cartId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cart_id", nullable = false, insertable = false, updatable = false)
	private Cart cart;

	public Transaction(int transactionId, @NotNull Timestamp transactionDate, int cartId, Cart cart) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.cartId = cartId;
		this.cart = cart;
	}

}