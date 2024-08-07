// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertContactGroupState extends com.pulumi.resources.ResourceArgs {

    public static final AlertContactGroupState Empty = new AlertContactGroupState();

    /**
     * The name of the resource.
     * 
     */
    @Import(name="alertContactGroupName")
    private @Nullable Output<String> alertContactGroupName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<Output<String>> alertContactGroupName() {
        return Optional.ofNullable(this.alertContactGroupName);
    }

    /**
     * The list id of alert contact.
     * 
     */
    @Import(name="contactIds")
    private @Nullable Output<List<String>> contactIds;

    /**
     * @return The list id of alert contact.
     * 
     */
    public Optional<Output<List<String>>> contactIds() {
        return Optional.ofNullable(this.contactIds);
    }

    private AlertContactGroupState() {}

    private AlertContactGroupState(AlertContactGroupState $) {
        this.alertContactGroupName = $.alertContactGroupName;
        this.contactIds = $.contactIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertContactGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertContactGroupState $;

        public Builder() {
            $ = new AlertContactGroupState();
        }

        public Builder(AlertContactGroupState defaults) {
            $ = new AlertContactGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertContactGroupName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder alertContactGroupName(@Nullable Output<String> alertContactGroupName) {
            $.alertContactGroupName = alertContactGroupName;
            return this;
        }

        /**
         * @param alertContactGroupName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder alertContactGroupName(String alertContactGroupName) {
            return alertContactGroupName(Output.of(alertContactGroupName));
        }

        /**
         * @param contactIds The list id of alert contact.
         * 
         * @return builder
         * 
         */
        public Builder contactIds(@Nullable Output<List<String>> contactIds) {
            $.contactIds = contactIds;
            return this;
        }

        /**
         * @param contactIds The list id of alert contact.
         * 
         * @return builder
         * 
         */
        public Builder contactIds(List<String> contactIds) {
            return contactIds(Output.of(contactIds));
        }

        /**
         * @param contactIds The list id of alert contact.
         * 
         * @return builder
         * 
         */
        public Builder contactIds(String... contactIds) {
            return contactIds(List.of(contactIds));
        }

        public AlertContactGroupState build() {
            return $;
        }
    }

}
