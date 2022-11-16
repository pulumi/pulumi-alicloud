// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGatewayVpnAttachmentsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayVpnAttachmentsPlainArgs Empty = new GetGatewayVpnAttachmentsPlainArgs();

    /**
     * A list of Vpn Attachment IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Vpn Attachment IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Vpn Attachment name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Vpn Attachment name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="pageNumber")
    private @Nullable Integer pageNumber;

    public Optional<Integer> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Integer pageSize;

    public Optional<Integer> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the VPN gateway.
     * 
     */
    @Import(name="vpnGatewayId")
    private @Nullable String vpnGatewayId;

    /**
     * @return The ID of the VPN gateway.
     * 
     */
    public Optional<String> vpnGatewayId() {
        return Optional.ofNullable(this.vpnGatewayId);
    }

    private GetGatewayVpnAttachmentsPlainArgs() {}

    private GetGatewayVpnAttachmentsPlainArgs(GetGatewayVpnAttachmentsPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.status = $.status;
        this.vpnGatewayId = $.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayVpnAttachmentsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayVpnAttachmentsPlainArgs $;

        public Builder() {
            $ = new GetGatewayVpnAttachmentsPlainArgs();
        }

        public Builder(GetGatewayVpnAttachmentsPlainArgs defaults) {
            $ = new GetGatewayVpnAttachmentsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Vpn Attachment IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Vpn Attachment IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Vpn Attachment name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder pageNumber(@Nullable Integer pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageSize(@Nullable Integer pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param vpnGatewayId The ID of the VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayId(@Nullable String vpnGatewayId) {
            $.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public GetGatewayVpnAttachmentsPlainArgs build() {
            return $;
        }
    }

}