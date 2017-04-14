package com.liferay.samples.portlet.jsp;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Liferay
 */
@Component(
	immediate = true,
	property = {
	
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Blade Soy Portlet",
		"javax.portlet.init-param.template-path=/",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SoyPortlet extends SoyPortlet {
}