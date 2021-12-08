package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\madhu\\CucumberFrameworkwithFeatures\\Cucumber\\src\\test\\resources\\features\\JSON.feature"},
		glue={"JSON"},
		monochrome=true,
		plugin= {"pretty","html:target/HtmlReports1",
				"json:target/Json/report.json",
				"junit:target/Junit/reports.xml"}
		//tags="@madhu"
		//tags="@madhu and not @chinna"//skip
		//tags="(@mphasis or @pinnu) and @doop"//mixed
		//tags="@mphasis and @doop"//and
		/** tags= "@madhu or @kiran"*///or
		//tags can be placedabove scenario,sce outline,examples,feature
	
		)
public class TestRunner {

	
		

	}


