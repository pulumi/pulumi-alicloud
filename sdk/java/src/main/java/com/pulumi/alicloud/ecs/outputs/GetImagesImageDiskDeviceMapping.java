// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetImagesImageDiskDeviceMapping {
    /**
     * @return Device information of the created disk: such as /dev/xvdb.
     * 
     */
    private String device;
    /**
     * @return Size of the created disk.
     * 
     */
    private String size;
    /**
     * @return The ID of the snapshot used to create the custom image.
     * 
     */
    private String snapshotId;

    private GetImagesImageDiskDeviceMapping() {}
    /**
     * @return Device information of the created disk: such as /dev/xvdb.
     * 
     */
    public String device() {
        return this.device;
    }
    /**
     * @return Size of the created disk.
     * 
     */
    public String size() {
        return this.size;
    }
    /**
     * @return The ID of the snapshot used to create the custom image.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImagesImageDiskDeviceMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String device;
        private String size;
        private String snapshotId;
        public Builder() {}
        public Builder(GetImagesImageDiskDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.size = defaults.size;
    	      this.snapshotId = defaults.snapshotId;
        }

        @CustomType.Setter
        public Builder device(String device) {
            if (device == null) {
              throw new MissingRequiredPropertyException("GetImagesImageDiskDeviceMapping", "device");
            }
            this.device = device;
            return this;
        }
        @CustomType.Setter
        public Builder size(String size) {
            if (size == null) {
              throw new MissingRequiredPropertyException("GetImagesImageDiskDeviceMapping", "size");
            }
            this.size = size;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            if (snapshotId == null) {
              throw new MissingRequiredPropertyException("GetImagesImageDiskDeviceMapping", "snapshotId");
            }
            this.snapshotId = snapshotId;
            return this;
        }
        public GetImagesImageDiskDeviceMapping build() {
            final var _resultValue = new GetImagesImageDiskDeviceMapping();
            _resultValue.device = device;
            _resultValue.size = size;
            _resultValue.snapshotId = snapshotId;
            return _resultValue;
        }
    }
}
