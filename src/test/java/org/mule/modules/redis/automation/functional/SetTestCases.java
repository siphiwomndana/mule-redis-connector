package org.mule.modules.redis.automation.functional;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.modules.redis.RedisConnector;
import org.mule.modules.redis.automation.AutomationBase;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class SetTestCases extends AutomationBase {
	@Test
	public void verify() throws Exception {
		getLogger().debug("SetTestCases.verify()::START");
		java.lang.String expected = "OK,-1";
		java.lang.String key = "hello";
		java.lang.String value = "world";
		int timeout = -1;
		assertEquals(getConnector().set(key, value, timeout), expected);
		getLogger().debug("SetTestCases.verify()::END");
	}

}