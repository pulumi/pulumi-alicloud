// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEngineNamespacesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEngineNamespacesArgs Empty = new GetEngineNamespacesArgs();

    /**
     * The language type of the returned information. Valid values: `zh`, `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable Output<String> acceptLanguage;

    /**
     * @return The language type of the returned information. Valid values: `zh`, `en`.
     * 
     */
    public Optional<Output<String>> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * The id of the cluster.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    /**
     * @return The id of the cluster.
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * A list of Engine Namespace IDs. It is formatted to `&lt;cluster_id&gt;:&lt;namespace_id&gt;`.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Engine Namespace IDs. It is formatted to `&lt;cluster_id&gt;:&lt;namespace_id&gt;`.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
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

    private GetEngineNamespacesArgs() {}

    private GetEngineNamespacesArgs(GetEngineNamespacesArgs $) {
        this.acceptLanguage = $.acceptLanguage;
        this.clusterId = $.clusterId;
        this.ids = $.ids;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEngineNamespacesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEngineNamespacesArgs $;

        public Builder() {
            $ = new GetEngineNamespacesArgs();
        }

        public Builder(GetEngineNamespacesArgs defaults) {
            $ = new GetEngineNamespacesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptLanguage The language type of the returned information. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * @param acceptLanguage The language type of the returned information. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(String acceptLanguage) {
            return acceptLanguage(Output.of(acceptLanguage));
        }

        /**
         * @param clusterId The id of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The id of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param ids A list of Engine Namespace IDs. It is formatted to `&lt;cluster_id&gt;:&lt;namespace_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Engine Namespace IDs. It is formatted to `&lt;cluster_id&gt;:&lt;namespace_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Engine Namespace IDs. It is formatted to `&lt;cluster_id&gt;:&lt;namespace_id&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
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

        public GetEngineNamespacesArgs build() {
            if ($.clusterId == null) {
                throw new MissingRequiredPropertyException("GetEngineNamespacesArgs", "clusterId");
            }
            return $;
        }
    }

}