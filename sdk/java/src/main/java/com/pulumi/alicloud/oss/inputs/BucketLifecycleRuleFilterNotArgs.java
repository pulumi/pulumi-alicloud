// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.alicloud.oss.inputs.BucketLifecycleRuleFilterNotTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleFilterNotArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleFilterNotArgs Empty = new BucketLifecycleRuleFilterNotArgs();

    /**
     * The prefix in the names of the objects to which the lifecycle rule does not apply.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    /**
     * @return The prefix in the names of the objects to which the lifecycle rule does not apply.
     * 
     */
    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The tag of the objects to which the lifecycle rule does not apply. See `tag` below.
     * 
     */
    @Import(name="tag")
    private @Nullable Output<BucketLifecycleRuleFilterNotTagArgs> tag;

    /**
     * @return The tag of the objects to which the lifecycle rule does not apply. See `tag` below.
     * 
     */
    public Optional<Output<BucketLifecycleRuleFilterNotTagArgs>> tag() {
        return Optional.ofNullable(this.tag);
    }

    private BucketLifecycleRuleFilterNotArgs() {}

    private BucketLifecycleRuleFilterNotArgs(BucketLifecycleRuleFilterNotArgs $) {
        this.prefix = $.prefix;
        this.tag = $.tag;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleRuleFilterNotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleFilterNotArgs $;

        public Builder() {
            $ = new BucketLifecycleRuleFilterNotArgs();
        }

        public Builder(BucketLifecycleRuleFilterNotArgs defaults) {
            $ = new BucketLifecycleRuleFilterNotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param prefix The prefix in the names of the objects to which the lifecycle rule does not apply.
         * 
         * @return builder
         * 
         */
        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix The prefix in the names of the objects to which the lifecycle rule does not apply.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param tag The tag of the objects to which the lifecycle rule does not apply. See `tag` below.
         * 
         * @return builder
         * 
         */
        public Builder tag(@Nullable Output<BucketLifecycleRuleFilterNotTagArgs> tag) {
            $.tag = tag;
            return this;
        }

        /**
         * @param tag The tag of the objects to which the lifecycle rule does not apply. See `tag` below.
         * 
         * @return builder
         * 
         */
        public Builder tag(BucketLifecycleRuleFilterNotTagArgs tag) {
            return tag(Output.of(tag));
        }

        public BucketLifecycleRuleFilterNotArgs build() {
            return $;
        }
    }

}