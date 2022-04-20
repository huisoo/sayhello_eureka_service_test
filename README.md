# sayHelloServer
BE week 2 practice (04/19)

REST API 에 반응 local 웹 서버

## (Spec) :
- Spring 5+, Java 8+, WebFlux, Functional Endpoint
- internalServer : https://github.com/huisoo/infoServiceServer

```
(Request) :
GET localhost:8080/hello?name=$name
```

```json
(Response) :
application/json
{ “to”: “$name”, “message”: “hello $name” }
```
