// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.alicloud.cms.outputs.AlarmCompositeExpressionExpressionList;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmCompositeExpression {
    /**
     * @return The relationship between the trigger conditions for multiple metrics. Valid values: `&amp;&amp;`, `||`.
     * 
     */
    private @Nullable String expressionListJoin;
    /**
     * @return The trigger conditions that are created in standard mode. See `expression_list` below.
     * 
     */
    private @Nullable List<AlarmCompositeExpressionExpressionList> expressionLists;
    /**
     * @return The trigger conditions that are created by using expressions.
     * 
     */
    private @Nullable String expressionRaw;
    /**
     * @return The level of the alert. Valid values: `CRITICAL`, `WARN`, `INFO`.
     * 
     */
    private @Nullable String level;
    /**
     * @return The number of consecutive triggers.
     * 
     */
    private @Nullable Integer times;

    private AlarmCompositeExpression() {}
    /**
     * @return The relationship between the trigger conditions for multiple metrics. Valid values: `&amp;&amp;`, `||`.
     * 
     */
    public Optional<String> expressionListJoin() {
        return Optional.ofNullable(this.expressionListJoin);
    }
    /**
     * @return The trigger conditions that are created in standard mode. See `expression_list` below.
     * 
     */
    public List<AlarmCompositeExpressionExpressionList> expressionLists() {
        return this.expressionLists == null ? List.of() : this.expressionLists;
    }
    /**
     * @return The trigger conditions that are created by using expressions.
     * 
     */
    public Optional<String> expressionRaw() {
        return Optional.ofNullable(this.expressionRaw);
    }
    /**
     * @return The level of the alert. Valid values: `CRITICAL`, `WARN`, `INFO`.
     * 
     */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    /**
     * @return The number of consecutive triggers.
     * 
     */
    public Optional<Integer> times() {
        return Optional.ofNullable(this.times);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmCompositeExpression defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expressionListJoin;
        private @Nullable List<AlarmCompositeExpressionExpressionList> expressionLists;
        private @Nullable String expressionRaw;
        private @Nullable String level;
        private @Nullable Integer times;
        public Builder() {}
        public Builder(AlarmCompositeExpression defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expressionListJoin = defaults.expressionListJoin;
    	      this.expressionLists = defaults.expressionLists;
    	      this.expressionRaw = defaults.expressionRaw;
    	      this.level = defaults.level;
    	      this.times = defaults.times;
        }

        @CustomType.Setter
        public Builder expressionListJoin(@Nullable String expressionListJoin) {

            this.expressionListJoin = expressionListJoin;
            return this;
        }
        @CustomType.Setter
        public Builder expressionLists(@Nullable List<AlarmCompositeExpressionExpressionList> expressionLists) {

            this.expressionLists = expressionLists;
            return this;
        }
        public Builder expressionLists(AlarmCompositeExpressionExpressionList... expressionLists) {
            return expressionLists(List.of(expressionLists));
        }
        @CustomType.Setter
        public Builder expressionRaw(@Nullable String expressionRaw) {

            this.expressionRaw = expressionRaw;
            return this;
        }
        @CustomType.Setter
        public Builder level(@Nullable String level) {

            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder times(@Nullable Integer times) {

            this.times = times;
            return this;
        }
        public AlarmCompositeExpression build() {
            final var _resultValue = new AlarmCompositeExpression();
            _resultValue.expressionListJoin = expressionListJoin;
            _resultValue.expressionLists = expressionLists;
            _resultValue.expressionRaw = expressionRaw;
            _resultValue.level = level;
            _resultValue.times = times;
            return _resultValue;
        }
    }
}
