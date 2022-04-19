package be.sayHello;

import io.netty.channel.ChannelOption;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

@Configuration
@EnableWebFlux
public class WebClientConfig {

    @Bean
    public WebClient webClient() {

        return WebClient.builder()
                .baseUrl("http://localhost:8083")
                .clientConnector(
                        new ReactorClientHttpConnector(
                                HttpClient
                                        .create()
                                        .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 3000)
                        )
                ).build();

    }
}
