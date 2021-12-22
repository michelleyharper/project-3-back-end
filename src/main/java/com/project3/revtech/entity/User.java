package com.project3.revtech.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "user_details")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;

	@OneToMany(mappedBy = "user")
	private Set<Cart> carts;

	@NotNull
	@Column(name = "user_email")
	private String userEmail;

	@NotNull
	@Column(name = "user_name")
	private String userName;

	@NotNull
	@Column(name = "user_password")
	private String userPassword;

	@NotNull
	@Column(name = "user_first_name")
	private String userFirstName;

	@NotNull
	@Column(name = "user_last_name")
	private String userLastName;

	@NotNull
	@Column(name = "user_address")
	private String userAddress;

	@NotNull
	@Column(name = "user_contact")
	private String userContact;

	@NotNull
	@Column(name = "user_type")
	private String userType;

	@Column(name = "user_removed")
	private boolean userRemoved;

	public User(int userId, Set<Cart> carts, @NotNull String userEmail, @NotNull String userName,
			@NotNull String userPassword, @NotNull String userFirstName, @NotNull String userLastName,
			@NotNull String userAddress, @NotNull String userContact, @NotNull String userType, boolean userRemoved) {
		super();
		this.userId = userId;
		this.carts = carts;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userAddress = userAddress;
		this.userContact = userContact;
		this.userType = userType;
		this.userRemoved = userRemoved;
	}

}