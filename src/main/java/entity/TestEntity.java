package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.panache.common.Parameters;

@Entity
@Table(name = "entity")
public class TestEntity extends PanacheEntityBase
{
	@Id
	long id;
	@Lob
	private byte[] data;
	
	public static void updateAll(byte[] data)
	{
		TestEntity.update("set data = :data", Parameters.with("data", data));
	}
}
