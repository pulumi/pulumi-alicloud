// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateZoneState extends com.pulumi.resources.ResourceArgs {

    public static final PrivateZoneState Empty = new PrivateZoneState();

    /**
     * The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     * 
     */
    @Import(name="accessRegionId")
    private @Nullable Output<String> accessRegionId;

    /**
     * @return The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     * 
     */
    public Optional<Output<String>> accessRegionId() {
        return Optional.ofNullable(this.accessRegionId);
    }

    /**
     * The ID of the CEN instance.
     * 
     */
    @Import(name="cenId")
    private @Nullable Output<String> cenId;

    /**
     * @return The ID of the CEN instance.
     * 
     */
    public Optional<Output<String>> cenId() {
        return Optional.ofNullable(this.cenId);
    }

    /**
     * The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
     * 
     */
    @Import(name="hostRegionId")
    private @Nullable Output<String> hostRegionId;

    /**
     * @return The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
     * 
     */
    public Optional<Output<String>> hostRegionId() {
        return Optional.ofNullable(this.hostRegionId);
    }

    /**
     * The VPC that belongs to the service region.
     * 
     * -&gt;**NOTE:** The &#34;alicloud.cen.PrivateZone&#34; resource depends on the related &#34;alicloud.cen.InstanceAttachment&#34; resource.
     * 
     */
    @Import(name="hostVpcId")
    private @Nullable Output<String> hostVpcId;

    /**
     * @return The VPC that belongs to the service region.
     * 
     * -&gt;**NOTE:** The &#34;alicloud.cen.PrivateZone&#34; resource depends on the related &#34;alicloud.cen.InstanceAttachment&#34; resource.
     * 
     */
    public Optional<Output<String>> hostVpcId() {
        return Optional.ofNullable(this.hostVpcId);
    }

    /**
     * The status of the PrivateZone service. Valid values: [&#34;Creating&#34;, &#34;Active&#34;, &#34;Deleting&#34;].
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the PrivateZone service. Valid values: [&#34;Creating&#34;, &#34;Active&#34;, &#34;Deleting&#34;].
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private PrivateZoneState() {}

    private PrivateZoneState(PrivateZoneState $) {
        this.accessRegionId = $.accessRegionId;
        this.cenId = $.cenId;
        this.hostRegionId = $.hostRegionId;
        this.hostVpcId = $.hostVpcId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateZoneState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateZoneState $;

        public Builder() {
            $ = new PrivateZoneState();
        }

        public Builder(PrivateZoneState defaults) {
            $ = new PrivateZoneState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessRegionId The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
         * 
         * @return builder
         * 
         */
        public Builder accessRegionId(@Nullable Output<String> accessRegionId) {
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
        public Builder cenId(@Nullable Output<String> cenId) {
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
        public Builder hostRegionId(@Nullable Output<String> hostRegionId) {
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
         * -&gt;**NOTE:** The &#34;alicloud.cen.PrivateZone&#34; resource depends on the related &#34;alicloud.cen.InstanceAttachment&#34; resource.
         * 
         * @return builder
         * 
         */
        public Builder hostVpcId(@Nullable Output<String> hostVpcId) {
            $.hostVpcId = hostVpcId;
            return this;
        }

        /**
         * @param hostVpcId The VPC that belongs to the service region.
         * 
         * -&gt;**NOTE:** The &#34;alicloud.cen.PrivateZone&#34; resource depends on the related &#34;alicloud.cen.InstanceAttachment&#34; resource.
         * 
         * @return builder
         * 
         */
        public Builder hostVpcId(String hostVpcId) {
            return hostVpcId(Output.of(hostVpcId));
        }

        /**
         * @param status The status of the PrivateZone service. Valid values: [&#34;Creating&#34;, &#34;Active&#34;, &#34;Deleting&#34;].
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the PrivateZone service. Valid values: [&#34;Creating&#34;, &#34;Active&#34;, &#34;Deleting&#34;].
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public PrivateZoneState build() {
            return $;
        }
    }

}
