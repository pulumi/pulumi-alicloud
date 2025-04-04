// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceWorkspaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceWorkspaceArgs Empty = new WorkspaceWorkspaceArgs();

    /**
     * Workspace description, no more than 80 characters.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return Workspace description, no more than 80 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Environments contained in the workspace:
     * - Simple mode only production environment (prod).
     * - Standard mode includes development environment (dev) and production environment (prod).
     * 
     */
    @Import(name="envTypes", required=true)
    private Output<List<String>> envTypes;

    /**
     * @return Environments contained in the workspace:
     * - Simple mode only production environment (prod).
     * - Standard mode includes development environment (dev) and production environment (prod).
     * 
     */
    public Output<List<String>> envTypes() {
        return this.envTypes;
    }

    /**
     * The workspace name. The format is as follows:
     * - 3 to 23 characters in length and can contain letters, underscores, or numbers.
     * - Must start with a large or small letter.
     * - Unique in the current region.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The workspace name. The format is as follows:
     * - 3 to 23 characters in length and can contain letters, underscores, or numbers.
     * - Must start with a large or small letter.
     * - Unique in the current region.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private WorkspaceWorkspaceArgs() {}

    private WorkspaceWorkspaceArgs(WorkspaceWorkspaceArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.envTypes = $.envTypes;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceWorkspaceArgs $;

        public Builder() {
            $ = new WorkspaceWorkspaceArgs();
        }

        public Builder(WorkspaceWorkspaceArgs defaults) {
            $ = new WorkspaceWorkspaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Workspace description, no more than 80 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Workspace description, no more than 80 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName It is recommended that you name the workspace based on the business attribute to identify the purpose of the workspace. If not configured, the default value is the workspace name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param envTypes Environments contained in the workspace:
         * - Simple mode only production environment (prod).
         * - Standard mode includes development environment (dev) and production environment (prod).
         * 
         * @return builder
         * 
         */
        public Builder envTypes(Output<List<String>> envTypes) {
            $.envTypes = envTypes;
            return this;
        }

        /**
         * @param envTypes Environments contained in the workspace:
         * - Simple mode only production environment (prod).
         * - Standard mode includes development environment (dev) and production environment (prod).
         * 
         * @return builder
         * 
         */
        public Builder envTypes(List<String> envTypes) {
            return envTypes(Output.of(envTypes));
        }

        /**
         * @param envTypes Environments contained in the workspace:
         * - Simple mode only production environment (prod).
         * - Standard mode includes development environment (dev) and production environment (prod).
         * 
         * @return builder
         * 
         */
        public Builder envTypes(String... envTypes) {
            return envTypes(List.of(envTypes));
        }

        /**
         * @param workspaceName The workspace name. The format is as follows:
         * - 3 to 23 characters in length and can contain letters, underscores, or numbers.
         * - Must start with a large or small letter.
         * - Unique in the current region.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The workspace name. The format is as follows:
         * - 3 to 23 characters in length and can contain letters, underscores, or numbers.
         * - Must start with a large or small letter.
         * - Unique in the current region.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public WorkspaceWorkspaceArgs build() {
            if ($.description == null) {
                throw new MissingRequiredPropertyException("WorkspaceWorkspaceArgs", "description");
            }
            if ($.envTypes == null) {
                throw new MissingRequiredPropertyException("WorkspaceWorkspaceArgs", "envTypes");
            }
            if ($.workspaceName == null) {
                throw new MissingRequiredPropertyException("WorkspaceWorkspaceArgs", "workspaceName");
            }
            return $;
        }
    }

}
