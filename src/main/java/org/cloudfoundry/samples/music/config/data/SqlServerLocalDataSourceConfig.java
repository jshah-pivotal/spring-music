package org.cloudfoundry.samples.music.config.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("sqlserver-local")
public class SqlServerLocalDataSourceConfig extends AbstractLocalDataSourceConfig {

    @Bean
    public DataSource dataSource() {
        return createBasicDataSource(
          "jdbc:sqlserver://ox5nzb0vd1.database.windows.net:1433;database=music;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;", 
          "com.microsoft.sqlserver.jdbc.SQLServerDriver", 
          "pivotal@ox5nzb0vd1", 
          "Cl0udf0undry");
    }

// MS provided this URL
//  jdbc:sqlserver://ox5nzb0vd1.database.windows.net:1433;database=music;user=pivotal@ox5nzb0vd1;password={your_password_here};encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;
    
// Local Testing: GT modified this URL to remove username and password
//  jdbc:sqlserver://ox5nzb0vd1.database.windows.net:1433;database=music;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;
    
// CloudFoundry testing with User-provided service
// {"uri":"sqlserver://pivotal:Cl0udf0undry@ox5nzb0vd1.database.windows.net:1433/music"}
    
}
