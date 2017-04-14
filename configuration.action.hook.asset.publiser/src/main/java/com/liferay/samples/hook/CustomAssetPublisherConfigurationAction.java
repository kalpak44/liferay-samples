package com.liferay.samples.hook;

import com.liferay.asset.publisher.web.portlet.action.AssetPublisherConfigurationAction;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.LayoutLocalService;
import com.liferay.portal.kernel.service.LayoutRevisionLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created in Methodia on 13.04.2017.
 */
@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + AssetPublisherPortletKeys.ASSET_PUBLISHER,
                "service.ranking:Integer=100"},
        service = ConfigurationAction.class)
public class CustomAssetPublisherConfigurationAction extends AssetPublisherConfigurationAction {

    @Override
    public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
            throws Exception {
		//your code here
        super.processAction(portletConfig, actionRequest, actionResponse);
    }

    

  

    @Reference(unbind = "-")
    protected void setAssetTagLocalService(
            AssetTagLocalService assetTagLocalService) {

        this.assetTagLocalService = assetTagLocalService;
    }

    @Reference(unbind = "-")
    protected void setGroupLocalService(GroupLocalService groupLocalService) {
        this.groupLocalService = groupLocalService;
    }

    @Reference(unbind = "-")
    protected void setLayoutLocalService(
            LayoutLocalService layoutLocalService) {

        this.layoutLocalService = layoutLocalService;
    }

    @Reference(unbind = "-")
    protected void setLayoutRevisionLocalService(
            LayoutRevisionLocalService layoutRevisionLocalService) {

        this.layoutRevisionLocalService = layoutRevisionLocalService;
    }

    @Reference(
            target = "(osgi.web.symbolicname=com.liferay.asset.publisher.web)",
            unbind = "-"
    )
    public void setServletContext(ServletContext servletContext) {
        super.setServletContext(servletContext);
    }

}
