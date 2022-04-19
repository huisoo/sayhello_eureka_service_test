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

    public Info addJob(Mono<Map> job){
        //String jobValue = this.getJob();
        //this.setJob();
        //this.changeJob()
        Info tInfo = this;
        job.map( jobMap -> {
            String jobValue = jobMap.get("job").toString();
            tInfo.setJob(jobValue);
            return true;
            //this.setJob(jobMap.get("job").toString());
            //return getJob();
        });


        return tInfo;
    }


}
