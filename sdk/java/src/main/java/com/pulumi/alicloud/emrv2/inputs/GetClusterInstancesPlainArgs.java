// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emrv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterInstancesPlainArgs Empty = new GetClusterInstancesPlainArgs();

    /**
     * The emr cluster ID.
     * 
     */
    @Import(name="clusterId")
    private @Nullable String clusterId;

    /**
     * @return The emr cluster ID.
     * 
     */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * A list of Cluster IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Cluster IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The cluster ecs instance states.
     * 
     */
    @Import(name="instanceStates")
    private @Nullable List<String> instanceStates;

    /**
     * @return The cluster ecs instance states.
     * 
     */
    public Optional<List<String>> instanceStates() {
        return Optional.ofNullable(this.instanceStates);
    }

    /**
     * The max results is used to list emr cluster ecs instances for next page.
     * 
     */
    @Import(name="maxResults")
    private @Nullable Integer maxResults;

    /**
     * @return The max results is used to list emr cluster ecs instances for next page.
     * 
     */
    public Optional<Integer> maxResults() {
        return Optional.ofNullable(this.maxResults);
    }

    /**
     * The next token is used to list emr cluster ecs instances for next page.
     * 
     */
    @Import(name="nextToken")
    private @Nullable String nextToken;

    /**
     * @return The next token is used to list emr cluster ecs instances for next page.
     * 
     */
    public Optional<String> nextToken() {
        return Optional.ofNullable(this.nextToken);
    }

    /**
     * The cluster node group ids.
     * 
     */
    @Import(name="nodeGroupIds")
    private @Nullable List<String> nodeGroupIds;

    /**
     * @return The cluster node group ids.
     * 
     */
    public Optional<List<String>> nodeGroupIds() {
        return Optional.ofNullable(this.nodeGroupIds);
    }

    /**
     * The cluster node group names.
     * 
     */
    @Import(name="nodeGroupNames")
    private @Nullable List<String> nodeGroupNames;

    /**
     * @return The cluster node group names.
     * 
     */
    public Optional<List<String>> nodeGroupNames() {
        return Optional.ofNullable(this.nodeGroupNames);
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
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetClusterInstancesPlainArgs() {}

    private GetClusterInstancesPlainArgs(GetClusterInstancesPlainArgs $) {
        this.clusterId = $.clusterId;
        this.ids = $.ids;
        this.instanceStates = $.instanceStates;
        this.maxResults = $.maxResults;
        this.nextToken = $.nextToken;
        this.nodeGroupIds = $.nodeGroupIds;
        this.nodeGroupNames = $.nodeGroupNames;
        this.outputFile = $.outputFile;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterInstancesPlainArgs $;

        public Builder() {
            $ = new GetClusterInstancesPlainArgs();
        }

        public Builder(GetClusterInstancesPlainArgs defaults) {
            $ = new GetClusterInstancesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The emr cluster ID.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param ids A list of Cluster IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
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
         * @param instanceStates The cluster ecs instance states.
         * 
         * @return builder
         * 
         */
        public Builder instanceStates(@Nullable List<String> instanceStates) {
            $.instanceStates = instanceStates;
            return this;
        }

        /**
         * @param instanceStates The cluster ecs instance states.
         * 
         * @return builder
         * 
         */
        public Builder instanceStates(String... instanceStates) {
            return instanceStates(List.of(instanceStates));
        }

        /**
         * @param maxResults The max results is used to list emr cluster ecs instances for next page.
         * 
         * @return builder
         * 
         */
        public Builder maxResults(@Nullable Integer maxResults) {
            $.maxResults = maxResults;
            return this;
        }

        /**
         * @param nextToken The next token is used to list emr cluster ecs instances for next page.
         * 
         * @return builder
         * 
         */
        public Builder nextToken(@Nullable String nextToken) {
            $.nextToken = nextToken;
            return this;
        }

        /**
         * @param nodeGroupIds The cluster node group ids.
         * 
         * @return builder
         * 
         */
        public Builder nodeGroupIds(@Nullable List<String> nodeGroupIds) {
            $.nodeGroupIds = nodeGroupIds;
            return this;
        }

        /**
         * @param nodeGroupIds The cluster node group ids.
         * 
         * @return builder
         * 
         */
        public Builder nodeGroupIds(String... nodeGroupIds) {
            return nodeGroupIds(List.of(nodeGroupIds));
        }

        /**
         * @param nodeGroupNames The cluster node group names.
         * 
         * @return builder
         * 
         */
        public Builder nodeGroupNames(@Nullable List<String> nodeGroupNames) {
            $.nodeGroupNames = nodeGroupNames;
            return this;
        }

        /**
         * @param nodeGroupNames The cluster node group names.
         * 
         * @return builder
         * 
         */
        public Builder nodeGroupNames(String... nodeGroupNames) {
            return nodeGroupNames(List.of(nodeGroupNames));
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
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetClusterInstancesPlainArgs build() {
            return $;
        }
    }

}
