// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.alicloud.fc.outputs.GetServicesServiceNasConfigMountPoint;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServicesServiceNasConfig {
    /**
     * @return The group id of the NAS file system.
     * 
     */
    private Integer groupId;
    /**
     * @return The mount points configuration, including following attributes:
     * 
     */
    private List<GetServicesServiceNasConfigMountPoint> mountPoints;
    /**
     * @return The user id of the NAS file system.
     * 
     */
    private Integer userId;

    private GetServicesServiceNasConfig() {}
    /**
     * @return The group id of the NAS file system.
     * 
     */
    public Integer groupId() {
        return this.groupId;
    }
    /**
     * @return The mount points configuration, including following attributes:
     * 
     */
    public List<GetServicesServiceNasConfigMountPoint> mountPoints() {
        return this.mountPoints;
    }
    /**
     * @return The user id of the NAS file system.
     * 
     */
    public Integer userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServicesServiceNasConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer groupId;
        private List<GetServicesServiceNasConfigMountPoint> mountPoints;
        private Integer userId;
        public Builder() {}
        public Builder(GetServicesServiceNasConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.mountPoints = defaults.mountPoints;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder groupId(Integer groupId) {
            if (groupId == null) {
              throw new MissingRequiredPropertyException("GetServicesServiceNasConfig", "groupId");
            }
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder mountPoints(List<GetServicesServiceNasConfigMountPoint> mountPoints) {
            if (mountPoints == null) {
              throw new MissingRequiredPropertyException("GetServicesServiceNasConfig", "mountPoints");
            }
            this.mountPoints = mountPoints;
            return this;
        }
        public Builder mountPoints(GetServicesServiceNasConfigMountPoint... mountPoints) {
            return mountPoints(List.of(mountPoints));
        }
        @CustomType.Setter
        public Builder userId(Integer userId) {
            if (userId == null) {
              throw new MissingRequiredPropertyException("GetServicesServiceNasConfig", "userId");
            }
            this.userId = userId;
            return this;
        }
        public GetServicesServiceNasConfig build() {
            final var _resultValue = new GetServicesServiceNasConfig();
            _resultValue.groupId = groupId;
            _resultValue.mountPoints = mountPoints;
            _resultValue.userId = userId;
            return _resultValue;
        }
    }
}