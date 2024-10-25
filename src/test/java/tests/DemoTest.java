package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

    @Test
    void verifyTwoNumber(){
        String name = "CICD";
        System.out.println("Assertion is started");
       Assert.assertTrue(name.contains("C"), "variable does not contain letter C");
        System.out.println("Assertion is ended");
    }
}
