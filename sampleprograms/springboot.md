Spring Boot Starter
--------------------

* Spring boot starters are templates that contain a collection of all the relevant transitive dependencies that are 
  needed to start a particular functionality
  These files can be found inside /resources/META-INF folder of template project and file name is spring.provides
  
  For ex: spring-boot-starter --> spring-boot, spring-context, spring beans
  
* Autoconfiguration is enabled with @EnableAutoConfiguration annotation. Spring boot auto configuration scans the
  classpath, finds the libraries in the classpath and then attempts to guess the best configurations for them
  and finally configures all such beans
  
* To run the application, we need to use @SpringBootApplication annotation. Behind the scenes that equivalent to 
  @Configuration, @EnableAutoConfiguration and @ComponentScan together.
  
* The spring-boot-starter-parent dependency is the parent pom providing dependency and plugin management for 
  spring boot based applications.
  It contains the default versions of java to use, the default versions of dependencies that spring boot uses
  and the default configuration of the Maven plugins
  
 
Spring Boot Logging
-------------------

* The spring boot is using Logback as a default logger. By default, the SLF4j logging is included in the spring boot
  starter package. So no additional dependencies are required.
 
* Spring boot also allows you to create standard logback.xml file in the resources directory.
  This will override spring boot logging template
  
* Logging appender is configured as "Logback" which is an open source, server-side data processing pipeline that ingests
  data from a multitude of sources simultaneously, transforms it and then sends it to your favorite "stash (ElasticSearch)
 
* ElasticSearch is highly scalable open-source full text-search and analytics engine.
  

















   
   