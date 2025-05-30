// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesNodePoolsNodepoolTaint {
    /**
     * @return The scheduling policy.
     * 
     */
    private String effect;
    /**
     * @return The key of a taint.
     * 
     */
    private String key;
    /**
     * @return The value of a taint.
     * 
     */
    private String value;

    private GetKubernetesNodePoolsNodepoolTaint() {}
    /**
     * @return The scheduling policy.
     * 
     */
    public String effect() {
        return this.effect;
    }
    /**
     * @return The key of a taint.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The value of a taint.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesNodePoolsNodepoolTaint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String effect;
        private String key;
        private String value;
        public Builder() {}
        public Builder(GetKubernetesNodePoolsNodepoolTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder effect(String effect) {
            if (effect == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolTaint", "effect");
            }
            this.effect = effect;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolTaint", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetKubernetesNodePoolsNodepoolTaint", "value");
            }
            this.value = value;
            return this;
        }
        public GetKubernetesNodePoolsNodepoolTaint build() {
            final var _resultValue = new GetKubernetesNodePoolsNodepoolTaint();
            _resultValue.effect = effect;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
