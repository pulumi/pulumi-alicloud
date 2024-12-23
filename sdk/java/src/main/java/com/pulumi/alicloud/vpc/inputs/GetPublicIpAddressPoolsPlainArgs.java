// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicIpAddressPoolsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicIpAddressPoolsPlainArgs Empty = new GetPublicIpAddressPoolsPlainArgs();

    /**
     * A list of Vpc Public Ip Address Pool IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Vpc Public Ip Address Pool IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`.
     * 
     */
    @Import(name="isp")
    private @Nullable String isp;

    /**
     * @return The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`.
     * 
     */
    public Optional<String> isp() {
        return Optional.ofNullable(this.isp);
    }

    /**
     * A regex string to filter results by Vpc Public Ip Address Pool name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Vpc Public Ip Address Pool name.
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
     * The IDs of the Vpc Public IP address pools.
     * 
     */
    @Import(name="publicIpAddressPoolIds")
    private @Nullable List<String> publicIpAddressPoolIds;

    /**
     * @return The IDs of the Vpc Public IP address pools.
     * 
     */
    public Optional<List<String>> publicIpAddressPoolIds() {
        return Optional.ofNullable(this.publicIpAddressPoolIds);
    }

    /**
     * The name of the VPC Public IP address pool.
     * 
     */
    @Import(name="publicIpAddressPoolName")
    private @Nullable String publicIpAddressPoolName;

    /**
     * @return The name of the VPC Public IP address pool.
     * 
     */
    public Optional<String> publicIpAddressPoolName() {
        return Optional.ofNullable(this.publicIpAddressPoolName);
    }

    /**
     * The status of the Vpc Public Ip Address Pool. Valid values: `Created`, `Deleting`, `Modifying`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the Vpc Public Ip Address Pool. Valid values: `Created`, `Deleting`, `Modifying`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetPublicIpAddressPoolsPlainArgs() {}

    private GetPublicIpAddressPoolsPlainArgs(GetPublicIpAddressPoolsPlainArgs $) {
        this.ids = $.ids;
        this.isp = $.isp;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.publicIpAddressPoolIds = $.publicIpAddressPoolIds;
        this.publicIpAddressPoolName = $.publicIpAddressPoolName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicIpAddressPoolsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicIpAddressPoolsPlainArgs $;

        public Builder() {
            $ = new GetPublicIpAddressPoolsPlainArgs();
        }

        public Builder(GetPublicIpAddressPoolsPlainArgs defaults) {
            $ = new GetPublicIpAddressPoolsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Vpc Public Ip Address Pool IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Vpc Public Ip Address Pool IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param isp The Internet service provider. Valid values: `BGP`, `BGP_PRO`, `ChinaTelecom`, `ChinaUnicom`, `ChinaMobile`, `ChinaTelecom_L2`, `ChinaUnicom_L2`, `ChinaMobile_L2`, `BGP_FinanceCloud`.
         * 
         * @return builder
         * 
         */
        public Builder isp(@Nullable String isp) {
            $.isp = isp;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Vpc Public Ip Address Pool name.
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
         * @param publicIpAddressPoolIds The IDs of the Vpc Public IP address pools.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressPoolIds(@Nullable List<String> publicIpAddressPoolIds) {
            $.publicIpAddressPoolIds = publicIpAddressPoolIds;
            return this;
        }

        /**
         * @param publicIpAddressPoolIds The IDs of the Vpc Public IP address pools.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressPoolIds(String... publicIpAddressPoolIds) {
            return publicIpAddressPoolIds(List.of(publicIpAddressPoolIds));
        }

        /**
         * @param publicIpAddressPoolName The name of the VPC Public IP address pool.
         * 
         * @return builder
         * 
         */
        public Builder publicIpAddressPoolName(@Nullable String publicIpAddressPoolName) {
            $.publicIpAddressPoolName = publicIpAddressPoolName;
            return this;
        }

        /**
         * @param status The status of the Vpc Public Ip Address Pool. Valid values: `Created`, `Deleting`, `Modifying`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetPublicIpAddressPoolsPlainArgs build() {
            return $;
        }
    }

}
