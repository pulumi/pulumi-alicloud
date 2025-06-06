// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ControlPolicyAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final ControlPolicyAttachmentState Empty = new ControlPolicyAttachmentState();

    /**
     * The ID of the access control policy.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return The ID of the access control policy.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * The ID of the object to which you want to attach the access control policy.
     * 
     */
    @Import(name="targetId")
    private @Nullable Output<String> targetId;

    /**
     * @return The ID of the object to which you want to attach the access control policy.
     * 
     */
    public Optional<Output<String>> targetId() {
        return Optional.ofNullable(this.targetId);
    }

    private ControlPolicyAttachmentState() {}

    private ControlPolicyAttachmentState(ControlPolicyAttachmentState $) {
        this.policyId = $.policyId;
        this.targetId = $.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ControlPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ControlPolicyAttachmentState $;

        public Builder() {
            $ = new ControlPolicyAttachmentState();
        }

        public Builder(ControlPolicyAttachmentState defaults) {
            $ = new ControlPolicyAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyId The ID of the access control policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The ID of the access control policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param targetId The ID of the object to which you want to attach the access control policy.
         * 
         * @return builder
         * 
         */
        public Builder targetId(@Nullable Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId The ID of the object to which you want to attach the access control policy.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        public ControlPolicyAttachmentState build() {
            return $;
        }
    }

}
