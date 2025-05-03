package com.pcgestion;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/com/pcgestion",
        glue = "com.pcgestion",
        plugin = {"pretty"},
        monochrome = true
)
public class PCGestionCucumberTest {
}


