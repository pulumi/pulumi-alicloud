// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ShardingNetworkPrivateAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final ShardingNetworkPrivateAddressArgs Empty = new ShardingNetworkPrivateAddressArgs();

    /**
     * The username of the account.
     * - The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
     * - You need to set the account name and password only when you apply for an endpoint for a shard or ConfigServer node for the first time. In this case, the account name and password are used for all shard and ConfigServer nodes.
     * - The permissions of this account are fixed to read-only.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return The username of the account.
     * - The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
     * - You need to set the account name and password only when you apply for an endpoint for a shard or ConfigServer node for the first time. In this case, the account name and password are used for all shard and ConfigServer nodes.
     * - The permissions of this account are fixed to read-only.
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * The password for the account.
     * - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
     * - The password must be 8 to 32 characters in length.
     * 
     */
    @Import(name="accountPassword")
    private @Nullable Output<String> accountPassword;

    /**
     * @return The password for the account.
     * - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
     * - The password must be 8 to 32 characters in length.
     * 
     */
    public Optional<Output<String>> accountPassword() {
        return Optional.ofNullable(this.accountPassword);
    }

    /**
     * The ID of the sharded cluster instance.
     * 
     */
    @Import(name="dbInstanceId", required=true)
    private Output<String> dbInstanceId;

    /**
     * @return The ID of the sharded cluster instance.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * The ID of the Shard node or ConfigServer node.
     * 
     */
    @Import(name="nodeId", required=true)
    private Output<String> nodeId;

    /**
     * @return The ID of the Shard node or ConfigServer node.
     * 
     */
    public Output<String> nodeId() {
        return this.nodeId;
    }

    /**
     * The zone ID of the instance.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The zone ID of the instance.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private ShardingNetworkPrivateAddressArgs() {}

    private ShardingNetworkPrivateAddressArgs(ShardingNetworkPrivateAddressArgs $) {
        this.accountName = $.accountName;
        this.accountPassword = $.accountPassword;
        this.dbInstanceId = $.dbInstanceId;
        this.nodeId = $.nodeId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShardingNetworkPrivateAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShardingNetworkPrivateAddressArgs $;

        public Builder() {
            $ = new ShardingNetworkPrivateAddressArgs();
        }

        public Builder(ShardingNetworkPrivateAddressArgs defaults) {
            $ = new ShardingNetworkPrivateAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The username of the account.
         * - The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
         * - You need to set the account name and password only when you apply for an endpoint for a shard or ConfigServer node for the first time. In this case, the account name and password are used for all shard and ConfigServer nodes.
         * - The permissions of this account are fixed to read-only.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The username of the account.
         * - The name must be 4 to 16 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a lowercase letter.
         * - You need to set the account name and password only when you apply for an endpoint for a shard or ConfigServer node for the first time. In this case, the account name and password are used for all shard and ConfigServer nodes.
         * - The permissions of this account are fixed to read-only.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param accountPassword The password for the account.
         * - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
         * - The password must be 8 to 32 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder accountPassword(@Nullable Output<String> accountPassword) {
            $.accountPassword = accountPassword;
            return this;
        }

        /**
         * @param accountPassword The password for the account.
         * - The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `!#$%^&amp;*()_+-=`.
         * - The password must be 8 to 32 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder accountPassword(String accountPassword) {
            return accountPassword(Output.of(accountPassword));
        }

        /**
         * @param dbInstanceId The ID of the sharded cluster instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(Output<String> dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceId The ID of the sharded cluster instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            return dbInstanceId(Output.of(dbInstanceId));
        }

        /**
         * @param nodeId The ID of the Shard node or ConfigServer node.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(Output<String> nodeId) {
            $.nodeId = nodeId;
            return this;
        }

        /**
         * @param nodeId The ID of the Shard node or ConfigServer node.
         * 
         * @return builder
         * 
         */
        public Builder nodeId(String nodeId) {
            return nodeId(Output.of(nodeId));
        }

        /**
         * @param zoneId The zone ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The zone ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public ShardingNetworkPrivateAddressArgs build() {
            if ($.dbInstanceId == null) {
                throw new MissingRequiredPropertyException("ShardingNetworkPrivateAddressArgs", "dbInstanceId");
            }
            if ($.nodeId == null) {
                throw new MissingRequiredPropertyException("ShardingNetworkPrivateAddressArgs", "nodeId");
            }
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("ShardingNetworkPrivateAddressArgs", "zoneId");
            }
            return $;
        }
    }

}
