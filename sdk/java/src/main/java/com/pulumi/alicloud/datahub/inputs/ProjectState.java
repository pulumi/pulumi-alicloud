// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.datahub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * Comment of the datahub project. It cannot be longer than 255 characters.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Comment of the datahub project. It cannot be longer than 255 characters.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Create time of the datahub project. It is a human-readable string rather than 64-bits UTC.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Create time of the datahub project. It is a human-readable string rather than 64-bits UTC.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Last modify time of the datahub project. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     * 
     */
    @Import(name="lastModifyTime")
    private @Nullable Output<String> lastModifyTime;

    /**
     * @return Last modify time of the datahub project. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
     * 
     */
    public Optional<Output<String>> lastModifyTime() {
        return Optional.ofNullable(this.lastModifyTime);
    }

    /**
     * The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and &#39;_&#39; are allowed. It is case-insensitive.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and &#39;_&#39; are allowed. It is case-insensitive.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ProjectState() {}

    private ProjectState(ProjectState $) {
        this.comment = $.comment;
        this.createTime = $.createTime;
        this.lastModifyTime = $.lastModifyTime;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectState $;

        public Builder() {
            $ = new ProjectState();
        }

        public Builder(ProjectState defaults) {
            $ = new ProjectState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Comment of the datahub project. It cannot be longer than 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Comment of the datahub project. It cannot be longer than 255 characters.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param createTime Create time of the datahub project. It is a human-readable string rather than 64-bits UTC.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Create time of the datahub project. It is a human-readable string rather than 64-bits UTC.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param lastModifyTime Last modify time of the datahub project. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
         * 
         * @return builder
         * 
         */
        public Builder lastModifyTime(@Nullable Output<String> lastModifyTime) {
            $.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * @param lastModifyTime Last modify time of the datahub project. It is the same as *create_time* at the beginning. It is also a human-readable string rather than 64-bits UTC.
         * 
         * @return builder
         * 
         */
        public Builder lastModifyTime(String lastModifyTime) {
            return lastModifyTime(Output.of(lastModifyTime));
        }

        /**
         * @param name The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and &#39;_&#39; are allowed. It is case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the datahub project. Its length is limited to 3-32 and only characters such as letters, digits and &#39;_&#39; are allowed. It is case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ProjectState build() {
            return $;
        }
    }

}