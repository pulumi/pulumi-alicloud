// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServerlessInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServerlessInstancesPlainArgs Empty = new GetServerlessInstancesPlainArgs();

    /**
     * The db instance class.
     * 
     */
    @Import(name="dbInstanceClass")
    private @Nullable String dbInstanceClass;

    /**
     * @return The db instance class.
     * 
     */
    public Optional<String> dbInstanceClass() {
        return Optional.ofNullable(this.dbInstanceClass);
    }

    /**
     * The db instance description.
     * 
     */
    @Import(name="dbInstanceDescription")
    private @Nullable String dbInstanceDescription;

    /**
     * @return The db instance description.
     * 
     */
    public Optional<String> dbInstanceDescription() {
        return Optional.ofNullable(this.dbInstanceDescription);
    }

    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `false`. Set it to `true` can output more details about resource attributes.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Serverless Instance IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Serverless Instance IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The network type of the instance. Valid values: `Classic` or `VPC`.
     * 
     */
    @Import(name="networkType")
    private @Nullable String networkType;

    /**
     * @return The network type of the instance. Valid values: `Classic` or `VPC`.
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

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The instance status. Valid values: `Creating`, `DBInstanceClassChanging`, `DBInstanceNetTypeChanging`, `Deleting`, `EngineVersionUpgrading`, `GuardSwitching`, `HASwitching`, `Importing`, `ImportingFromOthers`, `LinkSwitching`, `MinorVersionUpgrading`, `NodeCreating`, `NodeDeleting`, `Rebooting`, `Restoring`, `Running`, `SSLModifying`, `TDEModifying`, `TempDBInstanceCreating`, `Transing`, `TransingToOthers`, `released`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The instance status. Valid values: `Creating`, `DBInstanceClassChanging`, `DBInstanceNetTypeChanging`, `Deleting`, `EngineVersionUpgrading`, `GuardSwitching`, `HASwitching`, `Importing`, `ImportingFromOthers`, `LinkSwitching`, `MinorVersionUpgrading`, `NodeCreating`, `NodeDeleting`, `Rebooting`, `Restoring`, `Running`, `SSLModifying`, `TDEModifying`, `TempDBInstanceCreating`, `Transing`, `TransingToOthers`, `released`.
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
    private @Nullable Map<String,Object> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the VPC network.
     * 
     */
    @Import(name="vpcId")
    private @Nullable String vpcId;

    /**
     * @return The ID of the VPC network.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The id of the vswitch.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable String vswitchId;

    /**
     * @return The id of the vswitch.
     * 
     */
    public Optional<String> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    /**
     * The ID of the zone.
     * 
     */
    @Import(name="zoneId")
    private @Nullable String zoneId;

    /**
     * @return The ID of the zone.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetServerlessInstancesPlainArgs() {}

    private GetServerlessInstancesPlainArgs(GetServerlessInstancesPlainArgs $) {
        this.dbInstanceClass = $.dbInstanceClass;
        this.dbInstanceDescription = $.dbInstanceDescription;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.networkType = $.networkType;
        this.outputFile = $.outputFile;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServerlessInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServerlessInstancesPlainArgs $;

        public Builder() {
            $ = new GetServerlessInstancesPlainArgs();
        }

        public Builder(GetServerlessInstancesPlainArgs defaults) {
            $ = new GetServerlessInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbInstanceClass The db instance class.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceClass(@Nullable String dbInstanceClass) {
            $.dbInstanceClass = dbInstanceClass;
            return this;
        }

        /**
         * @param dbInstanceDescription The db instance description.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceDescription(@Nullable String dbInstanceDescription) {
            $.dbInstanceDescription = dbInstanceDescription;
            return this;
        }

        /**
         * @param enableDetails Default to `false`. Set it to `true` can output more details about resource attributes.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Serverless Instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Serverless Instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param networkType The network type of the instance. Valid values: `Classic` or `VPC`.
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

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param status The instance status. Valid values: `Creating`, `DBInstanceClassChanging`, `DBInstanceNetTypeChanging`, `Deleting`, `EngineVersionUpgrading`, `GuardSwitching`, `HASwitching`, `Importing`, `ImportingFromOthers`, `LinkSwitching`, `MinorVersionUpgrading`, `NodeCreating`, `NodeDeleting`, `Rebooting`, `Restoring`, `Running`, `SSLModifying`, `TDEModifying`, `TempDBInstanceCreating`, `Transing`, `TransingToOthers`, `released`.
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
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC network.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vswitchId The id of the vswitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable String vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param zoneId The ID of the zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetServerlessInstancesPlainArgs build() {
            return $;
        }
    }

}