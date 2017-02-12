STEPS:

`git clone https://github.com/elamgit/dropwizard-test.git`
`cd dropwizard-test`
`mvn clean install`
`java -jar target dropwizard-test-1.0-SNAPSHOT.jar server`
`curl http://localhost:8080/order?name=tv`
`curl http://localhost:8080/order?name=iphone`