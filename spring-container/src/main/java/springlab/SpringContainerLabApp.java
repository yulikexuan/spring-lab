package springlab;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


@Slf4j
@SpringBootApplication
public class SpringContainerLabApp {

    public static void main(String[] args) {

        log.info(">>> Instantiating SpringApplication Class ... ");

        // instantiateSpringApplication(args);
        instantiateSpringAppWithBuilder(args);
    }

    static void instantiateSpringApplication(final String[] args) {

        final var app = new SpringApplication(SpringContainerLabApp.class);

        app.setHeadless(false);
        app.setBannerMode(Banner.Mode.OFF);
        app.setLogStartupInfo(false);

        app.run(args);
    }

    static void instantiateSpringAppWithBuilder(final String[] args) {

        new SpringApplicationBuilder(SpringContainerLabApp.class)
                .headless(false)
                .bannerMode(Banner.Mode.OFF)
                .logStartupInfo(false)
                .run(args);
    }

}