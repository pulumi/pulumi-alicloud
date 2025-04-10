// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sls.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertConfigurationSinkCmsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertConfigurationSinkCmsArgs Empty = new AlertConfigurationSinkCmsArgs();

    /**
     * Open.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Open.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private AlertConfigurationSinkCmsArgs() {}

    private AlertConfigurationSinkCmsArgs(AlertConfigurationSinkCmsArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertConfigurationSinkCmsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertConfigurationSinkCmsArgs $;

        public Builder() {
            $ = new AlertConfigurationSinkCmsArgs();
        }

        public Builder(AlertConfigurationSinkCmsArgs defaults) {
            $ = new AlertConfigurationSinkCmsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Open.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Open.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public AlertConfigurationSinkCmsArgs build() {
            return $;
        }
    }

}
