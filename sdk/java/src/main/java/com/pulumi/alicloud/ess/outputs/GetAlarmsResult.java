// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.outputs;

import com.pulumi.alicloud.ess.outputs.GetAlarmsAlarm;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAlarmsResult {
    /**
     * @return A list of alarms. Each element contains the following attributes:
     * 
     */
    private List<GetAlarmsAlarm> alarms;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of alarm ids.
     * 
     */
    private List<String> ids;
    /**
     * @return The type for the alarm&#39;s associated metric.
     * 
     */
    private @Nullable String metricType;
    private @Nullable String nameRegex;
    /**
     * @return A list of alarm names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return The scaling group associated with this alarm.
     * 
     */
    private @Nullable String scalingGroupId;

    private GetAlarmsResult() {}
    /**
     * @return A list of alarms. Each element contains the following attributes:
     * 
     */
    public List<GetAlarmsAlarm> alarms() {
        return this.alarms;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of alarm ids.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return The type for the alarm&#39;s associated metric.
     * 
     */
    public Optional<String> metricType() {
        return Optional.ofNullable(this.metricType);
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of alarm names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The scaling group associated with this alarm.
     * 
     */
    public Optional<String> scalingGroupId() {
        return Optional.ofNullable(this.scalingGroupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlarmsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAlarmsAlarm> alarms;
        private String id;
        private List<String> ids;
        private @Nullable String metricType;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String scalingGroupId;
        public Builder() {}
        public Builder(GetAlarmsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarms = defaults.alarms;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.metricType = defaults.metricType;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.scalingGroupId = defaults.scalingGroupId;
        }

        @CustomType.Setter
        public Builder alarms(List<GetAlarmsAlarm> alarms) {
            if (alarms == null) {
              throw new MissingRequiredPropertyException("GetAlarmsResult", "alarms");
            }
            this.alarms = alarms;
            return this;
        }
        public Builder alarms(GetAlarmsAlarm... alarms) {
            return alarms(List.of(alarms));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAlarmsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetAlarmsResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder metricType(@Nullable String metricType) {

            this.metricType = metricType;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetAlarmsResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder scalingGroupId(@Nullable String scalingGroupId) {

            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public GetAlarmsResult build() {
            final var _resultValue = new GetAlarmsResult();
            _resultValue.alarms = alarms;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.metricType = metricType;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.scalingGroupId = scalingGroupId;
            return _resultValue;
        }
    }
}