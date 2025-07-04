// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitRouterRouteTablePropagationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitRouterRouteTablePropagationsPlainArgs Empty = new GetTransitRouterRouteTablePropagationsPlainArgs();

    /**
     * A list of Transit Router Route Table Propagation IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Transit Router Route Table Propagation IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the route learning correlation. Valid values: `Active`, `Enabling`, `Disabling`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the route learning correlation. Valid values: `Active`, `Enabling`, `Disabling`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the network instance connection.
     * 
     */
    @Import(name="transitRouterAttachmentId")
    private @Nullable String transitRouterAttachmentId;

    /**
     * @return The ID of the network instance connection.
     * 
     */
    public Optional<String> transitRouterAttachmentId() {
        return Optional.ofNullable(this.transitRouterAttachmentId);
    }

    /**
     * The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    @Import(name="transitRouterRouteTableId", required=true)
    private String transitRouterRouteTableId;

    /**
     * @return The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    public String transitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    private GetTransitRouterRouteTablePropagationsPlainArgs() {}

    private GetTransitRouterRouteTablePropagationsPlainArgs(GetTransitRouterRouteTablePropagationsPlainArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
        this.transitRouterAttachmentId = $.transitRouterAttachmentId;
        this.transitRouterRouteTableId = $.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitRouterRouteTablePropagationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitRouterRouteTablePropagationsPlainArgs $;

        public Builder() {
            $ = new GetTransitRouterRouteTablePropagationsPlainArgs();
        }

        public Builder(GetTransitRouterRouteTablePropagationsPlainArgs defaults) {
            $ = new GetTransitRouterRouteTablePropagationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Transit Router Route Table Propagation IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Transit Router Route Table Propagation IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The status of the route learning correlation. Valid values: `Active`, `Enabling`, `Disabling`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param transitRouterAttachmentId The ID of the network instance connection.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(@Nullable String transitRouterAttachmentId) {
            $.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * @param transitRouterRouteTableId The ID of the route table of the Enterprise Edition transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            $.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        public GetTransitRouterRouteTablePropagationsPlainArgs build() {
            if ($.transitRouterRouteTableId == null) {
                throw new MissingRequiredPropertyException("GetTransitRouterRouteTablePropagationsPlainArgs", "transitRouterRouteTableId");
            }
            return $;
        }
    }

}
