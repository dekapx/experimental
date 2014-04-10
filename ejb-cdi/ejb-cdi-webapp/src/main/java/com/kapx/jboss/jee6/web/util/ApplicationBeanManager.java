package com.kapx.jboss.jee6.web.util;

import java.util.Iterator;

import javax.ejb.Singleton;
import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

@Singleton
public class ApplicationBeanManager {

	@Inject
	private BeanManager beanManager;

	@SuppressWarnings({ "unchecked" })
	public <T> T getBeanInstanceByName(final String name) {
		final Iterator<Bean<?>> iterator = beanManager.getBeans(name).iterator();
		final Bean<T> bean = (Bean<T>) iterator.next();
		final CreationalContext<T> context = beanManager.createCreationalContext(bean);
		return (T) beanManager.getReference(bean, bean.getBeanClass(), context);
	}
}
