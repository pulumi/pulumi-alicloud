// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.inputs;

import com.pulumi.alicloud.ga.inputs.ForwardingRuleRuleConditionHostConfigArgs;
import com.pulumi.alicloud.ga.inputs.ForwardingRuleRuleConditionPathConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ForwardingRuleRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ForwardingRuleRuleConditionArgs Empty = new ForwardingRuleRuleConditionArgs();

    /**
     * The configuration of the domain name. See `host_config` below.
     * 
     */
    @Import(name="hostConfigs")
    private @Nullable Output<List<ForwardingRuleRuleConditionHostConfigArgs>> hostConfigs;

    /**
     * @return The configuration of the domain name. See `host_config` below.
     * 
     */
    public Optional<Output<List<ForwardingRuleRuleConditionHostConfigArgs>>> hostConfigs() {
        return Optional.ofNullable(this.hostConfigs);
    }

    /**
     * The configuration of the path. See `path_config` below.
     * 
     */
    @Import(name="pathConfig")
    private @Nullable Output<ForwardingRuleRuleConditionPathConfigArgs> pathConfig;

    /**
     * @return The configuration of the path. See `path_config` below.
     * 
     */
    public Optional<Output<ForwardingRuleRuleConditionPathConfigArgs>> pathConfig() {
        return Optional.ofNullable(this.pathConfig);
    }

    /**
     * The type of the forwarding conditions. Valid values: `Host`, `Path`.
     * 
     */
    @Import(name="ruleConditionType", required=true)
    private Output<String> ruleConditionType;

    /**
     * @return The type of the forwarding conditions. Valid values: `Host`, `Path`.
     * 
     */
    public Output<String> ruleConditionType() {
        return this.ruleConditionType;
    }

    private ForwardingRuleRuleConditionArgs() {}

    private ForwardingRuleRuleConditionArgs(ForwardingRuleRuleConditionArgs $) {
        this.hostConfigs = $.hostConfigs;
        this.pathConfig = $.pathConfig;
        this.ruleConditionType = $.ruleConditionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForwardingRuleRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForwardingRuleRuleConditionArgs $;

        public Builder() {
            $ = new ForwardingRuleRuleConditionArgs();
        }

        public Builder(ForwardingRuleRuleConditionArgs defaults) {
            $ = new ForwardingRuleRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostConfigs The configuration of the domain name. See `host_config` below.
         * 
         * @return builder
         * 
         */
        public Builder hostConfigs(@Nullable Output<List<ForwardingRuleRuleConditionHostConfigArgs>> hostConfigs) {
            $.hostConfigs = hostConfigs;
            return this;
        }

        /**
         * @param hostConfigs The configuration of the domain name. See `host_config` below.
         * 
         * @return builder
         * 
         */
        public Builder hostConfigs(List<ForwardingRuleRuleConditionHostConfigArgs> hostConfigs) {
            return hostConfigs(Output.of(hostConfigs));
        }

        /**
         * @param hostConfigs The configuration of the domain name. See `host_config` below.
         * 
         * @return builder
         * 
         */
        public Builder hostConfigs(ForwardingRuleRuleConditionHostConfigArgs... hostConfigs) {
            return hostConfigs(List.of(hostConfigs));
        }

        /**
         * @param pathConfig The configuration of the path. See `path_config` below.
         * 
         * @return builder
         * 
         */
        public Builder pathConfig(@Nullable Output<ForwardingRuleRuleConditionPathConfigArgs> pathConfig) {
            $.pathConfig = pathConfig;
            return this;
        }

        /**
         * @param pathConfig The configuration of the path. See `path_config` below.
         * 
         * @return builder
         * 
         */
        public Builder pathConfig(ForwardingRuleRuleConditionPathConfigArgs pathConfig) {
            return pathConfig(Output.of(pathConfig));
        }

        /**
         * @param ruleConditionType The type of the forwarding conditions. Valid values: `Host`, `Path`.
         * 
         * @return builder
         * 
         */
        public Builder ruleConditionType(Output<String> ruleConditionType) {
            $.ruleConditionType = ruleConditionType;
            return this;
        }

        /**
         * @param ruleConditionType The type of the forwarding conditions. Valid values: `Host`, `Path`.
         * 
         * @return builder
         * 
         */
        public Builder ruleConditionType(String ruleConditionType) {
            return ruleConditionType(Output.of(ruleConditionType));
        }

        public ForwardingRuleRuleConditionArgs build() {
            if ($.ruleConditionType == null) {
                throw new MissingRequiredPropertyException("ForwardingRuleRuleConditionArgs", "ruleConditionType");
            }
            return $;
        }
    }

}