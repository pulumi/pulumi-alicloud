// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceDataDisk {
    /**
     * @return Data disk type. Optional values:
     * - cloud_efficiency: Ultra cloud disk
     * - cloud_ssd: Full Flash cloud disk
     * - local_hdd: local hdd disk
     * - local_ssd: local disk ssd.
     * 
     */
    private @Nullable String category;
    /**
     * @return Data disk size, unit: GB.
     * 
     */
    private @Nullable Integer size;

    private InstanceDataDisk() {}
    /**
     * @return Data disk type. Optional values:
     * - cloud_efficiency: Ultra cloud disk
     * - cloud_ssd: Full Flash cloud disk
     * - local_hdd: local hdd disk
     * - local_ssd: local disk ssd.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }
    /**
     * @return Data disk size, unit: GB.
     * 
     */
    public Optional<Integer> size() {
        return Optional.ofNullable(this.size);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceDataDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String category;
        private @Nullable Integer size;
        public Builder() {}
        public Builder(InstanceDataDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.size = defaults.size;
        }

        @CustomType.Setter
        public Builder category(@Nullable String category) {

            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Integer size) {

            this.size = size;
            return this;
        }
        public InstanceDataDisk build() {
            final var _resultValue = new InstanceDataDisk();
            _resultValue.category = category;
            _resultValue.size = size;
            return _resultValue;
        }
    }
}