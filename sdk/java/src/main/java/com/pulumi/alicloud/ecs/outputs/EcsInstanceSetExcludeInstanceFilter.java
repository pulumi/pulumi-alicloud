// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EcsInstanceSetExcludeInstanceFilter {
    /**
     * @return The type of the excluded. Valid values: `InstanceId`, `InstanceName`.
     * 
     */
    private String key;
    /**
     * @return The value of the excluded. The identification of the excluded instances. It is a list of instance Ids or names.
     * 
     */
    private List<String> values;

    private EcsInstanceSetExcludeInstanceFilter() {}
    /**
     * @return The type of the excluded. Valid values: `InstanceId`, `InstanceName`.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value of the excluded. The identification of the excluded instances. It is a list of instance Ids or names.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EcsInstanceSetExcludeInstanceFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private List<String> values;
        public Builder() {}
        public Builder(EcsInstanceSetExcludeInstanceFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("EcsInstanceSetExcludeInstanceFilter", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            if (values == null) {
              throw new MissingRequiredPropertyException("EcsInstanceSetExcludeInstanceFilter", "values");
            }
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public EcsInstanceSetExcludeInstanceFilter build() {
            final var _resultValue = new EcsInstanceSetExcludeInstanceFilter();
            _resultValue.key = key;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}