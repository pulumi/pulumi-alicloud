// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHybridMonitorSlsTasksTaskSlsProcessConfigGroupBy {
    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    private final String alias;
    /**
     * @return The name of the key that is used to filter logs imported from Log Service.
     * 
     */
    private final String slsKeyName;

    @CustomType.Constructor
    private GetHybridMonitorSlsTasksTaskSlsProcessConfigGroupBy(
        @CustomType.Parameter("alias") String alias,
        @CustomType.Parameter("slsKeyName") String slsKeyName) {
        this.alias = alias;
        this.slsKeyName = slsKeyName;
    }

    /**
     * @return The alias of the extended field that specifies the result of basic operations that are performed on aggregation results.
     * 
     */
    public String alias() {
        return this.alias;
    }
    /**
     * @return The name of the key that is used to filter logs imported from Log Service.
     * 
     */
    public String slsKeyName() {
        return this.slsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridMonitorSlsTasksTaskSlsProcessConfigGroupBy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alias;
        private String slsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridMonitorSlsTasksTaskSlsProcessConfigGroupBy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.slsKeyName = defaults.slsKeyName;
        }

        public Builder alias(String alias) {
            this.alias = Objects.requireNonNull(alias);
            return this;
        }
        public Builder slsKeyName(String slsKeyName) {
            this.slsKeyName = Objects.requireNonNull(slsKeyName);
            return this;
        }        public GetHybridMonitorSlsTasksTaskSlsProcessConfigGroupBy build() {
            return new GetHybridMonitorSlsTasksTaskSlsProcessConfigGroupBy(alias, slsKeyName);
        }
    }
}