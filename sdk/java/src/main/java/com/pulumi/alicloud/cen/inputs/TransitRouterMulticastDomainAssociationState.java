// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitRouterMulticastDomainAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final TransitRouterMulticastDomainAssociationState Empty = new TransitRouterMulticastDomainAssociationState();

    /**
     * The status of the Transit Router Multicast Domain Association.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Transit Router Multicast Domain Association.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the VPC connection.
     * 
     */
    @Import(name="transitRouterAttachmentId")
    private @Nullable Output<String> transitRouterAttachmentId;

    /**
     * @return The ID of the VPC connection.
     * 
     */
    public Optional<Output<String>> transitRouterAttachmentId() {
        return Optional.ofNullable(this.transitRouterAttachmentId);
    }

    /**
     * The ID of the multicast domain.
     * 
     */
    @Import(name="transitRouterMulticastDomainId")
    private @Nullable Output<String> transitRouterMulticastDomainId;

    /**
     * @return The ID of the multicast domain.
     * 
     */
    public Optional<Output<String>> transitRouterMulticastDomainId() {
        return Optional.ofNullable(this.transitRouterMulticastDomainId);
    }

    /**
     * The ID of the vSwitch.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The ID of the vSwitch.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private TransitRouterMulticastDomainAssociationState() {}

    private TransitRouterMulticastDomainAssociationState(TransitRouterMulticastDomainAssociationState $) {
        this.status = $.status;
        this.transitRouterAttachmentId = $.transitRouterAttachmentId;
        this.transitRouterMulticastDomainId = $.transitRouterMulticastDomainId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitRouterMulticastDomainAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitRouterMulticastDomainAssociationState $;

        public Builder() {
            $ = new TransitRouterMulticastDomainAssociationState();
        }

        public Builder(TransitRouterMulticastDomainAssociationState defaults) {
            $ = new TransitRouterMulticastDomainAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param status The status of the Transit Router Multicast Domain Association.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Transit Router Multicast Domain Association.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param transitRouterAttachmentId The ID of the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(@Nullable Output<String> transitRouterAttachmentId) {
            $.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * @param transitRouterAttachmentId The ID of the VPC connection.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            return transitRouterAttachmentId(Output.of(transitRouterAttachmentId));
        }

        /**
         * @param transitRouterMulticastDomainId The ID of the multicast domain.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainId(@Nullable Output<String> transitRouterMulticastDomainId) {
            $.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
            return this;
        }

        /**
         * @param transitRouterMulticastDomainId The ID of the multicast domain.
         * 
         * @return builder
         * 
         */
        public Builder transitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
            return transitRouterMulticastDomainId(Output.of(transitRouterMulticastDomainId));
        }

        /**
         * @param vswitchId The ID of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public TransitRouterMulticastDomainAssociationState build() {
            return $;
        }
    }

}
