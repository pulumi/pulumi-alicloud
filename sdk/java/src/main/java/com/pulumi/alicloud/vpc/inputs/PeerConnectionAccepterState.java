// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PeerConnectionAccepterState extends com.pulumi.resources.ResourceArgs {

    public static final PeerConnectionAccepterState Empty = new PeerConnectionAccepterState();

    /**
     * The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.&gt; If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
     * 
     */
    @Import(name="acceptingOwnerUid")
    private @Nullable Output<Integer> acceptingOwnerUid;

    /**
     * @return The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.&gt; If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
     * 
     */
    public Optional<Output<Integer>> acceptingOwnerUid() {
        return Optional.ofNullable(this.acceptingOwnerUid);
    }

    /**
     * The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
     * 
     */
    @Import(name="acceptingRegionId")
    private @Nullable Output<String> acceptingRegionId;

    /**
     * @return The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
     * 
     */
    public Optional<Output<String>> acceptingRegionId() {
        return Optional.ofNullable(this.acceptingRegionId);
    }

    /**
     * The VPC ID of the receiving end of the VPC peer connection.
     * 
     */
    @Import(name="acceptingVpcId")
    private @Nullable Output<String> acceptingVpcId;

    /**
     * @return The VPC ID of the receiving end of the VPC peer connection.
     * 
     */
    public Optional<Output<String>> acceptingVpcId() {
        return Optional.ofNullable(this.acceptingVpcId);
    }

    /**
     * The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
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
     * The ID of the instance of the created VPC peer connection.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of the instance of the created VPC peer connection.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="peerConnectionAccepterName")
    private @Nullable Output<String> peerConnectionAccepterName;

    /**
     * @return The name of the resource
     * 
     */
    public Optional<Output<String>> peerConnectionAccepterName() {
        return Optional.ofNullable(this.peerConnectionAccepterName);
    }

    /**
     * The status of the resource
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * You must create a VPC ID on the initiator of a VPC peer connection.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return You must create a VPC ID on the initiator of a VPC peer connection.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private PeerConnectionAccepterState() {}

    private PeerConnectionAccepterState(PeerConnectionAccepterState $) {
        this.acceptingOwnerUid = $.acceptingOwnerUid;
        this.acceptingRegionId = $.acceptingRegionId;
        this.acceptingVpcId = $.acceptingVpcId;
        this.bandwidth = $.bandwidth;
        this.description = $.description;
        this.dryRun = $.dryRun;
        this.instanceId = $.instanceId;
        this.peerConnectionAccepterName = $.peerConnectionAccepterName;
        this.status = $.status;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PeerConnectionAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PeerConnectionAccepterState $;

        public Builder() {
            $ = new PeerConnectionAccepterState();
        }

        public Builder(PeerConnectionAccepterState defaults) {
            $ = new PeerConnectionAccepterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptingOwnerUid The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.&gt; If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
         * 
         * @return builder
         * 
         */
        public Builder acceptingOwnerUid(@Nullable Output<Integer> acceptingOwnerUid) {
            $.acceptingOwnerUid = acceptingOwnerUid;
            return this;
        }

        /**
         * @param acceptingOwnerUid The ID of the Alibaba Cloud account (primary account) of the receiving end of the VPC peering connection to be created.-Enter the ID of your Alibaba Cloud account to create a peer-to-peer connection to the VPC account.-Enter the ID of another Alibaba Cloud account to create a cross-account VPC peer-to-peer connection.&gt; If the recipient account is a RAM user (sub-account), enter the ID of the Alibaba Cloud account corresponding to the RAM user.
         * 
         * @return builder
         * 
         */
        public Builder acceptingOwnerUid(Integer acceptingOwnerUid) {
            return acceptingOwnerUid(Output.of(acceptingOwnerUid));
        }

        /**
         * @param acceptingRegionId The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
         * 
         * @return builder
         * 
         */
        public Builder acceptingRegionId(@Nullable Output<String> acceptingRegionId) {
            $.acceptingRegionId = acceptingRegionId;
            return this;
        }

        /**
         * @param acceptingRegionId The region ID of the recipient of the VPC peering connection to be created.-When creating a VPC peer-to-peer connection in the same region, enter the same region ID as the region ID of the initiator.-When creating a cross-region VPC peer-to-peer connection, enter a region ID that is different from the region ID of the initiator.
         * 
         * @return builder
         * 
         */
        public Builder acceptingRegionId(String acceptingRegionId) {
            return acceptingRegionId(Output.of(acceptingRegionId));
        }

        /**
         * @param acceptingVpcId The VPC ID of the receiving end of the VPC peer connection.
         * 
         * @return builder
         * 
         */
        public Builder acceptingVpcId(@Nullable Output<String> acceptingVpcId) {
            $.acceptingVpcId = acceptingVpcId;
            return this;
        }

        /**
         * @param acceptingVpcId The VPC ID of the receiving end of the VPC peer connection.
         * 
         * @return builder
         * 
         */
        public Builder acceptingVpcId(String acceptingVpcId) {
            return acceptingVpcId(Output.of(acceptingVpcId));
        }

        /**
         * @param bandwidth The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The bandwidth of the VPC peering connection to be modified. Unit: Mbps. The value range is an integer greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param description The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the VPC peer connection to be created.It must be 2 to 256 characters in length and must start with a letter or Chinese, but cannot start with http:// or https.
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
         * @param instanceId The ID of the instance of the created VPC peer connection.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the instance of the created VPC peer connection.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param peerConnectionAccepterName The name of the resource
         * 
         * @return builder
         * 
         */
        public Builder peerConnectionAccepterName(@Nullable Output<String> peerConnectionAccepterName) {
            $.peerConnectionAccepterName = peerConnectionAccepterName;
            return this;
        }

        /**
         * @param peerConnectionAccepterName The name of the resource
         * 
         * @return builder
         * 
         */
        public Builder peerConnectionAccepterName(String peerConnectionAccepterName) {
            return peerConnectionAccepterName(Output.of(peerConnectionAccepterName));
        }

        /**
         * @param status The status of the resource
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vpcId You must create a VPC ID on the initiator of a VPC peer connection.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId You must create a VPC ID on the initiator of a VPC peer connection.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public PeerConnectionAccepterState build() {
            return $;
        }
    }

}