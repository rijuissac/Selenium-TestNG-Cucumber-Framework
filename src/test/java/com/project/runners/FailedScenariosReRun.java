package com.project.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@regression",features= {"/target/rerun.txt"},
glue= {"com.project.website.stepdefentions","com.project.website.hooks"},
plugin= {"pretty","html:target/report.html"})

public class FailedScenariosReRun extends BaseRunner {

	//asdasdasda
	
}
