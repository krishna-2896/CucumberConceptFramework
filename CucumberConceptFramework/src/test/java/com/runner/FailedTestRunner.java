package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target\\Failed_Scenario.txt",
                 glue="com.stepdefinition",
                 plugin = {"pretty", "json:target\\rerun_json.json",
                		             "html:target\\rerun_CucumberOutput.html"},
                 monochrome = true,
                 snippets = SnippetType.CAMELCASE)
public class FailedTestRunner {

}
