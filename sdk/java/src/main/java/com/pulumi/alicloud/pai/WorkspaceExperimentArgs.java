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


public final class WorkspaceExperimentArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceExperimentArgs Empty = new WorkspaceExperimentArgs();

    /**
     * Experimental Visibility
     * 
     */
    @Import(name="accessibility")
    private @Nullable Output<String> accessibility;

    /**
     * @return Experimental Visibility
     * 
     */
    public Optional<Output<String>> accessibility() {
        return Optional.ofNullable(this.accessibility);
    }

    /**
     * ArtifactUri is default OSS storage path of the output of trials in the experiment
     * 
     */
    @Import(name="artifactUri", required=true)
    private Output<String> artifactUri;

    /**
     * @return ArtifactUri is default OSS storage path of the output of trials in the experiment
     * 
     */
    public Output<String> artifactUri() {
        return this.artifactUri;
    }

    /**
     * Name is the name of the experiment, unique in a namespace
     * 
     */
    @Import(name="experimentName", required=true)
    private Output<String> experimentName;

    /**
     * @return Name is the name of the experiment, unique in a namespace
     * 
     */
    public Output<String> experimentName() {
        return this.experimentName;
    }

    /**
     * WorkspaceId is the workspace id which contains the experiment
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return WorkspaceId is the workspace id which contains the experiment
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private WorkspaceExperimentArgs() {}

    private WorkspaceExperimentArgs(WorkspaceExperimentArgs $) {
        this.accessibility = $.accessibility;
        this.artifactUri = $.artifactUri;
        this.experimentName = $.experimentName;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceExperimentArgs $;

        public Builder() {
            $ = new WorkspaceExperimentArgs();
        }

        public Builder(WorkspaceExperimentArgs defaults) {
            $ = new WorkspaceExperimentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessibility Experimental Visibility
         * 
         * @return builder
         * 
         */
        public Builder accessibility(@Nullable Output<String> accessibility) {
            $.accessibility = accessibility;
            return this;
        }

        /**
         * @param accessibility Experimental Visibility
         * 
         * @return builder
         * 
         */
        public Builder accessibility(String accessibility) {
            return accessibility(Output.of(accessibility));
        }

        /**
         * @param artifactUri ArtifactUri is default OSS storage path of the output of trials in the experiment
         * 
         * @return builder
         * 
         */
        public Builder artifactUri(Output<String> artifactUri) {
            $.artifactUri = artifactUri;
            return this;
        }

        /**
         * @param artifactUri ArtifactUri is default OSS storage path of the output of trials in the experiment
         * 
         * @return builder
         * 
         */
        public Builder artifactUri(String artifactUri) {
            return artifactUri(Output.of(artifactUri));
        }

        /**
         * @param experimentName Name is the name of the experiment, unique in a namespace
         * 
         * @return builder
         * 
         */
        public Builder experimentName(Output<String> experimentName) {
            $.experimentName = experimentName;
            return this;
        }

        /**
         * @param experimentName Name is the name of the experiment, unique in a namespace
         * 
         * @return builder
         * 
         */
        public Builder experimentName(String experimentName) {
            return experimentName(Output.of(experimentName));
        }

        /**
         * @param workspaceId WorkspaceId is the workspace id which contains the experiment
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId WorkspaceId is the workspace id which contains the experiment
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public WorkspaceExperimentArgs build() {
            if ($.artifactUri == null) {
                throw new MissingRequiredPropertyException("WorkspaceExperimentArgs", "artifactUri");
            }
            if ($.experimentName == null) {
                throw new MissingRequiredPropertyException("WorkspaceExperimentArgs", "experimentName");
            }
            if ($.workspaceId == null) {
                throw new MissingRequiredPropertyException("WorkspaceExperimentArgs", "workspaceId");
            }
            return $;
        }
    }

}
