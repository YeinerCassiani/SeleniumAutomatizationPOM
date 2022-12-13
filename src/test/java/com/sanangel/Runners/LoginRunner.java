package com.sanangel.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",
        tags = "@Login",
        glue = "com.sanangel.StepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class LoginRunner {
}
