// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.inputs;

import com.pulumi.alicloud.sae.inputs.GreyTagRouteDubboRuleItemArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GreyTagRouteDubboRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GreyTagRouteDubboRuleArgs Empty = new GreyTagRouteDubboRuleArgs();

    /**
     * The Conditional Patterns for Grayscale Rules. Valid values: `AND`, `OR`.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    /**
     * @return The Conditional Patterns for Grayscale Rules. Valid values: `AND`, `OR`.
     * 
     */
    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The service group.
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return The service group.
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * A list of conditions items. See `items` below.
     * 
     */
    @Import(name="items")
    private @Nullable Output<List<GreyTagRouteDubboRuleItemArgs>> items;

    /**
     * @return A list of conditions items. See `items` below.
     * 
     */
    public Optional<Output<List<GreyTagRouteDubboRuleItemArgs>>> items() {
        return Optional.ofNullable(this.items);
    }

    /**
     * The method name
     * 
     */
    @Import(name="methodName")
    private @Nullable Output<String> methodName;

    /**
     * @return The method name
     * 
     */
    public Optional<Output<String>> methodName() {
        return Optional.ofNullable(this.methodName);
    }

    /**
     * The service name.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The service name.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * The service version.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The service version.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GreyTagRouteDubboRuleArgs() {}

    private GreyTagRouteDubboRuleArgs(GreyTagRouteDubboRuleArgs $) {
        this.condition = $.condition;
        this.group = $.group;
        this.items = $.items;
        this.methodName = $.methodName;
        this.serviceName = $.serviceName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GreyTagRouteDubboRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GreyTagRouteDubboRuleArgs $;

        public Builder() {
            $ = new GreyTagRouteDubboRuleArgs();
        }

        public Builder(GreyTagRouteDubboRuleArgs defaults) {
            $ = new GreyTagRouteDubboRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition The Conditional Patterns for Grayscale Rules. Valid values: `AND`, `OR`.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition The Conditional Patterns for Grayscale Rules. Valid values: `AND`, `OR`.
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param group The service group.
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The service group.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param items A list of conditions items. See `items` below.
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable Output<List<GreyTagRouteDubboRuleItemArgs>> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items A list of conditions items. See `items` below.
         * 
         * @return builder
         * 
         */
        public Builder items(List<GreyTagRouteDubboRuleItemArgs> items) {
            return items(Output.of(items));
        }

        /**
         * @param items A list of conditions items. See `items` below.
         * 
         * @return builder
         * 
         */
        public Builder items(GreyTagRouteDubboRuleItemArgs... items) {
            return items(List.of(items));
        }

        /**
         * @param methodName The method name
         * 
         * @return builder
         * 
         */
        public Builder methodName(@Nullable Output<String> methodName) {
            $.methodName = methodName;
            return this;
        }

        /**
         * @param methodName The method name
         * 
         * @return builder
         * 
         */
        public Builder methodName(String methodName) {
            return methodName(Output.of(methodName));
        }

        /**
         * @param serviceName The service name.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The service name.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param version The service version.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The service version.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GreyTagRouteDubboRuleArgs build() {
            return $;
        }
    }

}