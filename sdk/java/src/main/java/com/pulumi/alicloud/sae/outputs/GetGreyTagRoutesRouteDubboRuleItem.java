// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGreyTagRoutesRouteDubboRuleItem {
    /**
     * @return The comparison operator.
     * 
     */
    private String cond;
    /**
     * @return The parameter value gets the expression.
     * 
     */
    private String expr;
    /**
     * @return The parameter number.
     * 
     */
    private Integer index;
    /**
     * @return The operator.
     * 
     */
    private String operator;
    /**
     * @return The value of the parameter.
     * 
     */
    private String value;

    private GetGreyTagRoutesRouteDubboRuleItem() {}
    /**
     * @return The comparison operator.
     * 
     */
    public String cond() {
        return this.cond;
    }
    /**
     * @return The parameter value gets the expression.
     * 
     */
    public String expr() {
        return this.expr;
    }
    /**
     * @return The parameter number.
     * 
     */
    public Integer index() {
        return this.index;
    }
    /**
     * @return The operator.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return The value of the parameter.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGreyTagRoutesRouteDubboRuleItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cond;
        private String expr;
        private Integer index;
        private String operator;
        private String value;
        public Builder() {}
        public Builder(GetGreyTagRoutesRouteDubboRuleItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cond = defaults.cond;
    	      this.expr = defaults.expr;
    	      this.index = defaults.index;
    	      this.operator = defaults.operator;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder cond(String cond) {
            if (cond == null) {
              throw new MissingRequiredPropertyException("GetGreyTagRoutesRouteDubboRuleItem", "cond");
            }
            this.cond = cond;
            return this;
        }
        @CustomType.Setter
        public Builder expr(String expr) {
            if (expr == null) {
              throw new MissingRequiredPropertyException("GetGreyTagRoutesRouteDubboRuleItem", "expr");
            }
            this.expr = expr;
            return this;
        }
        @CustomType.Setter
        public Builder index(Integer index) {
            if (index == null) {
              throw new MissingRequiredPropertyException("GetGreyTagRoutesRouteDubboRuleItem", "index");
            }
            this.index = index;
            return this;
        }
        @CustomType.Setter
        public Builder operator(String operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("GetGreyTagRoutesRouteDubboRuleItem", "operator");
            }
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetGreyTagRoutesRouteDubboRuleItem", "value");
            }
            this.value = value;
            return this;
        }
        public GetGreyTagRoutesRouteDubboRuleItem build() {
            final var _resultValue = new GetGreyTagRoutesRouteDubboRuleItem();
            _resultValue.cond = cond;
            _resultValue.expr = expr;
            _resultValue.index = index;
            _resultValue.operator = operator;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
