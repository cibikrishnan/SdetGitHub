package org.ckrishnan;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "feature",
glue = {"stepdefinitions"},
        tags = "@webpage"
)


public class Runner {


}
