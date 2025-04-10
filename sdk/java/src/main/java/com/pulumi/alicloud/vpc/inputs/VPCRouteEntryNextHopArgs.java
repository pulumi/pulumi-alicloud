// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.alicloud.vpc.inputs.VPCRouteEntryNextHopNextHopRelatedInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VPCRouteEntryNextHopArgs extends com.pulumi.resources.ResourceArgs {

    public static final VPCRouteEntryNextHopArgs Empty = new VPCRouteEntryNextHopArgs();

    /**
     * Whether the route is available.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Integer> enabled;

    /**
     * @return Whether the route is available.
     * 
     */
    public Optional<Output<Integer>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The region of the next instance.
     * 
     */
    @Import(name="nextHopRegionId")
    private @Nullable Output<String> nextHopRegionId;

    /**
     * @return The region of the next instance.
     * 
     */
    public Optional<Output<String>> nextHopRegionId() {
        return Optional.ofNullable(this.nextHopRegionId);
    }

    /**
     * Next hop information.
     * 
     */
    @Import(name="nextHopRelatedInfo")
    private @Nullable Output<VPCRouteEntryNextHopNextHopRelatedInfoArgs> nextHopRelatedInfo;

    /**
     * @return Next hop information.
     * 
     */
    public Optional<Output<VPCRouteEntryNextHopNextHopRelatedInfoArgs>> nextHopRelatedInfo() {
        return Optional.ofNullable(this.nextHopRelatedInfo);
    }

    /**
     * ID of next hop
     * 
     */
    @Import(name="nexthopId")
    private @Nullable Output<String> nexthopId;

    /**
     * @return ID of next hop
     * 
     */
    public Optional<Output<String>> nexthopId() {
        return Optional.ofNullable(this.nexthopId);
    }

    /**
     * type of next hop
     * 
     */
    @Import(name="nexthopType")
    private @Nullable Output<String> nexthopType;

    /**
     * @return type of next hop
     * 
     */
    public Optional<Output<String>> nexthopType() {
        return Optional.ofNullable(this.nexthopType);
    }

    /**
     * The weight of the route entry.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return The weight of the route entry.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private VPCRouteEntryNextHopArgs() {}

    private VPCRouteEntryNextHopArgs(VPCRouteEntryNextHopArgs $) {
        this.enabled = $.enabled;
        this.nextHopRegionId = $.nextHopRegionId;
        this.nextHopRelatedInfo = $.nextHopRelatedInfo;
        this.nexthopId = $.nexthopId;
        this.nexthopType = $.nexthopType;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VPCRouteEntryNextHopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VPCRouteEntryNextHopArgs $;

        public Builder() {
            $ = new VPCRouteEntryNextHopArgs();
        }

        public Builder(VPCRouteEntryNextHopArgs defaults) {
            $ = new VPCRouteEntryNextHopArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether the route is available.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Integer> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the route is available.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Integer enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param nextHopRegionId The region of the next instance.
         * 
         * @return builder
         * 
         */
        public Builder nextHopRegionId(@Nullable Output<String> nextHopRegionId) {
            $.nextHopRegionId = nextHopRegionId;
            return this;
        }

        /**
         * @param nextHopRegionId The region of the next instance.
         * 
         * @return builder
         * 
         */
        public Builder nextHopRegionId(String nextHopRegionId) {
            return nextHopRegionId(Output.of(nextHopRegionId));
        }

        /**
         * @param nextHopRelatedInfo Next hop information.
         * 
         * @return builder
         * 
         */
        public Builder nextHopRelatedInfo(@Nullable Output<VPCRouteEntryNextHopNextHopRelatedInfoArgs> nextHopRelatedInfo) {
            $.nextHopRelatedInfo = nextHopRelatedInfo;
            return this;
        }

        /**
         * @param nextHopRelatedInfo Next hop information.
         * 
         * @return builder
         * 
         */
        public Builder nextHopRelatedInfo(VPCRouteEntryNextHopNextHopRelatedInfoArgs nextHopRelatedInfo) {
            return nextHopRelatedInfo(Output.of(nextHopRelatedInfo));
        }

        /**
         * @param nexthopId ID of next hop
         * 
         * @return builder
         * 
         */
        public Builder nexthopId(@Nullable Output<String> nexthopId) {
            $.nexthopId = nexthopId;
            return this;
        }

        /**
         * @param nexthopId ID of next hop
         * 
         * @return builder
         * 
         */
        public Builder nexthopId(String nexthopId) {
            return nexthopId(Output.of(nexthopId));
        }

        /**
         * @param nexthopType type of next hop
         * 
         * @return builder
         * 
         */
        public Builder nexthopType(@Nullable Output<String> nexthopType) {
            $.nexthopType = nexthopType;
            return this;
        }

        /**
         * @param nexthopType type of next hop
         * 
         * @return builder
         * 
         */
        public Builder nexthopType(String nexthopType) {
            return nexthopType(Output.of(nexthopType));
        }

        /**
         * @param weight The weight of the route entry.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The weight of the route entry.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public VPCRouteEntryNextHopArgs build() {
            return $;
        }
    }

}
