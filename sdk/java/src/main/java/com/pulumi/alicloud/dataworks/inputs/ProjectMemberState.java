// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks.inputs;

import com.pulumi.alicloud.dataworks.inputs.ProjectMemberRoleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectMemberState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectMemberState Empty = new ProjectMemberState();

    /**
     * Project ID
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<Integer> projectId;

    /**
     * @return Project ID
     * 
     */
    public Optional<Output<Integer>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * List of roles owned by members. See `roles` below.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<ProjectMemberRoleArgs>> roles;

    /**
     * @return List of roles owned by members. See `roles` below.
     * 
     */
    public Optional<Output<List<ProjectMemberRoleArgs>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * The status of the user in project
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the user in project
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The user ID of the member.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The user ID of the member.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private ProjectMemberState() {}

    private ProjectMemberState(ProjectMemberState $) {
        this.projectId = $.projectId;
        this.roles = $.roles;
        this.status = $.status;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectMemberState $;

        public Builder() {
            $ = new ProjectMemberState();
        }

        public Builder(ProjectMemberState defaults) {
            $ = new ProjectMemberState(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId Project ID
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<Integer> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param roles List of roles owned by members. See `roles` below.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<ProjectMemberRoleArgs>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles List of roles owned by members. See `roles` below.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<ProjectMemberRoleArgs> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles List of roles owned by members. See `roles` below.
         * 
         * @return builder
         * 
         */
        public Builder roles(ProjectMemberRoleArgs... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param status The status of the user in project
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the user in project
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param userId The user ID of the member.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The user ID of the member.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public ProjectMemberState build() {
            return $;
        }
    }

}