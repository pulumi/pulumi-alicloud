// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerSecurityGroupAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerSecurityGroupAttachmentState Empty = new LoadBalancerSecurityGroupAttachmentState();

    /**
     * The ID of the load balancing instance.
     * 
     */
    @Import(name="loadBalancerId")
    private @Nullable Output<String> loadBalancerId;

    /**
     * @return The ID of the load balancing instance.
     * 
     */
    public Optional<Output<String>> loadBalancerId() {
        return Optional.ofNullable(this.loadBalancerId);
    }

    /**
     * Security group ID collection.
     * 
     */
    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    /**
     * @return Security group ID collection.
     * 
     */
    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    private LoadBalancerSecurityGroupAttachmentState() {}

    private LoadBalancerSecurityGroupAttachmentState(LoadBalancerSecurityGroupAttachmentState $) {
        this.loadBalancerId = $.loadBalancerId;
        this.securityGroupId = $.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerSecurityGroupAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerSecurityGroupAttachmentState $;

        public Builder() {
            $ = new LoadBalancerSecurityGroupAttachmentState();
        }

        public Builder(LoadBalancerSecurityGroupAttachmentState defaults) {
            $ = new LoadBalancerSecurityGroupAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param loadBalancerId The ID of the load balancing instance.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(@Nullable Output<String> loadBalancerId) {
            $.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * @param loadBalancerId The ID of the load balancing instance.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerId(String loadBalancerId) {
            return loadBalancerId(Output.of(loadBalancerId));
        }

        /**
         * @param securityGroupId Security group ID collection.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId Security group ID collection.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        public LoadBalancerSecurityGroupAttachmentState build() {
            return $;
        }
    }

}
