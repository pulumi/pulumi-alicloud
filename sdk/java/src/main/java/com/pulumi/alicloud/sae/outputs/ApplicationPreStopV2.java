// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sae.outputs;

import com.pulumi.alicloud.sae.outputs.ApplicationPreStopV2Exec;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationPreStopV2 {
    /**
     * @return Execute. See `exec` below.
     * 
     */
    private @Nullable ApplicationPreStopV2Exec exec;

    private ApplicationPreStopV2() {}
    /**
     * @return Execute. See `exec` below.
     * 
     */
    public Optional<ApplicationPreStopV2Exec> exec() {
        return Optional.ofNullable(this.exec);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationPreStopV2 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApplicationPreStopV2Exec exec;
        public Builder() {}
        public Builder(ApplicationPreStopV2 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
        }

        @CustomType.Setter
        public Builder exec(@Nullable ApplicationPreStopV2Exec exec) {
            this.exec = exec;
            return this;
        }
        public ApplicationPreStopV2 build() {
            final var o = new ApplicationPreStopV2();
            o.exec = exec;
            return o;
        }
    }
}