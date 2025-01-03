// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V3FunctionVersionArgs extends com.pulumi.resources.ResourceArgs {

    public static final V3FunctionVersionArgs Empty = new V3FunctionVersionArgs();

    /**
     * Description of the function version
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the function version
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Function Name
     * 
     */
    @Import(name="functionName", required=true)
    private Output<String> functionName;

    /**
     * @return Function Name
     * 
     */
    public Output<String> functionName() {
        return this.functionName;
    }

    private V3FunctionVersionArgs() {}

    private V3FunctionVersionArgs(V3FunctionVersionArgs $) {
        this.description = $.description;
        this.functionName = $.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V3FunctionVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V3FunctionVersionArgs $;

        public Builder() {
            $ = new V3FunctionVersionArgs();
        }

        public Builder(V3FunctionVersionArgs defaults) {
            $ = new V3FunctionVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the function version
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the function version
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param functionName Function Name
         * 
         * @return builder
         * 
         */
        public Builder functionName(Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName Function Name
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        public V3FunctionVersionArgs build() {
            if ($.functionName == null) {
                throw new MissingRequiredPropertyException("V3FunctionVersionArgs", "functionName");
            }
            return $;
        }
    }

}
