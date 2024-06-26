// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StoreEncryptConfUserCmkInfo {
    private @Nullable String arn;
    private @Nullable String cmkKeyId;
    private @Nullable String regionId;

    private StoreEncryptConfUserCmkInfo() {}
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> cmkKeyId() {
        return Optional.ofNullable(this.cmkKeyId);
    }
    public Optional<String> regionId() {
        return Optional.ofNullable(this.regionId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StoreEncryptConfUserCmkInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String cmkKeyId;
        private @Nullable String regionId;
        public Builder() {}
        public Builder(StoreEncryptConfUserCmkInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cmkKeyId = defaults.cmkKeyId;
    	      this.regionId = defaults.regionId;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {

            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder cmkKeyId(@Nullable String cmkKeyId) {

            this.cmkKeyId = cmkKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder regionId(@Nullable String regionId) {

            this.regionId = regionId;
            return this;
        }
        public StoreEncryptConfUserCmkInfo build() {
            final var _resultValue = new StoreEncryptConfUserCmkInfo();
            _resultValue.arn = arn;
            _resultValue.cmkKeyId = cmkKeyId;
            _resultValue.regionId = regionId;
            return _resultValue;
        }
    }
}
