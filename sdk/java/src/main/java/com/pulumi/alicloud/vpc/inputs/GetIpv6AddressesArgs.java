// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpv6AddressesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpv6AddressesArgs Empty = new GetIpv6AddressesArgs();

    /**
     * The ID of the instance that is assigned the IPv6 address.
     * 
     */
    @Import(name="associatedInstanceId")
    private @Nullable Output<String> associatedInstanceId;

    /**
     * @return The ID of the instance that is assigned the IPv6 address.
     * 
     */
    public Optional<Output<String>> associatedInstanceId() {
        return Optional.ofNullable(this.associatedInstanceId);
    }

    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the IPv6 address. Valid values:`Pending` or `Available`.
     * - `Pending`: The IPv6 address is being configured.
     * - `Available`: The IPv6 address is available.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the IPv6 address. Valid values:`Pending` or `Available`.
     * - `Pending`: The IPv6 address is being configured.
     * - `Available`: The IPv6 address is available.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the VPC to which the IPv6 address belongs.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the VPC to which the IPv6 address belongs.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The ID of the vSwitch to which the IPv6 address belongs.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The ID of the vSwitch to which the IPv6 address belongs.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private GetIpv6AddressesArgs() {}

    private GetIpv6AddressesArgs(GetIpv6AddressesArgs $) {
        this.associatedInstanceId = $.associatedInstanceId;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpv6AddressesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpv6AddressesArgs $;

        public Builder() {
            $ = new GetIpv6AddressesArgs();
        }

        public Builder(GetIpv6AddressesArgs defaults) {
            $ = new GetIpv6AddressesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param associatedInstanceId The ID of the instance that is assigned the IPv6 address.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstanceId(@Nullable Output<String> associatedInstanceId) {
            $.associatedInstanceId = associatedInstanceId;
            return this;
        }

        /**
         * @param associatedInstanceId The ID of the instance that is assigned the IPv6 address.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstanceId(String associatedInstanceId) {
            return associatedInstanceId(Output.of(associatedInstanceId));
        }

        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param status The status of the IPv6 address. Valid values:`Pending` or `Available`.
         * - `Pending`: The IPv6 address is being configured.
         * - `Available`: The IPv6 address is available.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the IPv6 address. Valid values:`Pending` or `Available`.
         * - `Pending`: The IPv6 address is being configured.
         * - `Available`: The IPv6 address is available.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vpcId The ID of the VPC to which the IPv6 address belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC to which the IPv6 address belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitchId The ID of the vSwitch to which the IPv6 address belongs.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the vSwitch to which the IPv6 address belongs.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public GetIpv6AddressesArgs build() {
            return $;
        }
    }

}