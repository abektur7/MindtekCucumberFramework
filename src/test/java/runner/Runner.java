package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json","rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        //features = "src/test/resources/features/OrangeApp.feature",
        glue = "steps",
        tags = "@MTB-664",
        dryRun = false,
        publish = true

)



public class Runner {

}
