// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DbInstanceEndpointAddressState extends com.pulumi.resources.ResourceArgs {

    public static final DbInstanceEndpointAddressState Empty = new DbInstanceEndpointAddressState();

    /**
     * The endpoint of the instance.
     * 
     */
    @Import(name="connectionString")
    private @Nullable Output<String> connectionString;

    /**
     * @return The endpoint of the instance.
     * 
     */
    public Optional<Output<String>> connectionString() {
        return Optional.ofNullable(this.connectionString);
    }

    /**
     * The prefix of the public endpoint.
     * 
     */
    @Import(name="connectionStringPrefix")
    private @Nullable Output<String> connectionStringPrefix;

    /**
     * @return The prefix of the public endpoint.
     * 
     */
    public Optional<Output<String>> connectionStringPrefix() {
        return Optional.ofNullable(this.connectionStringPrefix);
    }

    /**
     * The Endpoint ID of the instance.
     * 
     */
    @Import(name="dbInstanceEndpointId")
    private @Nullable Output<String> dbInstanceEndpointId;

    /**
     * @return The Endpoint ID of the instance.
     * 
     */
    public Optional<Output<String>> dbInstanceEndpointId() {
        return Optional.ofNullable(this.dbInstanceEndpointId);
    }

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
     * The IP address of the endpoint.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The IP address of the endpoint.
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The type of the IP address.
     * 
     */
    @Import(name="ipType")
    private @Nullable Output<String> ipType;

    /**
     * @return The type of the IP address.
     * 
     */
    public Optional<Output<String>> ipType() {
        return Optional.ofNullable(this.ipType);
    }

    /**
     * The port number of the public endpoint.
     * 
     */
    @Import(name="port")
    private @Nullable Output<String> port;

    /**
     * @return The port number of the public endpoint.
     * 
     */
    public Optional<Output<String>> port() {
        return Optional.ofNullable(this.port);
    }

    private DbInstanceEndpointAddressState() {}

    private DbInstanceEndpointAddressState(DbInstanceEndpointAddressState $) {
        this.connectionString = $.connectionString;
        this.connectionStringPrefix = $.connectionStringPrefix;
        this.dbInstanceEndpointId = $.dbInstanceEndpointId;
        this.dbInstanceId = $.dbInstanceId;
        this.ipAddress = $.ipAddress;
        this.ipType = $.ipType;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DbInstanceEndpointAddressState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DbInstanceEndpointAddressState $;

        public Builder() {
            $ = new DbInstanceEndpointAddressState();
        }

        public Builder(DbInstanceEndpointAddressState defaults) {
            $ = new DbInstanceEndpointAddressState(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionString The endpoint of the instance.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(@Nullable Output<String> connectionString) {
            $.connectionString = connectionString;
            return this;
        }

        /**
         * @param connectionString The endpoint of the instance.
         * 
         * @return builder
         * 
         */
        public Builder connectionString(String connectionString) {
            return connectionString(Output.of(connectionString));
        }

        /**
         * @param connectionStringPrefix The prefix of the public endpoint.
         * 
         * @return builder
         * 
         */
        public Builder connectionStringPrefix(@Nullable Output<String> connectionStringPrefix) {
            $.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * @param connectionStringPrefix The prefix of the public endpoint.
         * 
         * @return builder
         * 
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            return connectionStringPrefix(Output.of(connectionStringPrefix));
        }

        /**
         * @param dbInstanceEndpointId The Endpoint ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceEndpointId(@Nullable Output<String> dbInstanceEndpointId) {
            $.dbInstanceEndpointId = dbInstanceEndpointId;
            return this;
        }

        /**
         * @param dbInstanceEndpointId The Endpoint ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceEndpointId(String dbInstanceEndpointId) {
            return dbInstanceEndpointId(Output.of(dbInstanceEndpointId));
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
         * @param ipAddress The IP address of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address of the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param ipType The type of the IP address.
         * 
         * @return builder
         * 
         */
        public Builder ipType(@Nullable Output<String> ipType) {
            $.ipType = ipType;
            return this;
        }

        /**
         * @param ipType The type of the IP address.
         * 
         * @return builder
         * 
         */
        public Builder ipType(String ipType) {
            return ipType(Output.of(ipType));
        }

        /**
         * @param port The port number of the public endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<String> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number of the public endpoint.
         * 
         * @return builder
         * 
         */
        public Builder port(String port) {
            return port(Output.of(port));
        }

        public DbInstanceEndpointAddressState build() {
            return $;
        }
    }

}
