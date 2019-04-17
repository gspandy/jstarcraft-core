package com.jstarcraft.core.aspect.lock;

/**
 * 可锁定
 * 
 * @author Birdy
 *
 */
public interface Lockable extends AutoCloseable {

	/**
	 * 开启锁
	 */
	public void open();

	/**
	 * 关闭锁
	 */
	public void close();

}
