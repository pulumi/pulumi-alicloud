// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn.inputs;

import com.pulumi.alicloud.dcdn.inputs.ErEnvConfArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ErState extends com.pulumi.resources.ResourceArgs {

    public static final ErState Empty = new ErState();

    /**
     * Routine The description of the routine.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Routine The description of the routine.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The configurations of the specified environment. See `env_conf` below.
     * 
     */
    @Import(name="envConf")
    private @Nullable Output<ErEnvConfArgs> envConf;

    /**
     * @return The configurations of the specified environment. See `env_conf` below.
     * 
     */
    public Optional<Output<ErEnvConfArgs>> envConf() {
        return Optional.ofNullable(this.envConf);
    }

    /**
     * The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
     * 
     */
    @Import(name="erName")
    private @Nullable Output<String> erName;

    /**
     * @return The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
     * 
     */
    public Optional<Output<String>> erName() {
        return Optional.ofNullable(this.erName);
    }

    private ErState() {}

    private ErState(ErState $) {
        this.description = $.description;
        this.envConf = $.envConf;
        this.erName = $.erName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ErState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ErState $;

        public Builder() {
            $ = new ErState();
        }

        public Builder(ErState defaults) {
            $ = new ErState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Routine The description of the routine.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Routine The description of the routine.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param envConf The configurations of the specified environment. See `env_conf` below.
         * 
         * @return builder
         * 
         */
        public Builder envConf(@Nullable Output<ErEnvConfArgs> envConf) {
            $.envConf = envConf;
            return this;
        }

        /**
         * @param envConf The configurations of the specified environment. See `env_conf` below.
         * 
         * @return builder
         * 
         */
        public Builder envConf(ErEnvConfArgs envConf) {
            return envConf(Output.of(envConf));
        }

        /**
         * @param erName The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
         * 
         * @return builder
         * 
         */
        public Builder erName(@Nullable Output<String> erName) {
            $.erName = erName;
            return this;
        }

        /**
         * @param erName The name of the routine. The name must be unique among the routines that belong to the same Alibaba Cloud account.
         * 
         * @return builder
         * 
         */
        public Builder erName(String erName) {
            return erName(Output.of(erName));
        }

        public ErState build() {
            return $;
        }
    }

}
