// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ControlPolicyAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ControlPolicyAttachmentArgs Empty = new ControlPolicyAttachmentArgs();

    /**
     * The ID of control policy.
     * 
     */
    @Import(name="policyId", required=true)
    private Output<String> policyId;

    /**
     * @return The ID of control policy.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     * The ID of target.
     * 
     */
    @Import(name="targetId", required=true)
    private Output<String> targetId;

    /**
     * @return The ID of target.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }

    private ControlPolicyAttachmentArgs() {}

    private ControlPolicyAttachmentArgs(ControlPolicyAttachmentArgs $) {
        this.policyId = $.policyId;
        this.targetId = $.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ControlPolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ControlPolicyAttachmentArgs $;

        public Builder() {
            $ = new ControlPolicyAttachmentArgs();
        }

        public Builder(ControlPolicyAttachmentArgs defaults) {
            $ = new ControlPolicyAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyId The ID of control policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The ID of control policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param targetId The ID of target.
         * 
         * @return builder
         * 
         */
        public Builder targetId(Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId The ID of target.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        public ControlPolicyAttachmentArgs build() {
            if ($.policyId == null) {
                throw new MissingRequiredPropertyException("ControlPolicyAttachmentArgs", "policyId");
            }
            if ($.targetId == null) {
                throw new MissingRequiredPropertyException("ControlPolicyAttachmentArgs", "targetId");
            }
            return $;
        }
    }

}