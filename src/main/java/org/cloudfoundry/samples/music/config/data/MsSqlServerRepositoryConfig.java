package org.cloudfoundry.samples.music.config.data;

import org.hibernate.dialect.SQLServer2012Dialect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Profile("sqlserver")
@EnableJpaRepositories("org.cloudfoundry.samples.music.repositories.jpa")
public class MsSqlServerRepositoryConfig extends AbstractJpaRepositoryConfig {

    protected String getHibernateDialect() {
        return SQLServer2012Dialect.class.getName();
    }

}
