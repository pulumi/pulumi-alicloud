// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceMeshesMeshMeshConfigPrometheus {
    /**
     * @return The  service addresses of the Prometheus.
     * 
     */
    private String externalUrl;
    /**
     * @return Whether to enable external Prometheus.
     * 
     */
    private Boolean useExternal;

    private GetServiceMeshesMeshMeshConfigPrometheus() {}
    /**
     * @return The  service addresses of the Prometheus.
     * 
     */
    public String externalUrl() {
        return this.externalUrl;
    }
    /**
     * @return Whether to enable external Prometheus.
     * 
     */
    public Boolean useExternal() {
        return this.useExternal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceMeshesMeshMeshConfigPrometheus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String externalUrl;
        private Boolean useExternal;
        public Builder() {}
        public Builder(GetServiceMeshesMeshMeshConfigPrometheus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalUrl = defaults.externalUrl;
    	      this.useExternal = defaults.useExternal;
        }

        @CustomType.Setter
        public Builder externalUrl(String externalUrl) {
            if (externalUrl == null) {
              throw new MissingRequiredPropertyException("GetServiceMeshesMeshMeshConfigPrometheus", "externalUrl");
            }
            this.externalUrl = externalUrl;
            return this;
        }
        @CustomType.Setter
        public Builder useExternal(Boolean useExternal) {
            if (useExternal == null) {
              throw new MissingRequiredPropertyException("GetServiceMeshesMeshMeshConfigPrometheus", "useExternal");
            }
            this.useExternal = useExternal;
            return this;
        }
        public GetServiceMeshesMeshMeshConfigPrometheus build() {
            final var _resultValue = new GetServiceMeshesMeshMeshConfigPrometheus();
            _resultValue.externalUrl = externalUrl;
            _resultValue.useExternal = useExternal;
            return _resultValue;
        }
    }
}