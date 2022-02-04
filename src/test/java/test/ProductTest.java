package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import test.Product;

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
