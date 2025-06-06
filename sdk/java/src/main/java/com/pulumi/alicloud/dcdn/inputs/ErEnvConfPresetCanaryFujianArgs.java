// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ErEnvConfPresetCanaryFujianArgs extends com.pulumi.resources.ResourceArgs {

    public static final ErEnvConfPresetCanaryFujianArgs Empty = new ErEnvConfPresetCanaryFujianArgs();

    /**
     * Allowed DCDN domain names.
     * 
     */
    @Import(name="allowedHosts")
    private @Nullable Output<List<String>> allowedHosts;

    /**
     * @return Allowed DCDN domain names.
     * 
     */
    public Optional<Output<List<String>>> allowedHosts() {
        return Optional.ofNullable(this.allowedHosts);
    }

    /**
     * The version number of the code.
     * 
     */
    @Import(name="codeRev")
    private @Nullable Output<String> codeRev;

    /**
     * @return The version number of the code.
     * 
     */
    public Optional<Output<String>> codeRev() {
        return Optional.ofNullable(this.codeRev);
    }

    /**
     * The specification of the CPU time slice. Valid values: `5ms`, `50ms`, `100ms`.
     * 
     */
    @Import(name="specName")
    private @Nullable Output<String> specName;

    /**
     * @return The specification of the CPU time slice. Valid values: `5ms`, `50ms`, `100ms`.
     * 
     */
    public Optional<Output<String>> specName() {
        return Optional.ofNullable(this.specName);
    }

    private ErEnvConfPresetCanaryFujianArgs() {}

    private ErEnvConfPresetCanaryFujianArgs(ErEnvConfPresetCanaryFujianArgs $) {
        this.allowedHosts = $.allowedHosts;
        this.codeRev = $.codeRev;
        this.specName = $.specName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ErEnvConfPresetCanaryFujianArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErEnvConfPresetCanaryFujianArgs $;

        public Builder() {
            $ = new ErEnvConfPresetCanaryFujianArgs();
        }

        public Builder(ErEnvConfPresetCanaryFujianArgs defaults) {
            $ = new ErEnvConfPresetCanaryFujianArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedHosts Allowed DCDN domain names.
         * 
         * @return builder
         * 
         */
        public Builder allowedHosts(@Nullable Output<List<String>> allowedHosts) {
            $.allowedHosts = allowedHosts;
            return this;
        }

        /**
         * @param allowedHosts Allowed DCDN domain names.
         * 
         * @return builder
         * 
         */
        public Builder allowedHosts(List<String> allowedHosts) {
            return allowedHosts(Output.of(allowedHosts));
        }

        /**
         * @param allowedHosts Allowed DCDN domain names.
         * 
         * @return builder
         * 
         */
        public Builder allowedHosts(String... allowedHosts) {
            return allowedHosts(List.of(allowedHosts));
        }

        /**
         * @param codeRev The version number of the code.
         * 
         * @return builder
         * 
         */
        public Builder codeRev(@Nullable Output<String> codeRev) {
            $.codeRev = codeRev;
            return this;
        }

        /**
         * @param codeRev The version number of the code.
         * 
         * @return builder
         * 
         */
        public Builder codeRev(String codeRev) {
            return codeRev(Output.of(codeRev));
        }

        /**
         * @param specName The specification of the CPU time slice. Valid values: `5ms`, `50ms`, `100ms`.
         * 
         * @return builder
         * 
         */
        public Builder specName(@Nullable Output<String> specName) {
            $.specName = specName;
            return this;
        }

        /**
         * @param specName The specification of the CPU time slice. Valid values: `5ms`, `50ms`, `100ms`.
         * 
         * @return builder
         * 
         */
        public Builder specName(String specName) {
            return specName(Output.of(specName));
        }

        public ErEnvConfPresetCanaryFujianArgs build() {
            return $;
        }
    }

}
