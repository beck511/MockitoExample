package com.fdmgroup.mockito.robots;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.concurrent.ArrayBlockingQueue;

import org.junit.Test;


public class TestRobot {

	@Test
	public void testDestroySuccess() {
		
		// 1. Mock
		
		Weapon mockWeapon = mock(Weapon.class);
		Robot robot = new Robot(mockWeapon);

		// 2. Use the mock
		robot.destroy(3);

		// 3. Verify the behavior took place
		verify(mockWeapon).fire(3);
		
	}
	
	@Test
	public void testAccountName() {
		
		// 1. Mock
		
		Account mockAccount = mock(Account.class);
		

		// 2. Use the mock
		mockAccount.getAccountName();

		// 3. Verify the behavior took place
		verify(mockAccount).getAccountName();
		assertNotNull(mockAccount);
		
	}

}
