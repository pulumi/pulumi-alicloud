// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationLoadBalancersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationLoadBalancersPlainArgs Empty = new GetApplicationLoadBalancersPlainArgs();

    /**
     * Service address of the SLBs.
     * 
     */
    @Import(name="address")
    private @Nullable String address;

    /**
     * @return Service address of the SLBs.
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The address ip version. Valid values `ipv4` and `ipv6`.
     * 
     */
    @Import(name="addressIpVersion")
    private @Nullable String addressIpVersion;

    /**
     * @return The address ip version. Valid values `ipv4` and `ipv6`.
     * 
     */
    public Optional<String> addressIpVersion() {
        return Optional.ofNullable(this.addressIpVersion);
    }

    /**
     * The address type of the SLB. Valid values `internet` and `intranet`.
     * 
     */
    @Import(name="addressType")
    private @Nullable String addressType;

    /**
     * @return The address type of the SLB. Valid values `internet` and `intranet`.
     * 
     */
    public Optional<String> addressType() {
        return Optional.ofNullable(this.addressType);
    }

    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of SLBs IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of SLBs IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The internet charge type. Valid values `PayByBandwidth` and `PayByTraffic`.
     * 
     */
    @Import(name="internetChargeType")
    private @Nullable String internetChargeType;

    /**
     * @return The internet charge type. Valid values `PayByBandwidth` and `PayByTraffic`.
     * 
     */
    public Optional<String> internetChargeType() {
        return Optional.ofNullable(this.internetChargeType);
    }

    /**
     * The name of the SLB.
     * 
     */
    @Import(name="loadBalancerName")
    private @Nullable String loadBalancerName;

    /**
     * @return The name of the SLB.
     * 
     */
    public Optional<String> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }

    /**
     * The master zone id of the SLB.
     * 
     */
    @Import(name="masterZoneId")
    private @Nullable String masterZoneId;

    /**
     * @return The master zone id of the SLB.
     * 
     */
    public Optional<String> masterZoneId() {
        return Optional.ofNullable(this.masterZoneId);
    }

    /**
     * A regex string to filter results by SLB name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by SLB name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * Network type of the SLBs. Valid values: `vpc` and `classic`.
     * 
     */
    @Import(name="networkType")
    private @Nullable String networkType;

    /**
     * @return Network type of the SLBs. Valid values: `vpc` and `classic`.
     * 
     */
    public Optional<String> networkType() {
        return Optional.ofNullable(this.networkType);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The payment type of SLB. Valid values `PayAsYouGo` and `Subscription`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable String paymentType;

    /**
     * @return The payment type of SLB. Valid values `PayAsYouGo` and `Subscription`.
     * 
     */
    public Optional<String> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The Id of resource group which SLB belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The Id of resource group which SLB belongs.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The server ID.
     * 
     */
    @Import(name="serverId")
    private @Nullable String serverId;

    /**
     * @return The server ID.
     * 
     */
    public Optional<String> serverId() {
        return Optional.ofNullable(this.serverId);
    }

    /**
     * The server intranet address.
     * 
     */
    @Import(name="serverIntranetAddress")
    private @Nullable String serverIntranetAddress;

    /**
     * @return The server intranet address.
     * 
     */
    public Optional<String> serverIntranetAddress() {
        return Optional.ofNullable(this.serverIntranetAddress);
    }

    /**
     * The slave zone id of the SLB.
     * 
     */
    @Import(name="slaveZoneId")
    private @Nullable String slaveZoneId;

    /**
     * @return The slave zone id of the SLB.
     * 
     */
    public Optional<String> slaveZoneId() {
        return Optional.ofNullable(this.slaveZoneId);
    }

    /**
     * SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return SLB current status. Possible values: `inactive`, `active` and `locked`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    /**
     * @return A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * ID of the VPC linked to the SLBs.
     * 
     */
    @Import(name="vpcId")
    private @Nullable String vpcId;

    /**
     * @return ID of the VPC linked to the SLBs.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * ID of the VSwitch linked to the SLBs.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable String vswitchId;

    /**
     * @return ID of the VSwitch linked to the SLBs.
     * 
     */
    public Optional<String> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private GetApplicationLoadBalancersPlainArgs() {}

    private GetApplicationLoadBalancersPlainArgs(GetApplicationLoadBalancersPlainArgs $) {
        this.address = $.address;
        this.addressIpVersion = $.addressIpVersion;
        this.addressType = $.addressType;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.internetChargeType = $.internetChargeType;
        this.loadBalancerName = $.loadBalancerName;
        this.masterZoneId = $.masterZoneId;
        this.nameRegex = $.nameRegex;
        this.networkType = $.networkType;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.paymentType = $.paymentType;
        this.resourceGroupId = $.resourceGroupId;
        this.serverId = $.serverId;
        this.serverIntranetAddress = $.serverIntranetAddress;
        this.slaveZoneId = $.slaveZoneId;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationLoadBalancersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationLoadBalancersPlainArgs $;

        public Builder() {
            $ = new GetApplicationLoadBalancersPlainArgs();
        }

        public Builder(GetApplicationLoadBalancersPlainArgs defaults) {
            $ = new GetApplicationLoadBalancersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address Service address of the SLBs.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable String address) {
            $.address = address;
            return this;
        }

        /**
         * @param addressIpVersion The address ip version. Valid values `ipv4` and `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder addressIpVersion(@Nullable String addressIpVersion) {
            $.addressIpVersion = addressIpVersion;
            return this;
        }

        /**
         * @param addressType The address type of the SLB. Valid values `internet` and `intranet`.
         * 
         * @return builder
         * 
         */
        public Builder addressType(@Nullable String addressType) {
            $.addressType = addressType;
            return this;
        }

        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of SLBs IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of SLBs IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param internetChargeType The internet charge type. Valid values `PayByBandwidth` and `PayByTraffic`.
         * 
         * @return builder
         * 
         */
        public Builder internetChargeType(@Nullable String internetChargeType) {
            $.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * @param loadBalancerName The name of the SLB.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * @param masterZoneId The master zone id of the SLB.
         * 
         * @return builder
         * 
         */
        public Builder masterZoneId(@Nullable String masterZoneId) {
            $.masterZoneId = masterZoneId;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by SLB name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param networkType Network type of the SLBs. Valid values: `vpc` and `classic`.
         * 
         * @return builder
         * 
         */
        public Builder networkType(@Nullable String networkType) {
            $.networkType = networkType;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param paymentType The payment type of SLB. Valid values `PayAsYouGo` and `Subscription`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable String paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param resourceGroupId The Id of resource group which SLB belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param serverId The server ID.
         * 
         * @return builder
         * 
         */
        public Builder serverId(@Nullable String serverId) {
            $.serverId = serverId;
            return this;
        }

        /**
         * @param serverIntranetAddress The server intranet address.
         * 
         * @return builder
         * 
         */
        public Builder serverIntranetAddress(@Nullable String serverIntranetAddress) {
            $.serverIntranetAddress = serverIntranetAddress;
            return this;
        }

        /**
         * @param slaveZoneId The slave zone id of the SLB.
         * 
         * @return builder
         * 
         */
        public Builder slaveZoneId(@Nullable String slaveZoneId) {
            $.slaveZoneId = slaveZoneId;
            return this;
        }

        /**
         * @param status SLB current status. Possible values: `inactive`, `active` and `locked`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the SLB instances. The `tags` can have a maximum of 5 tag. It must be in the format:
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param vpcId ID of the VPC linked to the SLBs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vswitchId ID of the VSwitch linked to the SLBs.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable String vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        public GetApplicationLoadBalancersPlainArgs build() {
            return $;
        }
    }

}