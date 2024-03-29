// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessGroupState extends com.pulumi.resources.ResourceArgs {

    public static final AccessGroupState Empty = new AccessGroupState();

    /**
     * The name of the permission group.
     * 
     */
    @Import(name="accessGroupName")
    private @Nullable Output<String> accessGroupName;

    /**
     * @return The name of the permission group.
     * 
     */
    public Optional<Output<String>> accessGroupName() {
        return Optional.ofNullable(this.accessGroupName);
    }

    /**
     * Permission group types, including Vpc.
     * 
     */
    @Import(name="accessGroupType")
    private @Nullable Output<String> accessGroupType;

    /**
     * @return Permission group types, including Vpc.
     * 
     */
    public Optional<Output<String>> accessGroupType() {
        return Optional.ofNullable(this.accessGroupType);
    }

    /**
     * Creation time.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Creation time.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Permission group description information.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Permission group description information.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * File system type. Value:
     * - standard (default): Universal NAS
     * - extreme: extreme NAS
     *   The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    @Import(name="fileSystemType")
    private @Nullable Output<String> fileSystemType;

    /**
     * @return File system type. Value:
     * - standard (default): Universal NAS
     * - extreme: extreme NAS
     *   The following arguments will be discarded. Please use new fields as soon as possible:
     * 
     */
    public Optional<Output<String>> fileSystemType() {
        return Optional.ofNullable(this.fileSystemType);
    }

    /**
     * . Field &#39;name&#39; has been deprecated from provider version 1.218.0. New field &#39;access_group_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.218.0. New field &#39;access_group_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.218.0. New field 'access_group_name' instead. */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return . Field &#39;name&#39; has been deprecated from provider version 1.218.0. New field &#39;access_group_name&#39; instead.
     * 
     * @deprecated
     * Field &#39;name&#39; has been deprecated since provider version 1.218.0. New field &#39;access_group_name&#39; instead.
     * 
     */
    @Deprecated /* Field 'name' has been deprecated since provider version 1.218.0. New field 'access_group_name' instead. */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * . Field &#39;type&#39; has been deprecated from provider version 1.218.0. New field &#39;access_group_type&#39; instead.
     * 
     * @deprecated
     * Field &#39;type&#39; has been deprecated since provider version 1.218.0. New field &#39;access_group_type&#39; instead.
     * 
     */
    @Deprecated /* Field 'type' has been deprecated since provider version 1.218.0. New field 'access_group_type' instead. */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return . Field &#39;type&#39; has been deprecated from provider version 1.218.0. New field &#39;access_group_type&#39; instead.
     * 
     * @deprecated
     * Field &#39;type&#39; has been deprecated since provider version 1.218.0. New field &#39;access_group_type&#39; instead.
     * 
     */
    @Deprecated /* Field 'type' has been deprecated since provider version 1.218.0. New field 'access_group_type' instead. */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private AccessGroupState() {}

    private AccessGroupState(AccessGroupState $) {
        this.accessGroupName = $.accessGroupName;
        this.accessGroupType = $.accessGroupType;
        this.createTime = $.createTime;
        this.description = $.description;
        this.fileSystemType = $.fileSystemType;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessGroupState $;

        public Builder() {
            $ = new AccessGroupState();
        }

        public Builder(AccessGroupState defaults) {
            $ = new AccessGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessGroupName The name of the permission group.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupName(@Nullable Output<String> accessGroupName) {
            $.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * @param accessGroupName The name of the permission group.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupName(String accessGroupName) {
            return accessGroupName(Output.of(accessGroupName));
        }

        /**
         * @param accessGroupType Permission group types, including Vpc.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupType(@Nullable Output<String> accessGroupType) {
            $.accessGroupType = accessGroupType;
            return this;
        }

        /**
         * @param accessGroupType Permission group types, including Vpc.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupType(String accessGroupType) {
            return accessGroupType(Output.of(accessGroupType));
        }

        /**
         * @param createTime Creation time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Creation time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Permission group description information.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Permission group description information.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fileSystemType File system type. Value:
         * - standard (default): Universal NAS
         * - extreme: extreme NAS
         *   The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder fileSystemType(@Nullable Output<String> fileSystemType) {
            $.fileSystemType = fileSystemType;
            return this;
        }

        /**
         * @param fileSystemType File system type. Value:
         * - standard (default): Universal NAS
         * - extreme: extreme NAS
         *   The following arguments will be discarded. Please use new fields as soon as possible:
         * 
         * @return builder
         * 
         */
        public Builder fileSystemType(String fileSystemType) {
            return fileSystemType(Output.of(fileSystemType));
        }

        /**
         * @param name . Field &#39;name&#39; has been deprecated from provider version 1.218.0. New field &#39;access_group_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated since provider version 1.218.0. New field &#39;access_group_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated since provider version 1.218.0. New field 'access_group_name' instead. */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name . Field &#39;name&#39; has been deprecated from provider version 1.218.0. New field &#39;access_group_name&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;name&#39; has been deprecated since provider version 1.218.0. New field &#39;access_group_name&#39; instead.
         * 
         */
        @Deprecated /* Field 'name' has been deprecated since provider version 1.218.0. New field 'access_group_name' instead. */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type . Field &#39;type&#39; has been deprecated from provider version 1.218.0. New field &#39;access_group_type&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;type&#39; has been deprecated since provider version 1.218.0. New field &#39;access_group_type&#39; instead.
         * 
         */
        @Deprecated /* Field 'type' has been deprecated since provider version 1.218.0. New field 'access_group_type' instead. */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type . Field &#39;type&#39; has been deprecated from provider version 1.218.0. New field &#39;access_group_type&#39; instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;type&#39; has been deprecated since provider version 1.218.0. New field &#39;access_group_type&#39; instead.
         * 
         */
        @Deprecated /* Field 'type' has been deprecated since provider version 1.218.0. New field 'access_group_type' instead. */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AccessGroupState build() {
            return $;
        }
    }

}
