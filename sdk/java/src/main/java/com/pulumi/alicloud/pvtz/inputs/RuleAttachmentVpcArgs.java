// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class RuleAttachmentVpcArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleAttachmentVpcArgs Empty = new RuleAttachmentVpcArgs();

    /**
     * The region of the vpc. If not set, the current region will instead of.
     * 
     */
    @Import(name="regionId", required=true)
    private Output<String> regionId;

    /**
     * @return The region of the vpc. If not set, the current region will instead of.
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
    }

    /**
     * The ID of the VPC.  **NOTE:** The VPC that can be associated with the forwarding rule must belong to the same region as the Endpoint.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.  **NOTE:** The VPC that can be associated with the forwarding rule must belong to the same region as the Endpoint.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    private RuleAttachmentVpcArgs() {}

    private RuleAttachmentVpcArgs(RuleAttachmentVpcArgs $) {
        this.regionId = $.regionId;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleAttachmentVpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleAttachmentVpcArgs $;

        public Builder() {
            $ = new RuleAttachmentVpcArgs();
        }

        public Builder(RuleAttachmentVpcArgs defaults) {
            $ = new RuleAttachmentVpcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param regionId The region of the vpc. If not set, the current region will instead of.
         * 
         * @return builder
         * 
         */
        public Builder regionId(Output<String> regionId) {
            $.regionId = regionId;
            return this;
        }

        /**
         * @param regionId The region of the vpc. If not set, the current region will instead of.
         * 
         * @return builder
         * 
         */
        public Builder regionId(String regionId) {
            return regionId(Output.of(regionId));
        }

        /**
         * @param vpcId The ID of the VPC.  **NOTE:** The VPC that can be associated with the forwarding rule must belong to the same region as the Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC.  **NOTE:** The VPC that can be associated with the forwarding rule must belong to the same region as the Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public RuleAttachmentVpcArgs build() {
            if ($.regionId == null) {
                throw new MissingRequiredPropertyException("RuleAttachmentVpcArgs", "regionId");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("RuleAttachmentVpcArgs", "vpcId");
            }
            return $;
        }
    }

}