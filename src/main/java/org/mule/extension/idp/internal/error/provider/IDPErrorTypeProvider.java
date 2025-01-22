/**
 * (c) 2003-2024 MuleSoft, Inc. The software in this package is published under the terms of the Commercial Free Software license V.1 a copy of which has been included with this distribution in the LICENSE.md file.
 */
package org.mule.extension.idp.internal.error.provider;

import org.mule.runtime.extension.api.error.ErrorTypeDefinition;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableSet;
import static org.mule.extension.idp.internal.error.IDPErrorType.IDP_OPERATIONS_FAILURE;
import static org.mule.extension.idp.internal.error.IDPErrorType.IDP_SERVICES_FAILURE;

public class IDPErrorTypeProvider implements org.mule.runtime.extension.api.annotation.error.ErrorTypeProvider {

  @SuppressWarnings("rawtypes")
  @Override
  public Set<ErrorTypeDefinition> getErrorTypes() {
    return unmodifiableSet(new HashSet<>(asList(
        IDP_OPERATIONS_FAILURE,
        IDP_SERVICES_FAILURE)));
  }
}
