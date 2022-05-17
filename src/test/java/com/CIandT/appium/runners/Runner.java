package com.CIandT.appium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = "src/test/java/com/CIandT/appium/features",
        glue = "com/CIandT/appium/steps",
        tags = "@Cadastro",
        monochrome = true
)
public class Runner {
}
