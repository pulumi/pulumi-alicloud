// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAclEntriesIngressArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAclEntriesIngressArgs Empty = new NetworkAclEntriesIngressArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="entryType")
    private @Nullable Output<String> entryType;

    public Optional<Output<String>> entryType() {
        return Optional.ofNullable(this.entryType);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="policy")
    private @Nullable Output<String> policy;

    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    @Import(name="port")
    private @Nullable Output<String> port;

    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * The source ip of the ingress entry.
     * 
     */
    @Import(name="sourceCidrIp")
    private @Nullable Output<String> sourceCidrIp;

    /**
     * @return The source ip of the ingress entry.
     * 
     */
    public Optional<Output<String>> sourceCidrIp() {
        return Optional.ofNullable(this.sourceCidrIp);
    }

    private NetworkAclEntriesIngressArgs() {}

    private NetworkAclEntriesIngressArgs(NetworkAclEntriesIngressArgs $) {
        this.description = $.description;
        this.entryType = $.entryType;
        this.name = $.name;
        this.policy = $.policy;
        this.port = $.port;
        this.protocol = $.protocol;
        this.sourceCidrIp = $.sourceCidrIp;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAclEntriesIngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAclEntriesIngressArgs $;

        public Builder() {
            $ = new NetworkAclEntriesIngressArgs();
        }

        public Builder(NetworkAclEntriesIngressArgs defaults) {
            $ = new NetworkAclEntriesIngressArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder entryType(@Nullable Output<String> entryType) {
            $.entryType = entryType;
            return this;
        }

        public Builder entryType(String entryType) {
            return entryType(Output.of(entryType));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        public Builder port(String port) {
            return port(Output.of(port));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param sourceCidrIp The source ip of the ingress entry.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidrIp(@Nullable Output<String> sourceCidrIp) {
            $.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * @param sourceCidrIp The source ip of the ingress entry.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            return sourceCidrIp(Output.of(sourceCidrIp));
        }

        public NetworkAclEntriesIngressArgs build() {
            return $;
        }
    }

}
