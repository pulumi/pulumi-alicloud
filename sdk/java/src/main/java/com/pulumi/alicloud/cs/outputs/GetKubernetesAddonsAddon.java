// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesAddonsAddon {
    /**
     * @return The current custom configuration of the addon. **Note:** Available in v1.166.0+
     * 
     */
    private String currentConfig;
    /**
     * @return The current version of addon, if this field is an empty string, it means that the addon is not installed.
     * 
     */
    private String currentVersion;
    /**
     * @return The name of addon.
     * 
     */
    private String name;
    /**
     * @return The next version of this addon can be upgraded to.
     * 
     */
    private String nextVersion;
    /**
     * @return Whether the addon is a system addon.
     * 
     */
    private Boolean required;

    private GetKubernetesAddonsAddon() {}
    /**
     * @return The current custom configuration of the addon. **Note:** Available in v1.166.0+
     * 
     */
    public String currentConfig() {
        return this.currentConfig;
    }
    /**
     * @return The current version of addon, if this field is an empty string, it means that the addon is not installed.
     * 
     */
    public String currentVersion() {
        return this.currentVersion;
    }
    /**
     * @return The name of addon.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The next version of this addon can be upgraded to.
     * 
     */
    public String nextVersion() {
        return this.nextVersion;
    }
    /**
     * @return Whether the addon is a system addon.
     * 
     */
    public Boolean required() {
        return this.required;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesAddonsAddon defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String currentConfig;
        private String currentVersion;
        private String name;
        private String nextVersion;
        private Boolean required;
        public Builder() {}
        public Builder(GetKubernetesAddonsAddon defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentConfig = defaults.currentConfig;
    	      this.currentVersion = defaults.currentVersion;
    	      this.name = defaults.name;
    	      this.nextVersion = defaults.nextVersion;
    	      this.required = defaults.required;
        }

        @CustomType.Setter
        public Builder currentConfig(String currentConfig) {
            if (currentConfig == null) {
              throw new MissingRequiredPropertyException("GetKubernetesAddonsAddon", "currentConfig");
            }
            this.currentConfig = currentConfig;
            return this;
        }
        @CustomType.Setter
        public Builder currentVersion(String currentVersion) {
            if (currentVersion == null) {
              throw new MissingRequiredPropertyException("GetKubernetesAddonsAddon", "currentVersion");
            }
            this.currentVersion = currentVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetKubernetesAddonsAddon", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder nextVersion(String nextVersion) {
            if (nextVersion == null) {
              throw new MissingRequiredPropertyException("GetKubernetesAddonsAddon", "nextVersion");
            }
            this.nextVersion = nextVersion;
            return this;
        }
        @CustomType.Setter
        public Builder required(Boolean required) {
            if (required == null) {
              throw new MissingRequiredPropertyException("GetKubernetesAddonsAddon", "required");
            }
            this.required = required;
            return this;
        }
        public GetKubernetesAddonsAddon build() {
            final var _resultValue = new GetKubernetesAddonsAddon();
            _resultValue.currentConfig = currentConfig;
            _resultValue.currentVersion = currentVersion;
            _resultValue.name = name;
            _resultValue.nextVersion = nextVersion;
            _resultValue.required = required;
            return _resultValue;
        }
    }
}