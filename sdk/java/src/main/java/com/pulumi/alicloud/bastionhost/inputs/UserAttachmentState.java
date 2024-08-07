// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final UserAttachmentState Empty = new UserAttachmentState();

    /**
     * Specifies the user group to add the user&#39;s bastion host ID of.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return Specifies the user group to add the user&#39;s bastion host ID of.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Specifies the user group to which you want to add the user ID.
     * 
     */
    @Import(name="userGroupId")
    private @Nullable Output<String> userGroupId;

    /**
     * @return Specifies the user group to which you want to add the user ID.
     * 
     */
    public Optional<Output<String>> userGroupId() {
        return Optional.ofNullable(this.userGroupId);
    }

    /**
     * Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private UserAttachmentState() {}

    private UserAttachmentState(UserAttachmentState $) {
        this.instanceId = $.instanceId;
        this.userGroupId = $.userGroupId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserAttachmentState $;

        public Builder() {
            $ = new UserAttachmentState();
        }

        public Builder(UserAttachmentState defaults) {
            $ = new UserAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId Specifies the user group to add the user&#39;s bastion host ID of.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Specifies the user group to add the user&#39;s bastion host ID of.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param userGroupId Specifies the user group to which you want to add the user ID.
         * 
         * @return builder
         * 
         */
        public Builder userGroupId(@Nullable Output<String> userGroupId) {
            $.userGroupId = userGroupId;
            return this;
        }

        /**
         * @param userGroupId Specifies the user group to which you want to add the user ID.
         * 
         * @return builder
         * 
         */
        public Builder userGroupId(String userGroupId) {
            return userGroupId(Output.of(userGroupId));
        }

        /**
         * @param userId Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId Specify that you want to add to the policy attached to the user group ID. This includes response parameters in a Json-formatted string supports up to set up 100 USER ID.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserAttachmentState build() {
            return $;
        }
    }

}
