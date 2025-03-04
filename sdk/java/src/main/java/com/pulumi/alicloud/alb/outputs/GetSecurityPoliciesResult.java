// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.GetSecurityPoliciesPolicy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecurityPoliciesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private List<GetSecurityPoliciesPolicy> policies;
    private @Nullable String resourceGroupId;
    private @Nullable List<String> securityPolicyIds;
    private @Nullable String securityPolicyName;
    private @Nullable String status;
    private @Nullable Map<String,String> tags;

    private GetSecurityPoliciesResult() {}
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
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetSecurityPoliciesPolicy> policies() {
        return this.policies;
    }
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    public List<String> securityPolicyIds() {
        return this.securityPolicyIds == null ? List.of() : this.securityPolicyIds;
    }
    public Optional<String> securityPolicyName() {
        return Optional.ofNullable(this.securityPolicyName);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPoliciesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetSecurityPoliciesPolicy> policies;
        private @Nullable String resourceGroupId;
        private @Nullable List<String> securityPolicyIds;
        private @Nullable String securityPolicyName;
        private @Nullable String status;
        private @Nullable Map<String,String> tags;
        public Builder() {}
        public Builder(GetSecurityPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.policies = defaults.policies;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.securityPolicyIds = defaults.securityPolicyIds;
    	      this.securityPolicyName = defaults.securityPolicyName;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSecurityPoliciesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetSecurityPoliciesResult", "ids");
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
              throw new MissingRequiredPropertyException("GetSecurityPoliciesResult", "names");
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
        public Builder policies(List<GetSecurityPoliciesPolicy> policies) {
            if (policies == null) {
              throw new MissingRequiredPropertyException("GetSecurityPoliciesResult", "policies");
            }
            this.policies = policies;
            return this;
        }
        public Builder policies(GetSecurityPoliciesPolicy... policies) {
            return policies(List.of(policies));
        }
        @CustomType.Setter
        public Builder resourceGroupId(@Nullable String resourceGroupId) {

            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicyIds(@Nullable List<String> securityPolicyIds) {

            this.securityPolicyIds = securityPolicyIds;
            return this;
        }
        public Builder securityPolicyIds(String... securityPolicyIds) {
            return securityPolicyIds(List.of(securityPolicyIds));
        }
        @CustomType.Setter
        public Builder securityPolicyName(@Nullable String securityPolicyName) {

            this.securityPolicyName = securityPolicyName;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {

            this.tags = tags;
            return this;
        }
        public GetSecurityPoliciesResult build() {
            final var _resultValue = new GetSecurityPoliciesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.policies = policies;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.securityPolicyIds = securityPolicyIds;
            _resultValue.securityPolicyName = securityPolicyName;
            _resultValue.status = status;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}
