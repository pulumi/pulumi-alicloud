// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetModifyParameterLogsLog {
    /**
     * @return The time when the parameter was reconfigured. This value is a UNIX timestamp. Unit: milliseconds.
     * 
     */
    private String modifyTime;
    /**
     * @return The new value of the parameter.
     * 
     */
    private String newParameterValue;
    /**
     * @return The original value of the parameter.
     * 
     */
    private String oldParameterValue;
    /**
     * @return The name of the parameter.
     * 
     */
    private String parameterName;
    /**
     * @return The status of the new value specified for the parameter. Valid values:
     * * **Applied**: The new value has taken effect.
     * * **Syncing**: The new value is being applied and has not taken effect.
     * 
     */
    private String status;

    private GetModifyParameterLogsLog() {}
    /**
     * @return The time when the parameter was reconfigured. This value is a UNIX timestamp. Unit: milliseconds.
     * 
     */
    public String modifyTime() {
        return this.modifyTime;
    }
    /**
     * @return The new value of the parameter.
     * 
     */
    public String newParameterValue() {
        return this.newParameterValue;
    }
    /**
     * @return The original value of the parameter.
     * 
     */
    public String oldParameterValue() {
        return this.oldParameterValue;
    }
    /**
     * @return The name of the parameter.
     * 
     */
    public String parameterName() {
        return this.parameterName;
    }
    /**
     * @return The status of the new value specified for the parameter. Valid values:
     * * **Applied**: The new value has taken effect.
     * * **Syncing**: The new value is being applied and has not taken effect.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModifyParameterLogsLog defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String modifyTime;
        private String newParameterValue;
        private String oldParameterValue;
        private String parameterName;
        private String status;
        public Builder() {}
        public Builder(GetModifyParameterLogsLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modifyTime = defaults.modifyTime;
    	      this.newParameterValue = defaults.newParameterValue;
    	      this.oldParameterValue = defaults.oldParameterValue;
    	      this.parameterName = defaults.parameterName;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder modifyTime(String modifyTime) {
            if (modifyTime == null) {
              throw new MissingRequiredPropertyException("GetModifyParameterLogsLog", "modifyTime");
            }
            this.modifyTime = modifyTime;
            return this;
        }
        @CustomType.Setter
        public Builder newParameterValue(String newParameterValue) {
            if (newParameterValue == null) {
              throw new MissingRequiredPropertyException("GetModifyParameterLogsLog", "newParameterValue");
            }
            this.newParameterValue = newParameterValue;
            return this;
        }
        @CustomType.Setter
        public Builder oldParameterValue(String oldParameterValue) {
            if (oldParameterValue == null) {
              throw new MissingRequiredPropertyException("GetModifyParameterLogsLog", "oldParameterValue");
            }
            this.oldParameterValue = oldParameterValue;
            return this;
        }
        @CustomType.Setter
        public Builder parameterName(String parameterName) {
            if (parameterName == null) {
              throw new MissingRequiredPropertyException("GetModifyParameterLogsLog", "parameterName");
            }
            this.parameterName = parameterName;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetModifyParameterLogsLog", "status");
            }
            this.status = status;
            return this;
        }
        public GetModifyParameterLogsLog build() {
            final var _resultValue = new GetModifyParameterLogsLog();
            _resultValue.modifyTime = modifyTime;
            _resultValue.newParameterValue = newParameterValue;
            _resultValue.oldParameterValue = oldParameterValue;
            _resultValue.parameterName = parameterName;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
