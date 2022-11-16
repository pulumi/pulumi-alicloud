// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkAclEntriesIngress {
    /**
     * @return The description of the egress entry.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The entry type of the egress entry. It must be `custom` or `system`. Default value is `custom`.
     * 
     */
    private final @Nullable String entryType;
    /**
     * @return The name of the egress entry.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The policy of the egress entry. It must be `accept` or `drop`.
     * 
     */
    private final @Nullable String policy;
    /**
     * @return The port of the egress entry.
     * 
     */
    private final @Nullable String port;
    /**
     * @return The protocol of the egress entry.
     * 
     */
    private final @Nullable String protocol;
    /**
     * @return The source ip of the ingress entry.
     * 
     */
    private final @Nullable String sourceCidrIp;

    @CustomType.Constructor
    private NetworkAclEntriesIngress(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("entryType") @Nullable String entryType,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("policy") @Nullable String policy,
        @CustomType.Parameter("port") @Nullable String port,
        @CustomType.Parameter("protocol") @Nullable String protocol,
        @CustomType.Parameter("sourceCidrIp") @Nullable String sourceCidrIp) {
        this.description = description;
        this.entryType = entryType;
        this.name = name;
        this.policy = policy;
        this.port = port;
        this.protocol = protocol;
        this.sourceCidrIp = sourceCidrIp;
    }

    /**
     * @return The description of the egress entry.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The entry type of the egress entry. It must be `custom` or `system`. Default value is `custom`.
     * 
     */
    public Optional<String> entryType() {
        return Optional.ofNullable(this.entryType);
    }
    /**
     * @return The name of the egress entry.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The policy of the egress entry. It must be `accept` or `drop`.
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return The port of the egress entry.
     * 
     */
    public Optional<String> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The protocol of the egress entry.
     * 
     */
    public Optional<String> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * @return The source ip of the ingress entry.
     * 
     */
    public Optional<String> sourceCidrIp() {
        return Optional.ofNullable(this.sourceCidrIp);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkAclEntriesIngress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String entryType;
        private @Nullable String name;
        private @Nullable String policy;
        private @Nullable String port;
        private @Nullable String protocol;
        private @Nullable String sourceCidrIp;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkAclEntriesIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.entryType = defaults.entryType;
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sourceCidrIp = defaults.sourceCidrIp;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder entryType(@Nullable String entryType) {
            this.entryType = entryType;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = policy;
            return this;
        }
        public Builder port(@Nullable String port) {
            this.port = port;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder sourceCidrIp(@Nullable String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }        public NetworkAclEntriesIngress build() {
            return new NetworkAclEntriesIngress(description, entryType, name, policy, port, protocol, sourceCidrIp);
        }
    }
}