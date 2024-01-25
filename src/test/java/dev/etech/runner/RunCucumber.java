package dev.etech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

      features = "./src/test/resources",
        glue = "dev.etech.steps",
        //tags = "@smokeTest", Executa todos os cenarios do projeto que contem a tag @smokeTest
        //tags = "@cadastro and @smokeTest", Executa todos os cenarios que contem as duas tags
        //tags = "@cadastro or @smokeTest",   Executa todos os cenarios que contem uma das duas tags
        tags = "@emailExistente",
        plugin = {"json:target/cucumber/cucumber.json"}
)

public class RunCucumber {
}
