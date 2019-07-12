

1 start eureka 
-------------------------------------------------
2 start config 
-------------------------------------------------
3 start demo-server
-------------------------------------------------



then you will found that while demo-server uping,it will fetch config twice

ex:

    2019-07-12 14:39:39.067  INFO 4340 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@460ebd80: startup date [Fri Jul 12 14:39:39 CST 2019]; root of context hierarchy
    2019-07-12 14:39:39.720  INFO 4340 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
    2019-07-12 14:39:39.819  INFO 4340 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'configurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$acac4a37] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
    
      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::        (v2.0.3.RELEASE)
    
    2019-07-12 14:39:41.311  INFO 4340 --- [           main] c.xulb.demo.EamConfigServerApplication   : The following profiles are active: native
    2019-07-12 14:39:41.346  INFO 4340 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@b273a59: startup date [Fri Jul 12 14:39:41 CST 2019]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@460ebd80
    2019-07-12 14:39:44.078  INFO 4340 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=be358d27-f73e-3e9f-bf32-91aa46889e0b
    2019-07-12 14:39:44.133  INFO 4340 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
    2019-07-12 14:39:44.550  INFO 4340 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$acac4a37] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
    2019-07-12 14:39:45.639  INFO 4340 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 6671 (http)
    2019-07-12 14:39:45.676  INFO 4340 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
    2019-07-12 14:39:45.676  INFO 4340 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.31
    2019-07-12 14:39:45.694  INFO 4340 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [C:\Program Files\Java\jdk1.8.0_131\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Program Files\Java\jdk1.8.0_131\jre\bin;C:/Program Files/Java/jre1.8.0_131/bin/server;C:/Program Files/Java/jre1.8.0_131/bin;C:/Program Files/Java/jre1.8.0_131/lib/amd64;C:\ProgramData\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Windows\System32\OpenSSH\;C:\Program Files\nodejs\;C:\Program Files\TortoiseGit\bin;C:\Program Files\Git\cmd;C:\Users\yqxulb\AppData\Local\Microsoft\WindowsApps;C:\Users\yqxulb\AppData\Roaming\npm;C:\Users\yqxulb\AppData\Local\Programs\Microsoft VS Code\bin;E:\BaiduNetdiskDownload\eclipse;;.]
    2019-07-12 14:39:45.963  INFO 4340 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
    2019-07-12 14:39:45.963  INFO 4340 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 4617 ms
    2019-07-12 14:39:46.421  WARN 4340 --- [ost-startStop-1] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
    2019-07-12 14:39:46.421  INFO 4340 --- [ost-startStop-1] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
    2019-07-12 14:39:46.453  INFO 4340 --- [ost-startStop-1] c.netflix.config.DynamicPropertyFactory  : DynamicPropertyFactory is initialized with configuration sources: com.netflix.config.ConcurrentCompositeConfiguration@3409dcad
    2019-07-12 14:39:53.460  INFO 4340 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
    2019-07-12 14:39:53.482  INFO 4340 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
    2019-07-12 14:39:53.483  INFO 4340 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
    2019-07-12 14:39:53.483  INFO 4340 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
    2019-07-12 14:39:53.483  INFO 4340 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
    2019-07-12 14:39:53.484  INFO 4340 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpTraceFilter' to: [/*]
    2019-07-12 14:39:53.484  INFO 4340 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'webMvcMetricsFilter' to: [/*]
    2019-07-12 14:39:53.672  WARN 4340 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
    2019-07-12 14:39:53.672  INFO 4340 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
    2019-07-12 14:39:53.867  INFO 4340 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2019-07-12 14:39:54.524  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@b273a59: startup date [Fri Jul 12 14:39:41 CST 2019]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@460ebd80
    2019-07-12 14:39:54.695  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
    2019-07-12 14:39:54.697  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
    2019-07-12 14:39:54.715  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/encrypt],methods=[POST]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.encrypt(java.lang.String,org.springframework.http.MediaType)
    2019-07-12 14:39:54.719  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/encrypt/{name}/{profiles}],methods=[POST]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.encrypt(java.lang.String,java.lang.String,java.lang.String,org.springframework.http.MediaType)
    2019-07-12 14:39:54.720  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/decrypt/{name}/{profiles}],methods=[POST]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.decrypt(java.lang.String,java.lang.String,java.lang.String,org.springframework.http.MediaType)
    2019-07-12 14:39:54.721  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/decrypt],methods=[POST]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.decrypt(java.lang.String,org.springframework.http.MediaType)
    2019-07-12 14:39:54.723  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/encrypt/status],methods=[GET]}" onto public java.util.Map<java.lang.String, java.lang.Object> org.springframework.cloud.config.server.encryption.EncryptionController.status()
    2019-07-12 14:39:54.730  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/key],methods=[GET]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.getPublicKey()
    2019-07-12 14:39:54.732  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/key/{name}/{profiles}],methods=[GET]}" onto public java.lang.String org.springframework.cloud.config.server.encryption.EncryptionController.getPublicKey(java.lang.String,java.lang.String)
    2019-07-12 14:39:54.752  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}-{profiles}.properties],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.properties(java.lang.String,java.lang.String,boolean) throws java.io.IOException
    2019-07-12 14:39:54.753  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{label}/{name}-{profiles}.json],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.labelledJsonProperties(java.lang.String,java.lang.String,java.lang.String,boolean) throws java.lang.Exception
    2019-07-12 14:39:54.753  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{label}/{name}-{profiles}.properties],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.labelledProperties(java.lang.String,java.lang.String,java.lang.String,boolean) throws java.io.IOException
    2019-07-12 14:39:54.754  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}-{profiles}.yml || /{name}-{profiles}.yaml],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.yaml(java.lang.String,java.lang.String,boolean) throws java.lang.Exception
    2019-07-12 14:39:54.754  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}/{profiles}/{label:.*}],methods=[GET]}" onto public org.springframework.cloud.config.environment.Environment org.springframework.cloud.config.server.environment.EnvironmentController.labelled(java.lang.String,java.lang.String,java.lang.String)
    2019-07-12 14:39:54.754  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{label}/{name}-{profiles}.yml || /{label}/{name}-{profiles}.yaml],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.labelledYaml(java.lang.String,java.lang.String,java.lang.String,boolean) throws java.lang.Exception
    2019-07-12 14:39:54.755  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}-{profiles}.json],methods=[GET]}" onto public org.springframework.http.ResponseEntity<java.lang.String> org.springframework.cloud.config.server.environment.EnvironmentController.jsonProperties(java.lang.String,java.lang.String,boolean) throws java.lang.Exception
    2019-07-12 14:39:54.755  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}/{profiles:.*[^-].*}],methods=[GET]}" onto public org.springframework.cloud.config.environment.Environment org.springframework.cloud.config.server.environment.EnvironmentController.defaultLabel(java.lang.String,java.lang.String)
    2019-07-12 14:39:54.768  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}/{profile}/**],methods=[GET],params=[useDefaultLabel]}" onto public java.lang.String org.springframework.cloud.config.server.resource.ResourceController.retrieve(java.lang.String,java.lang.String,javax.servlet.http.HttpServletRequest,boolean) throws java.io.IOException
    2019-07-12 14:39:54.772  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}/{profile}/{label}/**],methods=[GET]}" onto public java.lang.String org.springframework.cloud.config.server.resource.ResourceController.retrieve(java.lang.String,java.lang.String,java.lang.String,javax.servlet.http.HttpServletRequest,boolean) throws java.io.IOException
    2019-07-12 14:39:54.773  INFO 4340 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/{name}/{profile}/{label}/**],methods=[GET],produces=[application/octet-stream]}" onto public synchronized byte[] org.springframework.cloud.config.server.resource.ResourceController.binary(java.lang.String,java.lang.String,java.lang.String,javax.servlet.http.HttpServletRequest) throws java.io.IOException
    2019-07-12 14:39:54.925  INFO 4340 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2019-07-12 14:39:54.925  INFO 4340 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2019-07-12 14:39:57.219  INFO 4340 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
    2019-07-12 14:39:57.259  INFO 4340 --- [           main] s.b.a.e.w.s.WebMvcEndpointHandlerMapping : Mapped "{[/actuator/health],methods=[GET],produces=[application/vnd.spring-boot.actuator.v2+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping$OperationHandler.handle(javax.servlet.http.HttpServletRequest,java.util.Map<java.lang.String, java.lang.String>)
    2019-07-12 14:39:57.264  INFO 4340 --- [           main] s.b.a.e.w.s.WebMvcEndpointHandlerMapping : Mapped "{[/actuator/info],methods=[GET],produces=[application/vnd.spring-boot.actuator.v2+json || application/json]}" onto public java.lang.Object org.springframework.boot.actuate.endpoint.web.servlet.AbstractWebMvcEndpointHandlerMapping$OperationHandler.handle(javax.servlet.http.HttpServletRequest,java.util.Map<java.lang.String, java.lang.String>)
    2019-07-12 14:39:57.266  INFO 4340 --- [           main] s.b.a.e.w.s.WebMvcEndpointHandlerMapping : Mapped "{[/actuator],methods=[GET],produces=[application/vnd.spring-boot.actuator.v2+json || application/json]}" onto protected java.util.Map<java.lang.String, java.util.Map<java.lang.String, org.springframework.boot.actuate.endpoint.web.Link>> org.springframework.boot.actuate.endpoint.web.servlet.WebMvcEndpointHandlerMapping.links(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
    2019-07-12 14:39:57.446  INFO 4340 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
    2019-07-12 14:39:57.468  INFO 4340 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'environmentManager' has been autodetected for JMX exposure
    2019-07-12 14:39:57.687  INFO 4340 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'configurationPropertiesRebinder' has been autodetected for JMX exposure
    2019-07-12 14:39:57.691  INFO 4340 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'refreshScope' has been autodetected for JMX exposure
    2019-07-12 14:39:57.700  INFO 4340 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'environmentManager': registering with JMX server as MBean [org.springframework.cloud.context.environment:name=environmentManager,type=EnvironmentManager]
    2019-07-12 14:39:57.766  INFO 4340 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'refreshScope': registering with JMX server as MBean [org.springframework.cloud.context.scope.refresh:name=refreshScope,type=RefreshScope]
    2019-07-12 14:39:57.800  INFO 4340 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'configurationPropertiesRebinder': registering with JMX server as MBean [org.springframework.cloud.context.properties:name=configurationPropertiesRebinder,context=b273a59,type=ConfigurationPropertiesRebinder]
    2019-07-12 14:39:57.832  INFO 4340 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 0
    2019-07-12 14:39:57.858  INFO 4340 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
    2019-07-12 14:39:57.974  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Initializing Eureka in region us-east-1
    2019-07-12 14:39:59.244  INFO 4340 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
    2019-07-12 14:39:59.245  INFO 4340 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
    2019-07-12 14:39:59.649  INFO 4340 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
    2019-07-12 14:39:59.649  INFO 4340 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
    2019-07-12 14:40:00.097  INFO 4340 --- [           main] c.n.d.s.r.aws.ConfigClusterResolver      : Resolving eureka endpoints via configuration
    2019-07-12 14:40:00.633  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
    2019-07-12 14:40:00.633  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
    2019-07-12 14:40:00.633  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
    2019-07-12 14:40:00.634  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Application is null : false
    2019-07-12 14:40:00.634  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
    2019-07-12 14:40:00.634  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Application version is -1: true
    2019-07-12 14:40:00.634  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
    2019-07-12 14:40:03.867  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : The response status is 200
    2019-07-12 14:40:03.870  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Starting heartbeat executor: renew interval is: 30
    2019-07-12 14:40:03.891  INFO 4340 --- [           main] c.n.discovery.InstanceInfoReplicator     : InstanceInfoReplicator onDemand update allowed rate per min is 4
    2019-07-12 14:40:03.904  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Discovery Client initialized at timestamp 1562913603902 with initial instances count: 0
    2019-07-12 14:40:03.913  INFO 4340 --- [           main] o.s.c.n.e.s.EurekaServiceRegistry        : Registering application eam-config-server with eureka with status UP
    2019-07-12 14:40:03.918  INFO 4340 --- [           main] com.netflix.discovery.DiscoveryClient    : Saw local status change event StatusChangeEvent [timestamp=1562913603918, current=UP, previous=STARTING]
    2019-07-12 14:40:03.978  INFO 4340 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_EAM-CONFIG-SERVER/YQ-ZN-125.sunnyoptical.com:eam-config-server:6671: registering service...
    2019-07-12 14:40:04.382  INFO 4340 --- [nfoReplicator-0] com.netflix.discovery.DiscoveryClient    : DiscoveryClient_EAM-CONFIG-SERVER/YQ-ZN-125.sunnyoptical.com:eam-config-server:6671 - registration status: 204
    2019-07-12 14:40:04.526  INFO 4340 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 6671 (http) with context path ''
    2019-07-12 14:40:04.528  INFO 4340 --- [           main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 6671
    2019-07-12 14:40:04.534  INFO 4340 --- [           main] c.xulb.demo.EamConfigServerApplication   : Started EamConfigServerApplication in 27.973 seconds (JVM running for 29.314)
    2019-07-12 14:40:33.871  INFO 4340 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Disable delta property : false
    2019-07-12 14:40:33.872  INFO 4340 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Single vip registry refresh property : null
    2019-07-12 14:40:33.872  INFO 4340 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Force full registry fetch : false
    2019-07-12 14:40:33.872  INFO 4340 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application is null : false
    2019-07-12 14:40:33.872  INFO 4340 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Registered Applications size is zero : true
    2019-07-12 14:40:33.872  INFO 4340 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Application version is -1: false
    2019-07-12 14:40:33.872  INFO 4340 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : Getting all instance registry info from the eureka server
    2019-07-12 14:40:33.960  INFO 4340 --- [freshExecutor-0] com.netflix.discovery.DiscoveryClient    : The response status is 200
    2019-07-12 14:41:17.105  INFO 4340 --- [nio-6671-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring FrameworkServlet 'dispatcherServlet'
    2019-07-12 14:41:17.106  INFO 4340 --- [nio-6671-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization started
    2019-07-12 14:41:17.153  INFO 4340 --- [nio-6671-exec-1] o.s.web.servlet.DispatcherServlet        : FrameworkServlet 'dispatcherServlet': initialization completed in 47 ms
    2019-07-12 14:41:17.973  INFO 4340 --- [nio-6671-exec-1] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@52361ff3: startup date [Fri Jul 12 14:41:17 CST 2019]; root of context hierarchy
    2019-07-12 14:41:18.013  INFO 4340 --- [nio-6671-exec-1] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
    2019-07-12 14:41:18.085  INFO 4340 --- [nio-6671-exec-1] o.s.c.c.s.e.NativeEnvironmentRepository  : Adding property source: classpath:/config/eam-demo-dev.yml
    2019-07-12 14:41:18.085  INFO 4340 --- [nio-6671-exec-1] o.s.c.c.s.e.NativeEnvironmentRepository  : Adding property source: classpath:/config/application-dev.yml
    2019-07-12 14:41:18.085  INFO 4340 --- [nio-6671-exec-1] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@52361ff3: startup date [Fri Jul 12 14:41:17 CST 2019]; root of context hierarchy
    2019-07-12 14:41:27.809  INFO 4340 --- [nio-6671-exec-4] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@1fbb7750: startup date [Fri Jul 12 14:41:27 CST 2019]; root of context hierarchy
    2019-07-12 14:41:27.813  INFO 4340 --- [nio-6671-exec-4] f.a.AutowiredAnnotationBeanPostProcessor : JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
    2019-07-12 14:41:27.821  INFO 4340 --- [nio-6671-exec-4] o.s.c.c.s.e.NativeEnvironmentRepository  : Adding property source: classpath:/config/eam-demo-dev.yml
    2019-07-12 14:41:27.822  INFO 4340 --- [nio-6671-exec-4] o.s.c.c.s.e.NativeEnvironmentRepository  : Adding property source: classpath:/config/application-dev.yml
    2019-07-12 14:41:27.822  INFO 4340 --- [nio-6671-exec-4] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@1fbb7750: startup date [Fri Jul 12 14:41:27 CST 2019]; root of context hierarchy

