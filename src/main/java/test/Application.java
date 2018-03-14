package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Commands:
 * ./gradlew build
 * docker build -t myapp .
 * docker run -it --rm -p 8888:8080 myapp
 *
 * @see https://howtoprogram.xyz/2017/01/26/package-spring-boot-application-war-file/
 * */

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

@RestController
class GreetingController {

    @RequestMapping("/")
    String hello() {
        return "Hello Docker World";
    }
}