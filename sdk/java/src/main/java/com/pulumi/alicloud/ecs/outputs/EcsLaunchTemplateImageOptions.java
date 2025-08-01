// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EcsLaunchTemplateImageOptions {
    /**
     * @return Specifies whether the instance that uses the image supports logons of the ecs-user user. Default value: `false`. Valid values: `true`,`false`.
     * 
     */
    private @Nullable Boolean loginAsNonRoot;

    private EcsLaunchTemplateImageOptions() {}
    /**
     * @return Specifies whether the instance that uses the image supports logons of the ecs-user user. Default value: `false`. Valid values: `true`,`false`.
     * 
     */
    public Optional<Boolean> loginAsNonRoot() {
        return Optional.ofNullable(this.loginAsNonRoot);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EcsLaunchTemplateImageOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean loginAsNonRoot;
        public Builder() {}
        public Builder(EcsLaunchTemplateImageOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginAsNonRoot = defaults.loginAsNonRoot;
        }

        @CustomType.Setter
        public Builder loginAsNonRoot(@Nullable Boolean loginAsNonRoot) {

            this.loginAsNonRoot = loginAsNonRoot;
            return this;
        }
        public EcsLaunchTemplateImageOptions build() {
            final var _resultValue = new EcsLaunchTemplateImageOptions();
            _resultValue.loginAsNonRoot = loginAsNonRoot;
            return _resultValue;
        }
    }
}
