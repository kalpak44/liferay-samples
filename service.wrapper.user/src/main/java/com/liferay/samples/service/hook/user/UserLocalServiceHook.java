package com.liferay.samples.service.hook.user;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserLocalServiceWrapper;

import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Liferay
 */
@Component(
        immediate = true,
        property = {
                "service.ranking:Integer=10000"
        },
        service = ServiceWrapper.class
)
public class UserLocalServiceHook extends UserLocalServiceWrapper {

	public UserLocalServiceHook() {
		super(null);
	}

	@Override
	public int authenticateByEmailAddress(
			long companyId, String emailAddress, String password,
			Map<String, String[]> headerMap, Map<String, String[]> parameterMap,
			Map<String, Object> resultsMap)
		throws PortalException {

		System.out.println(
			"Authenticating user by email address " + emailAddress);

		return super.authenticateByEmailAddress(
			companyId, emailAddress, password, headerMap, parameterMap,
			resultsMap);
	}

	@Override
	public User getUser(long userId) throws PortalException {
		System.out.println("Getting user by id " + userId);

		return super.getUser(userId);
	}

}
