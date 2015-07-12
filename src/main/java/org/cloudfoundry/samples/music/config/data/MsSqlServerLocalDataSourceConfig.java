package org.cloudfoundry.samples.music.config.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("sqlserver-local")
public class MsSqlServerLocalDataSourceConfig extends AbstractLocalDataSourceConfig {

    @Bean
    public DataSource dataSource() {
    	
        return createBasicDataSource(
        	"jdbc:sqlserver://192.168.177.128:1433;databaseName=music", 
        	"com.microsoft.sqlserver.jdbc.SQLServerDriver", 
        	"sa", 
        	"administrator");
    }

}
