package com.multi.aopPro.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//모든 클래스에 적용할 공통모듈
//스프링에서 사용하는 aop가 정의되어 있는 클래스라는 의미
@Component
@Aspect
public class LogAdvice_back {
	// 포인트 컷을 적용하는 방법은 별도로 메소드 위에 정의하는 방식
	@Pointcut("execution(* com.multi.aopPro..*.*DAO.add*(..))")
	public void logPointcut() {
	}

	@Before("logPointcut()")
	public void before_log() {
		System.out.println("***************");
	}

	// 로그 기록하는 코드
	@After("logPointcut()")
	public void log() {
		System.out.println("^^");
	}

	// 시간을 측정하는 메소드
	// 트랜잭션처리를 위한 기능

}
