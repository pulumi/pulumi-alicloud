// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceRunArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceRunArgs Empty = new WorkspaceRunArgs();

    /**
     * Resource attribute field of the experiment ID to which Run belongs
     * 
     */
    @Import(name="experimentId", required=true)
    private Output<String> experimentId;

    /**
     * @return Resource attribute field of the experiment ID to which Run belongs
     * 
     */
    public Output<String> experimentId() {
        return this.experimentId;
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="runName")
    private @Nullable Output<String> runName;

    /**
     * @return The name of the resource
     * 
     */
    public Optional<Output<String>> runName() {
        return Optional.ofNullable(this.runName);
    }

    /**
     * Attribute Resource field representing the source task ID
     * 
     */
    @Import(name="sourceId")
    private @Nullable Output<String> sourceId;

    /**
     * @return Attribute Resource field representing the source task ID
     * 
     */
    public Optional<Output<String>> sourceId() {
        return Optional.ofNullable(this.sourceId);
    }

    /**
     * Resource attribute fields representing the source type
     * 
     */
    @Import(name="sourceType")
    private @Nullable Output<String> sourceType;

    /**
     * @return Resource attribute fields representing the source type
     * 
     */
    public Optional<Output<String>> sourceType() {
        return Optional.ofNullable(this.sourceType);
    }

    private WorkspaceRunArgs() {}

    private WorkspaceRunArgs(WorkspaceRunArgs $) {
        this.experimentId = $.experimentId;
        this.runName = $.runName;
        this.sourceId = $.sourceId;
        this.sourceType = $.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceRunArgs $;

        public Builder() {
            $ = new WorkspaceRunArgs();
        }

        public Builder(WorkspaceRunArgs defaults) {
            $ = new WorkspaceRunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param experimentId Resource attribute field of the experiment ID to which Run belongs
         * 
         * @return builder
         * 
         */
        public Builder experimentId(Output<String> experimentId) {
            $.experimentId = experimentId;
            return this;
        }

        /**
         * @param experimentId Resource attribute field of the experiment ID to which Run belongs
         * 
         * @return builder
         * 
         */
        public Builder experimentId(String experimentId) {
            return experimentId(Output.of(experimentId));
        }

        /**
         * @param runName The name of the resource
         * 
         * @return builder
         * 
         */
        public Builder runName(@Nullable Output<String> runName) {
            $.runName = runName;
            return this;
        }

        /**
         * @param runName The name of the resource
         * 
         * @return builder
         * 
         */
        public Builder runName(String runName) {
            return runName(Output.of(runName));
        }

        /**
         * @param sourceId Attribute Resource field representing the source task ID
         * 
         * @return builder
         * 
         */
        public Builder sourceId(@Nullable Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        /**
         * @param sourceId Attribute Resource field representing the source task ID
         * 
         * @return builder
         * 
         */
        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        /**
         * @param sourceType Resource attribute fields representing the source type
         * 
         * @return builder
         * 
         */
        public Builder sourceType(@Nullable Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType Resource attribute fields representing the source type
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        public WorkspaceRunArgs build() {
            if ($.experimentId == null) {
                throw new MissingRequiredPropertyException("WorkspaceRunArgs", "experimentId");
            }
            return $;
        }
    }

}