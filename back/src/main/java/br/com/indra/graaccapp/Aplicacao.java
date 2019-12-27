package br.com.indra.graaccapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

/**
 * Classe de start da aplicação e configuraçãoes iniciais
 * 
 * @author Leonardo Vismara <lvismara@indracompany.com>
 */
@SpringBootApplication
@EnableAutoConfiguration
@Configuration 
public class Aplicacao {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Aplicacao.class, args);
    }

    /**
     * Metodo para liberação de acesso cross origin
     * 
     * @author Leonardo Vismara <lvismara@indracompany.com>
     */
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
			.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
	}
	
//	
//	@Bean
//    public DataSource getDataSource() 
//    {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
//        dataSourceBuilder.url("jdbc:mysql://172.31.5.173:3306/graacc?useSSL=false");
//        dataSourceBuilder.username("root");
//        dataSourceBuilder.password("N9sdhpi2Dhn2");
//        return (DataSource) dataSourceBuilder.build();
//    }

}
