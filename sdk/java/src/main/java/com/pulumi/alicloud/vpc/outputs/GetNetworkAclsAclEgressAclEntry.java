// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkAclsAclEgressAclEntry {
    /**
     * @return Description of the entry direction rule.
     * 
     */
    private final String description;
    /**
     * @return The destination address segment.
     * 
     */
    private final String destinationCidrIp;
    /**
     * @return The name of the entry direction rule entry.
     * 
     */
    private final String networkAclEntryName;
    /**
     * @return The authorization policy.
     * 
     */
    private final String policy;
    /**
     * @return Source port range.
     * 
     */
    private final String port;
    /**
     * @return Transport layer protocol.
     * 
     */
    private final String protocol;

    @CustomType.Constructor
    private GetNetworkAclsAclEgressAclEntry(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("destinationCidrIp") String destinationCidrIp,
        @CustomType.Parameter("networkAclEntryName") String networkAclEntryName,
        @CustomType.Parameter("policy") String policy,
        @CustomType.Parameter("port") String port,
        @CustomType.Parameter("protocol") String protocol) {
        this.description = description;
        this.destinationCidrIp = destinationCidrIp;
        this.networkAclEntryName = networkAclEntryName;
        this.policy = policy;
        this.port = port;
        this.protocol = protocol;
    }

    /**
     * @return Description of the entry direction rule.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The destination address segment.
     * 
     */
    public String destinationCidrIp() {
        return this.destinationCidrIp;
    }
    /**
     * @return The name of the entry direction rule entry.
     * 
     */
    public String networkAclEntryName() {
        return this.networkAclEntryName;
    }
    /**
     * @return The authorization policy.
     * 
     */
    public String policy() {
        return this.policy;
    }
    /**
     * @return Source port range.
     * 
     */
    public String port() {
        return this.port;
    }
    /**
     * @return Transport layer protocol.
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAclsAclEgressAclEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String destinationCidrIp;
        private String networkAclEntryName;
        private String policy;
        private String port;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkAclsAclEgressAclEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationCidrIp = defaults.destinationCidrIp;
    	      this.networkAclEntryName = defaults.networkAclEntryName;
    	      this.policy = defaults.policy;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder destinationCidrIp(String destinationCidrIp) {
            this.destinationCidrIp = Objects.requireNonNull(destinationCidrIp);
            return this;
        }
        public Builder networkAclEntryName(String networkAclEntryName) {
            this.networkAclEntryName = Objects.requireNonNull(networkAclEntryName);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }        public GetNetworkAclsAclEgressAclEntry build() {
            return new GetNetworkAclsAclEgressAclEntry(description, destinationCidrIp, networkAclEntryName, policy, port, protocol);
        }
    }
}