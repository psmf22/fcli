/*******************************************************************************
 * Copyright 2021, 2023 Open Text.
 *
 * The only warranties for products and services of Open Text 
 * and its affiliates and licensors ("Open Text") are as may 
 * be set forth in the express warranty statements accompanying 
 * such products and services. Nothing herein should be construed 
 * as constituting an additional warranty. Open Text shall not be 
 * liable for technical or editorial errors or omissions contained 
 * herein. The information contained herein is subject to change 
 * without notice.
 *******************************************************************************/
package com.fortify.cli.tool._common.helper;

import java.util.Arrays;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.formkiq.graalvm.annotations.Reflectable;
import com.fortify.cli.common.util.StringUtils;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown=true)
@Reflectable @NoArgsConstructor
@Data
public class ToolDefinitionsDescriptor {
    private String schema_version;
    private ToolVersionDescriptor[] versions;
    
    public final ToolVersionDescriptor[] getVersions() {
        return getVersionsStream().toArray(ToolVersionDescriptor[]::new);
    }
    
    public final Stream<ToolVersionDescriptor> getVersionsStream() {
        return Stream.of(versions);
    }
    
    public final ToolVersionDescriptor getVersion(String version) {
        return getVersionsStream()
                .filter(v-> (v.getVersion().equals(version) || Arrays.stream(v.getAliases()).anyMatch(version::equals)) )
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Version "+version+" not defined"));
    }
    
    public final ToolVersionDescriptor getVersionOrDefault(String versionName) {
        if ( StringUtils.isBlank(versionName) || "default".equals(versionName)) {
            versionName = "latest";
        }
        return getVersion(versionName);
    }
    
}