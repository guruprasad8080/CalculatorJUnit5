package com.testclass;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.testclass")
@IncludeClassNamePatterns(".*Test.*")
public class UnsderstandingIncludeClassPatternTest {

}
