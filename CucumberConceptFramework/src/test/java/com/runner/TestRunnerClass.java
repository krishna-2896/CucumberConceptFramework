package com.runner;

import org.junit.runner.RunWith;

import com.common.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,
                 //tags = "@smoke",
                 features = "src\\test\\resources\\Features",
                 glue="com.stepdefinition",
                // stepNotifications = true,
                 plugin = {"pretty","html:target\\CucumberOutput.html",
                		             "json:target\\JsonOutput.json",
                		             "junit:target\\cucumber.xml",
                		             "rerun:target\\Failed_Scenario.txt"},
                 monochrome = true,
                 snippets = SnippetType.CAMELCASE)
public class TestRunnerClass extends BaseClass {

}
