// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPolicyGroupsGroupAuthorizeAccessPolicyRule {
    /**
     * @return The cidrip of security rules.
     * 
     */
    private final String cidrIp;
    /**
     * @return The description of security rules.
     * 
     */
    private final String description;

    @CustomType.Constructor
    private GetPolicyGroupsGroupAuthorizeAccessPolicyRule(
        @CustomType.Parameter("cidrIp") String cidrIp,
        @CustomType.Parameter("description") String description) {
        this.cidrIp = cidrIp;
        this.description = description;
    }

    /**
     * @return The cidrip of security rules.
     * 
     */
    public String cidrIp() {
        return this.cidrIp;
    }
    /**
     * @return The description of security rules.
     * 
     */
    public String description() {
        return this.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyGroupsGroupAuthorizeAccessPolicyRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidrIp;
        private String description;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyGroupsGroupAuthorizeAccessPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrIp = defaults.cidrIp;
    	      this.description = defaults.description;
        }

        public Builder cidrIp(String cidrIp) {
            this.cidrIp = Objects.requireNonNull(cidrIp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }        public GetPolicyGroupsGroupAuthorizeAccessPolicyRule build() {
            return new GetPolicyGroupsGroupAuthorizeAccessPolicyRule(cidrIp, description);
        }
    }
}