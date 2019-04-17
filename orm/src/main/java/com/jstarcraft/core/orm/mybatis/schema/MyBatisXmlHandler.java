package com.jstarcraft.core.orm.mybatis.schema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.jstarcraft.core.orm.mybatis.schema.MyBatisXmlParser.ElementDefinition;

/**
 * MyBatisXML处理器
 * 
 * @author Birdy
 */
public class MyBatisXmlHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser(ElementDefinition.CONFIGURATION.getName(), new MyBatisXmlParser());
	}

}
