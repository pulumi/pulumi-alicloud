// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.outputs;

import com.pulumi.alicloud.gpdb.outputs.DbInstancePlanPlanConfigPause;
import com.pulumi.alicloud.gpdb.outputs.DbInstancePlanPlanConfigResume;
import com.pulumi.alicloud.gpdb.outputs.DbInstancePlanPlanConfigScaleIn;
import com.pulumi.alicloud.gpdb.outputs.DbInstancePlanPlanConfigScaleOut;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DbInstancePlanPlanConfig {
    /**
     * @return Pause instance plan config. See `pause` below.
     * 
     */
    private @Nullable DbInstancePlanPlanConfigPause pause;
    /**
     * @return Resume instance plan config. See `resume` below.
     * 
     */
    private @Nullable DbInstancePlanPlanConfigResume resume;
    /**
     * @return Scale In instance plan config. See `scale_in` below.
     * 
     */
    private @Nullable DbInstancePlanPlanConfigScaleIn scaleIn;
    /**
     * @return Scale out instance plan config. See `scale_out` below.
     * 
     */
    private @Nullable DbInstancePlanPlanConfigScaleOut scaleOut;

    private DbInstancePlanPlanConfig() {}
    /**
     * @return Pause instance plan config. See `pause` below.
     * 
     */
    public Optional<DbInstancePlanPlanConfigPause> pause() {
        return Optional.ofNullable(this.pause);
    }
    /**
     * @return Resume instance plan config. See `resume` below.
     * 
     */
    public Optional<DbInstancePlanPlanConfigResume> resume() {
        return Optional.ofNullable(this.resume);
    }
    /**
     * @return Scale In instance plan config. See `scale_in` below.
     * 
     */
    public Optional<DbInstancePlanPlanConfigScaleIn> scaleIn() {
        return Optional.ofNullable(this.scaleIn);
    }
    /**
     * @return Scale out instance plan config. See `scale_out` below.
     * 
     */
    public Optional<DbInstancePlanPlanConfigScaleOut> scaleOut() {
        return Optional.ofNullable(this.scaleOut);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DbInstancePlanPlanConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DbInstancePlanPlanConfigPause pause;
        private @Nullable DbInstancePlanPlanConfigResume resume;
        private @Nullable DbInstancePlanPlanConfigScaleIn scaleIn;
        private @Nullable DbInstancePlanPlanConfigScaleOut scaleOut;
        public Builder() {}
        public Builder(DbInstancePlanPlanConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pause = defaults.pause;
    	      this.resume = defaults.resume;
    	      this.scaleIn = defaults.scaleIn;
    	      this.scaleOut = defaults.scaleOut;
        }

        @CustomType.Setter
        public Builder pause(@Nullable DbInstancePlanPlanConfigPause pause) {

            this.pause = pause;
            return this;
        }
        @CustomType.Setter
        public Builder resume(@Nullable DbInstancePlanPlanConfigResume resume) {

            this.resume = resume;
            return this;
        }
        @CustomType.Setter
        public Builder scaleIn(@Nullable DbInstancePlanPlanConfigScaleIn scaleIn) {

            this.scaleIn = scaleIn;
            return this;
        }
        @CustomType.Setter
        public Builder scaleOut(@Nullable DbInstancePlanPlanConfigScaleOut scaleOut) {

            this.scaleOut = scaleOut;
            return this;
        }
        public DbInstancePlanPlanConfig build() {
            final var _resultValue = new DbInstancePlanPlanConfig();
            _resultValue.pause = pause;
            _resultValue.resume = resume;
            _resultValue.scaleIn = scaleIn;
            _resultValue.scaleOut = scaleOut;
            return _resultValue;
        }
    }
}