package com.jstarcraft.core.aspect.lock;

/**
 * 锁管理器
 * 
 * @author Birdy
 *
 */
public interface LockableManager {

	/**
	 * 获取指定的参数对应的锁
	 * 
	 * @param arguments
	 * @return
	 */
	Lockable getLock(Object... arguments);

}