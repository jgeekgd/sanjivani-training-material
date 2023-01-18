package com.revature.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.revature.dao.impl.UserDaoImplTest;
import com.revature.util.java8.datetime.api.ZonedDateTimeDemoTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ UserDaoImplTest.class, ZonedDateTimeDemoTest.class })
public class JunitTestSuite {
}