package com.vth.pattern.creational.singleton;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingletonTest {

	@Test(enabled = true, description = "Tests Singleton.getInstance() method always returns same instance")
    void testSingletonInstance() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		Assert.assertEquals(instance1, instance2);
    }
    
    @Test(enabled = true, description = "Tests Singleton class doesn't support clone()", expectedExceptions = { CloneNotSupportedException.class })
    void testCloneNotSupported() throws CloneNotSupportedException {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = (Singleton) instance1.clone();
    }
}
