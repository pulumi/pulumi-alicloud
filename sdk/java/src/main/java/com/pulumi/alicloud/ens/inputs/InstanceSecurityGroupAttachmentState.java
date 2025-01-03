// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceSecurityGroupAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceSecurityGroupAttachmentState Empty = new InstanceSecurityGroupAttachmentState();

    /**
     * Instance ID.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return Instance ID.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Security group ID.
     * 
     */
    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    /**
     * @return Security group ID.
     * 
     */
    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    private InstanceSecurityGroupAttachmentState() {}

    private InstanceSecurityGroupAttachmentState(InstanceSecurityGroupAttachmentState $) {
        this.instanceId = $.instanceId;
        this.securityGroupId = $.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceSecurityGroupAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceSecurityGroupAttachmentState $;

        public Builder() {
            $ = new InstanceSecurityGroupAttachmentState();
        }

        public Builder(InstanceSecurityGroupAttachmentState defaults) {
            $ = new InstanceSecurityGroupAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId Instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param securityGroupId Security group ID.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId Security group ID.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        public InstanceSecurityGroupAttachmentState build() {
            return $;
        }
    }

}
