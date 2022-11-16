// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointState extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointState Empty = new VpcEndpointState();

    /**
     * The Bandwidth.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return The Bandwidth.
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The status of Connection.
     * 
     */
    @Import(name="connectionStatus")
    private @Nullable Output<String> connectionStatus;

    /**
     * @return The status of Connection.
     * 
     */
    public Optional<Output<String>> connectionStatus() {
        return Optional.ofNullable(this.connectionStatus);
    }

    /**
     * The dry run. Default to: `false`.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return The dry run. Default to: `false`.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The status of Endpoint Business.
     * 
     */
    @Import(name="endpointBusinessStatus")
    private @Nullable Output<String> endpointBusinessStatus;

    /**
     * @return The status of Endpoint Business.
     * 
     */
    public Optional<Output<String>> endpointBusinessStatus() {
        return Optional.ofNullable(this.endpointBusinessStatus);
    }

    /**
     * The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
     * 
     */
    @Import(name="endpointDescription")
    private @Nullable Output<String> endpointDescription;

    /**
     * @return The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
     * 
     */
    public Optional<Output<String>> endpointDescription() {
        return Optional.ofNullable(this.endpointDescription);
    }

    /**
     * The Endpoint Domain.
     * 
     */
    @Import(name="endpointDomain")
    private @Nullable Output<String> endpointDomain;

    /**
     * @return The Endpoint Domain.
     * 
     */
    public Optional<Output<String>> endpointDomain() {
        return Optional.ofNullable(this.endpointDomain);
    }

    /**
     * The security group associated with the terminal node network card.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return The security group associated with the terminal node network card.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * The terminal node service associated with the terminal node.
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    /**
     * @return The terminal node service associated with the terminal node.
     * 
     */
    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    /**
     * The name of the terminal node service associated with the terminal node.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The name of the terminal node service associated with the terminal node.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * The status of Vpc Endpoint.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of Vpc Endpoint.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
     * 
     */
    @Import(name="vpcEndpointName")
    private @Nullable Output<String> vpcEndpointName;

    /**
     * @return The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
     * 
     */
    public Optional<Output<String>> vpcEndpointName() {
        return Optional.ofNullable(this.vpcEndpointName);
    }

    /**
     * The private network to which the terminal node belongs.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The private network to which the terminal node belongs.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private VpcEndpointState() {}

    private VpcEndpointState(VpcEndpointState $) {
        this.bandwidth = $.bandwidth;
        this.connectionStatus = $.connectionStatus;
        this.dryRun = $.dryRun;
        this.endpointBusinessStatus = $.endpointBusinessStatus;
        this.endpointDescription = $.endpointDescription;
        this.endpointDomain = $.endpointDomain;
        this.securityGroupIds = $.securityGroupIds;
        this.serviceId = $.serviceId;
        this.serviceName = $.serviceName;
        this.status = $.status;
        this.vpcEndpointName = $.vpcEndpointName;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointState $;

        public Builder() {
            $ = new VpcEndpointState();
        }

        public Builder(VpcEndpointState defaults) {
            $ = new VpcEndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidth The Bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The Bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param connectionStatus The status of Connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionStatus(@Nullable Output<String> connectionStatus) {
            $.connectionStatus = connectionStatus;
            return this;
        }

        /**
         * @param connectionStatus The status of Connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionStatus(String connectionStatus) {
            return connectionStatus(Output.of(connectionStatus));
        }

        /**
         * @param dryRun The dry run. Default to: `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun The dry run. Default to: `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param endpointBusinessStatus The status of Endpoint Business.
         * 
         * @return builder
         * 
         */
        public Builder endpointBusinessStatus(@Nullable Output<String> endpointBusinessStatus) {
            $.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }

        /**
         * @param endpointBusinessStatus The status of Endpoint Business.
         * 
         * @return builder
         * 
         */
        public Builder endpointBusinessStatus(String endpointBusinessStatus) {
            return endpointBusinessStatus(Output.of(endpointBusinessStatus));
        }

        /**
         * @param endpointDescription The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
         * 
         * @return builder
         * 
         */
        public Builder endpointDescription(@Nullable Output<String> endpointDescription) {
            $.endpointDescription = endpointDescription;
            return this;
        }

        /**
         * @param endpointDescription The description of Vpc Endpoint. The length is 2~256 characters and cannot start with `http://` and `https://`.
         * 
         * @return builder
         * 
         */
        public Builder endpointDescription(String endpointDescription) {
            return endpointDescription(Output.of(endpointDescription));
        }

        /**
         * @param endpointDomain The Endpoint Domain.
         * 
         * @return builder
         * 
         */
        public Builder endpointDomain(@Nullable Output<String> endpointDomain) {
            $.endpointDomain = endpointDomain;
            return this;
        }

        /**
         * @param endpointDomain The Endpoint Domain.
         * 
         * @return builder
         * 
         */
        public Builder endpointDomain(String endpointDomain) {
            return endpointDomain(Output.of(endpointDomain));
        }

        /**
         * @param securityGroupIds The security group associated with the terminal node network card.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds The security group associated with the terminal node network card.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds The security group associated with the terminal node network card.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param serviceId The terminal node service associated with the terminal node.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The terminal node service associated with the terminal node.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param serviceName The name of the terminal node service associated with the terminal node.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the terminal node service associated with the terminal node.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param status The status of Vpc Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of Vpc Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vpcEndpointName The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointName(@Nullable Output<String> vpcEndpointName) {
            $.vpcEndpointName = vpcEndpointName;
            return this;
        }

        /**
         * @param vpcEndpointName The name of Vpc Endpoint. The length is between 2 and 128 characters, starting with English letters or Chinese, and can include numbers, hyphens (-) and underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointName(String vpcEndpointName) {
            return vpcEndpointName(Output.of(vpcEndpointName));
        }

        /**
         * @param vpcId The private network to which the terminal node belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The private network to which the terminal node belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public VpcEndpointState build() {
            return $;
        }
    }

}