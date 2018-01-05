package db;

import liquibase.integration.cdi.CDILiquibaseConfig;
import liquibase.integration.cdi.annotations.LiquibaseType;
import liquibase.resource.ClassLoaderResourceAccessor;
import liquibase.resource.ResourceAccessor;

import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

@Dependent
public class LiquibaseStarter {
    @Produces
    @LiquibaseType
    public CDILiquibaseConfig createConfig() {
        CDILiquibaseConfig config = new CDILiquibaseConfig();
        config.setChangeLog("liquibase/init.xml");
        return config;
    }

    @Resource(name="java:/jdbc/mysqlds")
    private DataSource ds;

    @Produces
    @LiquibaseType
    public DataSource createDataSource() {
        return ds;
    }

    @Produces
    @LiquibaseType
    public ResourceAccessor create() {
        return new ClassLoaderResourceAccessor(getClass().getClassLoader());
    }
}