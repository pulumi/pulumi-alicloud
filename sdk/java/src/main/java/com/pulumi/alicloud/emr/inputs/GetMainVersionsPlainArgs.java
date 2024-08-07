// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMainVersionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMainVersionsPlainArgs Empty = new GetMainVersionsPlainArgs();

    /**
     * The supported clusterType of this emr version.
     * Possible values may be any one or combination of these: [&#34;HADOOP&#34;, &#34;DRUID&#34;, &#34;KAFKA&#34;, &#34;ZOOKEEPER&#34;, &#34;FLINK&#34;, &#34;CLICKHOUSE&#34;]
     * 
     */
    @Import(name="clusterTypes")
    private @Nullable List<String> clusterTypes;

    /**
     * @return The supported clusterType of this emr version.
     * Possible values may be any one or combination of these: [&#34;HADOOP&#34;, &#34;DRUID&#34;, &#34;KAFKA&#34;, &#34;ZOOKEEPER&#34;, &#34;FLINK&#34;, &#34;CLICKHOUSE&#34;]
     * 
     */
    public Optional<List<String>> clusterTypes() {
        return Optional.ofNullable(this.clusterTypes);
    }

    /**
     * The version of the emr cluster instance. Possible values: `EMR-4.0.0`, `EMR-3.23.0`, `EMR-3.22.0`.
     * 
     */
    @Import(name="emrVersion")
    private @Nullable String emrVersion;

    /**
     * @return The version of the emr cluster instance. Possible values: `EMR-4.0.0`, `EMR-3.23.0`, `EMR-3.22.0`.
     * 
     */
    public Optional<String> emrVersion() {
        return Optional.ofNullable(this.emrVersion);
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

    private GetMainVersionsPlainArgs() {}

    private GetMainVersionsPlainArgs(GetMainVersionsPlainArgs $) {
        this.clusterTypes = $.clusterTypes;
        this.emrVersion = $.emrVersion;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMainVersionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMainVersionsPlainArgs $;

        public Builder() {
            $ = new GetMainVersionsPlainArgs();
        }

        public Builder(GetMainVersionsPlainArgs defaults) {
            $ = new GetMainVersionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterTypes The supported clusterType of this emr version.
         * Possible values may be any one or combination of these: [&#34;HADOOP&#34;, &#34;DRUID&#34;, &#34;KAFKA&#34;, &#34;ZOOKEEPER&#34;, &#34;FLINK&#34;, &#34;CLICKHOUSE&#34;]
         * 
         * @return builder
         * 
         */
        public Builder clusterTypes(@Nullable List<String> clusterTypes) {
            $.clusterTypes = clusterTypes;
            return this;
        }

        /**
         * @param clusterTypes The supported clusterType of this emr version.
         * Possible values may be any one or combination of these: [&#34;HADOOP&#34;, &#34;DRUID&#34;, &#34;KAFKA&#34;, &#34;ZOOKEEPER&#34;, &#34;FLINK&#34;, &#34;CLICKHOUSE&#34;]
         * 
         * @return builder
         * 
         */
        public Builder clusterTypes(String... clusterTypes) {
            return clusterTypes(List.of(clusterTypes));
        }

        /**
         * @param emrVersion The version of the emr cluster instance. Possible values: `EMR-4.0.0`, `EMR-3.23.0`, `EMR-3.22.0`.
         * 
         * @return builder
         * 
         */
        public Builder emrVersion(@Nullable String emrVersion) {
            $.emrVersion = emrVersion;
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

        public GetMainVersionsPlainArgs build() {
            return $;
        }
    }

}
