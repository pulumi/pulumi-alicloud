// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.alicloud.cen.outputs.GetInterRegionTrafficQosPoliciesPolicy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInterRegionTrafficQosPoliciesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of Inter Region Traffic Qos Policy names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return A list of Cen Inter Region Traffic Qos Policies. Each element contains the following attributes:
     * 
     */
    private List<GetInterRegionTrafficQosPoliciesPolicy> policies;
    /**
     * @return The status of the Inter Region Traffic Qos Policy.
     * 
     */
    private @Nullable String status;
    private @Nullable String trafficQosPolicyDescription;
    private @Nullable String trafficQosPolicyId;
    private @Nullable String trafficQosPolicyName;
    /**
     * @return The ID of the inter-region connection.
     * 
     */
    private String transitRouterAttachmentId;
    /**
     * @return The ID of the transit router.
     * 
     */
    private String transitRouterId;

    private GetInterRegionTrafficQosPoliciesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of Inter Region Traffic Qos Policy names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return A list of Cen Inter Region Traffic Qos Policies. Each element contains the following attributes:
     * 
     */
    public List<GetInterRegionTrafficQosPoliciesPolicy> policies() {
        return this.policies;
    }
    /**
     * @return The status of the Inter Region Traffic Qos Policy.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> trafficQosPolicyDescription() {
        return Optional.ofNullable(this.trafficQosPolicyDescription);
    }
    public Optional<String> trafficQosPolicyId() {
        return Optional.ofNullable(this.trafficQosPolicyId);
    }
    public Optional<String> trafficQosPolicyName() {
        return Optional.ofNullable(this.trafficQosPolicyName);
    }
    /**
     * @return The ID of the inter-region connection.
     * 
     */
    public String transitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }
    /**
     * @return The ID of the transit router.
     * 
     */
    public String transitRouterId() {
        return this.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInterRegionTrafficQosPoliciesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetInterRegionTrafficQosPoliciesPolicy> policies;
        private @Nullable String status;
        private @Nullable String trafficQosPolicyDescription;
        private @Nullable String trafficQosPolicyId;
        private @Nullable String trafficQosPolicyName;
        private String transitRouterAttachmentId;
        private String transitRouterId;
        public Builder() {}
        public Builder(GetInterRegionTrafficQosPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.policies = defaults.policies;
    	      this.status = defaults.status;
    	      this.trafficQosPolicyDescription = defaults.trafficQosPolicyDescription;
    	      this.trafficQosPolicyId = defaults.trafficQosPolicyId;
    	      this.trafficQosPolicyName = defaults.trafficQosPolicyName;
    	      this.transitRouterAttachmentId = defaults.transitRouterAttachmentId;
    	      this.transitRouterId = defaults.transitRouterId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInterRegionTrafficQosPoliciesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetInterRegionTrafficQosPoliciesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetInterRegionTrafficQosPoliciesResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder policies(List<GetInterRegionTrafficQosPoliciesPolicy> policies) {
            if (policies == null) {
              throw new MissingRequiredPropertyException("GetInterRegionTrafficQosPoliciesResult", "policies");
            }
            this.policies = policies;
            return this;
        }
        public Builder policies(GetInterRegionTrafficQosPoliciesPolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder trafficQosPolicyDescription(@Nullable String trafficQosPolicyDescription) {

            this.trafficQosPolicyDescription = trafficQosPolicyDescription;
            return this;
        }
        @CustomType.Setter
        public Builder trafficQosPolicyId(@Nullable String trafficQosPolicyId) {

            this.trafficQosPolicyId = trafficQosPolicyId;
            return this;
        }
        @CustomType.Setter
        public Builder trafficQosPolicyName(@Nullable String trafficQosPolicyName) {

            this.trafficQosPolicyName = trafficQosPolicyName;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            if (transitRouterAttachmentId == null) {
              throw new MissingRequiredPropertyException("GetInterRegionTrafficQosPoliciesResult", "transitRouterAttachmentId");
            }
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        @CustomType.Setter
        public Builder transitRouterId(String transitRouterId) {
            if (transitRouterId == null) {
              throw new MissingRequiredPropertyException("GetInterRegionTrafficQosPoliciesResult", "transitRouterId");
            }
            this.transitRouterId = transitRouterId;
            return this;
        }
        public GetInterRegionTrafficQosPoliciesResult build() {
            final var _resultValue = new GetInterRegionTrafficQosPoliciesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.policies = policies;
            _resultValue.status = status;
            _resultValue.trafficQosPolicyDescription = trafficQosPolicyDescription;
            _resultValue.trafficQosPolicyId = trafficQosPolicyId;
            _resultValue.trafficQosPolicyName = trafficQosPolicyName;
            _resultValue.transitRouterAttachmentId = transitRouterAttachmentId;
            _resultValue.transitRouterId = transitRouterId;
            return _resultValue;
        }
    }
}