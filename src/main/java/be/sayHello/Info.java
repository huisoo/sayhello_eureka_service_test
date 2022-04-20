package be.sayHello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.util.Map;


@Slf4j
public class Info {
    private String to;
    private String message;
    private String job;

    public Info(String to, String message, String job){
        this.to = to;
        this.message = message;
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public String getMessage() {
        return message;
    }

}
