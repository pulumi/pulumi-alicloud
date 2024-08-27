// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V3CustomDomainWafConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final V3CustomDomainWafConfigArgs Empty = new V3CustomDomainWafConfigArgs();

    /**
     * Enable WAF protection.
     * 
     */
    @Import(name="enableWaf")
    private @Nullable Output<Boolean> enableWaf;

    /**
     * @return Enable WAF protection.
     * 
     */
    public Optional<Output<Boolean>> enableWaf() {
        return Optional.ofNullable(this.enableWaf);
    }

    private V3CustomDomainWafConfigArgs() {}

    private V3CustomDomainWafConfigArgs(V3CustomDomainWafConfigArgs $) {
        this.enableWaf = $.enableWaf;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V3CustomDomainWafConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V3CustomDomainWafConfigArgs $;

        public Builder() {
            $ = new V3CustomDomainWafConfigArgs();
        }

        public Builder(V3CustomDomainWafConfigArgs defaults) {
            $ = new V3CustomDomainWafConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableWaf Enable WAF protection.
         * 
         * @return builder
         * 
         */
        public Builder enableWaf(@Nullable Output<Boolean> enableWaf) {
            $.enableWaf = enableWaf;
            return this;
        }

        /**
         * @param enableWaf Enable WAF protection.
         * 
         * @return builder
         * 
         */
        public Builder enableWaf(Boolean enableWaf) {
            return enableWaf(Output.of(enableWaf));
        }

        public V3CustomDomainWafConfigArgs build() {
            return $;
        }
    }

}