// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceCodeSourceState extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceCodeSourceState Empty = new WorkspaceCodeSourceState();

    /**
     * Visibility of the code configuration, possible values:
     * - PRIVATE: In this workspace, it is only visible to you and the administrator.
     * - PUBLIC: In this workspace, it is visible to everyone.
     * 
     */
    @Import(name="accessibility")
    private @Nullable Output<String> accessibility;

    /**
     * @return Visibility of the code configuration, possible values:
     * - PRIVATE: In this workspace, it is only visible to you and the administrator.
     * - PUBLIC: In this workspace, it is visible to everyone.
     * 
     */
    public Optional<Output<String>> accessibility() {
        return Optional.ofNullable(this.accessibility);
    }

    /**
     * Code repository branch.
     * 
     */
    @Import(name="codeBranch")
    private @Nullable Output<String> codeBranch;

    /**
     * @return Code repository branch.
     * 
     */
    public Optional<Output<String>> codeBranch() {
        return Optional.ofNullable(this.codeBranch);
    }

    /**
     * The code CommitId.
     * 
     */
    @Import(name="codeCommit")
    private @Nullable Output<String> codeCommit;

    /**
     * @return The code CommitId.
     * 
     */
    public Optional<Output<String>> codeCommit() {
        return Optional.ofNullable(this.codeCommit);
    }

    /**
     * Code repository address.
     * 
     */
    @Import(name="codeRepo")
    private @Nullable Output<String> codeRepo;

    /**
     * @return Code repository address.
     * 
     */
    public Optional<Output<String>> codeRepo() {
        return Optional.ofNullable(this.codeRepo);
    }

    /**
     * The Token used to access the code repository.
     * 
     */
    @Import(name="codeRepoAccessToken")
    private @Nullable Output<String> codeRepoAccessToken;

    /**
     * @return The Token used to access the code repository.
     * 
     */
    public Optional<Output<String>> codeRepoAccessToken() {
        return Optional.ofNullable(this.codeRepoAccessToken);
    }

    /**
     * The user name of the code repository.
     * 
     */
    @Import(name="codeRepoUserName")
    private @Nullable Output<String> codeRepoUserName;

    /**
     * @return The user name of the code repository.
     * 
     */
    public Optional<Output<String>> codeRepoUserName() {
        return Optional.ofNullable(this.codeRepoUserName);
    }

    /**
     * The creation time of the resource
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The creation time of the resource
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * A detailed description of the code configuration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A detailed description of the code configuration.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Code source configuration name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Code source configuration name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The local Mount Directory of the code.
     * 
     */
    @Import(name="mountPath")
    private @Nullable Output<String> mountPath;

    /**
     * @return The local Mount Directory of the code.
     * 
     */
    public Optional<Output<String>> mountPath() {
        return Optional.ofNullable(this.mountPath);
    }

    /**
     * The ID of the workspace.
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return The ID of the workspace.
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private WorkspaceCodeSourceState() {}

    private WorkspaceCodeSourceState(WorkspaceCodeSourceState $) {
        this.accessibility = $.accessibility;
        this.codeBranch = $.codeBranch;
        this.codeCommit = $.codeCommit;
        this.codeRepo = $.codeRepo;
        this.codeRepoAccessToken = $.codeRepoAccessToken;
        this.codeRepoUserName = $.codeRepoUserName;
        this.createTime = $.createTime;
        this.description = $.description;
        this.displayName = $.displayName;
        this.mountPath = $.mountPath;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceCodeSourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceCodeSourceState $;

        public Builder() {
            $ = new WorkspaceCodeSourceState();
        }

        public Builder(WorkspaceCodeSourceState defaults) {
            $ = new WorkspaceCodeSourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessibility Visibility of the code configuration, possible values:
         * - PRIVATE: In this workspace, it is only visible to you and the administrator.
         * - PUBLIC: In this workspace, it is visible to everyone.
         * 
         * @return builder
         * 
         */
        public Builder accessibility(@Nullable Output<String> accessibility) {
            $.accessibility = accessibility;
            return this;
        }

        /**
         * @param accessibility Visibility of the code configuration, possible values:
         * - PRIVATE: In this workspace, it is only visible to you and the administrator.
         * - PUBLIC: In this workspace, it is visible to everyone.
         * 
         * @return builder
         * 
         */
        public Builder accessibility(String accessibility) {
            return accessibility(Output.of(accessibility));
        }

        /**
         * @param codeBranch Code repository branch.
         * 
         * @return builder
         * 
         */
        public Builder codeBranch(@Nullable Output<String> codeBranch) {
            $.codeBranch = codeBranch;
            return this;
        }

        /**
         * @param codeBranch Code repository branch.
         * 
         * @return builder
         * 
         */
        public Builder codeBranch(String codeBranch) {
            return codeBranch(Output.of(codeBranch));
        }

        /**
         * @param codeCommit The code CommitId.
         * 
         * @return builder
         * 
         */
        public Builder codeCommit(@Nullable Output<String> codeCommit) {
            $.codeCommit = codeCommit;
            return this;
        }

        /**
         * @param codeCommit The code CommitId.
         * 
         * @return builder
         * 
         */
        public Builder codeCommit(String codeCommit) {
            return codeCommit(Output.of(codeCommit));
        }

        /**
         * @param codeRepo Code repository address.
         * 
         * @return builder
         * 
         */
        public Builder codeRepo(@Nullable Output<String> codeRepo) {
            $.codeRepo = codeRepo;
            return this;
        }

        /**
         * @param codeRepo Code repository address.
         * 
         * @return builder
         * 
         */
        public Builder codeRepo(String codeRepo) {
            return codeRepo(Output.of(codeRepo));
        }

        /**
         * @param codeRepoAccessToken The Token used to access the code repository.
         * 
         * @return builder
         * 
         */
        public Builder codeRepoAccessToken(@Nullable Output<String> codeRepoAccessToken) {
            $.codeRepoAccessToken = codeRepoAccessToken;
            return this;
        }

        /**
         * @param codeRepoAccessToken The Token used to access the code repository.
         * 
         * @return builder
         * 
         */
        public Builder codeRepoAccessToken(String codeRepoAccessToken) {
            return codeRepoAccessToken(Output.of(codeRepoAccessToken));
        }

        /**
         * @param codeRepoUserName The user name of the code repository.
         * 
         * @return builder
         * 
         */
        public Builder codeRepoUserName(@Nullable Output<String> codeRepoUserName) {
            $.codeRepoUserName = codeRepoUserName;
            return this;
        }

        /**
         * @param codeRepoUserName The user name of the code repository.
         * 
         * @return builder
         * 
         */
        public Builder codeRepoUserName(String codeRepoUserName) {
            return codeRepoUserName(Output.of(codeRepoUserName));
        }

        /**
         * @param createTime The creation time of the resource
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The creation time of the resource
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description A detailed description of the code configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A detailed description of the code configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Code source configuration name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Code source configuration name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param mountPath The local Mount Directory of the code.
         * 
         * @return builder
         * 
         */
        public Builder mountPath(@Nullable Output<String> mountPath) {
            $.mountPath = mountPath;
            return this;
        }

        /**
         * @param mountPath The local Mount Directory of the code.
         * 
         * @return builder
         * 
         */
        public Builder mountPath(String mountPath) {
            return mountPath(Output.of(mountPath));
        }

        /**
         * @param workspaceId The ID of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The ID of the workspace.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public WorkspaceCodeSourceState build() {
            return $;
        }
    }

}