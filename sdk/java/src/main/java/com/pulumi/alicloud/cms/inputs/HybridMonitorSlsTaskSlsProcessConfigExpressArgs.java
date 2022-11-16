// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HybridMonitorSlsTaskSlsProcessConfigExpressArgs extends com.pulumi.resources.ResourceArgs {

    public static final HybridMonitorSlsTaskSlsProcessConfigExpressArgs Empty = new HybridMonitorSlsTaskSlsProcessConfigExpressArgs();

    /**
     * The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * The extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    @Import(name="express")
    private @Nullable Output<String> express;

    /**
     * @return The extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    public Optional<Output<String>> express() {
        return Optional.ofNullable(this.express);
    }

    private HybridMonitorSlsTaskSlsProcessConfigExpressArgs() {}

    private HybridMonitorSlsTaskSlsProcessConfigExpressArgs(HybridMonitorSlsTaskSlsProcessConfigExpressArgs $) {
        this.alias = $.alias;
        this.express = $.express;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HybridMonitorSlsTaskSlsProcessConfigExpressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridMonitorSlsTaskSlsProcessConfigExpressArgs $;

        public Builder() {
            $ = new HybridMonitorSlsTaskSlsProcessConfigExpressArgs();
        }

        public Builder(HybridMonitorSlsTaskSlsProcessConfigExpressArgs defaults) {
            $ = new HybridMonitorSlsTaskSlsProcessConfigExpressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
        }

        /**
         * @param express The extended field that specifies the result of basic operations that are performed on aggregation results.
         * 
         * @return builder
         * 
         */
        public Builder express(@Nullable Output<String> express) {
            $.express = express;
            return this;
        }

        /**
         * @param express The extended field that specifies the result of basic operations that are performed on aggregation results.
         * 
         * @return builder
         * 
         */
        public Builder express(String express) {
            return express(Output.of(express));
        }

        public HybridMonitorSlsTaskSlsProcessConfigExpressArgs build() {
            return $;
        }
    }

}