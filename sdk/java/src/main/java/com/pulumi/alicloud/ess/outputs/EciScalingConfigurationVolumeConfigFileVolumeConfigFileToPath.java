// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath {
    /**
     * @return The content of the configuration file. Maximum size: 32 KB.
     * 
     */
    private @Nullable String content;
    /**
     * @return The permissions on the ConfigFileVolume directory.
     * 
     */
    private @Nullable Integer mode;
    /**
     * @return The relative file path.
     * 
     */
    private @Nullable String path;

    private EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath() {}
    /**
     * @return The content of the configuration file. Maximum size: 32 KB.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return The permissions on the ConfigFileVolume directory.
     * 
     */
    public Optional<Integer> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return The relative file path.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String content;
        private @Nullable Integer mode;
        private @Nullable String path;
        public Builder() {}
        public Builder(EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder content(@Nullable String content) {

            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder mode(@Nullable Integer mode) {

            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        public EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath build() {
            final var _resultValue = new EciScalingConfigurationVolumeConfigFileVolumeConfigFileToPath();
            _resultValue.content = content;
            _resultValue.mode = mode;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}
