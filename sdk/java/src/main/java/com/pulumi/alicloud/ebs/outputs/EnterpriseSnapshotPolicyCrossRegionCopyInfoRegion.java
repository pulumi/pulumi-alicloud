// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion {
    private @Nullable String regionId;
    private @Nullable Integer retainDays;

    private EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion() {}
    public Optional<String> regionId() {
        return Optional.ofNullable(this.regionId);
    }
    public Optional<Integer> retainDays() {
        return Optional.ofNullable(this.retainDays);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String regionId;
        private @Nullable Integer retainDays;
        public Builder() {}
        public Builder(EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionId = defaults.regionId;
    	      this.retainDays = defaults.retainDays;
        }

        @CustomType.Setter
        public Builder regionId(@Nullable String regionId) {

            this.regionId = regionId;
            return this;
        }
        @CustomType.Setter
        public Builder retainDays(@Nullable Integer retainDays) {

            this.retainDays = retainDays;
            return this;
        }
        public EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion build() {
            final var _resultValue = new EnterpriseSnapshotPolicyCrossRegionCopyInfoRegion();
            _resultValue.regionId = regionId;
            _resultValue.retainDays = retainDays;
            return _resultValue;
        }
    }
}