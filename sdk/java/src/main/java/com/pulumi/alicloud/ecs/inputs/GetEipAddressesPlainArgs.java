// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEipAddressesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEipAddressesPlainArgs Empty = new GetEipAddressesPlainArgs();

    /**
     * The eip name.
     * 
     */
    @Import(name="addressName")
    private @Nullable String addressName;

    /**
     * @return The eip name.
     * 
     */
    public Optional<String> addressName() {
        return Optional.ofNullable(this.addressName);
    }

    /**
     * The associated instance id.
     * 
     */
    @Import(name="associatedInstanceId")
    private @Nullable String associatedInstanceId;

    /**
     * @return The associated instance id.
     * 
     */
    public Optional<String> associatedInstanceId() {
        return Optional.ofNullable(this.associatedInstanceId);
    }

    /**
     * The associated instance type.
     * 
     */
    @Import(name="associatedInstanceType")
    private @Nullable String associatedInstanceType;

    /**
     * @return The associated instance type.
     * 
     */
    public Optional<String> associatedInstanceType() {
        return Optional.ofNullable(this.associatedInstanceType);
    }

    /**
     * The dry run.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Boolean dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Optional<Boolean> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * Default to `true`. Set it to `false` can hide the `tags` to output.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Boolean enableDetails;

    /**
     * @return Default to `true`. Set it to `false` can hide the `tags` to output.
     * 
     */
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list of Address IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Address IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The include reservation data. Valid values: `BGP` and `BGP_PRO`.
     * 
     */
    @Import(name="includeReservationData")
    private @Nullable Boolean includeReservationData;

    /**
     * @return The include reservation data. Valid values: `BGP` and `BGP_PRO`.
     * 
     */
    public Optional<Boolean> includeReservationData() {
        return Optional.ofNullable(this.includeReservationData);
    }

    /**
     * The eip address.
     * 
     */
    @Import(name="ipAddress")
    private @Nullable String ipAddress;

    /**
     * @return The eip address.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * @deprecated
     * Field &#39;ip_addresses&#39; has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute &#39;ip_address&#39; instead.
     * 
     */
    @Deprecated /* Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead. */
    @Import(name="ipAddresses")
    private @Nullable List<String> ipAddresses;

    /**
     * @deprecated
     * Field &#39;ip_addresses&#39; has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute &#39;ip_address&#39; instead.
     * 
     */
    @Deprecated /* Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead. */
    public Optional<List<String>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    /**
     * The Internet service provider (ISP). Valid values `BGP` and `BGP_PRO`.
     * 
     */
    @Import(name="isp")
    private @Nullable String isp;

    /**
     * @return The Internet service provider (ISP). Valid values `BGP` and `BGP_PRO`.
     * 
     */
    public Optional<String> isp() {
        return Optional.ofNullable(this.isp);
    }

    /**
     * The lock reason.
     * 
     */
    @Import(name="lockReason")
    private @Nullable String lockReason;

    /**
     * @return The lock reason.
     * 
     */
    public Optional<String> lockReason() {
        return Optional.ofNullable(this.lockReason);
    }

    /**
     * A regex string to filter results by Address name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Address name.
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
     * The billing method of the EIP. Valid values: `Subscription` and `PayAsYouGo`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable String paymentType;

    /**
     * @return The billing method of the EIP. Valid values: `Subscription` and `PayAsYouGo`.
     * 
     */
    public Optional<String> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable String resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The IDs of the contiguous EIPs.  This value is returned only when contiguous EIPs are specified.
     * 
     */
    @Import(name="segmentInstanceId")
    private @Nullable String segmentInstanceId;

    /**
     * @return The IDs of the contiguous EIPs.  This value is returned only when contiguous EIPs are specified.
     * 
     */
    public Optional<String> segmentInstanceId() {
        return Optional.ofNullable(this.segmentInstanceId);
    }

    /**
     * The status of the EIP. Valid values:  `Associating`: The EIP is being associated. `Unassociating`: The EIP is being disassociated. `InUse`: The EIP is allocated. `Available`:The EIP is available.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the EIP. Valid values:  `Associating`: The EIP is being associated. `Unassociating`: The EIP is being disassociated. `InUse`: The EIP is allocated. `Available`:The EIP is available.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetEipAddressesPlainArgs() {}

    private GetEipAddressesPlainArgs(GetEipAddressesPlainArgs $) {
        this.addressName = $.addressName;
        this.associatedInstanceId = $.associatedInstanceId;
        this.associatedInstanceType = $.associatedInstanceType;
        this.dryRun = $.dryRun;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.includeReservationData = $.includeReservationData;
        this.ipAddress = $.ipAddress;
        this.ipAddresses = $.ipAddresses;
        this.isp = $.isp;
        this.lockReason = $.lockReason;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.paymentType = $.paymentType;
        this.resourceGroupId = $.resourceGroupId;
        this.segmentInstanceId = $.segmentInstanceId;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEipAddressesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEipAddressesPlainArgs $;

        public Builder() {
            $ = new GetEipAddressesPlainArgs();
        }

        public Builder(GetEipAddressesPlainArgs defaults) {
            $ = new GetEipAddressesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressName The eip name.
         * 
         * @return builder
         * 
         */
        public Builder addressName(@Nullable String addressName) {
            $.addressName = addressName;
            return this;
        }

        /**
         * @param associatedInstanceId The associated instance id.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstanceId(@Nullable String associatedInstanceId) {
            $.associatedInstanceId = associatedInstanceId;
            return this;
        }

        /**
         * @param associatedInstanceType The associated instance type.
         * 
         * @return builder
         * 
         */
        public Builder associatedInstanceType(@Nullable String associatedInstanceType) {
            $.associatedInstanceType = associatedInstanceType;
            return this;
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Boolean dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param enableDetails Default to `true`. Set it to `false` can hide the `tags` to output.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Boolean enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param ids A list of Address IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Address IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param includeReservationData The include reservation data. Valid values: `BGP` and `BGP_PRO`.
         * 
         * @return builder
         * 
         */
        public Builder includeReservationData(@Nullable Boolean includeReservationData) {
            $.includeReservationData = includeReservationData;
            return this;
        }

        /**
         * @param ipAddress The eip address.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;ip_addresses&#39; has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute &#39;ip_address&#39; instead.
         * 
         */
        @Deprecated /* Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead. */
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;ip_addresses&#39; has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute &#39;ip_address&#39; instead.
         * 
         */
        @Deprecated /* Field 'ip_addresses' has been deprecated from provider version 1.126.0 and it will be removed in the future version. Please use the new attribute 'ip_address' instead. */
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        /**
         * @param isp The Internet service provider (ISP). Valid values `BGP` and `BGP_PRO`.
         * 
         * @return builder
         * 
         */
        public Builder isp(@Nullable String isp) {
            $.isp = isp;
            return this;
        }

        /**
         * @param lockReason The lock reason.
         * 
         * @return builder
         * 
         */
        public Builder lockReason(@Nullable String lockReason) {
            $.lockReason = lockReason;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Address name.
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
         * @param paymentType The billing method of the EIP. Valid values: `Subscription` and `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable String paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param segmentInstanceId The IDs of the contiguous EIPs.  This value is returned only when contiguous EIPs are specified.
         * 
         * @return builder
         * 
         */
        public Builder segmentInstanceId(@Nullable String segmentInstanceId) {
            $.segmentInstanceId = segmentInstanceId;
            return this;
        }

        /**
         * @param status The status of the EIP. Valid values:  `Associating`: The EIP is being associated. `Unassociating`: The EIP is being disassociated. `InUse`: The EIP is allocated. `Available`:The EIP is available.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        public GetEipAddressesPlainArgs build() {
            return $;
        }
    }

}