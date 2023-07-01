// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.compute.inputs;

import com.pulumi.alicloud.compute.inputs.GetNestServiceInstancesFilter;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNestServiceInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNestServiceInstancesPlainArgs Empty = new GetNestServiceInstancesPlainArgs();

    /**
     * The conditions that are used to filter. See the following `Block filter`.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetNestServiceInstancesFilter> filters;

    /**
     * @return The conditions that are used to filter. See the following `Block filter`.
     * 
     */
    public Optional<List<GetNestServiceInstancesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A list of Service Instance IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Service Instance IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Service Instance name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Service Instance name.
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
     * The status of the Service Instance. Valid Values: `Created`, `Deploying`, `DeployedFailed`, `Deployed`, `Upgrading`, `Deleting`, `Deleted`, `DeletedFailed`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the Service Instance. Valid Values: `Created`, `Deploying`, `DeployedFailed`, `Deployed`, `Upgrading`, `Deleting`, `Deleted`, `DeletedFailed`.
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

    private GetNestServiceInstancesPlainArgs() {}

    private GetNestServiceInstancesPlainArgs(GetNestServiceInstancesPlainArgs $) {
        this.filters = $.filters;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNestServiceInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNestServiceInstancesPlainArgs $;

        public Builder() {
            $ = new GetNestServiceInstancesPlainArgs();
        }

        public Builder(GetNestServiceInstancesPlainArgs defaults) {
            $ = new GetNestServiceInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters The conditions that are used to filter. See the following `Block filter`.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetNestServiceInstancesFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters The conditions that are used to filter. See the following `Block filter`.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetNestServiceInstancesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param ids A list of Service Instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Service Instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Service Instance name.
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
         * @param status The status of the Service Instance. Valid Values: `Created`, `Deploying`, `DeployedFailed`, `Deployed`, `Upgrading`, `Deleting`, `Deleted`, `DeletedFailed`.
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

        public GetNestServiceInstancesPlainArgs build() {
            return $;
        }
    }

}