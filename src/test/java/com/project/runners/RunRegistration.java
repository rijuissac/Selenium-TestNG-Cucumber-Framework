package com.project.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@regression",features= {"src/test/resources/feature/"},
glue= {"com.project.website.stepdefentions","com.project.website.hooks"},
plugin= {"pretty","html:target/report.html"})
public class RunRegistration extends BaseRunner {

	
}
