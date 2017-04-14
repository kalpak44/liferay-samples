package com.liferay.samples.portlet.actioncommand;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

/**
 * @author Liferay
 */
@Component(
	immediate = true,
	property = {
		"javax.portlet.name=com_liferay_samples_portlet_actioncommand_GreeterPortlet",
		"mvc.command.name=greet"
	},
	service = MVCActionCommand.class
)
public class GreeterActionCommand implements MVCActionCommand {

	@Override
	public boolean processAction(
			ActionRequest actionRequest, ActionResponse actionResponse)
		throws PortletException {

		_handleActionCommand(actionRequest);

		return true;
	}

	private void _handleActionCommand(ActionRequest actionRequest) {
		String name = ParamUtil.get(actionRequest, "name", StringPool.BLANK);

		if (_log.isInfoEnabled()) {
			_log.info("Hello " + name);
		}

		String greetingMessage = "Hello " + name + "! Welcome to OSGi";

		actionRequest.setAttribute("GREETER_MESSAGE", greetingMessage);

		SessionMessages.add(actionRequest, "greetingMessage", greetingMessage);
	}

	private static final Log _log = LogFactoryUtil.getLog(
		GreeterActionCommand.class);

}