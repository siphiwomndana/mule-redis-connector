package org.mule.modules.redis.automation.functional;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mule.modules.redis.RedisConnector;
import org.mule.modules.redis.automation.AutomationBase;
import org.mule.tools.devkit.ctf.junit.AbstractTestCase;

public class PingTestCases extends AutomationBase {


	@Test
	public void verify() throws Exception {
		getLogger().debug("PingTestCases.verify()::START");
		java.lang.String expected="PONG";
		assertEquals(expected, getConnector().ping());
		getLogger().debug("PingTestCases.verify()::END");
	}

}