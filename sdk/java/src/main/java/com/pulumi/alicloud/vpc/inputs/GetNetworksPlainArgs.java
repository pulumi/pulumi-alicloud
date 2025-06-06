// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworksPlainArgs Empty = new GetNetworksPlainArgs();

    /**
     * Filter results by a specific CIDR block. For example: &#34;172.16.0.0/12&#34;.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable String cidrBlock;

    /**
     * @return Filter results by a specific CIDR block. For example: &#34;172.16.0.0/12&#34;.
     * 
     */
    public Optional<String> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * The ID of dhcp options set.
     * 
     */
    @Import(name="dhcpOptionsSetId")
    private @Nullable String dhcpOptionsSetId;

    /**
     * @return The ID of dhcp options set.
     * 
     */
    public Optional<String> dhcpOptionsSetId() {
        return Optional.ofNullable(this.dhcpOptionsSetId);
    }

    /**
     * Indicates whether to check this request only. Valid values: `true` and `false`.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Boolean dryRun;

    /**
     * @return Indicates whether to check this request only. Valid values: `true` and `false`.
     * 
     */
    public Optional<Boolean> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * Default to `true`. Set it to true can output the `route_table_id`.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `true`. Set it to true can output the `route_table_id`.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of VPC IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of VPC IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Indicate whether the VPC is the default one in the specified region.
     * 
     */
    @Import(name="isDefault")
    private @Nullable Boolean isDefault;

    /**
     * @return Indicate whether the VPC is the default one in the specified region.
     * 
     */
    public Optional<Boolean> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * A regex string to filter VPCs by name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter VPCs by name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
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
     * The Id of resource group which VPC belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The Id of resource group which VPC belongs.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * Filter results by a specific status. Valid value are `Pending` and `Available`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Filter results by a specific status. Valid value are `Pending` and `Available`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the VPC.
     * 
     */
    @Import(name="vpcName")
    private @Nullable String vpcName;

    /**
     * @return The name of the VPC.
     * 
     */
    public Optional<String> vpcName() {
        return Optional.ofNullable(this.vpcName);
    }

    /**
     * The owner ID of VPC.
     * 
     */
    @Import(name="vpcOwnerId")
    private @Nullable Integer vpcOwnerId;

    /**
     * @return The owner ID of VPC.
     * 
     */
    public Optional<Integer> vpcOwnerId() {
        return Optional.ofNullable(this.vpcOwnerId);
    }

    /**
     * Filter results by the specified vSwitch.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable String vswitchId;

    /**
     * @return Filter results by the specified vSwitch.
     * 
     */
    public Optional<String> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private GetNetworksPlainArgs() {}

    private GetNetworksPlainArgs(GetNetworksPlainArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.dhcpOptionsSetId = $.dhcpOptionsSetId;
        this.dryRun = $.dryRun;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.isDefault = $.isDefault;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcName = $.vpcName;
        this.vpcOwnerId = $.vpcOwnerId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworksPlainArgs $;

        public Builder() {
            $ = new GetNetworksPlainArgs();
        }

        public Builder(GetNetworksPlainArgs defaults) {
            $ = new GetNetworksPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlock Filter results by a specific CIDR block. For example: &#34;172.16.0.0/12&#34;.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable String cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param dhcpOptionsSetId The ID of dhcp options set.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsSetId(@Nullable String dhcpOptionsSetId) {
            $.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }

        /**
         * @param dryRun Indicates whether to check this request only. Valid values: `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Boolean dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param enableDetails Default to `true`. Set it to true can output the `route_table_id`.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of VPC IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of VPC IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param isDefault Indicate whether the VPC is the default one in the specified region.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Boolean isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter VPCs by name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
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
         * @param resourceGroupId The Id of resource group which VPC belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param status Filter results by a specific status. Valid value are `Pending` and `Available`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param vpcName The name of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcName(@Nullable String vpcName) {
            $.vpcName = vpcName;
            return this;
        }

        /**
         * @param vpcOwnerId The owner ID of VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcOwnerId(@Nullable Integer vpcOwnerId) {
            $.vpcOwnerId = vpcOwnerId;
            return this;
        }

        /**
         * @param vswitchId Filter results by the specified vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable String vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        public GetNetworksPlainArgs build() {
            return $;
        }
    }

}
