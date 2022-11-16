// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceMeshMeshConfigControlPlaneLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceMeshMeshConfigControlPlaneLogArgs Empty = new ServiceMeshMeshConfigControlPlaneLogArgs();

    /**
     * Whether to enable Service grid audit.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable Service grid audit.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The Service grid audit that to the project.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The Service grid audit that to the project.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ServiceMeshMeshConfigControlPlaneLogArgs() {}

    private ServiceMeshMeshConfigControlPlaneLogArgs(ServiceMeshMeshConfigControlPlaneLogArgs $) {
        this.enabled = $.enabled;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceMeshMeshConfigControlPlaneLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceMeshMeshConfigControlPlaneLogArgs $;

        public Builder() {
            $ = new ServiceMeshMeshConfigControlPlaneLogArgs();
        }

        public Builder(ServiceMeshMeshConfigControlPlaneLogArgs defaults) {
            $ = new ServiceMeshMeshConfigControlPlaneLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable Service grid audit.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable Service grid audit.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param project The Service grid audit that to the project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The Service grid audit that to the project.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ServiceMeshMeshConfigControlPlaneLogArgs build() {
            return $;
        }
    }

}