// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBackendServersBackendServer {
    /**
     * @return backend server ID.
     * 
     */
    private final String id;
    /**
     * @return Type of the backend server.
     * 
     */
    private final String serverType;
    /**
     * @return Weight associated to the ECS instance.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private GetBackendServersBackendServer(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("serverType") String serverType,
        @CustomType.Parameter("weight") Integer weight) {
        this.id = id;
        this.serverType = serverType;
        this.weight = weight;
    }

    /**
     * @return backend server ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Type of the backend server.
     * 
     */
    public String serverType() {
        return this.serverType;
    }
    /**
     * @return Weight associated to the ECS instance.
     * 
     */
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServersBackendServer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String serverType;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServersBackendServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.serverType = defaults.serverType;
    	      this.weight = defaults.weight;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder serverType(String serverType) {
            this.serverType = Objects.requireNonNull(serverType);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public GetBackendServersBackendServer build() {
            return new GetBackendServersBackendServer(id, serverType, weight);
        }
    }
}