// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.inputs;

import com.pulumi.alicloud.gpdb.inputs.DbInstancePlanPlanConfigPauseArgs;
import com.pulumi.alicloud.gpdb.inputs.DbInstancePlanPlanConfigResumeArgs;
import com.pulumi.alicloud.gpdb.inputs.DbInstancePlanPlanConfigScaleInArgs;
import com.pulumi.alicloud.gpdb.inputs.DbInstancePlanPlanConfigScaleOutArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DbInstancePlanPlanConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DbInstancePlanPlanConfigArgs Empty = new DbInstancePlanPlanConfigArgs();

    /**
     * Pause instance plan config. See `pause` below.
     * 
     */
    @Import(name="pause")
    private @Nullable Output<DbInstancePlanPlanConfigPauseArgs> pause;

    /**
     * @return Pause instance plan config. See `pause` below.
     * 
     */
    public Optional<Output<DbInstancePlanPlanConfigPauseArgs>> pause() {
        return Optional.ofNullable(this.pause);
    }

    /**
     * Resume instance plan config. See `resume` below.
     * 
     */
    @Import(name="resume")
    private @Nullable Output<DbInstancePlanPlanConfigResumeArgs> resume;

    /**
     * @return Resume instance plan config. See `resume` below.
     * 
     */
    public Optional<Output<DbInstancePlanPlanConfigResumeArgs>> resume() {
        return Optional.ofNullable(this.resume);
    }

    /**
     * Scale In instance plan config. See `scale_in` below.
     * 
     */
    @Import(name="scaleIn")
    private @Nullable Output<DbInstancePlanPlanConfigScaleInArgs> scaleIn;

    /**
     * @return Scale In instance plan config. See `scale_in` below.
     * 
     */
    public Optional<Output<DbInstancePlanPlanConfigScaleInArgs>> scaleIn() {
        return Optional.ofNullable(this.scaleIn);
    }

    /**
     * Scale out instance plan config. See `scale_out` below.
     * 
     */
    @Import(name="scaleOut")
    private @Nullable Output<DbInstancePlanPlanConfigScaleOutArgs> scaleOut;

    /**
     * @return Scale out instance plan config. See `scale_out` below.
     * 
     */
    public Optional<Output<DbInstancePlanPlanConfigScaleOutArgs>> scaleOut() {
        return Optional.ofNullable(this.scaleOut);
    }

    private DbInstancePlanPlanConfigArgs() {}

    private DbInstancePlanPlanConfigArgs(DbInstancePlanPlanConfigArgs $) {
        this.pause = $.pause;
        this.resume = $.resume;
        this.scaleIn = $.scaleIn;
        this.scaleOut = $.scaleOut;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DbInstancePlanPlanConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DbInstancePlanPlanConfigArgs $;

        public Builder() {
            $ = new DbInstancePlanPlanConfigArgs();
        }

        public Builder(DbInstancePlanPlanConfigArgs defaults) {
            $ = new DbInstancePlanPlanConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pause Pause instance plan config. See `pause` below.
         * 
         * @return builder
         * 
         */
        public Builder pause(@Nullable Output<DbInstancePlanPlanConfigPauseArgs> pause) {
            $.pause = pause;
            return this;
        }

        /**
         * @param pause Pause instance plan config. See `pause` below.
         * 
         * @return builder
         * 
         */
        public Builder pause(DbInstancePlanPlanConfigPauseArgs pause) {
            return pause(Output.of(pause));
        }

        /**
         * @param resume Resume instance plan config. See `resume` below.
         * 
         * @return builder
         * 
         */
        public Builder resume(@Nullable Output<DbInstancePlanPlanConfigResumeArgs> resume) {
            $.resume = resume;
            return this;
        }

        /**
         * @param resume Resume instance plan config. See `resume` below.
         * 
         * @return builder
         * 
         */
        public Builder resume(DbInstancePlanPlanConfigResumeArgs resume) {
            return resume(Output.of(resume));
        }

        /**
         * @param scaleIn Scale In instance plan config. See `scale_in` below.
         * 
         * @return builder
         * 
         */
        public Builder scaleIn(@Nullable Output<DbInstancePlanPlanConfigScaleInArgs> scaleIn) {
            $.scaleIn = scaleIn;
            return this;
        }

        /**
         * @param scaleIn Scale In instance plan config. See `scale_in` below.
         * 
         * @return builder
         * 
         */
        public Builder scaleIn(DbInstancePlanPlanConfigScaleInArgs scaleIn) {
            return scaleIn(Output.of(scaleIn));
        }

        /**
         * @param scaleOut Scale out instance plan config. See `scale_out` below.
         * 
         * @return builder
         * 
         */
        public Builder scaleOut(@Nullable Output<DbInstancePlanPlanConfigScaleOutArgs> scaleOut) {
            $.scaleOut = scaleOut;
            return this;
        }

        /**
         * @param scaleOut Scale out instance plan config. See `scale_out` below.
         * 
         * @return builder
         * 
         */
        public Builder scaleOut(DbInstancePlanPlanConfigScaleOutArgs scaleOut) {
            return scaleOut(Output.of(scaleOut));
        }

        public DbInstancePlanPlanConfigArgs build() {
            return $;
        }
    }

}