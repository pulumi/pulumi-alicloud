// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NestServiceInstanceOperationMetadata {
    /**
     * @return The ID of the imported service instance.
     * 
     */
    private @Nullable String operatedServiceInstanceId;
    /**
     * @return The end time of O&amp;M.
     * 
     */
    private @Nullable String operationEndTime;
    /**
     * @return The start time of O&amp;M.
     * 
     */
    private @Nullable String operationStartTime;
    /**
     * @return The list of imported resources.
     * 
     */
    private @Nullable String resources;

    private NestServiceInstanceOperationMetadata() {}
    /**
     * @return The ID of the imported service instance.
     * 
     */
    public Optional<String> operatedServiceInstanceId() {
        return Optional.ofNullable(this.operatedServiceInstanceId);
    }
    /**
     * @return The end time of O&amp;M.
     * 
     */
    public Optional<String> operationEndTime() {
        return Optional.ofNullable(this.operationEndTime);
    }
    /**
     * @return The start time of O&amp;M.
     * 
     */
    public Optional<String> operationStartTime() {
        return Optional.ofNullable(this.operationStartTime);
    }
    /**
     * @return The list of imported resources.
     * 
     */
    public Optional<String> resources() {
        return Optional.ofNullable(this.resources);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NestServiceInstanceOperationMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String operatedServiceInstanceId;
        private @Nullable String operationEndTime;
        private @Nullable String operationStartTime;
        private @Nullable String resources;
        public Builder() {}
        public Builder(NestServiceInstanceOperationMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operatedServiceInstanceId = defaults.operatedServiceInstanceId;
    	      this.operationEndTime = defaults.operationEndTime;
    	      this.operationStartTime = defaults.operationStartTime;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder operatedServiceInstanceId(@Nullable String operatedServiceInstanceId) {

            this.operatedServiceInstanceId = operatedServiceInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder operationEndTime(@Nullable String operationEndTime) {

            this.operationEndTime = operationEndTime;
            return this;
        }
        @CustomType.Setter
        public Builder operationStartTime(@Nullable String operationStartTime) {

            this.operationStartTime = operationStartTime;
            return this;
        }
        @CustomType.Setter
        public Builder resources(@Nullable String resources) {

            this.resources = resources;
            return this;
        }
        public NestServiceInstanceOperationMetadata build() {
            final var _resultValue = new NestServiceInstanceOperationMetadata();
            _resultValue.operatedServiceInstanceId = operatedServiceInstanceId;
            _resultValue.operationEndTime = operationEndTime;
            _resultValue.operationStartTime = operationStartTime;
            _resultValue.resources = resources;
            return _resultValue;
        }
    }
}