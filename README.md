# hymicroservices
springboot微服务使用feign服务调用服务demo

springboot微服务使用feign服务调用服务demo

1：使用consul作为注册中心，版本consul_1.6.1_windows_amd64

2: 以用户user-provider-service调用角色role-provider-service服务

3: 项目maven结构管理

 3.1: 总pom结构工程hymicroservices

 3.2: 用户服务工程user-provider

  3.2.1：工程user-provider-api基予feign提供其他服务调用用户服务接口api

  3.2.2: 工程user-provider-service提供前端api访问接口

 3.3: 角色服务role-provider

  3.3.1: 工程role-provider-api基于feign提供其他服务调用角色服务接口api

  3.3.2: 工程role-provider-service提供前端api访问接口

4:使用swagger2.9 api接口暴露服务
