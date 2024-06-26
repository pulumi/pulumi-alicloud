// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCommonBandwidthPackagesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCommonBandwidthPackagesArgs Empty = new GetCommonBandwidthPackagesArgs();

    /**
     * The name of bandwidth package.
     * 
     */
    @Import(name="bandwidthPackageName")
    private @Nullable Output<String> bandwidthPackageName;

    /**
     * @return The name of bandwidth package.
     * 
     */
    public Optional<Output<String>> bandwidthPackageName() {
        return Optional.ofNullable(this.bandwidthPackageName);
    }

    /**
     * Specifies whether to precheck only the request.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to precheck only the request.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * A list of Common Bandwidth Packages IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Common Bandwidth Packages IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Specifies whether to return data of orders that have not taken effect.
     * 
     */
    @Import(name="includeReservationData")
    private @Nullable Output<Boolean> includeReservationData;

    /**
     * @return Specifies whether to return data of orders that have not taken effect.
     * 
     */
    public Optional<Output<Boolean>> includeReservationData() {
        return Optional.ofNullable(this.includeReservationData);
    }

    /**
     * A regex string to filter results by name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by name.
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
     * The Id of resource group which the common bandwidth package belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The Id of resource group which the common bandwidth package belongs.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The status of bandwidth package. Valid values: `Available` and `Pending`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of bandwidth package. Valid values: `Available` and `Pending`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetCommonBandwidthPackagesArgs() {}

    private GetCommonBandwidthPackagesArgs(GetCommonBandwidthPackagesArgs $) {
        this.bandwidthPackageName = $.bandwidthPackageName;
        this.dryRun = $.dryRun;
        this.ids = $.ids;
        this.includeReservationData = $.includeReservationData;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCommonBandwidthPackagesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCommonBandwidthPackagesArgs $;

        public Builder() {
            $ = new GetCommonBandwidthPackagesArgs();
        }

        public Builder(GetCommonBandwidthPackagesArgs defaults) {
            $ = new GetCommonBandwidthPackagesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthPackageName The name of bandwidth package.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageName(@Nullable Output<String> bandwidthPackageName) {
            $.bandwidthPackageName = bandwidthPackageName;
            return this;
        }

        /**
         * @param bandwidthPackageName The name of bandwidth package.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthPackageName(String bandwidthPackageName) {
            return bandwidthPackageName(Output.of(bandwidthPackageName));
        }

        /**
         * @param dryRun Specifies whether to precheck only the request.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to precheck only the request.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param ids A list of Common Bandwidth Packages IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Common Bandwidth Packages IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Common Bandwidth Packages IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param includeReservationData Specifies whether to return data of orders that have not taken effect.
         * 
         * @return builder
         * 
         */
        public Builder includeReservationData(@Nullable Output<Boolean> includeReservationData) {
            $.includeReservationData = includeReservationData;
            return this;
        }

        /**
         * @param includeReservationData Specifies whether to return data of orders that have not taken effect.
         * 
         * @return builder
         * 
         */
        public Builder includeReservationData(Boolean includeReservationData) {
            return includeReservationData(Output.of(includeReservationData));
        }

        /**
         * @param nameRegex A regex string to filter results by name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by name.
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
         * @param resourceGroupId The Id of resource group which the common bandwidth package belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The Id of resource group which the common bandwidth package belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param status The status of bandwidth package. Valid values: `Available` and `Pending`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of bandwidth package. Valid values: `Available` and `Pending`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public GetCommonBandwidthPackagesArgs build() {
            return $;
        }
    }

}
