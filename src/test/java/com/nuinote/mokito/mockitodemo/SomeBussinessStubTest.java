package com.nuinote.mokito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBussinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}
