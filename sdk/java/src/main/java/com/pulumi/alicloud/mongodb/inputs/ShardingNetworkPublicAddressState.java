// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb.inputs;

import com.pulumi.alicloud.mongodb.inputs.ShardingNetworkPublicAddressNetworkAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShardingNetworkPublicAddressState extends com.pulumi.resources.ResourceArgs {

    public static final ShardingNetworkPublicAddressState Empty = new ShardingNetworkPublicAddressState();

    /**
     * The ID of the instance.
     * 
     */
    @Import(name="dbInstanceId")
    private @Nullable Output<String> dbInstanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Optional<Output<String>> dbInstanceId() {
        return Optional.ofNullable(this.dbInstanceId);
    }

    /**
     * The endpoint of the instance.
     * 
     */
    @Import(name="networkAddresses")
    private @Nullable Output<List<ShardingNetworkPublicAddressNetworkAddressArgs>> networkAddresses;

    /**
     * @return The endpoint of the instance.
     * 
     */
    public Optional<Output<List<ShardingNetworkPublicAddressNetworkAddressArgs>>> networkAddresses() {
        return Optional.ofNullable(this.networkAddresses);
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

    private ShardingNetworkPublicAddressState() {}

    private ShardingNetworkPublicAddressState(ShardingNetworkPublicAddressState $) {
        this.dbInstanceId = $.dbInstanceId;
        this.networkAddresses = $.networkAddresses;
        this.nodeId = $.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShardingNetworkPublicAddressState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShardingNetworkPublicAddressState $;

        public Builder() {
            $ = new ShardingNetworkPublicAddressState();
        }

        public Builder(ShardingNetworkPublicAddressState defaults) {
            $ = new ShardingNetworkPublicAddressState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbInstanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(@Nullable Output<String> dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            return dbInstanceId(Output.of(dbInstanceId));
        }

        /**
         * @param networkAddresses The endpoint of the instance.
         * 
         * @return builder
         * 
         */
        public Builder networkAddresses(@Nullable Output<List<ShardingNetworkPublicAddressNetworkAddressArgs>> networkAddresses) {
            $.networkAddresses = networkAddresses;
            return this;
        }

        /**
         * @param networkAddresses The endpoint of the instance.
         * 
         * @return builder
         * 
         */
        public Builder networkAddresses(List<ShardingNetworkPublicAddressNetworkAddressArgs> networkAddresses) {
            return networkAddresses(Output.of(networkAddresses));
        }

        /**
         * @param networkAddresses The endpoint of the instance.
         * 
         * @return builder
         * 
         */
        public Builder networkAddresses(ShardingNetworkPublicAddressNetworkAddressArgs... networkAddresses) {
            return networkAddresses(List.of(networkAddresses));
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

        public ShardingNetworkPublicAddressState build() {
            return $;
        }
    }

}
