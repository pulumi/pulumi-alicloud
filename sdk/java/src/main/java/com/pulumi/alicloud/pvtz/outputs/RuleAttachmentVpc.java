// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleAttachmentVpc {
    /**
     * @return The region of the vpc. If not set, the current region will instead of.
     * 
     */
    private String regionId;
    /**
     * @return The ID of the VPC.  **NOTE:** The VPC that can be associated with the forwarding rule must belong to the same region as the Endpoint.
     * 
     */
    private String vpcId;

    private RuleAttachmentVpc() {}
    /**
     * @return The region of the vpc. If not set, the current region will instead of.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return The ID of the VPC.  **NOTE:** The VPC that can be associated with the forwarding rule must belong to the same region as the Endpoint.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleAttachmentVpc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String regionId;
        private String vpcId;
        public Builder() {}
        public Builder(RuleAttachmentVpc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionId = defaults.regionId;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder regionId(String regionId) {
            if (regionId == null) {
              throw new MissingRequiredPropertyException("RuleAttachmentVpc", "regionId");
            }
            this.regionId = regionId;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("RuleAttachmentVpc", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        public RuleAttachmentVpc build() {
            final var _resultValue = new RuleAttachmentVpc();
            _resultValue.regionId = regionId;
            _resultValue.vpcId = vpcId;
            return _resultValue;
        }
    }
}