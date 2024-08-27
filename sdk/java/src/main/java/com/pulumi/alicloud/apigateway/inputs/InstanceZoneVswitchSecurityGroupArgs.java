// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class InstanceZoneVswitchSecurityGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceZoneVswitchSecurityGroupArgs Empty = new InstanceZoneVswitchSecurityGroupArgs();

    /**
     * The CIDR block of the VSwitch.
     * 
     */
    @Import(name="cidrBlock", required=true)
    private Output<String> cidrBlock;

    /**
     * @return The CIDR block of the VSwitch.
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }

    /**
     * The ID of the security group.
     * 
     */
    @Import(name="securityGroup", required=true)
    private Output<String> securityGroup;

    /**
     * @return The ID of the security group.
     * 
     */
    public Output<String> securityGroup() {
        return this.securityGroup;
    }

    /**
     * The VSwitch ID.
     * 
     */
    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    /**
     * @return The VSwitch ID.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     * The zone ID.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone ID.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private InstanceZoneVswitchSecurityGroupArgs() {}

    private InstanceZoneVswitchSecurityGroupArgs(InstanceZoneVswitchSecurityGroupArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.securityGroup = $.securityGroup;
        this.vswitchId = $.vswitchId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceZoneVswitchSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceZoneVswitchSecurityGroupArgs $;

        public Builder() {
            $ = new InstanceZoneVswitchSecurityGroupArgs();
        }

        public Builder(InstanceZoneVswitchSecurityGroupArgs defaults) {
            $ = new InstanceZoneVswitchSecurityGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlock The CIDR block of the VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The CIDR block of the VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param securityGroup The ID of the security group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroup(Output<String> securityGroup) {
            $.securityGroup = securityGroup;
            return this;
        }

        /**
         * @param securityGroup The ID of the security group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroup(String securityGroup) {
            return securityGroup(Output.of(securityGroup));
        }

        /**
         * @param vswitchId The VSwitch ID.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The VSwitch ID.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        /**
         * @param zoneId The zone ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone ID.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public InstanceZoneVswitchSecurityGroupArgs build() {
            if ($.cidrBlock == null) {
                throw new MissingRequiredPropertyException("InstanceZoneVswitchSecurityGroupArgs", "cidrBlock");
            }
            if ($.securityGroup == null) {
                throw new MissingRequiredPropertyException("InstanceZoneVswitchSecurityGroupArgs", "securityGroup");
            }
            if ($.vswitchId == null) {
                throw new MissingRequiredPropertyException("InstanceZoneVswitchSecurityGroupArgs", "vswitchId");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("InstanceZoneVswitchSecurityGroupArgs", "zoneId");
            }
            return $;
        }
    }

}