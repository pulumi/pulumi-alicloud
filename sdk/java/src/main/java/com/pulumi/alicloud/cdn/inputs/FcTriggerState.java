// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FcTriggerState extends com.pulumi.resources.ResourceArgs {

    public static final FcTriggerState Empty = new FcTriggerState();

    /**
     * The name of the Event.
     * 
     */
    @Import(name="eventMetaName")
    private @Nullable Output<String> eventMetaName;

    /**
     * @return The name of the Event.
     * 
     */
    public Optional<Output<String>> eventMetaName() {
        return Optional.ofNullable(this.eventMetaName);
    }

    /**
     * The version of the Event.
     * 
     */
    @Import(name="eventMetaVersion")
    private @Nullable Output<String> eventMetaVersion;

    /**
     * @return The version of the Event.
     * 
     */
    public Optional<Output<String>> eventMetaVersion() {
        return Optional.ofNullable(this.eventMetaVersion);
    }

    /**
     * The function arn. The value formats as `acs:fc:{RegionID}:{AccountID}:{Filter}`.
     * 
     */
    @Import(name="functionArn")
    private @Nullable Output<String> functionArn;

    /**
     * @return The function arn. The value formats as `acs:fc:{RegionID}:{AccountID}:{Filter}`.
     * 
     */
    public Optional<Output<String>> functionArn() {
        return Optional.ofNullable(this.functionArn);
    }

    /**
     * The Note information.
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return The Note information.
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    /**
     * The role authorized by RAM. The value formats as `acs:ram::{AccountID}:role/{RoleName}`.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The role authorized by RAM. The value formats as `acs:ram::{AccountID}:role/{RoleName}`.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    /**
     * Resources and filters for event listening. The value formats as `acs:cdn:{RegionID}:{AccountID}:{Filter}`.
     * 
     */
    @Import(name="sourceArn")
    private @Nullable Output<String> sourceArn;

    /**
     * @return Resources and filters for event listening. The value formats as `acs:cdn:{RegionID}:{AccountID}:{Filter}`.
     * 
     */
    public Optional<Output<String>> sourceArn() {
        return Optional.ofNullable(this.sourceArn);
    }

    /**
     * The trigger corresponding to the function Compute Service. The value formats as `acs:fc:{RegionID}:{AccountID}:{Filter}`. See [Create a CDN Fc Trigger](https://www.alibabacloud.com/help/en/cdn/developer-reference/api-cdn-2018-05-10-addfctrigger) for more details.
     * 
     */
    @Import(name="triggerArn")
    private @Nullable Output<String> triggerArn;

    /**
     * @return The trigger corresponding to the function Compute Service. The value formats as `acs:fc:{RegionID}:{AccountID}:{Filter}`. See [Create a CDN Fc Trigger](https://www.alibabacloud.com/help/en/cdn/developer-reference/api-cdn-2018-05-10-addfctrigger) for more details.
     * 
     */
    public Optional<Output<String>> triggerArn() {
        return Optional.ofNullable(this.triggerArn);
    }

    private FcTriggerState() {}

    private FcTriggerState(FcTriggerState $) {
        this.eventMetaName = $.eventMetaName;
        this.eventMetaVersion = $.eventMetaVersion;
        this.functionArn = $.functionArn;
        this.notes = $.notes;
        this.roleArn = $.roleArn;
        this.sourceArn = $.sourceArn;
        this.triggerArn = $.triggerArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FcTriggerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FcTriggerState $;

        public Builder() {
            $ = new FcTriggerState();
        }

        public Builder(FcTriggerState defaults) {
            $ = new FcTriggerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param eventMetaName The name of the Event.
         * 
         * @return builder
         * 
         */
        public Builder eventMetaName(@Nullable Output<String> eventMetaName) {
            $.eventMetaName = eventMetaName;
            return this;
        }

        /**
         * @param eventMetaName The name of the Event.
         * 
         * @return builder
         * 
         */
        public Builder eventMetaName(String eventMetaName) {
            return eventMetaName(Output.of(eventMetaName));
        }

        /**
         * @param eventMetaVersion The version of the Event.
         * 
         * @return builder
         * 
         */
        public Builder eventMetaVersion(@Nullable Output<String> eventMetaVersion) {
            $.eventMetaVersion = eventMetaVersion;
            return this;
        }

        /**
         * @param eventMetaVersion The version of the Event.
         * 
         * @return builder
         * 
         */
        public Builder eventMetaVersion(String eventMetaVersion) {
            return eventMetaVersion(Output.of(eventMetaVersion));
        }

        /**
         * @param functionArn The function arn. The value formats as `acs:fc:{RegionID}:{AccountID}:{Filter}`.
         * 
         * @return builder
         * 
         */
        public Builder functionArn(@Nullable Output<String> functionArn) {
            $.functionArn = functionArn;
            return this;
        }

        /**
         * @param functionArn The function arn. The value formats as `acs:fc:{RegionID}:{AccountID}:{Filter}`.
         * 
         * @return builder
         * 
         */
        public Builder functionArn(String functionArn) {
            return functionArn(Output.of(functionArn));
        }

        /**
         * @param notes The Note information.
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes The Note information.
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        /**
         * @param roleArn The role authorized by RAM. The value formats as `acs:ram::{AccountID}:role/{RoleName}`.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The role authorized by RAM. The value formats as `acs:ram::{AccountID}:role/{RoleName}`.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param sourceArn Resources and filters for event listening. The value formats as `acs:cdn:{RegionID}:{AccountID}:{Filter}`.
         * 
         * @return builder
         * 
         */
        public Builder sourceArn(@Nullable Output<String> sourceArn) {
            $.sourceArn = sourceArn;
            return this;
        }

        /**
         * @param sourceArn Resources and filters for event listening. The value formats as `acs:cdn:{RegionID}:{AccountID}:{Filter}`.
         * 
         * @return builder
         * 
         */
        public Builder sourceArn(String sourceArn) {
            return sourceArn(Output.of(sourceArn));
        }

        /**
         * @param triggerArn The trigger corresponding to the function Compute Service. The value formats as `acs:fc:{RegionID}:{AccountID}:{Filter}`. See [Create a CDN Fc Trigger](https://www.alibabacloud.com/help/en/cdn/developer-reference/api-cdn-2018-05-10-addfctrigger) for more details.
         * 
         * @return builder
         * 
         */
        public Builder triggerArn(@Nullable Output<String> triggerArn) {
            $.triggerArn = triggerArn;
            return this;
        }

        /**
         * @param triggerArn The trigger corresponding to the function Compute Service. The value formats as `acs:fc:{RegionID}:{AccountID}:{Filter}`. See [Create a CDN Fc Trigger](https://www.alibabacloud.com/help/en/cdn/developer-reference/api-cdn-2018-05-10-addfctrigger) for more details.
         * 
         * @return builder
         * 
         */
        public Builder triggerArn(String triggerArn) {
            return triggerArn(Output.of(triggerArn));
        }

        public FcTriggerState build() {
            return $;
        }
    }

}