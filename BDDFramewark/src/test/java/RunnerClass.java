import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"}, tags="@tag1")
// ~ called as tilde if u want to exclude or except the tag line then tags="~@tag1"
public class RunnerClass {

}
