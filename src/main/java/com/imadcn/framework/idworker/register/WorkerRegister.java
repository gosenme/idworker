package com.imadcn.framework.idworker.register;

/**
 * Worker注册
 * @author yangc
 * @since 2017-12-01
 */
public interface WorkerRegister {

	/**
	 * 注册workerId
	 */
	long register();
	
	/**
	 * 退出注册
	 */
	void logout();
}
