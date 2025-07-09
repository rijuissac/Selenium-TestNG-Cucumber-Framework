package com.project.website.runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags="@regression",features= {"src/test/resources/feature"},
glue= {"com.project.website.stepdefentions"},
plugin= {"pretty","html:target/report.html"})
public class testNGRunner extends AbstractTestNGCucumberTests {

}
