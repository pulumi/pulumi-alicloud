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


public final class GetSwitchesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSwitchesPlainArgs Empty = new GetSwitchesPlainArgs();

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
     * Specifies whether to precheck this request only. Valid values: `true` and `false`.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Boolean dryRun;

    /**
     * @return Specifies whether to precheck this request only. Valid values: `true` and `false`.
     * 
     */
    public Optional<Boolean> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * A list of vSwitch IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of vSwitch IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Indicate whether the vSwitch is created by the system.
     * 
     */
    @Import(name="isDefault")
    private @Nullable Boolean isDefault;

    /**
     * @return Indicate whether the vSwitch is created by the system.
     * 
     */
    public Optional<Boolean> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * A regex string to filter results by name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by name.
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

    /**
     * The Id of resource group which VSWitch belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The Id of resource group which VSWitch belongs.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The route table ID of the vSwitch.
     * 
     */
    @Import(name="routeTableId")
    private @Nullable String routeTableId;

    /**
     * @return The route table ID of the vSwitch.
     * 
     */
    public Optional<String> routeTableId() {
        return Optional.ofNullable(this.routeTableId);
    }

    /**
     * The status of the vSwitch. Valid values: `Available` and `Pending`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the vSwitch. Valid values: `Available` and `Pending`.
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
     * ID of the VPC that owns the vSwitch.
     * 
     */
    @Import(name="vpcId")
    private @Nullable String vpcId;

    /**
     * @return ID of the VPC that owns the vSwitch.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The name of the vSwitch.
     * 
     */
    @Import(name="vswitchName")
    private @Nullable String vswitchName;

    /**
     * @return The name of the vSwitch.
     * 
     */
    public Optional<String> vswitchName() {
        return Optional.ofNullable(this.vswitchName);
    }

    /**
     * The vSwitch owner id.
     * 
     */
    @Import(name="vswitchOwnerId")
    private @Nullable Integer vswitchOwnerId;

    /**
     * @return The vSwitch owner id.
     * 
     */
    public Optional<Integer> vswitchOwnerId() {
        return Optional.ofNullable(this.vswitchOwnerId);
    }

    /**
     * The availability zone of the vSwitch.
     * 
     */
    @Import(name="zoneId")
    private @Nullable String zoneId;

    /**
     * @return The availability zone of the vSwitch.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetSwitchesPlainArgs() {}

    private GetSwitchesPlainArgs(GetSwitchesPlainArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.dryRun = $.dryRun;
        this.ids = $.ids;
        this.isDefault = $.isDefault;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.resourceGroupId = $.resourceGroupId;
        this.routeTableId = $.routeTableId;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.vswitchName = $.vswitchName;
        this.vswitchOwnerId = $.vswitchOwnerId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSwitchesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSwitchesPlainArgs $;

        public Builder() {
            $ = new GetSwitchesPlainArgs();
        }

        public Builder(GetSwitchesPlainArgs defaults) {
            $ = new GetSwitchesPlainArgs(Objects.requireNonNull(defaults));
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
         * @param dryRun Specifies whether to precheck this request only. Valid values: `true` and `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Boolean dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param ids A list of vSwitch IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of vSwitch IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param isDefault Indicate whether the vSwitch is created by the system.
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Boolean isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by name.
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

        /**
         * @param resourceGroupId The Id of resource group which VSWitch belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param routeTableId The route table ID of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder routeTableId(@Nullable String routeTableId) {
            $.routeTableId = routeTableId;
            return this;
        }

        /**
         * @param status The status of the vSwitch. Valid values: `Available` and `Pending`.
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
         * @param vpcId ID of the VPC that owns the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vswitchName The name of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchName(@Nullable String vswitchName) {
            $.vswitchName = vswitchName;
            return this;
        }

        /**
         * @param vswitchOwnerId The vSwitch owner id.
         * 
         * @return builder
         * 
         */
        public Builder vswitchOwnerId(@Nullable Integer vswitchOwnerId) {
            $.vswitchOwnerId = vswitchOwnerId;
            return this;
        }

        /**
         * @param zoneId The availability zone of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetSwitchesPlainArgs build() {
            return $;
        }
    }

}
