package stu.mybatis.official.plugin;

import java.lang.reflect.Method;
import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

@Intercepts(@Signature(type=Executor.class,method="update",args={MappedStatement.class,Object.class}))
public class MyPlugin implements Interceptor {
	public Object intercept(Invocation invocation) throws Throwable {
		
		Method method = invocation.getMethod();
		System.out.println("method name: " + method.getName());
		
		invocation.getTarget();
		
		return invocation.proceed();
	}

	public Object plugin(Object target) {
		
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties properties) {
		
	}
}
