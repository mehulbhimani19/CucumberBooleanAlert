package Lotus;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Mehul on 27/11/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/Resources/feature/log_in.feature" )
public class RunTest {

}

