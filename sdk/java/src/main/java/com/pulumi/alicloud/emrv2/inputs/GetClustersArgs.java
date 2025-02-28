// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emrv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClustersArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClustersArgs Empty = new GetClustersArgs();

    /**
     * The cluster name.
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return The cluster name.
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    /**
     * The cluster states.
     * 
     */
    @Import(name="clusterStates")
    private @Nullable Output<List<String>> clusterStates;

    /**
     * @return The cluster states.
     * 
     */
    public Optional<Output<List<String>>> clusterStates() {
        return Optional.ofNullable(this.clusterStates);
    }

    /**
     * The cluster types.
     * 
     */
    @Import(name="clusterTypes")
    private @Nullable Output<List<String>> clusterTypes;

    /**
     * @return The cluster types.
     * 
     */
    public Optional<Output<List<String>>> clusterTypes() {
        return Optional.ofNullable(this.clusterTypes);
    }

    /**
     * A list of Cluster IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Cluster IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The max results is used to list clusters for next page.
     * 
     */
    @Import(name="maxResults")
    private @Nullable Output<Integer> maxResults;

    /**
     * @return The max results is used to list clusters for next page.
     * 
     */
    public Optional<Output<Integer>> maxResults() {
        return Optional.ofNullable(this.maxResults);
    }

    /**
     * A regex string to filter results by Cluster name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Cluster name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The next token is used to list clusters for next page.
     * 
     */
    @Import(name="nextToken")
    private @Nullable Output<String> nextToken;

    /**
     * @return The next token is used to list clusters for next page.
     * 
     */
    public Optional<Output<String>> nextToken() {
        return Optional.ofNullable(this.nextToken);
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
     * The cluster payment types.
     * 
     */
    @Import(name="paymentTypes")
    private @Nullable Output<List<String>> paymentTypes;

    /**
     * @return The cluster payment types.
     * 
     */
    public Optional<Output<List<String>>> paymentTypes() {
        return Optional.ofNullable(this.paymentTypes);
    }

    /**
     * The Resource Group ID.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The Resource Group ID.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetClustersArgs() {}

    private GetClustersArgs(GetClustersArgs $) {
        this.clusterName = $.clusterName;
        this.clusterStates = $.clusterStates;
        this.clusterTypes = $.clusterTypes;
        this.ids = $.ids;
        this.maxResults = $.maxResults;
        this.nameRegex = $.nameRegex;
        this.nextToken = $.nextToken;
        this.outputFile = $.outputFile;
        this.paymentTypes = $.paymentTypes;
        this.resourceGroupId = $.resourceGroupId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClustersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClustersArgs $;

        public Builder() {
            $ = new GetClustersArgs();
        }

        public Builder(GetClustersArgs defaults) {
            $ = new GetClustersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The cluster name.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The cluster name.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param clusterStates The cluster states.
         * 
         * @return builder
         * 
         */
        public Builder clusterStates(@Nullable Output<List<String>> clusterStates) {
            $.clusterStates = clusterStates;
            return this;
        }

        /**
         * @param clusterStates The cluster states.
         * 
         * @return builder
         * 
         */
        public Builder clusterStates(List<String> clusterStates) {
            return clusterStates(Output.of(clusterStates));
        }

        /**
         * @param clusterStates The cluster states.
         * 
         * @return builder
         * 
         */
        public Builder clusterStates(String... clusterStates) {
            return clusterStates(List.of(clusterStates));
        }

        /**
         * @param clusterTypes The cluster types.
         * 
         * @return builder
         * 
         */
        public Builder clusterTypes(@Nullable Output<List<String>> clusterTypes) {
            $.clusterTypes = clusterTypes;
            return this;
        }

        /**
         * @param clusterTypes The cluster types.
         * 
         * @return builder
         * 
         */
        public Builder clusterTypes(List<String> clusterTypes) {
            return clusterTypes(Output.of(clusterTypes));
        }

        /**
         * @param clusterTypes The cluster types.
         * 
         * @return builder
         * 
         */
        public Builder clusterTypes(String... clusterTypes) {
            return clusterTypes(List.of(clusterTypes));
        }

        /**
         * @param ids A list of Cluster IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Cluster IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Cluster IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param maxResults The max results is used to list clusters for next page.
         * 
         * @return builder
         * 
         */
        public Builder maxResults(@Nullable Output<Integer> maxResults) {
            $.maxResults = maxResults;
            return this;
        }

        /**
         * @param maxResults The max results is used to list clusters for next page.
         * 
         * @return builder
         * 
         */
        public Builder maxResults(Integer maxResults) {
            return maxResults(Output.of(maxResults));
        }

        /**
         * @param nameRegex A regex string to filter results by Cluster name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Cluster name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param nextToken The next token is used to list clusters for next page.
         * 
         * @return builder
         * 
         */
        public Builder nextToken(@Nullable Output<String> nextToken) {
            $.nextToken = nextToken;
            return this;
        }

        /**
         * @param nextToken The next token is used to list clusters for next page.
         * 
         * @return builder
         * 
         */
        public Builder nextToken(String nextToken) {
            return nextToken(Output.of(nextToken));
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
         * @param paymentTypes The cluster payment types.
         * 
         * @return builder
         * 
         */
        public Builder paymentTypes(@Nullable Output<List<String>> paymentTypes) {
            $.paymentTypes = paymentTypes;
            return this;
        }

        /**
         * @param paymentTypes The cluster payment types.
         * 
         * @return builder
         * 
         */
        public Builder paymentTypes(List<String> paymentTypes) {
            return paymentTypes(Output.of(paymentTypes));
        }

        /**
         * @param paymentTypes The cluster payment types.
         * 
         * @return builder
         * 
         */
        public Builder paymentTypes(String... paymentTypes) {
            return paymentTypes(List.of(paymentTypes));
        }

        /**
         * @param resourceGroupId The Resource Group ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The Resource Group ID.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetClustersArgs build() {
            return $;
        }
    }

}
