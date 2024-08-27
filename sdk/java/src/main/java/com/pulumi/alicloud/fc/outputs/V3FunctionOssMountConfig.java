// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc.outputs;

import com.pulumi.alicloud.fc.outputs.V3FunctionOssMountConfigMountPoint;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class V3FunctionOssMountConfig {
    /**
     * @return OSS mount point list. See `mount_points` below.
     * 
     */
    private @Nullable List<V3FunctionOssMountConfigMountPoint> mountPoints;

    private V3FunctionOssMountConfig() {}
    /**
     * @return OSS mount point list. See `mount_points` below.
     * 
     */
    public List<V3FunctionOssMountConfigMountPoint> mountPoints() {
        return this.mountPoints == null ? List.of() : this.mountPoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V3FunctionOssMountConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<V3FunctionOssMountConfigMountPoint> mountPoints;
        public Builder() {}
        public Builder(V3FunctionOssMountConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPoints = defaults.mountPoints;
        }

        @CustomType.Setter
        public Builder mountPoints(@Nullable List<V3FunctionOssMountConfigMountPoint> mountPoints) {

            this.mountPoints = mountPoints;
            return this;
        }
        public Builder mountPoints(V3FunctionOssMountConfigMountPoint... mountPoints) {
            return mountPoints(List.of(mountPoints));
        }
        public V3FunctionOssMountConfig build() {
            final var _resultValue = new V3FunctionOssMountConfig();
            _resultValue.mountPoints = mountPoints;
            return _resultValue;
        }
    }
}