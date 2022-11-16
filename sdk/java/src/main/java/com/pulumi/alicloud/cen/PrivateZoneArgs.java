// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PrivateZoneArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateZoneArgs Empty = new PrivateZoneArgs();

    /**
     * The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     * 
     */
    @Import(name="accessRegionId", required=true)
    private Output<String> accessRegionId;

    /**
     * @return The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     * 
     */
    public Output<String> accessRegionId() {
        return this.accessRegionId;
    }

    /**
     * The ID of the CEN instance.
     * 
     */
    @Import(name="cenId", required=true)
    private Output<String> cenId;

    /**
     * @return The ID of the CEN instance.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }

    /**
     * The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
     * 
     */
    @Import(name="hostRegionId", required=true)
    private Output<String> hostRegionId;

    /**
     * @return The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
     * 
     */
    public Output<String> hostRegionId() {
        return this.hostRegionId;
    }

    /**
     * The VPC that belongs to the service region.
     * 
     */
    @Import(name="hostVpcId", required=true)
    private Output<String> hostVpcId;

    /**
     * @return The VPC that belongs to the service region.
     * 
     */
    public Output<String> hostVpcId() {
        return this.hostVpcId;
    }

    private PrivateZoneArgs() {}

    private PrivateZoneArgs(PrivateZoneArgs $) {
        this.accessRegionId = $.accessRegionId;
        this.cenId = $.cenId;
        this.hostRegionId = $.hostRegionId;
        this.hostVpcId = $.hostVpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateZoneArgs $;

        public Builder() {
            $ = new PrivateZoneArgs();
        }

        public Builder(PrivateZoneArgs defaults) {
            $ = new PrivateZoneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessRegionId The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
         * 
         * @return builder
         * 
         */
        public Builder accessRegionId(Output<String> accessRegionId) {
            $.accessRegionId = accessRegionId;
            return this;
        }

        /**
         * @param accessRegionId The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
         * 
         * @return builder
         * 
         */
        public Builder accessRegionId(String accessRegionId) {
            return accessRegionId(Output.of(accessRegionId));
        }

        /**
         * @param cenId The ID of the CEN instance.
         * 
         * @return builder
         * 
         */
        public Builder cenId(Output<String> cenId) {
            $.cenId = cenId;
            return this;
        }

        /**
         * @param cenId The ID of the CEN instance.
         * 
         * @return builder
         * 
         */
        public Builder cenId(String cenId) {
            return cenId(Output.of(cenId));
        }

        /**
         * @param hostRegionId The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
         * 
         * @return builder
         * 
         */
        public Builder hostRegionId(Output<String> hostRegionId) {
            $.hostRegionId = hostRegionId;
            return this;
        }

        /**
         * @param hostRegionId The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
         * 
         * @return builder
         * 
         */
        public Builder hostRegionId(String hostRegionId) {
            return hostRegionId(Output.of(hostRegionId));
        }

        /**
         * @param hostVpcId The VPC that belongs to the service region.
         * 
         * @return builder
         * 
         */
        public Builder hostVpcId(Output<String> hostVpcId) {
            $.hostVpcId = hostVpcId;
            return this;
        }

        /**
         * @param hostVpcId The VPC that belongs to the service region.
         * 
         * @return builder
         * 
         */
        public Builder hostVpcId(String hostVpcId) {
            return hostVpcId(Output.of(hostVpcId));
        }

        public PrivateZoneArgs build() {
            $.accessRegionId = Objects.requireNonNull($.accessRegionId, "expected parameter 'accessRegionId' to be non-null");
            $.cenId = Objects.requireNonNull($.cenId, "expected parameter 'cenId' to be non-null");
            $.hostRegionId = Objects.requireNonNull($.hostRegionId, "expected parameter 'hostRegionId' to be non-null");
            $.hostVpcId = Objects.requireNonNull($.hostVpcId, "expected parameter 'hostVpcId' to be non-null");
            return $;
        }
    }

}