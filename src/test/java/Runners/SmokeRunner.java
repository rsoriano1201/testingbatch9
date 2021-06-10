package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(

            features = "src/test/resources/features/Login.feature",
            //glue where we can find implementations for gherkin steps
            //we provide the path of package for steps
            glue = "steps",

            //if we set dry run to true, it will quickly scan all gherkin steps at implemented or not
            // if it is true, then no actual execution happens
            dryRun = false,

            //it means that the console output for the cucumber test is easily readable
            //it will remove unreadable characters
            monochrome = true,

            //if strict is set to true than at the time of execution if cucumber finds any undefined steps
            //it will give an error and stops execution. Also it gives code snippet for the
            //unimplemented steps
            //strict = false,

            tags = "@simpletag",
            //tags will identify the scenarios based on the tags we will provide such as @smoke, @regression etc
            //we can add multiple tags in the runner class to execute scenarios belonging to different tags
            //such as And OR ,
            plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}


    )

    public class SmokeRunner {


}
