package org.mule.extension.idp.internal.error;

import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

public enum IDPErrorType implements ErrorTypeDefinition<IDPErrorType> {

  IDP_OPERATIONS_FAILURE,
  IDP_SERVICES_FAILURE
}
