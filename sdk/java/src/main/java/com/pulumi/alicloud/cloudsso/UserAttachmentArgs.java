// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class UserAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserAttachmentArgs Empty = new UserAttachmentArgs();

    /**
     * The ID of the Directory.
     * 
     */
    @Import(name="directoryId", required=true)
    private Output<String> directoryId;

    /**
     * @return The ID of the Directory.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }

    /**
     * The Group ID.
     * 
     */
    @Import(name="groupId", required=true)
    private Output<String> groupId;

    /**
     * @return The Group ID.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * The User ID.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The User ID.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private UserAttachmentArgs() {}

    private UserAttachmentArgs(UserAttachmentArgs $) {
        this.directoryId = $.directoryId;
        this.groupId = $.groupId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserAttachmentArgs $;

        public Builder() {
            $ = new UserAttachmentArgs();
        }

        public Builder(UserAttachmentArgs defaults) {
            $ = new UserAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param directoryId The ID of the Directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId The ID of the Directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        /**
         * @param groupId The Group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The Group ID.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param userId The User ID.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The User ID.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserAttachmentArgs build() {
            if ($.directoryId == null) {
                throw new MissingRequiredPropertyException("UserAttachmentArgs", "directoryId");
            }
            if ($.groupId == null) {
                throw new MissingRequiredPropertyException("UserAttachmentArgs", "groupId");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("UserAttachmentArgs", "userId");
            }
            return $;
        }
    }

}