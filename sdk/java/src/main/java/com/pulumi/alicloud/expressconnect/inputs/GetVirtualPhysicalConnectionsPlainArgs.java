// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualPhysicalConnectionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualPhysicalConnectionsPlainArgs Empty = new GetVirtualPhysicalConnectionsPlainArgs();

    /**
     * The commercial status of the physical line. Value:
     * - **Normal**: activated.
     * - **Financialized**: Arrears locked.
     * - **SecurityLocked**: locked for security reasons.
     * 
     */
    @Import(name="businessStatus")
    private @Nullable String businessStatus;

    /**
     * @return The commercial status of the physical line. Value:
     * - **Normal**: activated.
     * - **Financialized**: Arrears locked.
     * - **SecurityLocked**: locked for security reasons.
     * 
     */
    public Optional<String> businessStatus() {
        return Optional.ofNullable(this.businessStatus);
    }

    /**
     * A list of Virtual Physical Connection IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Virtual Physical Connection IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    @Import(name="isConfirmed")
    private @Nullable Boolean isConfirmed;

    public Optional<Boolean> isConfirmed() {
        return Optional.ofNullable(this.isConfirmed);
    }

    /**
     * A regex string to filter results by Group Metric Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Group Metric Rule name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
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
     * The ID of the instance of the physical connection.
     * 
     */
    @Import(name="parentPhysicalConnectionId")
    private @Nullable String parentPhysicalConnectionId;

    /**
     * @return The ID of the instance of the physical connection.
     * 
     */
    public Optional<String> parentPhysicalConnectionId() {
        return Optional.ofNullable(this.parentPhysicalConnectionId);
    }

    /**
     * The ID of the hosted connection. You can specify multiple hosted connection IDs.
     * 
     */
    @Import(name="virtualPhysicalConnectionIds")
    private @Nullable List<String> virtualPhysicalConnectionIds;

    /**
     * @return The ID of the hosted connection. You can specify multiple hosted connection IDs.
     * 
     */
    public Optional<List<String>> virtualPhysicalConnectionIds() {
        return Optional.ofNullable(this.virtualPhysicalConnectionIds);
    }

    /**
     * The business status of the shared line. Value:
     * - **Confirmed**: The shared line has been Confirmed to receive.
     * - **UnConfirmed**: The shared line has not been confirmed to be received.
     * - **Deleted**: The shared line has been Deleted.
     * 
     */
    @Import(name="virtualPhysicalConnectionStatus")
    private @Nullable String virtualPhysicalConnectionStatus;

    /**
     * @return The business status of the shared line. Value:
     * - **Confirmed**: The shared line has been Confirmed to receive.
     * - **UnConfirmed**: The shared line has not been confirmed to be received.
     * - **Deleted**: The shared line has been Deleted.
     * 
     */
    public Optional<String> virtualPhysicalConnectionStatus() {
        return Optional.ofNullable(this.virtualPhysicalConnectionStatus);
    }

    /**
     * The VLAN ID of the hosted connection. You can specify multiple VLAN IDs.
     * 
     */
    @Import(name="vlanIds")
    private @Nullable List<Integer> vlanIds;

    /**
     * @return The VLAN ID of the hosted connection. You can specify multiple VLAN IDs.
     * 
     */
    public Optional<List<Integer>> vlanIds() {
        return Optional.ofNullable(this.vlanIds);
    }

    /**
     * The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     * 
     */
    @Import(name="vpconnAliUid")
    private @Nullable String vpconnAliUid;

    /**
     * @return The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
     * 
     */
    public Optional<String> vpconnAliUid() {
        return Optional.ofNullable(this.vpconnAliUid);
    }

    private GetVirtualPhysicalConnectionsPlainArgs() {}

    private GetVirtualPhysicalConnectionsPlainArgs(GetVirtualPhysicalConnectionsPlainArgs $) {
        this.businessStatus = $.businessStatus;
        this.ids = $.ids;
        this.isConfirmed = $.isConfirmed;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.parentPhysicalConnectionId = $.parentPhysicalConnectionId;
        this.virtualPhysicalConnectionIds = $.virtualPhysicalConnectionIds;
        this.virtualPhysicalConnectionStatus = $.virtualPhysicalConnectionStatus;
        this.vlanIds = $.vlanIds;
        this.vpconnAliUid = $.vpconnAliUid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualPhysicalConnectionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualPhysicalConnectionsPlainArgs $;

        public Builder() {
            $ = new GetVirtualPhysicalConnectionsPlainArgs();
        }

        public Builder(GetVirtualPhysicalConnectionsPlainArgs defaults) {
            $ = new GetVirtualPhysicalConnectionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param businessStatus The commercial status of the physical line. Value:
         * - **Normal**: activated.
         * - **Financialized**: Arrears locked.
         * - **SecurityLocked**: locked for security reasons.
         * 
         * @return builder
         * 
         */
        public Builder businessStatus(@Nullable String businessStatus) {
            $.businessStatus = businessStatus;
            return this;
        }

        /**
         * @param ids A list of Virtual Physical Connection IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Virtual Physical Connection IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        public Builder isConfirmed(@Nullable Boolean isConfirmed) {
            $.isConfirmed = isConfirmed;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Group Metric Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
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
         * @param parentPhysicalConnectionId The ID of the instance of the physical connection.
         * 
         * @return builder
         * 
         */
        public Builder parentPhysicalConnectionId(@Nullable String parentPhysicalConnectionId) {
            $.parentPhysicalConnectionId = parentPhysicalConnectionId;
            return this;
        }

        /**
         * @param virtualPhysicalConnectionIds The ID of the hosted connection. You can specify multiple hosted connection IDs.
         * 
         * @return builder
         * 
         */
        public Builder virtualPhysicalConnectionIds(@Nullable List<String> virtualPhysicalConnectionIds) {
            $.virtualPhysicalConnectionIds = virtualPhysicalConnectionIds;
            return this;
        }

        /**
         * @param virtualPhysicalConnectionIds The ID of the hosted connection. You can specify multiple hosted connection IDs.
         * 
         * @return builder
         * 
         */
        public Builder virtualPhysicalConnectionIds(String... virtualPhysicalConnectionIds) {
            return virtualPhysicalConnectionIds(List.of(virtualPhysicalConnectionIds));
        }

        /**
         * @param virtualPhysicalConnectionStatus The business status of the shared line. Value:
         * - **Confirmed**: The shared line has been Confirmed to receive.
         * - **UnConfirmed**: The shared line has not been confirmed to be received.
         * - **Deleted**: The shared line has been Deleted.
         * 
         * @return builder
         * 
         */
        public Builder virtualPhysicalConnectionStatus(@Nullable String virtualPhysicalConnectionStatus) {
            $.virtualPhysicalConnectionStatus = virtualPhysicalConnectionStatus;
            return this;
        }

        /**
         * @param vlanIds The VLAN ID of the hosted connection. You can specify multiple VLAN IDs.
         * 
         * @return builder
         * 
         */
        public Builder vlanIds(@Nullable List<Integer> vlanIds) {
            $.vlanIds = vlanIds;
            return this;
        }

        /**
         * @param vlanIds The VLAN ID of the hosted connection. You can specify multiple VLAN IDs.
         * 
         * @return builder
         * 
         */
        public Builder vlanIds(Integer... vlanIds) {
            return vlanIds(List.of(vlanIds));
        }

        /**
         * @param vpconnAliUid The ID of the Alibaba Cloud account (primary account) of the owner of the shared line.
         * 
         * @return builder
         * 
         */
        public Builder vpconnAliUid(@Nullable String vpconnAliUid) {
            $.vpconnAliUid = vpconnAliUid;
            return this;
        }

        public GetVirtualPhysicalConnectionsPlainArgs build() {
            return $;
        }
    }

}