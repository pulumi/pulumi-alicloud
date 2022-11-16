// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEcsLaunchTemplatesTemplateNetworkInterface {
    /**
     * @return System disk description.
     * 
     */
    private final String description;
    /**
     * @return System disk name.
     * 
     */
    private final String name;
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    private final String primaryIp;
    /**
     * @return The security group ID.
     * 
     */
    private final String securityGroupId;
    /**
     * @return The vswitch id.
     * 
     */
    private final String vswitchId;

    @CustomType.Constructor
    private GetEcsLaunchTemplatesTemplateNetworkInterface(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("primaryIp") String primaryIp,
        @CustomType.Parameter("securityGroupId") String securityGroupId,
        @CustomType.Parameter("vswitchId") String vswitchId) {
        this.description = description;
        this.name = name;
        this.primaryIp = primaryIp;
        this.securityGroupId = securityGroupId;
        this.vswitchId = vswitchId;
    }

    /**
     * @return System disk description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return System disk name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The primary private IP address of the ENI.
     * 
     */
    public String primaryIp() {
        return this.primaryIp;
    }
    /**
     * @return The security group ID.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * @return The vswitch id.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsLaunchTemplatesTemplateNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String name;
        private String primaryIp;
        private String securityGroupId;
        private String vswitchId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsLaunchTemplatesTemplateNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.primaryIp = defaults.primaryIp;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.vswitchId = defaults.vswitchId;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder primaryIp(String primaryIp) {
            this.primaryIp = Objects.requireNonNull(primaryIp);
            return this;
        }
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }        public GetEcsLaunchTemplatesTemplateNetworkInterface build() {
            return new GetEcsLaunchTemplatesTemplateNetworkInterface(description, name, primaryIp, securityGroupId, vswitchId);
        }
    }
}