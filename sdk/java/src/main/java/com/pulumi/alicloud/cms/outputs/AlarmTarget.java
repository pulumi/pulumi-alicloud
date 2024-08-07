// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlarmTarget {
    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the resource.
     * &gt; **NOTE:** Currently, the Alibaba Cloud Resource Name (ARN) of the resource. To use, please [submit an application](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruletargets).
     * 
     */
    private @Nullable String arn;
    /**
     * @return The parameters of the alert callback. The parameters are in the JSON format.
     * 
     */
    private @Nullable String jsonParams;
    /**
     * @return The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
     * 
     */
    private @Nullable String level;
    /**
     * @return The ID of the resource for which alerts are triggered.
     * 
     */
    private @Nullable String targetId;

    private AlarmTarget() {}
    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the resource.
     * &gt; **NOTE:** Currently, the Alibaba Cloud Resource Name (ARN) of the resource. To use, please [submit an application](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruletargets).
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The parameters of the alert callback. The parameters are in the JSON format.
     * 
     */
    public Optional<String> jsonParams() {
        return Optional.ofNullable(this.jsonParams);
    }
    /**
     * @return The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
     * 
     */
    public Optional<String> level() {
        return Optional.ofNullable(this.level);
    }
    /**
     * @return The ID of the resource for which alerts are triggered.
     * 
     */
    public Optional<String> targetId() {
        return Optional.ofNullable(this.targetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlarmTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String jsonParams;
        private @Nullable String level;
        private @Nullable String targetId;
        public Builder() {}
        public Builder(AlarmTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.jsonParams = defaults.jsonParams;
    	      this.level = defaults.level;
    	      this.targetId = defaults.targetId;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {

            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder jsonParams(@Nullable String jsonParams) {

            this.jsonParams = jsonParams;
            return this;
        }
        @CustomType.Setter
        public Builder level(@Nullable String level) {

            this.level = level;
            return this;
        }
        @CustomType.Setter
        public Builder targetId(@Nullable String targetId) {

            this.targetId = targetId;
            return this;
        }
        public AlarmTarget build() {
            final var _resultValue = new AlarmTarget();
            _resultValue.arn = arn;
            _resultValue.jsonParams = jsonParams;
            _resultValue.level = level;
            _resultValue.targetId = targetId;
            return _resultValue;
        }
    }
}
