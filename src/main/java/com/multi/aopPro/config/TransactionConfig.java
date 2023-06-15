package com.multi.aopPro.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class TransactionConfig {
	DataSource ds;

	@Autowired
	public TransactionConfig(DataSource ds) {
		super();
		this.ds = ds;
	}
	
	// 스프링이 제공하는 AOP는 트랜잭션 매니저를 찾아서 실행
	// 직접 트랜잭션 매니저를 등록 가능
	@Bean
	PlatformTransactionManager transactionManager() {
		return new JdbcTransactionManager(ds);
	}
	
	
	
}
