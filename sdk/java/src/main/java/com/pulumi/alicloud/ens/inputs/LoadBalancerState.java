// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens.inputs;

import com.pulumi.alicloud.ens.inputs.LoadBalancerBackendServerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancerState extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerState Empty = new LoadBalancerState();

    /**
     * The list of backend servers. See `backend_servers` below.
     * 
     */
    @Import(name="backendServers")
    private @Nullable Output<List<LoadBalancerBackendServerArgs>> backendServers;

    /**
     * @return The list of backend servers. See `backend_servers` below.
     * 
     */
    public Optional<Output<List<LoadBalancerBackendServerArgs>>> backendServers() {
        return Optional.ofNullable(this.backendServers);
    }

    /**
     * The creation Time (UTC) of the load balancing instance.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation Time (UTC) of the load balancing instance.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The ID of the ENS node.
     * 
     */
    @Import(name="ensRegionId")
    private @Nullable Output<String> ensRegionId;

    /**
     * @return The ID of the ENS node.
     * 
     */
    public Optional<Output<String>> ensRegionId() {
        return Optional.ofNullable(this.ensRegionId);
    }

    /**
     * Name of the Server Load Balancer instance. The length is 1~80 English or Chinese characters. When this parameter is not specified, the system randomly assigns an instance name. Cannot start with http:// and https.
     * 
     */
    @Import(name="loadBalancerName")
    private @Nullable Output<String> loadBalancerName;

    /**
     * @return Name of the Server Load Balancer instance. The length is 1~80 English or Chinese characters. When this parameter is not specified, the system randomly assigns an instance name. Cannot start with http:// and https.
     * 
     */
    public Optional<Output<String>> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }

    /**
     * Specifications of the Server Load Balancer instance. Optional values: elb.s1.small,elb.s3.medium,elb.s2.small,elb.s2.medium,elb.s3.small.
     * 
     */
    @Import(name="loadBalancerSpec")
    private @Nullable Output<String> loadBalancerSpec;

    /**
     * @return Specifications of the Server Load Balancer instance. Optional values: elb.s1.small,elb.s3.medium,elb.s2.small,elb.s2.medium,elb.s3.small.
     * 
     */
    public Optional<Output<String>> loadBalancerSpec() {
        return Optional.ofNullable(this.loadBalancerSpec);
    }

    /**
     * The network ID of the created edge load balancing (ELB) instance.
     * 
     */
    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    /**
     * @return The network ID of the created edge load balancing (ELB) instance.
     * 
     */
    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    /**
     * Server Load Balancer Instance Payment Type. Value:PayAsYouGo
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return Server Load Balancer Instance Payment Type. Value:PayAsYouGo
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The status of the SLB instance.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the SLB instance.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the vSwitch to which the VPC instance belongs.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The ID of the vSwitch to which the VPC instance belongs.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private LoadBalancerState() {}

    private LoadBalancerState(LoadBalancerState $) {
        this.backendServers = $.backendServers;
        this.createTime = $.createTime;
        this.ensRegionId = $.ensRegionId;
        this.loadBalancerName = $.loadBalancerName;
        this.loadBalancerSpec = $.loadBalancerSpec;
        this.networkId = $.networkId;
        this.paymentType = $.paymentType;
        this.status = $.status;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerState $;

        public Builder() {
            $ = new LoadBalancerState();
        }

        public Builder(LoadBalancerState defaults) {
            $ = new LoadBalancerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendServers The list of backend servers. See `backend_servers` below.
         * 
         * @return builder
         * 
         */
        public Builder backendServers(@Nullable Output<List<LoadBalancerBackendServerArgs>> backendServers) {
            $.backendServers = backendServers;
            return this;
        }

        /**
         * @param backendServers The list of backend servers. See `backend_servers` below.
         * 
         * @return builder
         * 
         */
        public Builder backendServers(List<LoadBalancerBackendServerArgs> backendServers) {
            return backendServers(Output.of(backendServers));
        }

        /**
         * @param backendServers The list of backend servers. See `backend_servers` below.
         * 
         * @return builder
         * 
         */
        public Builder backendServers(LoadBalancerBackendServerArgs... backendServers) {
            return backendServers(List.of(backendServers));
        }

        /**
         * @param createTime The creation Time (UTC) of the load balancing instance.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation Time (UTC) of the load balancing instance.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param ensRegionId The ID of the ENS node.
         * 
         * @return builder
         * 
         */
        public Builder ensRegionId(@Nullable Output<String> ensRegionId) {
            $.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * @param ensRegionId The ID of the ENS node.
         * 
         * @return builder
         * 
         */
        public Builder ensRegionId(String ensRegionId) {
            return ensRegionId(Output.of(ensRegionId));
        }

        /**
         * @param loadBalancerName Name of the Server Load Balancer instance. The length is 1~80 English or Chinese characters. When this parameter is not specified, the system randomly assigns an instance name. Cannot start with http:// and https.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            $.loadBalancerName = loadBalancerName;
            return this;
        }

        /**
         * @param loadBalancerName Name of the Server Load Balancer instance. The length is 1~80 English or Chinese characters. When this parameter is not specified, the system randomly assigns an instance name. Cannot start with http:// and https.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerName(String loadBalancerName) {
            return loadBalancerName(Output.of(loadBalancerName));
        }

        /**
         * @param loadBalancerSpec Specifications of the Server Load Balancer instance. Optional values: elb.s1.small,elb.s3.medium,elb.s2.small,elb.s2.medium,elb.s3.small.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerSpec(@Nullable Output<String> loadBalancerSpec) {
            $.loadBalancerSpec = loadBalancerSpec;
            return this;
        }

        /**
         * @param loadBalancerSpec Specifications of the Server Load Balancer instance. Optional values: elb.s1.small,elb.s3.medium,elb.s2.small,elb.s2.medium,elb.s3.small.
         * 
         * @return builder
         * 
         */
        public Builder loadBalancerSpec(String loadBalancerSpec) {
            return loadBalancerSpec(Output.of(loadBalancerSpec));
        }

        /**
         * @param networkId The network ID of the created edge load balancing (ELB) instance.
         * 
         * @return builder
         * 
         */
        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        /**
         * @param networkId The network ID of the created edge load balancing (ELB) instance.
         * 
         * @return builder
         * 
         */
        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        /**
         * @param paymentType Server Load Balancer Instance Payment Type. Value:PayAsYouGo
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType Server Load Balancer Instance Payment Type. Value:PayAsYouGo
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param status The status of the SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the SLB instance.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vswitchId The ID of the vSwitch to which the VPC instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the vSwitch to which the VPC instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public LoadBalancerState build() {
            return $;
        }
    }

}
