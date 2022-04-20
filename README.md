# sayHelloServer
BE week 2 practice (04/19)


## (Spec) :
- Spring 5+, Java 8+, WebFlux, Functional Endpoint
- internalServer : https://github.com/huisoo/infoServiceServer

```
(Request) :
GET localhost:8080/hello?name=$name
```

```
(Response) :
application/json
{ “to”: “$name”, “message”: “hello $name” }
```
