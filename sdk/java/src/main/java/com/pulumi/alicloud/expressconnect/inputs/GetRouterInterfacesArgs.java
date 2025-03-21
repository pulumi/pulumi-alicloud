// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.expressconnect.inputs;

import com.pulumi.alicloud.expressconnect.inputs.GetRouterInterfacesFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouterInterfacesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouterInterfacesArgs Empty = new GetRouterInterfacesArgs();

    @Import(name="filters")
    private @Nullable Output<List<GetRouterInterfacesFilterArgs>> filters;

    public Optional<Output<List<GetRouterInterfacesFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A list of Router Interface IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Router Interface IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Does it contain renewal data. Valid values: `true`, `false`.
     * 
     */
    @Import(name="includeReservationData")
    private @Nullable Output<String> includeReservationData;

    /**
     * @return Does it contain renewal data. Valid values: `true`, `false`.
     * 
     */
    public Optional<Output<String>> includeReservationData() {
        return Optional.ofNullable(this.includeReservationData);
    }

    /**
     * A regex string to filter results by Group Metric Rule name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Group Metric Rule name.
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

    private GetRouterInterfacesArgs() {}

    private GetRouterInterfacesArgs(GetRouterInterfacesArgs $) {
        this.filters = $.filters;
        this.ids = $.ids;
        this.includeReservationData = $.includeReservationData;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouterInterfacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouterInterfacesArgs $;

        public Builder() {
            $ = new GetRouterInterfacesArgs();
        }

        public Builder(GetRouterInterfacesArgs defaults) {
            $ = new GetRouterInterfacesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable Output<List<GetRouterInterfacesFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetRouterInterfacesFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetRouterInterfacesFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param ids A list of Router Interface IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Router Interface IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Router Interface IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param includeReservationData Does it contain renewal data. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeReservationData(@Nullable Output<String> includeReservationData) {
            $.includeReservationData = includeReservationData;
            return this;
        }

        /**
         * @param includeReservationData Does it contain renewal data. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeReservationData(String includeReservationData) {
            return includeReservationData(Output.of(includeReservationData));
        }

        /**
         * @param nameRegex A regex string to filter results by Group Metric Rule name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Group Metric Rule name.
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

        public GetRouterInterfacesArgs build() {
            return $;
        }
    }

}
