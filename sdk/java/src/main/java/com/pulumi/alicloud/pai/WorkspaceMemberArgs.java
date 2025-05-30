// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WorkspaceMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceMemberArgs Empty = new WorkspaceMemberArgs();

    /**
     * The list of roles. see [how to use it](https://www.alibabacloud.com/help/en/pai/developer-reference/api-aiworkspace-2021-02-04-createmember).
     * 
     */
    @Import(name="roles", required=true)
    private Output<List<String>> roles;

    /**
     * @return The list of roles. see [how to use it](https://www.alibabacloud.com/help/en/pai/developer-reference/api-aiworkspace-2021-02-04-createmember).
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }

    /**
     * The ID of the User.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The ID of the User.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     * The ID of the Workspace.
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return The ID of the Workspace.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private WorkspaceMemberArgs() {}

    private WorkspaceMemberArgs(WorkspaceMemberArgs $) {
        this.roles = $.roles;
        this.userId = $.userId;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceMemberArgs $;

        public Builder() {
            $ = new WorkspaceMemberArgs();
        }

        public Builder(WorkspaceMemberArgs defaults) {
            $ = new WorkspaceMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param roles The list of roles. see [how to use it](https://www.alibabacloud.com/help/en/pai/developer-reference/api-aiworkspace-2021-02-04-createmember).
         * 
         * @return builder
         * 
         */
        public Builder roles(Output<List<String>> roles) {
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
        public Builder userId(Output<String> userId) {
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
        public Builder workspaceId(Output<String> workspaceId) {
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

        public WorkspaceMemberArgs build() {
            if ($.roles == null) {
                throw new MissingRequiredPropertyException("WorkspaceMemberArgs", "roles");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("WorkspaceMemberArgs", "userId");
            }
            if ($.workspaceId == null) {
                throw new MissingRequiredPropertyException("WorkspaceMemberArgs", "workspaceId");
            }
            return $;
        }
    }

}
