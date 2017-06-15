package cn.dafei1288;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("dev") // Only activate this in the "dev" profile
public class H2ServerConfiguration {

    // TCP port for remote connections, default 9092
    @Value("${spring.h2.tcp.port:9092}")
    private String h2TcpPort;

    // Web port, default 8082
    @Value("${spring.h2.web.port:8082}")
    private String h2WebPort;

    @Bean
    @ConditionalOnExpression("${spring.h2.tcp.enabled:false}")
    public Server h2TcpServer() throws SQLException {
        System.out.println();
        System.out.println("h2TcpPort ====>  "+h2TcpPort);
        System.out.println();
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", h2TcpPort).start();
    }


    @Bean
    @ConditionalOnExpression("${spring.h2.web.enabled:true}")
    public Server h2WebServer() throws SQLException {
        System.out.println();
        System.out.println("h2WebPort ====>  "+h2WebPort);
        System.out.println();
        return Server.createWebServer("-web", "-webAllowOthers", "-webPort", h2WebPort).start();
    }

}