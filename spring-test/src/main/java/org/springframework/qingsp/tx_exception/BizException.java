package org.springframework.qingsp.tx_exception;

import java.io.Serializable;

/**
 * @author qingshanpeng
 * @date 2021/8/2 14:08
 * @since 标果工厂-脱骨李
 */
public class BizException extends Exception implements Serializable {

	private static final long serialVersionUID = 5439915454935047936L;

	private final String name;

	public BizException(String name) {
		this.name = name;
	}
}
