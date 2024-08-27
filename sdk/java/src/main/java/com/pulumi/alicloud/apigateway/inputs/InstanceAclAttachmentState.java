// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceAclAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceAclAttachmentState Empty = new InstanceAclAttachmentState();

    /**
     * The ID of the ACL to attach.
     * 
     */
    @Import(name="aclId")
    private @Nullable Output<String> aclId;

    /**
     * @return The ID of the ACL to attach.
     * 
     */
    public Optional<Output<String>> aclId() {
        return Optional.ofNullable(this.aclId);
    }

    /**
     * The type of the ACL. Valid values: `white`, `black`.
     * 
     */
    @Import(name="aclType")
    private @Nullable Output<String> aclType;

    /**
     * @return The type of the ACL. Valid values: `white`, `black`.
     * 
     */
    public Optional<Output<String>> aclType() {
        return Optional.ofNullable(this.aclType);
    }

    /**
     * The ID of the API Gateway instance that the ACL will be attached to.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of the API Gateway instance that the ACL will be attached to.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    private InstanceAclAttachmentState() {}

    private InstanceAclAttachmentState(InstanceAclAttachmentState $) {
        this.aclId = $.aclId;
        this.aclType = $.aclType;
        this.instanceId = $.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceAclAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceAclAttachmentState $;

        public Builder() {
            $ = new InstanceAclAttachmentState();
        }

        public Builder(InstanceAclAttachmentState defaults) {
            $ = new InstanceAclAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclId The ID of the ACL to attach.
         * 
         * @return builder
         * 
         */
        public Builder aclId(@Nullable Output<String> aclId) {
            $.aclId = aclId;
            return this;
        }

        /**
         * @param aclId The ID of the ACL to attach.
         * 
         * @return builder
         * 
         */
        public Builder aclId(String aclId) {
            return aclId(Output.of(aclId));
        }

        /**
         * @param aclType The type of the ACL. Valid values: `white`, `black`.
         * 
         * @return builder
         * 
         */
        public Builder aclType(@Nullable Output<String> aclType) {
            $.aclType = aclType;
            return this;
        }

        /**
         * @param aclType The type of the ACL. Valid values: `white`, `black`.
         * 
         * @return builder
         * 
         */
        public Builder aclType(String aclType) {
            return aclType(Output.of(aclType));
        }

        /**
         * @param instanceId The ID of the API Gateway instance that the ACL will be attached to.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the API Gateway instance that the ACL will be attached to.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public InstanceAclAttachmentState build() {
            return $;
        }
    }

}