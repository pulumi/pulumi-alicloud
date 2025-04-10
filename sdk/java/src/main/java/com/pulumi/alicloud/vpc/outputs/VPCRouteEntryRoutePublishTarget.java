// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VPCRouteEntryRoutePublishTarget {
    /**
     * @return Route Publish Status
     * 
     */
    private @Nullable String publishStatus;
    /**
     * @return Route publish target instance id.
     * 
     */
    private @Nullable String targetInstanceId;
    /**
     * @return Route publish target type
     * 
     */
    private String targetType;

    private VPCRouteEntryRoutePublishTarget() {}
    /**
     * @return Route Publish Status
     * 
     */
    public Optional<String> publishStatus() {
        return Optional.ofNullable(this.publishStatus);
    }
    /**
     * @return Route publish target instance id.
     * 
     */
    public Optional<String> targetInstanceId() {
        return Optional.ofNullable(this.targetInstanceId);
    }
    /**
     * @return Route publish target type
     * 
     */
    public String targetType() {
        return this.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VPCRouteEntryRoutePublishTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String publishStatus;
        private @Nullable String targetInstanceId;
        private String targetType;
        public Builder() {}
        public Builder(VPCRouteEntryRoutePublishTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishStatus = defaults.publishStatus;
    	      this.targetInstanceId = defaults.targetInstanceId;
    	      this.targetType = defaults.targetType;
        }

        @CustomType.Setter
        public Builder publishStatus(@Nullable String publishStatus) {

            this.publishStatus = publishStatus;
            return this;
        }
        @CustomType.Setter
        public Builder targetInstanceId(@Nullable String targetInstanceId) {

            this.targetInstanceId = targetInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder targetType(String targetType) {
            if (targetType == null) {
              throw new MissingRequiredPropertyException("VPCRouteEntryRoutePublishTarget", "targetType");
            }
            this.targetType = targetType;
            return this;
        }
        public VPCRouteEntryRoutePublishTarget build() {
            final var _resultValue = new VPCRouteEntryRoutePublishTarget();
            _resultValue.publishStatus = publishStatus;
            _resultValue.targetInstanceId = targetInstanceId;
            _resultValue.targetType = targetType;
            return _resultValue;
        }
    }
}
