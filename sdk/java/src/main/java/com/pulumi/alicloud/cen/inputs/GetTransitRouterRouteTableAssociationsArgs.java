// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitRouterRouteTableAssociationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitRouterRouteTableAssociationsArgs Empty = new GetTransitRouterRouteTableAssociationsArgs();

    /**
     * A list of CEN Transit Router Route Table Association IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of CEN Transit Router Route Table Association IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the route table, including `Active`, `Associating`, `Dissociating`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the route table, including `Active`, `Associating`, `Dissociating`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the network instance connection.
     * 
     */
    @Import(name="transitRouterAttachmentId")
    private @Nullable Output<String> transitRouterAttachmentId;

    /**
     * @return The ID of the network instance connection.
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentId() {
        return Optional.ofNullable(this.transitRouterAttachmentId);
    }

    /**
     * The ID of the next hop.
     * 
     */
    @Import(name="transitRouterAttachmentResourceId")
    private @Nullable Output<String> transitRouterAttachmentResourceId;

    /**
     * @return The ID of the next hop.
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentResourceId() {
        return Optional.ofNullable(this.transitRouterAttachmentResourceId);
    }

    /**
     * The type of next hop. Valid values:
     * * `VPC`: virtual private cloud (VPC)
     * * `VBR`: virtual border router (VBR)
     * * `TR`: transit router
     * * `VPN`: VPN attachment
     * 
     */
    @Import(name="transitRouterAttachmentResourceType")
    private @Nullable Output<String> transitRouterAttachmentResourceType;

    /**
     * @return The type of next hop. Valid values:
     * * `VPC`: virtual private cloud (VPC)
     * * `VBR`: virtual border router (VBR)
     * * `TR`: transit router
     * * `VPN`: VPN attachment
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentResourceType() {
        return Optional.ofNullable(this.transitRouterAttachmentResourceType);
    }

    /**
     * The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    @Import(name="transitRouterRouteTableId")
    private @Nullable Output<String> transitRouterRouteTableId;

    /**
     * @return The ID of the route table of the Enterprise Edition transit router.
     * 
     */
    public Optional<Output<String>> transitRouterRouteTableId() {
        return Optional.ofNullable(this.transitRouterRouteTableId);
    }

    private GetTransitRouterRouteTableAssociationsArgs() {}

    private GetTransitRouterRouteTableAssociationsArgs(GetTransitRouterRouteTableAssociationsArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
        this.transitRouterAttachmentId = $.transitRouterAttachmentId;
        this.transitRouterAttachmentResourceId = $.transitRouterAttachmentResourceId;
        this.transitRouterAttachmentResourceType = $.transitRouterAttachmentResourceType;
        this.transitRouterRouteTableId = $.transitRouterRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitRouterRouteTableAssociationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitRouterRouteTableAssociationsArgs $;

        public Builder() {
            $ = new GetTransitRouterRouteTableAssociationsArgs();
        }

        public Builder(GetTransitRouterRouteTableAssociationsArgs defaults) {
            $ = new GetTransitRouterRouteTableAssociationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of CEN Transit Router Route Table Association IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of CEN Transit Router Route Table Association IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of CEN Transit Router Route Table Association IDs.
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
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param status The status of the route table, including `Active`, `Associating`, `Dissociating`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the route table, including `Active`, `Associating`, `Dissociating`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param transitRouterAttachmentId The ID of the network instance connection.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(@Nullable Output<String> transitRouterAttachmentId) {
            $.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * @param transitRouterAttachmentId The ID of the network instance connection.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            return transitRouterAttachmentId(Output.of(transitRouterAttachmentId));
        }

        /**
         * @param transitRouterAttachmentResourceId The ID of the next hop.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentResourceId(@Nullable Output<String> transitRouterAttachmentResourceId) {
            $.transitRouterAttachmentResourceId = transitRouterAttachmentResourceId;
            return this;
        }

        /**
         * @param transitRouterAttachmentResourceId The ID of the next hop.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentResourceId(String transitRouterAttachmentResourceId) {
            return transitRouterAttachmentResourceId(Output.of(transitRouterAttachmentResourceId));
        }

        /**
         * @param transitRouterAttachmentResourceType The type of next hop. Valid values:
         * * `VPC`: virtual private cloud (VPC)
         * * `VBR`: virtual border router (VBR)
         * * `TR`: transit router
         * * `VPN`: VPN attachment
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentResourceType(@Nullable Output<String> transitRouterAttachmentResourceType) {
            $.transitRouterAttachmentResourceType = transitRouterAttachmentResourceType;
            return this;
        }

        /**
         * @param transitRouterAttachmentResourceType The type of next hop. Valid values:
         * * `VPC`: virtual private cloud (VPC)
         * * `VBR`: virtual border router (VBR)
         * * `TR`: transit router
         * * `VPN`: VPN attachment
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentResourceType(String transitRouterAttachmentResourceType) {
            return transitRouterAttachmentResourceType(Output.of(transitRouterAttachmentResourceType));
        }

        /**
         * @param transitRouterRouteTableId The ID of the route table of the Enterprise Edition transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableId(@Nullable Output<String> transitRouterRouteTableId) {
            $.transitRouterRouteTableId = transitRouterRouteTableId;
            return this;
        }

        /**
         * @param transitRouterRouteTableId The ID of the route table of the Enterprise Edition transit router.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterRouteTableId(String transitRouterRouteTableId) {
            return transitRouterRouteTableId(Output.of(transitRouterRouteTableId));
        }

        public GetTransitRouterRouteTableAssociationsArgs build() {
            return $;
        }
    }

}
