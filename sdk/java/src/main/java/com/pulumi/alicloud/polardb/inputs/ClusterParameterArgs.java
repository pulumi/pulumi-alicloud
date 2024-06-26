// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ClusterParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterParameterArgs Empty = new ClusterParameterArgs();

    /**
     * Kernel parameter name.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Kernel parameter name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Kernel parameter value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Kernel parameter value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private ClusterParameterArgs() {}

    private ClusterParameterArgs(ClusterParameterArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterParameterArgs $;

        public Builder() {
            $ = new ClusterParameterArgs();
        }

        public Builder(ClusterParameterArgs defaults) {
            $ = new ClusterParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Kernel parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Kernel parameter name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Kernel parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Kernel parameter value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ClusterParameterArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ClusterParameterArgs", "name");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("ClusterParameterArgs", "value");
            }
            return $;
        }
    }

}
