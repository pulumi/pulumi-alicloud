// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.clickhouse.outputs;

import com.pulumi.alicloud.clickhouse.outputs.GetRegionsRegion;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegionsResult {
    private final @Nullable Boolean current;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String outputFile;
    private final @Nullable String regionId;
    private final List<GetRegionsRegion> regions;

    @CustomType.Constructor
    private GetRegionsResult(
        @CustomType.Parameter("current") @Nullable Boolean current,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("regionId") @Nullable String regionId,
        @CustomType.Parameter("regions") List<GetRegionsRegion> regions) {
        this.current = current;
        this.id = id;
        this.outputFile = outputFile;
        this.regionId = regionId;
        this.regions = regions;
    }

    public Optional<Boolean> current() {
        return Optional.ofNullable(this.current);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> regionId() {
        return Optional.ofNullable(this.regionId);
    }
    public List<GetRegionsRegion> regions() {
        return this.regions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean current;
        private String id;
        private @Nullable String outputFile;
        private @Nullable String regionId;
        private List<GetRegionsRegion> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.id = defaults.id;
    	      this.outputFile = defaults.outputFile;
    	      this.regionId = defaults.regionId;
    	      this.regions = defaults.regions;
        }

        public Builder current(@Nullable Boolean current) {
            this.current = current;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder regionId(@Nullable String regionId) {
            this.regionId = regionId;
            return this;
        }
        public Builder regions(List<GetRegionsRegion> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }
        public Builder regions(GetRegionsRegion... regions) {
            return regions(List.of(regions));
        }        public GetRegionsResult build() {
            return new GetRegionsResult(current, id, outputFile, regionId, regions);
        }
    }
}