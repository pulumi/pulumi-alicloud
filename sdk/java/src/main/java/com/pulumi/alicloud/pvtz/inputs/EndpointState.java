// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.inputs;

import com.pulumi.alicloud.pvtz.inputs.EndpointIpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointState extends com.pulumi.resources.ResourceArgs {

    public static final EndpointState Empty = new EndpointState();

    /**
     * The name of the resource.
     * 
     */
    @Import(name="endpointName")
    private @Nullable Output<String> endpointName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<Output<String>> endpointName() {
        return Optional.ofNullable(this.endpointName);
    }

    /**
     * The Ip Configs. See `ip_configs` below. **NOTE:** In order to ensure high availability, add at least 2 and up to 6.
     * 
     */
    @Import(name="ipConfigs")
    private @Nullable Output<List<EndpointIpConfigArgs>> ipConfigs;

    /**
     * @return The Ip Configs. See `ip_configs` below. **NOTE:** In order to ensure high availability, add at least 2 and up to 6.
     * 
     */
    public Optional<Output<List<EndpointIpConfigArgs>>> ipConfigs() {
        return Optional.ofNullable(this.ipConfigs);
    }

    /**
     * The ID of the Security Group.
     * 
     */
    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    /**
     * @return The ID of the Security Group.
     * 
     */
    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    /**
     * The status of the resource. Valid values: `CHANGE_FAILED`, `CHANGE_INIT`, `EXCEPTION`, `FAILED`, `INIT`, `SUCCESS`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource. Valid values: `CHANGE_FAILED`, `CHANGE_INIT`, `EXCEPTION`, `FAILED`, `INIT`, `SUCCESS`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The VPC ID.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The VPC ID.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The Region of the VPC.
     * 
     */
    @Import(name="vpcRegionId")
    private @Nullable Output<String> vpcRegionId;

    /**
     * @return The Region of the VPC.
     * 
     */
    public Optional<Output<String>> vpcRegionId() {
        return Optional.ofNullable(this.vpcRegionId);
    }

    private EndpointState() {}

    private EndpointState(EndpointState $) {
        this.endpointName = $.endpointName;
        this.ipConfigs = $.ipConfigs;
        this.securityGroupId = $.securityGroupId;
        this.status = $.status;
        this.vpcId = $.vpcId;
        this.vpcRegionId = $.vpcRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointState $;

        public Builder() {
            $ = new EndpointState();
        }

        public Builder(EndpointState defaults) {
            $ = new EndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder endpointName(@Nullable Output<String> endpointName) {
            $.endpointName = endpointName;
            return this;
        }

        /**
         * @param endpointName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder endpointName(String endpointName) {
            return endpointName(Output.of(endpointName));
        }

        /**
         * @param ipConfigs The Ip Configs. See `ip_configs` below. **NOTE:** In order to ensure high availability, add at least 2 and up to 6.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigs(@Nullable Output<List<EndpointIpConfigArgs>> ipConfigs) {
            $.ipConfigs = ipConfigs;
            return this;
        }

        /**
         * @param ipConfigs The Ip Configs. See `ip_configs` below. **NOTE:** In order to ensure high availability, add at least 2 and up to 6.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigs(List<EndpointIpConfigArgs> ipConfigs) {
            return ipConfigs(Output.of(ipConfigs));
        }

        /**
         * @param ipConfigs The Ip Configs. See `ip_configs` below. **NOTE:** In order to ensure high availability, add at least 2 and up to 6.
         * 
         * @return builder
         * 
         */
        public Builder ipConfigs(EndpointIpConfigArgs... ipConfigs) {
            return ipConfigs(List.of(ipConfigs));
        }

        /**
         * @param securityGroupId The ID of the Security Group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId The ID of the Security Group.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param status The status of the resource. Valid values: `CHANGE_FAILED`, `CHANGE_INIT`, `EXCEPTION`, `FAILED`, `INIT`, `SUCCESS`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `CHANGE_FAILED`, `CHANGE_INIT`, `EXCEPTION`, `FAILED`, `INIT`, `SUCCESS`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vpcId The VPC ID.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The VPC ID.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vpcRegionId The Region of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcRegionId(@Nullable Output<String> vpcRegionId) {
            $.vpcRegionId = vpcRegionId;
            return this;
        }

        /**
         * @param vpcRegionId The Region of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcRegionId(String vpcRegionId) {
            return vpcRegionId(Output.of(vpcRegionId));
        }

        public EndpointState build() {
            return $;
        }
    }

}