import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase  {
static ConfigWeb cw=new ConfigWeb();
    @BeforeSuite
    public void setup(){
        cw.init();
    }

    @AfterSuite
    public void stop(){
       cw.teardown();
    }
}



