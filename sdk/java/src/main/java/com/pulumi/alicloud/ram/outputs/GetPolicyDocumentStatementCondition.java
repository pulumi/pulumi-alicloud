// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPolicyDocumentStatementCondition {
    private String operator;
    private List<String> values;
    private String variable;

    private GetPolicyDocumentStatementCondition() {}
    public String operator() {
        return this.operator;
    }
    public List<String> values() {
        return this.values;
    }
    public String variable() {
        return this.variable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyDocumentStatementCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String operator;
        private List<String> values;
        private String variable;
        public Builder() {}
        public Builder(GetPolicyDocumentStatementCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
    	      this.variable = defaults.variable;
        }

        @CustomType.Setter
        public Builder operator(String operator) {
            if (operator == null) {
              throw new MissingRequiredPropertyException("GetPolicyDocumentStatementCondition", "operator");
            }
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            if (values == null) {
              throw new MissingRequiredPropertyException("GetPolicyDocumentStatementCondition", "values");
            }
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        @CustomType.Setter
        public Builder variable(String variable) {
            if (variable == null) {
              throw new MissingRequiredPropertyException("GetPolicyDocumentStatementCondition", "variable");
            }
            this.variable = variable;
            return this;
        }
        public GetPolicyDocumentStatementCondition build() {
            final var _resultValue = new GetPolicyDocumentStatementCondition();
            _resultValue.operator = operator;
            _resultValue.values = values;
            _resultValue.variable = variable;
            return _resultValue;
        }
    }
}