package org.springframework.qingsp.tx_test;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;

/**
 * @author qingshanpeng
 * @date 2021/7/28 14:44
 * @since 标果工厂-脱骨李
 */
@Component
public class DataSourceTransactionManagerConfig {
	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager() {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("qwer");
		dataSource.setServerName("localhost");
		dataSource.setURL(dataSource.getURL() + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false");
		return new DataSourceTransactionManager(dataSource);
	}
}
