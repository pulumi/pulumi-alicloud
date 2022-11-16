// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NatIpCidrState extends com.pulumi.resources.ResourceArgs {

    public static final NatIpCidrState Empty = new NatIpCidrState();

    /**
     * Specifies whether to precheck this request only. Valid values: `true` and `false`.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to precheck this request only. Valid values: `true` and `false`.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
     * 
     */
    @Import(name="natGatewayId")
    private @Nullable Output<String> natGatewayId;

    /**
     * @return The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
     * 
     */
    public Optional<Output<String>> natGatewayId() {
        return Optional.ofNullable(this.natGatewayId);
    }

    /**
     * The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
     * 
     */
    @Import(name="natIpCidr")
    private @Nullable Output<String> natIpCidr;

    /**
     * @return The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
     * 
     */
    public Optional<Output<String>> natIpCidr() {
        return Optional.ofNullable(this.natIpCidr);
    }

    /**
     * The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="natIpCidrDescription")
    private @Nullable Output<String> natIpCidrDescription;

    /**
     * @return The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> natIpCidrDescription() {
        return Optional.ofNullable(this.natIpCidrDescription);
    }

    /**
     * The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="natIpCidrName")
    private @Nullable Output<String> natIpCidrName;

    /**
     * @return The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> natIpCidrName() {
        return Optional.ofNullable(this.natIpCidrName);
    }

    /**
     * The status of the CIDR block of the NAT gateway. Valid values: `Available`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the CIDR block of the NAT gateway. Valid values: `Available`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private NatIpCidrState() {}

    private NatIpCidrState(NatIpCidrState $) {
        this.dryRun = $.dryRun;
        this.natGatewayId = $.natGatewayId;
        this.natIpCidr = $.natIpCidr;
        this.natIpCidrDescription = $.natIpCidrDescription;
        this.natIpCidrName = $.natIpCidrName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NatIpCidrState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NatIpCidrState $;

        public Builder() {
            $ = new NatIpCidrState();
        }

        public Builder(NatIpCidrState defaults) {
            $ = new NatIpCidrState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dryRun Specifies whether to precheck this request only. Valid values: `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to precheck this request only. Valid values: `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param natGatewayId The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayId(@Nullable Output<String> natGatewayId) {
            $.natGatewayId = natGatewayId;
            return this;
        }

        /**
         * @param natGatewayId The ID of the Virtual Private Cloud (VPC) NAT gateway where you want to create the NAT CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder natGatewayId(String natGatewayId) {
            return natGatewayId(Output.of(natGatewayId));
        }

        /**
         * @param natIpCidr The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
         * 
         * @return builder
         * 
         */
        public Builder natIpCidr(@Nullable Output<String> natIpCidr) {
            $.natIpCidr = natIpCidr;
            return this;
        }

        /**
         * @param natIpCidr The NAT CIDR block to be created. The CIDR block must meet the following conditions: It must be `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`, or one of their subnets. The subnet mask must be `16` to `32` bits in lengths. To use a public CIDR block as the NAT CIDR block, the VPC to which the VPC NAT gateway belongs must be authorized to use public CIDR blocks. For more information, see [Create a VPC NAT gateway](https://www.alibabacloud.com/help/doc-detail/268230.htm).
         * 
         * @return builder
         * 
         */
        public Builder natIpCidr(String natIpCidr) {
            return natIpCidr(Output.of(natIpCidr));
        }

        /**
         * @param natIpCidrDescription The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder natIpCidrDescription(@Nullable Output<String> natIpCidrDescription) {
            $.natIpCidrDescription = natIpCidrDescription;
            return this;
        }

        /**
         * @param natIpCidrDescription The description of the NAT CIDR block. The description must be `2` to `256` characters in length. It must start with a letter but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder natIpCidrDescription(String natIpCidrDescription) {
            return natIpCidrDescription(Output.of(natIpCidrDescription));
        }

        /**
         * @param natIpCidrName The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder natIpCidrName(@Nullable Output<String> natIpCidrName) {
            $.natIpCidrName = natIpCidrName;
            return this;
        }

        /**
         * @param natIpCidrName The name of the NAT CIDR block. The name must be `2` to `128` characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It must start with a letter but cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder natIpCidrName(String natIpCidrName) {
            return natIpCidrName(Output.of(natIpCidrName));
        }

        /**
         * @param status The status of the CIDR block of the NAT gateway. Valid values: `Available`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the CIDR block of the NAT gateway. Valid values: `Available`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public NatIpCidrState build() {
            return $;
        }
    }

}