// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclEntryAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final AclEntryAttachmentState Empty = new AclEntryAttachmentState();

    /**
     * The ID of the Acl.
     * 
     */
    @Import(name="aclId")
    private @Nullable Output<String> aclId;

    /**
     * @return The ID of the Acl.
     * 
     */
    public Optional<Output<String>> aclId() {
        return Optional.ofNullable(this.aclId);
    }

    /**
     * The description of the entry.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the entry.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The CIDR blocks.
     * 
     */
    @Import(name="entry")
    private @Nullable Output<String> entry;

    /**
     * @return The CIDR blocks.
     * 
     */
    public Optional<Output<String>> entry() {
        return Optional.ofNullable(this.entry);
    }

    /**
     * The Status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The Status of the resource.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private AclEntryAttachmentState() {}

    private AclEntryAttachmentState(AclEntryAttachmentState $) {
        this.aclId = $.aclId;
        this.description = $.description;
        this.entry = $.entry;
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
         * @param aclId The ID of the Acl.
         * 
         * @return builder
         * 
         */
        public Builder aclId(@Nullable Output<String> aclId) {
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
         * @param description The description of the entry.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the entry.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param entry The CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder entry(@Nullable Output<String> entry) {
            $.entry = entry;
            return this;
        }

        /**
         * @param entry The CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder entry(String entry) {
            return entry(Output.of(entry));
        }

        /**
         * @param status The Status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The Status of the resource.
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
