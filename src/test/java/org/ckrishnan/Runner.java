package org.ckrishnan;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "feature",
glue = {"stepdefinitions"},
tags = "@datatable")


public class Runner {


}