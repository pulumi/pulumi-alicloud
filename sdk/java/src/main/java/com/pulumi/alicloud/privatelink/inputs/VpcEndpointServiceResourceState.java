// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointServiceResourceState extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServiceResourceState Empty = new VpcEndpointServiceResourceState();

    /**
     * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
     * - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
     * - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The service resource ID.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The service resource ID.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * Service resource type, value:
     * - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
     * - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
     * - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return Service resource type, value:
     * - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
     * - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
     * - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * The endpoint service ID.
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    /**
     * @return The endpoint service ID.
     * 
     */
    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    /**
     * The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private VpcEndpointServiceResourceState() {}

    private VpcEndpointServiceResourceState(VpcEndpointServiceResourceState $) {
        this.dryRun = $.dryRun;
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
        this.serviceId = $.serviceId;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointServiceResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointServiceResourceState $;

        public Builder() {
            $ = new VpcEndpointServiceResourceState();
        }

        public Builder(VpcEndpointServiceResourceState defaults) {
            $ = new VpcEndpointServiceResourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dryRun Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
         * - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the DryRunOperation error code is returned.
         * - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param resourceId The service resource ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The service resource ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceType Service resource type, value:
         * - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
         * - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
         * - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Service resource type, value:
         * - **slb**: indicates that the service resource type is Classic Load Balancer (CLB).
         * - **alb**: indicates that the service resource type is Application Load Balancer (ALB).
         * - **nlb**: indicates that the service resource type is Network Load Balancer (NLB).
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param serviceId The endpoint service ID.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The endpoint service ID.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param zoneId The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The ID of the zone to which the service resource belongs. (valid when the resource type is nlb/alb).
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public VpcEndpointServiceResourceState build() {
            return $;
        }
    }

}
