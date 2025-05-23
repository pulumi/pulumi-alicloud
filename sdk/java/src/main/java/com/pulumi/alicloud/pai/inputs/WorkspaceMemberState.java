// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceMemberState extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceMemberState Empty = new WorkspaceMemberState();

    /**
     * The time when the workspace is created, in UTC. The time follows the ISO 8601 standard.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The time when the workspace is created, in UTC. The time follows the ISO 8601 standard.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The member ID.
     * 
     */
    @Import(name="memberId")
    private @Nullable Output<String> memberId;

    /**
     * @return The member ID.
     * 
     */
    public Optional<Output<String>> memberId() {
        return Optional.ofNullable(this.memberId);
    }

    /**
     * The list of roles. see [how to use it](https://www.alibabacloud.com/help/en/pai/developer-reference/api-aiworkspace-2021-02-04-createmember).
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return The list of roles. see [how to use it](https://www.alibabacloud.com/help/en/pai/developer-reference/api-aiworkspace-2021-02-04-createmember).
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * The ID of the User.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The ID of the User.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    /**
     * The ID of the Workspace.
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return The ID of the Workspace.
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private WorkspaceMemberState() {}

    private WorkspaceMemberState(WorkspaceMemberState $) {
        this.createTime = $.createTime;
        this.memberId = $.memberId;
        this.roles = $.roles;
        this.userId = $.userId;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceMemberState $;

        public Builder() {
            $ = new WorkspaceMemberState();
        }

        public Builder(WorkspaceMemberState defaults) {
            $ = new WorkspaceMemberState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The time when the workspace is created, in UTC. The time follows the ISO 8601 standard.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The time when the workspace is created, in UTC. The time follows the ISO 8601 standard.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param memberId The member ID.
         * 
         * @return builder
         * 
         */
        public Builder memberId(@Nullable Output<String> memberId) {
            $.memberId = memberId;
            return this;
        }

        /**
         * @param memberId The member ID.
         * 
         * @return builder
         * 
         */
        public Builder memberId(String memberId) {
            return memberId(Output.of(memberId));
        }

        /**
         * @param roles The list of roles. see [how to use it](https://www.alibabacloud.com/help/en/pai/developer-reference/api-aiworkspace-2021-02-04-createmember).
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles The list of roles. see [how to use it](https://www.alibabacloud.com/help/en/pai/developer-reference/api-aiworkspace-2021-02-04-createmember).
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles The list of roles. see [how to use it](https://www.alibabacloud.com/help/en/pai/developer-reference/api-aiworkspace-2021-02-04-createmember).
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param userId The ID of the User.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID of the User.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        /**
         * @param workspaceId The ID of the Workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The ID of the Workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public WorkspaceMemberState build() {
            return $;
        }
    }

}
