// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpcEndpointServiceUsersUser {
    /**
     * @return The ID of the Vpc Endpoint Service User.
     * 
     */
    private final String id;
    /**
     * @return The Id of Ram User.
     * 
     */
    private final String userId;

    @CustomType.Constructor
    private GetVpcEndpointServiceUsersUser(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("userId") String userId) {
        this.id = id;
        this.userId = userId;
    }

    /**
     * @return The ID of the Vpc Endpoint Service User.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Id of Ram User.
     * 
     */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointServiceUsersUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcEndpointServiceUsersUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.userId = defaults.userId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GetVpcEndpointServiceUsersUser build() {
            return new GetVpcEndpointServiceUsersUser(id, userId);
        }
    }
}