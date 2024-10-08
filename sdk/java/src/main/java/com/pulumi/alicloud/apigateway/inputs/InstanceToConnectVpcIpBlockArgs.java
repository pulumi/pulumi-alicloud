// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceToConnectVpcIpBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceToConnectVpcIpBlockArgs Empty = new InstanceToConnectVpcIpBlockArgs();

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
     * Specifies whether the IP block is customized.
     * 
     */
    @Import(name="customized")
    private @Nullable Output<Boolean> customized;

    /**
     * @return Specifies whether the IP block is customized.
     * 
     */
    public Optional<Output<Boolean>> customized() {
        return Optional.ofNullable(this.customized);
    }

    /**
     * The VSwitch ID.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The VSwitch ID.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    /**
     * The zone ID.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The zone ID.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private InstanceToConnectVpcIpBlockArgs() {}

    private InstanceToConnectVpcIpBlockArgs(InstanceToConnectVpcIpBlockArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.customized = $.customized;
        this.vswitchId = $.vswitchId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceToConnectVpcIpBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceToConnectVpcIpBlockArgs $;

        public Builder() {
            $ = new InstanceToConnectVpcIpBlockArgs();
        }

        public Builder(InstanceToConnectVpcIpBlockArgs defaults) {
            $ = new InstanceToConnectVpcIpBlockArgs(Objects.requireNonNull(defaults));
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
         * @param customized Specifies whether the IP block is customized.
         * 
         * @return builder
         * 
         */
        public Builder customized(@Nullable Output<Boolean> customized) {
            $.customized = customized;
            return this;
        }

        /**
         * @param customized Specifies whether the IP block is customized.
         * 
         * @return builder
         * 
         */
        public Builder customized(Boolean customized) {
            return customized(Output.of(customized));
        }

        /**
         * @param vswitchId The VSwitch ID.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
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
        public Builder zoneId(@Nullable Output<String> zoneId) {
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

        public InstanceToConnectVpcIpBlockArgs build() {
            if ($.cidrBlock == null) {
                throw new MissingRequiredPropertyException("InstanceToConnectVpcIpBlockArgs", "cidrBlock");
            }
            return $;
        }
    }

}
