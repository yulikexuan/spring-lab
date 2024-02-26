package springlab;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class SpringContainerLabApp {

    public static void main(String[] args) {

        final var app = new SpringApplication(SpringContainerLabApp.class);

        log.info(">>> Set up Spring Application ... ");

        app.setHeadless(true);
        app.setBannerMode(Banner.Mode.OFF);
        app.setLogStartupInfo(false);

        app.run(args);
    }

}