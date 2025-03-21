// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSiteMonitorsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSiteMonitorsArgs Empty = new GetSiteMonitorsArgs();

    /**
     * A list of Site Monitor IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Site Monitor IDs.
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

    /**
     * Task ID.
     * 
     */
    @Import(name="taskId")
    private @Nullable Output<String> taskId;

    /**
     * @return Task ID.
     * 
     */
    public Optional<Output<String>> taskId() {
        return Optional.ofNullable(this.taskId);
    }

    /**
     * Task Type.
     * 
     */
    @Import(name="taskType")
    private @Nullable Output<String> taskType;

    /**
     * @return Task Type.
     * 
     */
    public Optional<Output<String>> taskType() {
        return Optional.ofNullable(this.taskType);
    }

    private GetSiteMonitorsArgs() {}

    private GetSiteMonitorsArgs(GetSiteMonitorsArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.taskId = $.taskId;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSiteMonitorsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSiteMonitorsArgs $;

        public Builder() {
            $ = new GetSiteMonitorsArgs();
        }

        public Builder(GetSiteMonitorsArgs defaults) {
            $ = new GetSiteMonitorsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Site Monitor IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Site Monitor IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Site Monitor IDs.
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

        /**
         * @param taskId Task ID.
         * 
         * @return builder
         * 
         */
        public Builder taskId(@Nullable Output<String> taskId) {
            $.taskId = taskId;
            return this;
        }

        /**
         * @param taskId Task ID.
         * 
         * @return builder
         * 
         */
        public Builder taskId(String taskId) {
            return taskId(Output.of(taskId));
        }

        /**
         * @param taskType Task Type.
         * 
         * @return builder
         * 
         */
        public Builder taskType(@Nullable Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType Task Type.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public GetSiteMonitorsArgs build() {
            return $;
        }
    }

}
