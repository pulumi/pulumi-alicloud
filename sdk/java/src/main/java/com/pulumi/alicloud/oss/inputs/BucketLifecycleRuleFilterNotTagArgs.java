// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class BucketLifecycleRuleFilterNotTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleFilterNotTagArgs Empty = new BucketLifecycleRuleFilterNotTagArgs();

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private BucketLifecycleRuleFilterNotTagArgs() {}

    private BucketLifecycleRuleFilterNotTagArgs(BucketLifecycleRuleFilterNotTagArgs $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleRuleFilterNotTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleFilterNotTagArgs $;

        public Builder() {
            $ = new BucketLifecycleRuleFilterNotTagArgs();
        }

        public Builder(BucketLifecycleRuleFilterNotTagArgs defaults) {
            $ = new BucketLifecycleRuleFilterNotTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public BucketLifecycleRuleFilterNotTagArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("BucketLifecycleRuleFilterNotTagArgs", "key");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("BucketLifecycleRuleFilterNotTagArgs", "value");
            }
            return $;
        }
    }

}