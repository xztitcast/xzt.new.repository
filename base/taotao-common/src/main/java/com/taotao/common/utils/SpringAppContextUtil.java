package com.taotao.common.utils;

import org.springframework.context.ApplicationContext;

/**
 * spring 容器
 * @author xiangzuotao
 * @date 2018年1月27日 下午3:49:09
 * @version
 */
public abstract class SpringAppContextUtil {

	private static ApplicationContext ctx ;
	
	public static void setApplicationContext(ApplicationContext context) {
		ctx = context;
	}
	
	/**
	 * 根据类型获取bean对象
	 * @param cls 类型
	 * @return
	 */
	public static <T> T getBean(Class<T> cls) {
		return ctx.getBean(cls);
	}
	
	/**
	 * 根据id和类型获取bean对象
	 * @param id id名称
	 * @param cls 类型
	 * @return
	 */
	public static <T> T getBean(String id, Class<T> cls) {
		return ctx.getBean(id, cls);
	}
	
	/**
	 * 根据id获取bean对象
	 * @param id
	 * @return
	 */
	public static Object getBean(String id) {
		return ctx.getBean(id);
	}
}
