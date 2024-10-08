// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterRouteTableState extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterRouteTableState Empty = new TransitRouterRouteTableState();

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
     * The associating status of the Transit Router.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The associating status of the Transit Router.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
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

    /**
     * The description of the transit router route table.
     * 
     */
    @Import(name="transitRouterRouteTableDescription")
    private @Nullable Output<String> transitRouterRouteTableDescription;

    /**
     * @return The description of the transit router route table.
     * 
     */
    public Optional<Output<String>> transitRouterRouteTableDescription() {
        return Optional.ofNullable(this.transitRouterRouteTableDescription);
    }

    /**
     * The id of the transit router route table.
     * 
     */
    @Import(name="transitRouterRouteTableId")
    private @Nullable Output<String> transitRouterRouteTableId;

    /**
     * @return The id of the transit router route table.
     * 
     */
    public Optional<Output<String>> transitRouterRouteTableId() {
        return Optional.ofNullable(this.transitRouterRouteTableId);
    }

    /**
     * The name of the transit router route table.
     * 
     */
    @Import(name="transitRouterRouteTableName")
    private @Nullable Output<String> transitRouterRouteTableName;

    /**
     * @return The name of the transit router route table.
     * 
     */
    public Optional<Output<String>> transitRouterRouteTableName() {
        return Optional.ofNullable(this.transitRouterRouteTableName);
    }

    /**
     * The type of the transit router route table. Valid values: `Custom`, `System`.
     * 
     */
    @Import(name="transitRouterRouteTableType")
    private @Nullable Output<String> transitRouterRouteTableType;

    /**
     * @return The type of the transit router route table. Valid values: `Custom`, `System`.
     * 
     */
    public Optional<Output<String>> transitRouterRouteTableType() {
        return Optional.ofNullable(this.transitRouterRouteTableType);
    }

    private TransitRouterRouteTableState() {}

    private TransitRouterRouteTableState(TransitRouterRouteTableState $) {
        this.dryRun = $.dryRun;
        this.status = $.status;
        this.tags = $.tags;
        this.transitRouterId = $.transitRouterId;
        this.transitRouterRouteTableDescription = $.transitRouterRouteTableDescription;
        this.transitRouterRouteTableId = $.transitRouterRouteTableId;
        this.transitRouterRouteTableName = $.transitRouterRouteTableName;
        this.transitRouterRouteTableType = $.transitRouterRouteTableType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterRouteTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterRouteTableState $;

        public Builder() {
            $ = new TransitRouterRouteTableState();
        }

        public Builder(TransitRouterRouteTableState defaults) {
            $ = new TransitRouterRouteTableState(Objects.requireNonNull(defaults));
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
         * @param status The associating status of the Transit Router.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The associating status of the Transit Router.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
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

        /**
         * @param transitRouterRouteTableDescription The description of the transit router route table.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableDescription(@Nullable Output<String> transitRouterRouteTableDescription) {
            $.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
            return this;
        }

        /**
         * @param transitRouterRouteTableDescription The description of the transit router route table.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
            return transitRouterRouteTableDescription(Output.of(transitRouterRouteTableDescription));
        }

        /**
         * @param transitRouterRouteTableId The id of the transit router route table.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableId(@Nullable Output<String> transitRouterRouteTableId) {
            $.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        /**
         * @param transitRouterRouteTableId The id of the transit router route table.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            return transitRouterRouteTableId(Output.of(transitRouterRouteTableId));
        }

        /**
         * @param transitRouterRouteTableName The name of the transit router route table.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableName(@Nullable Output<String> transitRouterRouteTableName) {
            $.transitRouterRouteTableName = transitRouterRouteTableName;
            return this;
        }

        /**
         * @param transitRouterRouteTableName The name of the transit router route table.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableName(String transitRouterRouteTableName) {
            return transitRouterRouteTableName(Output.of(transitRouterRouteTableName));
        }

        /**
         * @param transitRouterRouteTableType The type of the transit router route table. Valid values: `Custom`, `System`.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableType(@Nullable Output<String> transitRouterRouteTableType) {
            $.transitRouterRouteTableType = transitRouterRouteTableType;
            return this;
        }

        /**
         * @param transitRouterRouteTableType The type of the transit router route table. Valid values: `Custom`, `System`.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableType(String transitRouterRouteTableType) {
            return transitRouterRouteTableType(Output.of(transitRouterRouteTableType));
        }

        public TransitRouterRouteTableState build() {
            return $;
        }
    }

}
