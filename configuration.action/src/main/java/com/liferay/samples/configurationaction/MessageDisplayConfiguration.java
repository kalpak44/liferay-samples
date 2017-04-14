package com.liferay.samples.configurationaction;

import aQute.bnd.annotation.metatype.Meta;

/**
 * @author Liferay
 */
@Meta.OCD(
	id = "com.liferay.samples.configurationaction.MessageDisplayConfiguration"
)
public interface MessageDisplayConfiguration {

	@Meta.AD(required = false)
	public String fontColor();

	@Meta.AD(required = false)
	public String fontFamily();

	@Meta.AD(required = false)
	public int fontSize();

}