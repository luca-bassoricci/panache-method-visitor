package com.zucchetti.main;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

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
