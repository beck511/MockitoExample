package com.fdmgroup.mockito;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

public class TestLogInManager {

	static LogInManager manager;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		
		manager = new LogInManager();
	}

	@Test
	public void testLogInSuccess() {
		
		// Create the mock
		User mockUser = mock(User.class);
		
		// Stubbing
		when(mockUser.getUsername()).thenReturn("admin");
		when(mockUser.isLoggedIn()).thenReturn(false);
		
		assertTrue(manager.logIn(mockUser));
		
		verify(mockUser).getUsername();
		verify(mockUser).setLoggedIn(true);
		verify(mockUser).isLoggedIn();
//		verify(mockUser).getPassword();
	}
@Test
public void logOutSuccessWhenLoggedIn(){
	
	User mockUser = mock(User.class);
	
	when(mockUser.isLoggedIn()).thenReturn(true);
	when(mockUser.getUsername()).thenReturn("penguin");
	manager.loggedInUsers.add("penguin");
	
	assertTrue(manager.logOut(mockUser));
	
	verify(mockUser).isLoggedIn();
	verify(mockUser).setLoggedIn(false);
	verify(mockUser).getUsername();
	
}




}
