// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointAddressArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointAddressArgs Empty = new EndpointAddressArgs();

    /**
     * Prefix of the specified endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter.
     * 
     */
    @Import(name="connectionPrefix")
    private @Nullable Output<String> connectionPrefix;

    /**
     * @return Prefix of the specified endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter.
     * 
     */
    public Optional<Output<String>> connectionPrefix() {
        return Optional.ofNullable(this.connectionPrefix);
    }

    /**
     * The Id of cluster that can run database.
     * 
     */
    @Import(name="dbClusterId", required=true)
    private Output<String> dbClusterId;

    /**
     * @return The Id of cluster that can run database.
     * 
     */
    public Output<String> dbClusterId() {
        return this.dbClusterId;
    }

    /**
     * The Id of endpoint that can run database.
     * 
     */
    @Import(name="dbEndpointId", required=true)
    private Output<String> dbEndpointId;

    /**
     * @return The Id of endpoint that can run database.
     * 
     */
    public Output<String> dbEndpointId() {
        return this.dbEndpointId;
    }

    /**
     * Internet connection net type. Valid value: `Public`. Default to `Public`. Currently supported only `Public`.
     * 
     */
    @Import(name="netType")
    private @Nullable Output<String> netType;

    /**
     * @return Internet connection net type. Valid value: `Public`. Default to `Public`. Currently supported only `Public`.
     * 
     */
    public Optional<Output<String>> netType() {
        return Optional.ofNullable(this.netType);
    }

    /**
     * Port of the specified endpoint. Valid values: 3000 to 5999.
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return Port of the specified endpoint. Valid values: 3000 to 5999.
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    private EndpointAddressArgs() {}

    private EndpointAddressArgs(EndpointAddressArgs $) {
        this.connectionPrefix = $.connectionPrefix;
        this.dbClusterId = $.dbClusterId;
        this.dbEndpointId = $.dbEndpointId;
        this.netType = $.netType;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointAddressArgs $;

        public Builder() {
            $ = new EndpointAddressArgs();
        }

        public Builder(EndpointAddressArgs defaults) {
            $ = new EndpointAddressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionPrefix Prefix of the specified endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter.
         * 
         * @return builder
         * 
         */
        public Builder connectionPrefix(@Nullable Output<String> connectionPrefix) {
            $.connectionPrefix = connectionPrefix;
            return this;
        }

        /**
         * @param connectionPrefix Prefix of the specified endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter.
         * 
         * @return builder
         * 
         */
        public Builder connectionPrefix(String connectionPrefix) {
            return connectionPrefix(Output.of(connectionPrefix));
        }

        /**
         * @param dbClusterId The Id of cluster that can run database.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterId(Output<String> dbClusterId) {
            $.dbClusterId = dbClusterId;
            return this;
        }

        /**
         * @param dbClusterId The Id of cluster that can run database.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterId(String dbClusterId) {
            return dbClusterId(Output.of(dbClusterId));
        }

        /**
         * @param dbEndpointId The Id of endpoint that can run database.
         * 
         * @return builder
         * 
         */
        public Builder dbEndpointId(Output<String> dbEndpointId) {
            $.dbEndpointId = dbEndpointId;
            return this;
        }

        /**
         * @param dbEndpointId The Id of endpoint that can run database.
         * 
         * @return builder
         * 
         */
        public Builder dbEndpointId(String dbEndpointId) {
            return dbEndpointId(Output.of(dbEndpointId));
        }

        /**
         * @param netType Internet connection net type. Valid value: `Public`. Default to `Public`. Currently supported only `Public`.
         * 
         * @return builder
         * 
         */
        public Builder netType(@Nullable Output<String> netType) {
            $.netType = netType;
            return this;
        }

        /**
         * @param netType Internet connection net type. Valid value: `Public`. Default to `Public`. Currently supported only `Public`.
         * 
         * @return builder
         * 
         */
        public Builder netType(String netType) {
            return netType(Output.of(netType));
        }

        /**
         * @param port Port of the specified endpoint. Valid values: 3000 to 5999.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port Port of the specified endpoint. Valid values: 3000 to 5999.
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        public EndpointAddressArgs build() {
            if ($.dbClusterId == null) {
                throw new MissingRequiredPropertyException("EndpointAddressArgs", "dbClusterId");
            }
            if ($.dbEndpointId == null) {
                throw new MissingRequiredPropertyException("EndpointAddressArgs", "dbEndpointId");
            }
            return $;
        }
    }

}