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


public final class GetTransitRouterMulticastDomainPeerMembersPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitRouterMulticastDomainPeerMembersPlainArgs Empty = new GetTransitRouterMulticastDomainPeerMembersPlainArgs();

    /**
     * A list of Cen Transit Router Multicast Domain Peer Member IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Cen Transit Router Multicast Domain Peer Member IDs.
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
     * The IDs of the inter-region multicast domains.
     * 
     */
    @Import(name="peerTransitRouterMulticastDomains")
    private @Nullable List<String> peerTransitRouterMulticastDomains;

    /**
     * @return The IDs of the inter-region multicast domains.
     * 
     */
    public Optional<List<String>> peerTransitRouterMulticastDomains() {
        return Optional.ofNullable(this.peerTransitRouterMulticastDomains);
    }

    /**
     * The ID of the resource associated with the multicast resource.
     * 
     */
    @Import(name="resourceId")
    private @Nullable String resourceId;

    /**
     * @return The ID of the resource associated with the multicast resource.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The type of the multicast resource. Valid values:
     * * VPC: queries multicast resources by VPC.
     * * TR: queries multicast resources that are also deployed in a different region.
     * 
     */
    @Import(name="resourceType")
    private @Nullable String resourceType;

    /**
     * @return The type of the multicast resource. Valid values:
     * * VPC: queries multicast resources by VPC.
     * * TR: queries multicast resources that are also deployed in a different region.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
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
     * The ID of the multicast domain to which the multicast member belongs.
     * 
     */
    @Import(name="transitRouterMulticastDomainId", required=true)
    private String transitRouterMulticastDomainId;

    /**
     * @return The ID of the multicast domain to which the multicast member belongs.
     * 
     */
    public String transitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    private GetTransitRouterMulticastDomainPeerMembersPlainArgs() {}

    private GetTransitRouterMulticastDomainPeerMembersPlainArgs(GetTransitRouterMulticastDomainPeerMembersPlainArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.peerTransitRouterMulticastDomains = $.peerTransitRouterMulticastDomains;
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
        this.transitRouterAttachmentId = $.transitRouterAttachmentId;
        this.transitRouterMulticastDomainId = $.transitRouterMulticastDomainId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitRouterMulticastDomainPeerMembersPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitRouterMulticastDomainPeerMembersPlainArgs $;

        public Builder() {
            $ = new GetTransitRouterMulticastDomainPeerMembersPlainArgs();
        }

        public Builder(GetTransitRouterMulticastDomainPeerMembersPlainArgs defaults) {
            $ = new GetTransitRouterMulticastDomainPeerMembersPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Cen Transit Router Multicast Domain Peer Member IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Cen Transit Router Multicast Domain Peer Member IDs.
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
         * @param peerTransitRouterMulticastDomains The IDs of the inter-region multicast domains.
         * 
         * @return builder
         * 
         */
        public Builder peerTransitRouterMulticastDomains(@Nullable List<String> peerTransitRouterMulticastDomains) {
            $.peerTransitRouterMulticastDomains = peerTransitRouterMulticastDomains;
            return this;
        }

        /**
         * @param peerTransitRouterMulticastDomains The IDs of the inter-region multicast domains.
         * 
         * @return builder
         * 
         */
        public Builder peerTransitRouterMulticastDomains(String... peerTransitRouterMulticastDomains) {
            return peerTransitRouterMulticastDomains(List.of(peerTransitRouterMulticastDomains));
        }

        /**
         * @param resourceId The ID of the resource associated with the multicast resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable String resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceType The type of the multicast resource. Valid values:
         * * VPC: queries multicast resources by VPC.
         * * TR: queries multicast resources that are also deployed in a different region.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable String resourceType) {
            $.resourceType = resourceType;
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
         * @param transitRouterMulticastDomainId The ID of the multicast domain to which the multicast member belongs.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            $.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        public GetTransitRouterMulticastDomainPeerMembersPlainArgs build() {
            if ($.transitRouterMulticastDomainId == null) {
                throw new MissingRequiredPropertyException("GetTransitRouterMulticastDomainPeerMembersPlainArgs", "transitRouterMulticastDomainId");
            }
            return $;
        }
    }

}