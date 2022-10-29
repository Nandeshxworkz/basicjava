package com.xworkz.cartoon.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cartooncharacter_info")


@NamedQueries({
	@NamedQuery(name="findByName",query="select cartoon from CartoonEntity cartoon where cartoon.name=:nme"),
	@NamedQuery(name="total",query="select count(*) from CartoonEntity "),
	@NamedQuery(name="findByMaxCreatedDate",query="select max(createdDate),cartoon from CartoonEntity cartoon "),
	@NamedQuery(name="findAll",query="select cartoon from CartoonEntity cartoon where name=:nme and country=:cnt and gender=:gn and author=:at"),
	@NamedQuery(name="findAuthor",query="select cartoon.author from CartoonEntity cartoon where cartoon.name=:nme"),
    @NamedQuery(name="findcreatedDate",query="select cartoon.createdDate from CartoonEntity cartoon where cartoon.author=:at"),
    @NamedQuery(name="findnameAndcountry",query="select cartoon.name, cartoon.country from CartoonEntity cartoon where cartoon.author=:at"),
    @NamedQuery(name="updateAuthor",query="update CartoonEntity cartoon set cartoon.author=:at where cartoon.name=:nme"),
    @NamedQuery(name="updateTypeByName",query="update CartoonEntity cartoon set cartoon.type=:ty where cartoon.name=:nmt"),
    @NamedQuery(name="deleteByName",query="delete from CartoonEntity cartoon where cartoon.name=:nms"),
    @NamedQuery(name="findall",query="select cartoon from CartoonEntity cartoon"),
	@NamedQuery(name="findAllByAuthor",query="select cartoon from CartoonEntity cartoon where cartoon.author=:at "),
	@NamedQuery(name="findAllByAuthorAndGender",query="select cartoon from CartoonEntity cartoon where cartoon.author=:atr and gender=:gr"),
	@NamedQuery(name="findAllName",query="select cartoon.name from CartoonEntity cartoon"),
    @NamedQuery(name="findAllCountry",query="select cartoon.country from CartoonEntity cartoon "),
    @NamedQuery(name="findAllNameAndCountry",query="select cartoon.name,cartoon.country from CartoonEntity cartoon"),
    @NamedQuery(name="findAllNameAndCountryAndAuthor",query="select cartoon.name,cartoon.country,cartoon.author from CartoonEntity cartoon")
})
public class CartoonEntity extends ParentEntity {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator ="")
	private int id;
	private String name;
	private String country;
	private String gender;
	private String author;
	private String type;

 public	CartoonEntity( String name, String country, String gender, String author, String type, String createdBy,
			LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		
		this.name = name;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;
	}

}
