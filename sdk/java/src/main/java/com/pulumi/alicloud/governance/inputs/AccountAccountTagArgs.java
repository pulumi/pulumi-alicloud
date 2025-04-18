// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.governance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountAccountTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountAccountTagArgs Empty = new AccountAccountTagArgs();

    /**
     * The key of the tags
     * 
     */
    @Import(name="tagKey")
    private @Nullable Output<String> tagKey;

    /**
     * @return The key of the tags
     * 
     */
    public Optional<Output<String>> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }

    /**
     * The value of the tags
     * 
     */
    @Import(name="tagValue")
    private @Nullable Output<String> tagValue;

    /**
     * @return The value of the tags
     * 
     */
    public Optional<Output<String>> tagValue() {
        return Optional.ofNullable(this.tagValue);
    }

    private AccountAccountTagArgs() {}

    private AccountAccountTagArgs(AccountAccountTagArgs $) {
        this.tagKey = $.tagKey;
        this.tagValue = $.tagValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountAccountTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountAccountTagArgs $;

        public Builder() {
            $ = new AccountAccountTagArgs();
        }

        public Builder(AccountAccountTagArgs defaults) {
            $ = new AccountAccountTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param tagKey The key of the tags
         * 
         * @return builder
         * 
         */
        public Builder tagKey(@Nullable Output<String> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        /**
         * @param tagKey The key of the tags
         * 
         * @return builder
         * 
         */
        public Builder tagKey(String tagKey) {
            return tagKey(Output.of(tagKey));
        }

        /**
         * @param tagValue The value of the tags
         * 
         * @return builder
         * 
         */
        public Builder tagValue(@Nullable Output<String> tagValue) {
            $.tagValue = tagValue;
            return this;
        }

        /**
         * @param tagValue The value of the tags
         * 
         * @return builder
         * 
         */
        public Builder tagValue(String tagValue) {
            return tagValue(Output.of(tagValue));
        }

        public AccountAccountTagArgs build() {
            return $;
        }
    }

}
