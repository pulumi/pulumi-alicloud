// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudmonitor.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceGroupMonitoringAgentProcessMatchExpressArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceGroupMonitoringAgentProcessMatchExpressArgs Empty = new ServiceGroupMonitoringAgentProcessMatchExpressArgs();

    /**
     * The matching condition. Valid values: `all`, `startWith`, `endWith`, `contains`, `notContains`, `equals`.
     * 
     */
    @Import(name="function")
    private @Nullable Output<String> function;

    /**
     * @return The matching condition. Valid values: `all`, `startWith`, `endWith`, `contains`, `notContains`, `equals`.
     * 
     */
    public Optional<Output<String>> function() {
        return Optional.ofNullable(this.function);
    }

    /**
     * The criteria based on which the instances are matched.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The criteria based on which the instances are matched.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The keyword used to match the instance name.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The keyword used to match the instance name.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private ServiceGroupMonitoringAgentProcessMatchExpressArgs() {}

    private ServiceGroupMonitoringAgentProcessMatchExpressArgs(ServiceGroupMonitoringAgentProcessMatchExpressArgs $) {
        this.function = $.function;
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceGroupMonitoringAgentProcessMatchExpressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceGroupMonitoringAgentProcessMatchExpressArgs $;

        public Builder() {
            $ = new ServiceGroupMonitoringAgentProcessMatchExpressArgs();
        }

        public Builder(ServiceGroupMonitoringAgentProcessMatchExpressArgs defaults) {
            $ = new ServiceGroupMonitoringAgentProcessMatchExpressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param function The matching condition. Valid values: `all`, `startWith`, `endWith`, `contains`, `notContains`, `equals`.
         * 
         * @return builder
         * 
         */
        public Builder function(@Nullable Output<String> function) {
            $.function = function;
            return this;
        }

        /**
         * @param function The matching condition. Valid values: `all`, `startWith`, `endWith`, `contains`, `notContains`, `equals`.
         * 
         * @return builder
         * 
         */
        public Builder function(String function) {
            return function(Output.of(function));
        }

        /**
         * @param name The criteria based on which the instances are matched.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The criteria based on which the instances are matched.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value The keyword used to match the instance name.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The keyword used to match the instance name.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public ServiceGroupMonitoringAgentProcessMatchExpressArgs build() {
            return $;
        }
    }

}