package test;

import javax.persistence.Entity;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name = "product")
public class Product extends PanacheEntity
{
	public String code;
	public String marketArea;
}
