package com.stepdefinition;

import java.io.File;
import java.io.IOException;

import com.common.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	@Before
	public void beforeScenario() {

		System.out.println("Launching Browser");
		ChromeBrowserLaunch();
		implicitiwait(20);
		loadUrl("https://www.redbus.in/");
		// maximize();
		System.out.println(getTitle());
		System.out.println(getCurrentUrl());
	}
	@After
	public void afterScenario(Scenario scenario) throws IOException, InterruptedException {
	if (scenario.isFailed()) {
		try {
			String currentDateTime = getCurrentDateTime();
			File src= screenShotWithFile();
			File dest=newFile(System.getProperty("user.dir")+"\\Screenshot\\"+scenario.getName()+currentDateTime+".png");
			copypastefile1(src, dest);
		} catch (Exception e) {
			System.out.println("Error was faced by scenario"+e);
		}
	}
	sleep(3000);
		close();
	}

}
