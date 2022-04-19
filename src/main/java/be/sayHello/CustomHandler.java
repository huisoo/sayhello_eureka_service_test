package be.sayHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;

@Component
public class CustomHandler {

    @Autowired
    WebClient webClient;


    public Mono<ServerResponse> someRequestMethod(ServerRequest request){

        String name = request.queryParam("name").get();



        Mono<Map> infoServiceMap = webClient.get()
                .uri("/uri?name=" + name)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve().bodyToMono(Map.class);

        //Mono<Info> info = Mono.just(new Info(name, "hello " + name, "init"));

        Mono<Info> info = infoServiceMap.map(job -> {
                    Info infos = new Info(name, "hello " + name, job.get("job").toString());
                    return infos;
                }
        );

        //Object obj = info.cast(Object.class);
        //System.out.println("test");

        //info.subscribe(result -> result)
        /*infoServiceMap.doOnNext(r -> {
            info.setJob(r.get("job").toString());
        }).subscribe();*/

        //ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)


        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(info);
    }
}
