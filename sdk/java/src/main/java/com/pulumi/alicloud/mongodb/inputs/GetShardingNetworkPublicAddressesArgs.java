// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetShardingNetworkPublicAddressesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetShardingNetworkPublicAddressesArgs Empty = new GetShardingNetworkPublicAddressesArgs();

    /**
     * The db instance id.
     * 
     */
    @Import(name="dbInstanceId", required=true)
    private Output<String> dbInstanceId;

    /**
     * @return The db instance id.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
     * 
     */
    @Import(name="nodeId")
    private @Nullable Output<String> nodeId;

    /**
     * @return The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
     * 
     */
    public Optional<Output<String>> nodeId() {
        return Optional.ofNullable(this.nodeId);
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
     * The role of the node. Valid values: `Primary` or `Secondary`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role of the node. Valid values: `Primary` or `Secondary`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    private GetShardingNetworkPublicAddressesArgs() {}

    private GetShardingNetworkPublicAddressesArgs(GetShardingNetworkPublicAddressesArgs $) {
        this.dbInstanceId = $.dbInstanceId;
        this.nodeId = $.nodeId;
        this.outputFile = $.outputFile;
        this.role = $.role;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetShardingNetworkPublicAddressesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetShardingNetworkPublicAddressesArgs $;

        public Builder() {
            $ = new GetShardingNetworkPublicAddressesArgs();
        }

        public Builder(GetShardingNetworkPublicAddressesArgs defaults) {
            $ = new GetShardingNetworkPublicAddressesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbInstanceId The db instance id.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(Output<String> dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceId The db instance id.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            return dbInstanceId(Output.of(dbInstanceId));
        }

        /**
         * @param nodeId The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(@Nullable Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        /**
         * @param nodeId The ID of the `mongos`, `shard`, or `Configserver` node in the sharded cluster instance.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
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
         * @param role The role of the node. Valid values: `Primary` or `Secondary`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role of the node. Valid values: `Primary` or `Secondary`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public GetShardingNetworkPublicAddressesArgs build() {
            if ($.dbInstanceId == null) {
                throw new MissingRequiredPropertyException("GetShardingNetworkPublicAddressesArgs", "dbInstanceId");
            }
            return $;
        }
    }

}