// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.alicloud.oss.inputs.BucketLifecycleRuleFilterNotArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleFilterArgs Empty = new BucketLifecycleRuleFilterArgs();

    @Import(name="not")
    private @Nullable Output<BucketLifecycleRuleFilterNotArgs> not;

    public Optional<Output<BucketLifecycleRuleFilterNotArgs>> not() {
        return Optional.ofNullable(this.not);
    }

    @Import(name="objectSizeGreaterThan")
    private @Nullable Output<Integer> objectSizeGreaterThan;

    public Optional<Output<Integer>> objectSizeGreaterThan() {
        return Optional.ofNullable(this.objectSizeGreaterThan);
    }

    @Import(name="objectSizeLessThan")
    private @Nullable Output<Integer> objectSizeLessThan;

    public Optional<Output<Integer>> objectSizeLessThan() {
        return Optional.ofNullable(this.objectSizeLessThan);
    }

    private BucketLifecycleRuleFilterArgs() {}

    private BucketLifecycleRuleFilterArgs(BucketLifecycleRuleFilterArgs $) {
        this.not = $.not;
        this.objectSizeGreaterThan = $.objectSizeGreaterThan;
        this.objectSizeLessThan = $.objectSizeLessThan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleRuleFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleFilterArgs $;

        public Builder() {
            $ = new BucketLifecycleRuleFilterArgs();
        }

        public Builder(BucketLifecycleRuleFilterArgs defaults) {
            $ = new BucketLifecycleRuleFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder not(@Nullable Output<BucketLifecycleRuleFilterNotArgs> not) {
            $.not = not;
            return this;
        }

        public Builder not(BucketLifecycleRuleFilterNotArgs not) {
            return not(Output.of(not));
        }

        public Builder objectSizeGreaterThan(@Nullable Output<Integer> objectSizeGreaterThan) {
            $.objectSizeGreaterThan = objectSizeGreaterThan;
            return this;
        }

        public Builder objectSizeGreaterThan(Integer objectSizeGreaterThan) {
            return objectSizeGreaterThan(Output.of(objectSizeGreaterThan));
        }

        public Builder objectSizeLessThan(@Nullable Output<Integer> objectSizeLessThan) {
            $.objectSizeLessThan = objectSizeLessThan;
            return this;
        }

        public Builder objectSizeLessThan(Integer objectSizeLessThan) {
            return objectSizeLessThan(Output.of(objectSizeLessThan));
        }

        public BucketLifecycleRuleFilterArgs build() {
            return $;
        }
    }

}