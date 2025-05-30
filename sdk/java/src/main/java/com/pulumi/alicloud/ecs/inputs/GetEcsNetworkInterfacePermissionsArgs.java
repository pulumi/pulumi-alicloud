// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEcsNetworkInterfacePermissionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEcsNetworkInterfacePermissionsArgs Empty = new GetEcsNetworkInterfacePermissionsArgs();

    /**
     * A list of Network Interface Permission IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Network Interface Permission IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The ID of the network interface.
     * 
     */
    @Import(name="networkInterfaceId", required=true)
    private Output<String> networkInterfaceId;

    /**
     * @return The ID of the network interface.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
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

    @Import(name="pageNumber")
    private @Nullable Output<Integer> pageNumber;

    public Optional<Output<Integer>> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Output<Integer> pageSize;

    public Optional<Output<Integer>> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The Status of the Network Interface Permissions. Valid values: `Granted`, `Pending`, `Revoked`, `Revoking`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The Status of the Network Interface Permissions. Valid values: `Granted`, `Pending`, `Revoked`, `Revoking`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetEcsNetworkInterfacePermissionsArgs() {}

    private GetEcsNetworkInterfacePermissionsArgs(GetEcsNetworkInterfacePermissionsArgs $) {
        this.ids = $.ids;
        this.networkInterfaceId = $.networkInterfaceId;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEcsNetworkInterfacePermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEcsNetworkInterfacePermissionsArgs $;

        public Builder() {
            $ = new GetEcsNetworkInterfacePermissionsArgs();
        }

        public Builder(GetEcsNetworkInterfacePermissionsArgs defaults) {
            $ = new GetEcsNetworkInterfacePermissionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Network Interface Permission IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Network Interface Permission IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Network Interface Permission IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param networkInterfaceId The ID of the network interface.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(Output<String> networkInterfaceId) {
            $.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * @param networkInterfaceId The ID of the network interface.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            return networkInterfaceId(Output.of(networkInterfaceId));
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

        public Builder pageNumber(@Nullable Output<Integer> pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageNumber(Integer pageNumber) {
            return pageNumber(Output.of(pageNumber));
        }

        public Builder pageSize(@Nullable Output<Integer> pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            return pageSize(Output.of(pageSize));
        }

        /**
         * @param status The Status of the Network Interface Permissions. Valid values: `Granted`, `Pending`, `Revoked`, `Revoking`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The Status of the Network Interface Permissions. Valid values: `Granted`, `Pending`, `Revoked`, `Revoking`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetEcsNetworkInterfacePermissionsArgs build() {
            if ($.networkInterfaceId == null) {
                throw new MissingRequiredPropertyException("GetEcsNetworkInterfacePermissionsArgs", "networkInterfaceId");
            }
            return $;
        }
    }

}
