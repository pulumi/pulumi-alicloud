// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetContainerGroupsGroupInitContainerPort {
    /**
     * @return The port number. Valid values: 1 to 65535.
     * 
     */
    private final Integer port;
    /**
     * @return Valid values: `TCP` and `UDP`.
     * 
     */
    private final String protocol;

    @CustomType.Constructor
    private GetContainerGroupsGroupInitContainerPort(
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("protocol") String protocol) {
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * @return The port number. Valid values: 1 to 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Valid values: `TCP` and `UDP`.
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerGroupsGroupInitContainerPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerGroupsGroupInitContainerPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }        public GetContainerGroupsGroupInitContainerPort build() {
            return new GetContainerGroupsGroupInitContainerPort(port, protocol);
        }
    }
}