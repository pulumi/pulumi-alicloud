// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * Comment of the RAM user. This parameter can have a string of 1 to 128 characters.
     * 
     */
    @Import(name="comments")
    private @Nullable Output<String> comments;

    /**
     * @return Comment of the RAM user. This parameter can have a string of 1 to 128 characters.
     * 
     */
    public Optional<Output<String>> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * Name of the RAM user which for display. This name can have a string of 1 to 128 characters or Chinese characters, must contain only alphanumeric characters or Chinese characters or hyphens, such as &#34;-&#34;,&#34;.&#34;, and must not end with a hyphen.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Name of the RAM user which for display. This name can have a string of 1 to 128 characters or Chinese characters, must contain only alphanumeric characters or Chinese characters or hyphens, such as &#34;-&#34;,&#34;.&#34;, and must not end with a hyphen.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Email of the RAM user.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return Email of the RAM user.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * This parameter is used for resource destroy. Default value: `false`.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return This parameter is used for resource destroy. Default value: `false`.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * Phone number of the RAM user. This number must contain an international area code prefix, just look like this: 86-18600008888.
     * 
     */
    @Import(name="mobile")
    private @Nullable Output<String> mobile;

    /**
     * @return Phone number of the RAM user. This number must contain an international area code prefix, just look like this: 86-18600008888.
     * 
     */
    public Optional<Output<String>> mobile() {
        return Optional.ofNullable(this.mobile);
    }

    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.comments = $.comments;
        this.displayName = $.displayName;
        this.email = $.email;
        this.force = $.force;
        this.mobile = $.mobile;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comments Comment of the RAM user. This parameter can have a string of 1 to 128 characters.
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable Output<String> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments Comment of the RAM user. This parameter can have a string of 1 to 128 characters.
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param displayName Name of the RAM user which for display. This name can have a string of 1 to 128 characters or Chinese characters, must contain only alphanumeric characters or Chinese characters or hyphens, such as &#34;-&#34;,&#34;.&#34;, and must not end with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Name of the RAM user which for display. This name can have a string of 1 to 128 characters or Chinese characters, must contain only alphanumeric characters or Chinese characters or hyphens, such as &#34;-&#34;,&#34;.&#34;, and must not end with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param email Email of the RAM user.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email of the RAM user.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param force This parameter is used for resource destroy. Default value: `false`.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force This parameter is used for resource destroy. Default value: `false`.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param mobile Phone number of the RAM user. This number must contain an international area code prefix, just look like this: 86-18600008888.
         * 
         * @return builder
         * 
         */
        public Builder mobile(@Nullable Output<String> mobile) {
            $.mobile = mobile;
            return this;
        }

        /**
         * @param mobile Phone number of the RAM user. This number must contain an international area code prefix, just look like this: 86-18600008888.
         * 
         * @return builder
         * 
         */
        public Builder mobile(String mobile) {
            return mobile(Output.of(mobile));
        }

        /**
         * @param name Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public UserArgs build() {
            return $;
        }
    }

}
