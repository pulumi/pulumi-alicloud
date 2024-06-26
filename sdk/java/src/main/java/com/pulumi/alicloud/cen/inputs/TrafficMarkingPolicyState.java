// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrafficMarkingPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final TrafficMarkingPolicyState Empty = new TrafficMarkingPolicyState();

    /**
     * The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The dry run.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
     * 
     */
    @Import(name="markingDscp")
    private @Nullable Output<Integer> markingDscp;

    /**
     * @return The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
     * 
     */
    public Optional<Output<Integer>> markingDscp() {
        return Optional.ofNullable(this.markingDscp);
    }

    /**
     * The Priority of the Traffic Marking Policy. Value range: 1~100.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The Priority of the Traffic Marking Policy. Value range: 1~100.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the Traffic Marking Policy.
     * 
     */
    @Import(name="trafficMarkingPolicyId")
    private @Nullable Output<String> trafficMarkingPolicyId;

    /**
     * @return The ID of the Traffic Marking Policy.
     * 
     */
    public Optional<Output<String>> trafficMarkingPolicyId() {
        return Optional.ofNullable(this.trafficMarkingPolicyId);
    }

    /**
     * The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     * 
     */
    @Import(name="trafficMarkingPolicyName")
    private @Nullable Output<String> trafficMarkingPolicyName;

    /**
     * @return The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
     * 
     */
    public Optional<Output<String>> trafficMarkingPolicyName() {
        return Optional.ofNullable(this.trafficMarkingPolicyName);
    }

    /**
     * The ID of the transit router.
     * 
     */
    @Import(name="transitRouterId")
    private @Nullable Output<String> transitRouterId;

    /**
     * @return The ID of the transit router.
     * 
     */
    public Optional<Output<String>> transitRouterId() {
        return Optional.ofNullable(this.transitRouterId);
    }

    private TrafficMarkingPolicyState() {}

    private TrafficMarkingPolicyState(TrafficMarkingPolicyState $) {
        this.description = $.description;
        this.dryRun = $.dryRun;
        this.markingDscp = $.markingDscp;
        this.priority = $.priority;
        this.status = $.status;
        this.trafficMarkingPolicyId = $.trafficMarkingPolicyId;
        this.trafficMarkingPolicyName = $.trafficMarkingPolicyName;
        this.transitRouterId = $.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrafficMarkingPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrafficMarkingPolicyState $;

        public Builder() {
            $ = new TrafficMarkingPolicyState();
        }

        public Builder(TrafficMarkingPolicyState defaults) {
            $ = new TrafficMarkingPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Traffic Marking Policy. The description must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param markingDscp The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
         * 
         * @return builder
         * 
         */
        public Builder markingDscp(@Nullable Output<Integer> markingDscp) {
            $.markingDscp = markingDscp;
            return this;
        }

        /**
         * @param markingDscp The DSCP(Differentiated Services Code Point) of the Traffic Marking Policy. Value range: 0~63.
         * 
         * @return builder
         * 
         */
        public Builder markingDscp(Integer markingDscp) {
            return markingDscp(Output.of(markingDscp));
        }

        /**
         * @param priority The Priority of the Traffic Marking Policy. Value range: 1~100.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The Priority of the Traffic Marking Policy. Value range: 1~100.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param trafficMarkingPolicyId The ID of the Traffic Marking Policy.
         * 
         * @return builder
         * 
         */
        public Builder trafficMarkingPolicyId(@Nullable Output<String> trafficMarkingPolicyId) {
            $.trafficMarkingPolicyId = trafficMarkingPolicyId;
            return this;
        }

        /**
         * @param trafficMarkingPolicyId The ID of the Traffic Marking Policy.
         * 
         * @return builder
         * 
         */
        public Builder trafficMarkingPolicyId(String trafficMarkingPolicyId) {
            return trafficMarkingPolicyId(Output.of(trafficMarkingPolicyId));
        }

        /**
         * @param trafficMarkingPolicyName The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder trafficMarkingPolicyName(@Nullable Output<String> trafficMarkingPolicyName) {
            $.trafficMarkingPolicyName = trafficMarkingPolicyName;
            return this;
        }

        /**
         * @param trafficMarkingPolicyName The name of the Traffic Marking Policy. The name must be 2 to 128 characters in length, and must start with a letter. It can contain digits, underscores (_), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder trafficMarkingPolicyName(String trafficMarkingPolicyName) {
            return trafficMarkingPolicyName(Output.of(trafficMarkingPolicyName));
        }

        /**
         * @param transitRouterId The ID of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(@Nullable Output<String> transitRouterId) {
            $.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * @param transitRouterId The ID of the transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterId(String transitRouterId) {
            return transitRouterId(Output.of(transitRouterId));
        }

        public TrafficMarkingPolicyState build() {
            return $;
        }
    }

}
