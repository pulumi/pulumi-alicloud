// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclEntryAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final AclEntryAttachmentState Empty = new AclEntryAttachmentState();

    /**
     * The ID of the global acceleration instance.
     * 
     */
    @Import(name="aclId")
    private @Nullable Output<String> aclId;

    /**
     * @return The ID of the global acceleration instance.
     * 
     */
    public Optional<Output<String>> aclId() {
        return Optional.ofNullable(this.aclId);
    }

    /**
     * The IP address or CIDR block that you want to add to the network ACL.
     * 
     */
    @Import(name="entry")
    private @Nullable Output<String> entry;

    /**
     * @return The IP address or CIDR block that you want to add to the network ACL.
     * 
     */
    public Optional<Output<String>> entry() {
        return Optional.ofNullable(this.entry);
    }

    /**
     * The description of the entry. The description must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
     * 
     */
    @Import(name="entryDescription")
    private @Nullable Output<String> entryDescription;

    /**
     * @return The description of the entry. The description must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
     * 
     */
    public Optional<Output<String>> entryDescription() {
        return Optional.ofNullable(this.entryDescription);
    }

    /**
     * The status of the network ACL.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the network ACL.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private AclEntryAttachmentState() {}

    private AclEntryAttachmentState(AclEntryAttachmentState $) {
        this.aclId = $.aclId;
        this.entry = $.entry;
        this.entryDescription = $.entryDescription;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclEntryAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclEntryAttachmentState $;

        public Builder() {
            $ = new AclEntryAttachmentState();
        }

        public Builder(AclEntryAttachmentState defaults) {
            $ = new AclEntryAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclId The ID of the global acceleration instance.
         * 
         * @return builder
         * 
         */
        public Builder aclId(@Nullable Output<String> aclId) {
            $.aclId = aclId;
            return this;
        }

        /**
         * @param aclId The ID of the global acceleration instance.
         * 
         * @return builder
         * 
         */
        public Builder aclId(String aclId) {
            return aclId(Output.of(aclId));
        }

        /**
         * @param entry The IP address or CIDR block that you want to add to the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder entry(@Nullable Output<String> entry) {
            $.entry = entry;
            return this;
        }

        /**
         * @param entry The IP address or CIDR block that you want to add to the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder entry(String entry) {
            return entry(Output.of(entry));
        }

        /**
         * @param entryDescription The description of the entry. The description must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder entryDescription(@Nullable Output<String> entryDescription) {
            $.entryDescription = entryDescription;
            return this;
        }

        /**
         * @param entryDescription The description of the entry. The description must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder entryDescription(String entryDescription) {
            return entryDescription(Output.of(entryDescription));
        }

        /**
         * @param status The status of the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public AclEntryAttachmentState build() {
            return $;
        }
    }

}