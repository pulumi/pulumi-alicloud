// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BandwidthLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final BandwidthLimitArgs Empty = new BandwidthLimitArgs();

    /**
     * The bandwidth configured for the interconnected regions communication.
     * 
     * -&gt;**NOTE:** The &#34;alicloud_cen_bandwidthlimit&#34; resource depends on the related &#34;alicloud.cen.BandwidthPackageAttachment&#34; resource and &#34;alicloud.cen.InstanceAttachment&#34; resource.
     * 
     */
    @Import(name="bandwidthLimit", required=true)
    private Output<Integer> bandwidthLimit;

    /**
     * @return The bandwidth configured for the interconnected regions communication.
     * 
     * -&gt;**NOTE:** The &#34;alicloud_cen_bandwidthlimit&#34; resource depends on the related &#34;alicloud.cen.BandwidthPackageAttachment&#34; resource and &#34;alicloud.cen.InstanceAttachment&#34; resource.
     * 
     */
    public Output<Integer> bandwidthLimit() {
        return this.bandwidthLimit;
    }

    /**
     * The ID of the CEN.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The ID of the CEN.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * List of the two regions to interconnect. Must be two different regions.
     * 
     */
    @Import(name="regionIds", required=true)
    private Output<List<String>> regionIds;

    /**
     * @return List of the two regions to interconnect. Must be two different regions.
     * 
     */
    public Output<List<String>> regionIds() {
        return this.regionIds;
    }

    private BandwidthLimitArgs() {}

    private BandwidthLimitArgs(BandwidthLimitArgs $) {
        this.bandwidthLimit = $.bandwidthLimit;
        this.instanceId = $.instanceId;
        this.regionIds = $.regionIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BandwidthLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BandwidthLimitArgs $;

        public Builder() {
            $ = new BandwidthLimitArgs();
        }

        public Builder(BandwidthLimitArgs defaults) {
            $ = new BandwidthLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthLimit The bandwidth configured for the interconnected regions communication.
         * 
         * -&gt;**NOTE:** The &#34;alicloud_cen_bandwidthlimit&#34; resource depends on the related &#34;alicloud.cen.BandwidthPackageAttachment&#34; resource and &#34;alicloud.cen.InstanceAttachment&#34; resource.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimit(Output<Integer> bandwidthLimit) {
            $.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * @param bandwidthLimit The bandwidth configured for the interconnected regions communication.
         * 
         * -&gt;**NOTE:** The &#34;alicloud_cen_bandwidthlimit&#34; resource depends on the related &#34;alicloud.cen.BandwidthPackageAttachment&#34; resource and &#34;alicloud.cen.InstanceAttachment&#34; resource.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthLimit(Integer bandwidthLimit) {
            return bandwidthLimit(Output.of(bandwidthLimit));
        }

        /**
         * @param instanceId The ID of the CEN.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the CEN.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param regionIds List of the two regions to interconnect. Must be two different regions.
         * 
         * @return builder
         * 
         */
        public Builder regionIds(Output<List<String>> regionIds) {
            $.regionIds = regionIds;
            return this;
        }

        /**
         * @param regionIds List of the two regions to interconnect. Must be two different regions.
         * 
         * @return builder
         * 
         */
        public Builder regionIds(List<String> regionIds) {
            return regionIds(Output.of(regionIds));
        }

        /**
         * @param regionIds List of the two regions to interconnect. Must be two different regions.
         * 
         * @return builder
         * 
         */
        public Builder regionIds(String... regionIds) {
            return regionIds(List.of(regionIds));
        }

        public BandwidthLimitArgs build() {
            if ($.bandwidthLimit == null) {
                throw new MissingRequiredPropertyException("BandwidthLimitArgs", "bandwidthLimit");
            }
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("BandwidthLimitArgs", "instanceId");
            }
            if ($.regionIds == null) {
                throw new MissingRequiredPropertyException("BandwidthLimitArgs", "regionIds");
            }
            return $;
        }
    }

}