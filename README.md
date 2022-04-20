# sayHelloServer
BE week 2 practice (04/19)


REST API 에 반응하는 local 웹 서버 앱 구축하기

(Spec) :

Spring 5+, Java 8+, WebFlux, Functional Endpoint
(Request) :

GET localhost:8080/hello?name=$name
(Response) :

application/json
{ “to”: “$name”, “message”: “hello $name” }
