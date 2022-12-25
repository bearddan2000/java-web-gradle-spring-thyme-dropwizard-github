package example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import example.resources.FilterResource;
// import example.TemplateHealthCheck;

public class Main extends Application<ApiConfiguration> {
    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<ApiConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(ApiConfiguration configuration,
                    Environment environment) {
        // nothing to do yet
        environment.jersey().register(new FilterResource());
    }

}
