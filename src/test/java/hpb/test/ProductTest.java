package hpb.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import hpb.entity.Product;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class ProductTest
{
	@Test
	void test()
	{
		Product.listAll();
		assertTrue(true);
	}
}
