// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.alicloud.oss.outputs.BucketLifecycleRuleFilterNot;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BucketLifecycleRuleFilter {
    /**
     * @return The condition that is matched by objects to which the lifecycle rule does not apply. See `not` below.
     * 
     */
    private @Nullable BucketLifecycleRuleFilterNot not;
    /**
     * @return Minimum object size (in bytes) to which the rule applies.
     * 
     */
    private @Nullable Integer objectSizeGreaterThan;
    /**
     * @return Maximum object size (in bytes) to which the rule applies.
     * 
     */
    private @Nullable Integer objectSizeLessThan;

    private BucketLifecycleRuleFilter() {}
    /**
     * @return The condition that is matched by objects to which the lifecycle rule does not apply. See `not` below.
     * 
     */
    public Optional<BucketLifecycleRuleFilterNot> not() {
        return Optional.ofNullable(this.not);
    }
    /**
     * @return Minimum object size (in bytes) to which the rule applies.
     * 
     */
    public Optional<Integer> objectSizeGreaterThan() {
        return Optional.ofNullable(this.objectSizeGreaterThan);
    }
    /**
     * @return Maximum object size (in bytes) to which the rule applies.
     * 
     */
    public Optional<Integer> objectSizeLessThan() {
        return Optional.ofNullable(this.objectSizeLessThan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BucketLifecycleRuleFilterNot not;
        private @Nullable Integer objectSizeGreaterThan;
        private @Nullable Integer objectSizeLessThan;
        public Builder() {}
        public Builder(BucketLifecycleRuleFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.not = defaults.not;
    	      this.objectSizeGreaterThan = defaults.objectSizeGreaterThan;
    	      this.objectSizeLessThan = defaults.objectSizeLessThan;
        }

        @CustomType.Setter
        public Builder not(@Nullable BucketLifecycleRuleFilterNot not) {

            this.not = not;
            return this;
        }
        @CustomType.Setter
        public Builder objectSizeGreaterThan(@Nullable Integer objectSizeGreaterThan) {

            this.objectSizeGreaterThan = objectSizeGreaterThan;
            return this;
        }
        @CustomType.Setter
        public Builder objectSizeLessThan(@Nullable Integer objectSizeLessThan) {

            this.objectSizeLessThan = objectSizeLessThan;
            return this;
        }
        public BucketLifecycleRuleFilter build() {
            final var _resultValue = new BucketLifecycleRuleFilter();
            _resultValue.not = not;
            _resultValue.objectSizeGreaterThan = objectSizeGreaterThan;
            _resultValue.objectSizeLessThan = objectSizeLessThan;
            return _resultValue;
        }
    }
}
