// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetPolicyDocumentStatementConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPolicyDocumentStatementConditionArgs Empty = new GetPolicyDocumentStatementConditionArgs();

    @Import(name="operator", required=true)
    private Output<String> operator;

    public Output<String> operator() {
        return this.operator;
    }

    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    @Import(name="variable", required=true)
    private Output<String> variable;

    public Output<String> variable() {
        return this.variable;
    }

    private GetPolicyDocumentStatementConditionArgs() {}

    private GetPolicyDocumentStatementConditionArgs(GetPolicyDocumentStatementConditionArgs $) {
        this.operator = $.operator;
        this.values = $.values;
        this.variable = $.variable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPolicyDocumentStatementConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPolicyDocumentStatementConditionArgs $;

        public Builder() {
            $ = new GetPolicyDocumentStatementConditionArgs();
        }

        public Builder(GetPolicyDocumentStatementConditionArgs defaults) {
            $ = new GetPolicyDocumentStatementConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public Builder variable(Output<String> variable) {
            $.variable = variable;
            return this;
        }

        public Builder variable(String variable) {
            return variable(Output.of(variable));
        }

        public GetPolicyDocumentStatementConditionArgs build() {
            if ($.operator == null) {
                throw new MissingRequiredPropertyException("GetPolicyDocumentStatementConditionArgs", "operator");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("GetPolicyDocumentStatementConditionArgs", "values");
            }
            if ($.variable == null) {
                throw new MissingRequiredPropertyException("GetPolicyDocumentStatementConditionArgs", "variable");
            }
            return $;
        }
    }

}