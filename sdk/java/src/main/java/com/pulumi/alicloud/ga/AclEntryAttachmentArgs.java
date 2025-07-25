// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclEntryAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclEntryAttachmentArgs Empty = new AclEntryAttachmentArgs();

    /**
     * The ID of the Acl.
     * 
     */
    @Import(name="aclId", required=true)
    private Output<String> aclId;

    /**
     * @return The ID of the Acl.
     * 
     */
    public Output<String> aclId() {
        return this.aclId;
    }

    /**
     * The entry (IP address or CIDR block) that you want to add.
     * 
     */
    @Import(name="entry", required=true)
    private Output<String> entry;

    /**
     * @return The entry (IP address or CIDR block) that you want to add.
     * 
     */
    public Output<String> entry() {
        return this.entry;
    }

    /**
     * The description of the entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
     * 
     */
    @Import(name="entryDescription")
    private @Nullable Output<String> entryDescription;

    /**
     * @return The description of the entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
     * 
     */
    public Optional<Output<String>> entryDescription() {
        return Optional.ofNullable(this.entryDescription);
    }

    private AclEntryAttachmentArgs() {}

    private AclEntryAttachmentArgs(AclEntryAttachmentArgs $) {
        this.aclId = $.aclId;
        this.entry = $.entry;
        this.entryDescription = $.entryDescription;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclEntryAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclEntryAttachmentArgs $;

        public Builder() {
            $ = new AclEntryAttachmentArgs();
        }

        public Builder(AclEntryAttachmentArgs defaults) {
            $ = new AclEntryAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclId The ID of the Acl.
         * 
         * @return builder
         * 
         */
        public Builder aclId(Output<String> aclId) {
            $.aclId = aclId;
            return this;
        }

        /**
         * @param aclId The ID of the Acl.
         * 
         * @return builder
         * 
         */
        public Builder aclId(String aclId) {
            return aclId(Output.of(aclId));
        }

        /**
         * @param entry The entry (IP address or CIDR block) that you want to add.
         * 
         * @return builder
         * 
         */
        public Builder entry(Output<String> entry) {
            $.entry = entry;
            return this;
        }

        /**
         * @param entry The entry (IP address or CIDR block) that you want to add.
         * 
         * @return builder
         * 
         */
        public Builder entry(String entry) {
            return entry(Output.of(entry));
        }

        /**
         * @param entryDescription The description of the entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder entryDescription(@Nullable Output<String> entryDescription) {
            $.entryDescription = entryDescription;
            return this;
        }

        /**
         * @param entryDescription The description of the entry. The description must be `1` to `256` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).
         * 
         * @return builder
         * 
         */
        public Builder entryDescription(String entryDescription) {
            return entryDescription(Output.of(entryDescription));
        }

        public AclEntryAttachmentArgs build() {
            if ($.aclId == null) {
                throw new MissingRequiredPropertyException("AclEntryAttachmentArgs", "aclId");
            }
            if ($.entry == null) {
                throw new MissingRequiredPropertyException("AclEntryAttachmentArgs", "entry");
            }
            return $;
        }
    }

}
