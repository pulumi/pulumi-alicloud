// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPeerConnectionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPeerConnectionsArgs Empty = new GetPeerConnectionsArgs();

    /**
     * A list of PeerConnection IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of PeerConnection IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by PeerConnection name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by PeerConnection name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
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
     * The name of the resource.
     * 
     */
    @Import(name="peerConnectionName")
    private @Nullable Output<String> peerConnectionName;

    /**
     * @return The name of the resource.
     * 
     */
    public Optional<Output<String>> peerConnectionName() {
        return Optional.ofNullable(this.peerConnectionName);
    }

    /**
     * The status of the resource. Valid values: `Accepting`, `Activated`, `Creating`, `Deleted`, `Deleting`, `Expired`, `Rejected`, `Updating`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource. Valid values: `Accepting`, `Activated`, `Creating`, `Deleted`, `Deleting`, `Expired`, `Rejected`, `Updating`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the requester VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the requester VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private GetPeerConnectionsArgs() {}

    private GetPeerConnectionsArgs(GetPeerConnectionsArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.peerConnectionName = $.peerConnectionName;
        this.status = $.status;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPeerConnectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPeerConnectionsArgs $;

        public Builder() {
            $ = new GetPeerConnectionsArgs();
        }

        public Builder(GetPeerConnectionsArgs defaults) {
            $ = new GetPeerConnectionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of PeerConnection IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of PeerConnection IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of PeerConnection IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by PeerConnection name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by PeerConnection name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
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
         * @param peerConnectionName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerConnectionName(@Nullable Output<String> peerConnectionName) {
            $.peerConnectionName = peerConnectionName;
            return this;
        }

        /**
         * @param peerConnectionName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder peerConnectionName(String peerConnectionName) {
            return peerConnectionName(Output.of(peerConnectionName));
        }

        /**
         * @param status The status of the resource. Valid values: `Accepting`, `Activated`, `Creating`, `Deleted`, `Deleting`, `Expired`, `Rejected`, `Updating`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `Accepting`, `Activated`, `Creating`, `Deleted`, `Deleting`, `Expired`, `Rejected`, `Updating`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vpcId The ID of the requester VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the requester VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public GetPeerConnectionsArgs build() {
            return $;
        }
    }

}