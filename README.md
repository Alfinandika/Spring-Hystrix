# Sample Hystrix Circuit Breaker Pattern – Spring Cloud

To demo circuit breaker, we will create following two microservices where first is dependent on another.

Student Microservice – Which will give some basic functionality on Student entity. It will be a REST based service. We will call this service from School Service to understand Circuit Breaker. It will run on port 8098 in localhost.
School Microservice – Again a simple REST based microservice where we will implement circuit breaker using Hystrix. Student Service will be invoked from here and we will test the fall back path once student service will be unavailable. It will run on port 9098 in localhost.
