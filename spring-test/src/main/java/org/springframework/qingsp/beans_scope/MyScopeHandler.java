package org.springframework.qingsp.beans_scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author qingshanpeng
 * @date 2022/2/17 15:17
 * @since 标果工厂
 */
@Component
public class MyScopeHandler implements Scope {

	private HashMap<String, Object> beans = new HashMap<>();

	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		if (beans.containsKey(name)) {
			beans.remove(name);
		}
		Object object = objectFactory.getObject();
		beans.put(name, object);
		return object;
	}

	@Override
	public Object remove(String name) {
		if (beans.containsKey(name)) {
			Object remove = beans.remove(name);
			return remove;
		}
		return null;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {

	}

	@Override
	public Object resolveContextualObject(String key) {
		return null;
	}

	@Override
	public String getConversationId() {
		return null;
	}
}
