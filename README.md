# spring-webapi
java spring + masql

# 修改application.properties文件内容（修改端口，数据库连接）：

#访问的接入端口

server.port=8090

#你的访问数据库的路由地址，localhost:127.0.0.1(本机地址) 3306(数据库访问的端口，这个是自己在数据库设置的， test(你的数据库名称))

spring.datasource.url=jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2B8
#登录数据库的用户名
spring.datasource.username=root
#登录数据库的密码
spring.datasource.password=123456
#下面这些默认就可以
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.hbm2ddl.auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
