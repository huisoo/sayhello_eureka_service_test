package be.sayHello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> router(CustomHandler customHandler){
        return RouterFunctions.route()
                .GET("/hello/test", customHandler::someRequestMethod)
                .build();
    }
}
