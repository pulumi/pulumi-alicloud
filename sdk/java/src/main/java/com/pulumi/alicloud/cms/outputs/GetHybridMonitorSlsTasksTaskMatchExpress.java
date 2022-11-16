// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHybridMonitorSlsTasksTaskMatchExpress {
    /**
     * @return The function that is used to aggregate log data within a statistical period.
     * 
     */
    private final String function;
    /**
     * @return The name of the instance.
     * 
     */
    private final String name;
    /**
     * @return The value of the key that is used to filter logs imported from Log Service.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private GetHybridMonitorSlsTasksTaskMatchExpress(
        @CustomType.Parameter("function") String function,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.function = function;
        this.name = name;
        this.value = value;
    }

    /**
     * @return The function that is used to aggregate log data within a statistical period.
     * 
     */
    public String function() {
        return this.function;
    }
    /**
     * @return The name of the instance.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The value of the key that is used to filter logs imported from Log Service.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridMonitorSlsTasksTaskMatchExpress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String function;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridMonitorSlsTasksTaskMatchExpress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.function = defaults.function;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder function(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetHybridMonitorSlsTasksTaskMatchExpress build() {
            return new GetHybridMonitorSlsTasksTaskMatchExpress(function, name, value);
        }
    }
}