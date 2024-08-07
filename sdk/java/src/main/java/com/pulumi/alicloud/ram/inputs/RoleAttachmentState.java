// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final RoleAttachmentState Empty = new RoleAttachmentState();

    /**
     * The list of ECS instance&#39;s IDs.
     * 
     */
    @Import(name="instanceIds")
    private @Nullable Output<List<String>> instanceIds;

    /**
     * @return The list of ECS instance&#39;s IDs.
     * 
     */
    public Optional<Output<List<String>>> instanceIds() {
        return Optional.ofNullable(this.instanceIds);
    }

    /**
     * The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Import(name="roleName")
    private @Nullable Output<String> roleName;

    /**
     * @return The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Optional<Output<String>> roleName() {
        return Optional.ofNullable(this.roleName);
    }

    private RoleAttachmentState() {}

    private RoleAttachmentState(RoleAttachmentState $) {
        this.instanceIds = $.instanceIds;
        this.roleName = $.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleAttachmentState $;

        public Builder() {
            $ = new RoleAttachmentState();
        }

        public Builder(RoleAttachmentState defaults) {
            $ = new RoleAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceIds The list of ECS instance&#39;s IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(@Nullable Output<List<String>> instanceIds) {
            $.instanceIds = instanceIds;
            return this;
        }

        /**
         * @param instanceIds The list of ECS instance&#39;s IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(List<String> instanceIds) {
            return instanceIds(Output.of(instanceIds));
        }

        /**
         * @param instanceIds The list of ECS instance&#39;s IDs.
         * 
         * @return builder
         * 
         */
        public Builder instanceIds(String... instanceIds) {
            return instanceIds(List.of(instanceIds));
        }

        /**
         * @param roleName The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder roleName(@Nullable Output<String> roleName) {
            $.roleName = roleName;
            return this;
        }

        /**
         * @param roleName The name of role used to bind. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder roleName(String roleName) {
            return roleName(Output.of(roleName));
        }

        public RoleAttachmentState build() {
            return $;
        }
    }

}
