// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostGroupAccountUserGroupAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final HostGroupAccountUserGroupAttachmentState Empty = new HostGroupAccountUserGroupAttachmentState();

    /**
     * A list names of the host account.
     * 
     */
    @Import(name="hostAccountNames")
    private @Nullable Output<List<String>> hostAccountNames;

    /**
     * @return A list names of the host account.
     * 
     */
    public Optional<Output<List<String>>> hostAccountNames() {
        return Optional.ofNullable(this.hostAccountNames);
    }

    /**
     * The ID of the host group.
     * 
     */
    @Import(name="hostGroupId")
    private @Nullable Output<String> hostGroupId;

    /**
     * @return The ID of the host group.
     * 
     */
    public Optional<Output<String>> hostGroupId() {
        return Optional.ofNullable(this.hostGroupId);
    }

    /**
     * The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The ID of the user group that you want to authorize to manage the specified hosts and host accounts.
     * 
     */
    @Import(name="userGroupId")
    private @Nullable Output<String> userGroupId;

    /**
     * @return The ID of the user group that you want to authorize to manage the specified hosts and host accounts.
     * 
     */
    public Optional<Output<String>> userGroupId() {
        return Optional.ofNullable(this.userGroupId);
    }

    private HostGroupAccountUserGroupAttachmentState() {}

    private HostGroupAccountUserGroupAttachmentState(HostGroupAccountUserGroupAttachmentState $) {
        this.hostAccountNames = $.hostAccountNames;
        this.hostGroupId = $.hostGroupId;
        this.instanceId = $.instanceId;
        this.userGroupId = $.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostGroupAccountUserGroupAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostGroupAccountUserGroupAttachmentState $;

        public Builder() {
            $ = new HostGroupAccountUserGroupAttachmentState();
        }

        public Builder(HostGroupAccountUserGroupAttachmentState defaults) {
            $ = new HostGroupAccountUserGroupAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostAccountNames A list names of the host account.
         * 
         * @return builder
         * 
         */
        public Builder hostAccountNames(@Nullable Output<List<String>> hostAccountNames) {
            $.hostAccountNames = hostAccountNames;
            return this;
        }

        /**
         * @param hostAccountNames A list names of the host account.
         * 
         * @return builder
         * 
         */
        public Builder hostAccountNames(List<String> hostAccountNames) {
            return hostAccountNames(Output.of(hostAccountNames));
        }

        /**
         * @param hostAccountNames A list names of the host account.
         * 
         * @return builder
         * 
         */
        public Builder hostAccountNames(String... hostAccountNames) {
            return hostAccountNames(List.of(hostAccountNames));
        }

        /**
         * @param hostGroupId The ID of the host group.
         * 
         * @return builder
         * 
         */
        public Builder hostGroupId(@Nullable Output<String> hostGroupId) {
            $.hostGroupId = hostGroupId;
            return this;
        }

        /**
         * @param hostGroupId The ID of the host group.
         * 
         * @return builder
         * 
         */
        public Builder hostGroupId(String hostGroupId) {
            return hostGroupId(Output.of(hostGroupId));
        }

        /**
         * @param instanceId The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the Bastionhost instance where you want to authorize the user to manage the specified hosts and host accounts.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param userGroupId The ID of the user group that you want to authorize to manage the specified hosts and host accounts.
         * 
         * @return builder
         * 
         */
        public Builder userGroupId(@Nullable Output<String> userGroupId) {
            $.userGroupId = userGroupId;
            return this;
        }

        /**
         * @param userGroupId The ID of the user group that you want to authorize to manage the specified hosts and host accounts.
         * 
         * @return builder
         * 
         */
        public Builder userGroupId(String userGroupId) {
            return userGroupId(Output.of(userGroupId));
        }

        public HostGroupAccountUserGroupAttachmentState build() {
            return $;
        }
    }

}