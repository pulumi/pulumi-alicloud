// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainsArgs Empty = new GetDomainsArgs();

    /**
     * The end time of the update. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
     * 
     */
    @Import(name="changeEndTime")
    private @Nullable Output<String> changeEndTime;

    /**
     * @return The end time of the update. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
     * 
     */
    public Optional<Output<String>> changeEndTime() {
        return Optional.ofNullable(this.changeEndTime);
    }

    /**
     * The start time of the update. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
     * 
     */
    @Import(name="changeStartTime")
    private @Nullable Output<String> changeStartTime;

    /**
     * @return The start time of the update. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
     * 
     */
    public Optional<Output<String>> changeStartTime() {
        return Optional.ofNullable(this.changeStartTime);
    }

    /**
     * Specifies whether to display the domains in the checking, check_failed, or configure_failed status. Valid values: `true` or `false`.
     * 
     */
    @Import(name="checkDomainShow")
    private @Nullable Output<Boolean> checkDomainShow;

    /**
     * @return Specifies whether to display the domains in the checking, check_failed, or configure_failed status. Valid values: `true` or `false`.
     * 
     */
    public Optional<Output<Boolean>> checkDomainShow() {
        return Optional.ofNullable(this.checkDomainShow);
    }

    /**
     * The search method. Default value: `fuzzy_match`. Valid values: `fuzzy_match`, `pre_match`, `suf_match`, `full_match`.
     * 
     */
    @Import(name="domainSearchType")
    private @Nullable Output<String> domainSearchType;

    /**
     * @return The search method. Default value: `fuzzy_match`. Valid values: `fuzzy_match`, `pre_match`, `suf_match`, `full_match`.
     * 
     */
    public Optional<Output<String>> domainSearchType() {
        return Optional.ofNullable(this.domainSearchType);
    }

    /**
     * Default to `false`. Set it to true can output more details.
     * 
     */
    @Import(name="enableDetails")
    private @Nullable Output<Boolean> enableDetails;

    /**
     * @return Default to `false`. Set it to true can output more details.
     * 
     */
    public Optional<Output<Boolean>> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }

    /**
     * A list ids of DCDN Domain.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list ids of DCDN Domain.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by the DCDN Domain.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by the DCDN Domain.
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
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    @Import(name="securityToken")
    private @Nullable Output<String> securityToken;

    public Optional<Output<String>> securityToken() {
        return Optional.ofNullable(this.securityToken);
    }

    /**
     * The status of DCDN Domain.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of DCDN Domain.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetDomainsArgs() {}

    private GetDomainsArgs(GetDomainsArgs $) {
        this.changeEndTime = $.changeEndTime;
        this.changeStartTime = $.changeStartTime;
        this.checkDomainShow = $.checkDomainShow;
        this.domainSearchType = $.domainSearchType;
        this.enableDetails = $.enableDetails;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.resourceGroupId = $.resourceGroupId;
        this.securityToken = $.securityToken;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainsArgs $;

        public Builder() {
            $ = new GetDomainsArgs();
        }

        public Builder(GetDomainsArgs defaults) {
            $ = new GetDomainsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param changeEndTime The end time of the update. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
         * 
         * @return builder
         * 
         */
        public Builder changeEndTime(@Nullable Output<String> changeEndTime) {
            $.changeEndTime = changeEndTime;
            return this;
        }

        /**
         * @param changeEndTime The end time of the update. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
         * 
         * @return builder
         * 
         */
        public Builder changeEndTime(String changeEndTime) {
            return changeEndTime(Output.of(changeEndTime));
        }

        /**
         * @param changeStartTime The start time of the update. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
         * 
         * @return builder
         * 
         */
        public Builder changeStartTime(@Nullable Output<String> changeStartTime) {
            $.changeStartTime = changeStartTime;
            return this;
        }

        /**
         * @param changeStartTime The start time of the update. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC.
         * 
         * @return builder
         * 
         */
        public Builder changeStartTime(String changeStartTime) {
            return changeStartTime(Output.of(changeStartTime));
        }

        /**
         * @param checkDomainShow Specifies whether to display the domains in the checking, check_failed, or configure_failed status. Valid values: `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder checkDomainShow(@Nullable Output<Boolean> checkDomainShow) {
            $.checkDomainShow = checkDomainShow;
            return this;
        }

        /**
         * @param checkDomainShow Specifies whether to display the domains in the checking, check_failed, or configure_failed status. Valid values: `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder checkDomainShow(Boolean checkDomainShow) {
            return checkDomainShow(Output.of(checkDomainShow));
        }

        /**
         * @param domainSearchType The search method. Default value: `fuzzy_match`. Valid values: `fuzzy_match`, `pre_match`, `suf_match`, `full_match`.
         * 
         * @return builder
         * 
         */
        public Builder domainSearchType(@Nullable Output<String> domainSearchType) {
            $.domainSearchType = domainSearchType;
            return this;
        }

        /**
         * @param domainSearchType The search method. Default value: `fuzzy_match`. Valid values: `fuzzy_match`, `pre_match`, `suf_match`, `full_match`.
         * 
         * @return builder
         * 
         */
        public Builder domainSearchType(String domainSearchType) {
            return domainSearchType(Output.of(domainSearchType));
        }

        /**
         * @param enableDetails Default to `false`. Set it to true can output more details.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(@Nullable Output<Boolean> enableDetails) {
            $.enableDetails = enableDetails;
            return this;
        }

        /**
         * @param enableDetails Default to `false`. Set it to true can output more details.
         * 
         * @return builder
         * 
         */
        public Builder enableDetails(Boolean enableDetails) {
            return enableDetails(Output.of(enableDetails));
        }

        /**
         * @param ids A list ids of DCDN Domain.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list ids of DCDN Domain.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list ids of DCDN Domain.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by the DCDN Domain.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by the DCDN Domain.
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
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        public Builder securityToken(@Nullable Output<String> securityToken) {
            $.securityToken = securityToken;
            return this;
        }

        public Builder securityToken(String securityToken) {
            return securityToken(Output.of(securityToken));
        }

        /**
         * @param status The status of DCDN Domain.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of DCDN Domain.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetDomainsArgs build() {
            return $;
        }
    }

}