// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ZoneUserInfo {
    /**
     * @return The list of the region IDs.
     * 
     */
    private final @Nullable List<String> regionIds;
    /**
     * @return The user ID belonging to the region is used for cross-account synchronization scenarios.
     * 
     */
    private final @Nullable String userId;

    @CustomType.Constructor
    private ZoneUserInfo(
        @CustomType.Parameter("regionIds") @Nullable List<String> regionIds,
        @CustomType.Parameter("userId") @Nullable String userId) {
        this.regionIds = regionIds;
        this.userId = userId;
    }

    /**
     * @return The list of the region IDs.
     * 
     */
    public List<String> regionIds() {
        return this.regionIds == null ? List.of() : this.regionIds;
    }
    /**
     * @return The user ID belonging to the region is used for cross-account synchronization scenarios.
     * 
     */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneUserInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> regionIds;
        private @Nullable String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(ZoneUserInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionIds = defaults.regionIds;
    	      this.userId = defaults.userId;
        }

        public Builder regionIds(@Nullable List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public Builder regionIds(String... regionIds) {
            return regionIds(List.of(regionIds));
        }
        public Builder userId(@Nullable String userId) {
            this.userId = userId;
            return this;
        }        public ZoneUserInfo build() {
            return new ZoneUserInfo(regionIds, userId);
        }
    }
}