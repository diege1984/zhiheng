package com.wu.tx.api;

/**
 * 消息服务
 * @author 0092397
 *
 */
public interface IMessageFacade {
	
	/**
	 * 发送预备消息
	 */
	public void prepare();
	
	/**
	 * 发送确认消息
	 */
	public void ack();
	
}
