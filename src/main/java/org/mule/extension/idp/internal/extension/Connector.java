package org.mule.extension.idp.internal.extension;

import org.mule.extension.idp.internal.config.IDPConfiguration;
import org.mule.extension.idp.internal.error.IDPErrorType;
import org.mule.runtime.api.meta.Category;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;
import org.mule.sdk.api.annotation.JavaVersionSupport;
import static org.mule.sdk.api.meta.JavaVersion.JAVA_11;
import static org.mule.sdk.api.meta.JavaVersion.JAVA_17;
import static org.mule.sdk.api.meta.JavaVersion.JAVA_8;

/**
 * This is the main class of an extension, is the entry point from which configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "ms-idp-omni")
@Extension(name = "MuleSoft IDP Omni Connector", category = Category.SELECT)
@Configurations(IDPConfiguration.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
@ErrorTypes(IDPErrorType.class)
@JavaVersionSupport({JAVA_8, JAVA_11, JAVA_17})
public class Connector {

}
