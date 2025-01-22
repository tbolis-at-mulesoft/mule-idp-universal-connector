package org.mule.extension.idp.internal.operation;

import org.mule.extension.idp.internal.config.IDPConfiguration;
import org.mule.extension.idp.internal.error.provider.IDPErrorTypeProvider;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;
import org.mule.runtime.extension.api.runtime.operation.Result;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static org.apache.commons.io.IOUtils.toInputStream;
import static org.mule.runtime.extension.api.annotation.param.MediaType.APPLICATION_JSON;

public class IDPOperations {

  @MediaType(value = APPLICATION_JSON, strict = false)
  @Alias("Process")
  @DisplayName("Process")
  @Throws(IDPErrorTypeProvider.class)
  public Result<InputStream, Map<String, Object>> process(@org.mule.runtime.extension.api.annotation.param.Config IDPConfiguration config, String input) {

    return Result.<InputStream, Map<String, Object>>builder()
        .attributes(new HashMap<String, Object>())
        .attributesMediaType(org.mule.runtime.api.metadata.MediaType.APPLICATION_JAVA)
        .output(toInputStream("", StandardCharsets.UTF_8))
        .mediaType(org.mule.runtime.api.metadata.MediaType.APPLICATION_JSON)
        .build();
  }
}
