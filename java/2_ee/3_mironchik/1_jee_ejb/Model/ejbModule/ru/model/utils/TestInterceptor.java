package ru.model.utils;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class TestInterceptor {
	@Resource
	private SessionContext sessionContext;
	@AroundInvoke
	public Object myInvoke(InvocationContext ctx) throws Exception{
		//System.out.println("----------------" + ctx);
		if(ctx.getMethod().getName().equals("userInfo")) {
			if(sessionContext.isCallerInRole("users")) {
				return "Ho to Hell!!!";
			}else {
				return ctx.proceed();
			}
		}else {
			return ctx.proceed();
		}
	}
}
