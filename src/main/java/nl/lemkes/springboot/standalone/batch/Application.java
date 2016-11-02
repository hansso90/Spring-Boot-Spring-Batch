package nl.lemkes.springboot.standalone.batch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Hans on 16-8-2016.
 */
@SpringBootApplication
@EnableAutoConfiguration
@EnableBatchProcessing
@ImportResource({"ApplicationContext.xml"})
@ComponentScan(basePackages = "nl.lemkes.springboot.standalone.batch")
public class Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
