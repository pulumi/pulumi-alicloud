// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HybridMonitorSlsTaskSlsProcessConfigGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final HybridMonitorSlsTaskSlsProcessConfigGroupByArgs Empty = new HybridMonitorSlsTaskSlsProcessConfigGroupByArgs();

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
     * The name of the key that is used to filter logs imported from Log Service.
     * 
     */
    @Import(name="slsKeyName")
    private @Nullable Output<String> slsKeyName;

    /**
     * @return The name of the key that is used to filter logs imported from Log Service.
     * 
     */
    public Optional<Output<String>> slsKeyName() {
        return Optional.ofNullable(this.slsKeyName);
    }

    private HybridMonitorSlsTaskSlsProcessConfigGroupByArgs() {}

    private HybridMonitorSlsTaskSlsProcessConfigGroupByArgs(HybridMonitorSlsTaskSlsProcessConfigGroupByArgs $) {
        this.alias = $.alias;
        this.slsKeyName = $.slsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HybridMonitorSlsTaskSlsProcessConfigGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridMonitorSlsTaskSlsProcessConfigGroupByArgs $;

        public Builder() {
            $ = new HybridMonitorSlsTaskSlsProcessConfigGroupByArgs();
        }

        public Builder(HybridMonitorSlsTaskSlsProcessConfigGroupByArgs defaults) {
            $ = new HybridMonitorSlsTaskSlsProcessConfigGroupByArgs(Objects.requireNonNull(defaults));
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
         * @param slsKeyName The name of the key that is used to filter logs imported from Log Service.
         * 
         * @return builder
         * 
         */
        public Builder slsKeyName(@Nullable Output<String> slsKeyName) {
            $.slsKeyName = slsKeyName;
            return this;
        }

        /**
         * @param slsKeyName The name of the key that is used to filter logs imported from Log Service.
         * 
         * @return builder
         * 
         */
        public Builder slsKeyName(String slsKeyName) {
            return slsKeyName(Output.of(slsKeyName));
        }

        public HybridMonitorSlsTaskSlsProcessConfigGroupByArgs build() {
            return $;
        }
    }

}