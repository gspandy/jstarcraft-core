package com.jstarcraft.core.common.instant;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SolarExpressionTestCase.class, IntervalExpressionTestCase.class, IslamicExpressionTestCase.class, LunarExpressionTestCase.class, CronExpressionTestCase.class, TermExpressionTestCase.class })
public class DateTimeExpressionTestSuite {

}
