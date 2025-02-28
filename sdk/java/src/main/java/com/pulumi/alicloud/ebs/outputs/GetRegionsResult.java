// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs.outputs;

import com.pulumi.alicloud.ebs.outputs.GetRegionsRegion;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String outputFile;
    private @Nullable String regionId;
    private List<GetRegionsRegion> regions;

    private GetRegionsResult() {}
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
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String outputFile;
        private @Nullable String regionId;
        private List<GetRegionsRegion> regions;
        public Builder() {}
        public Builder(GetRegionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.outputFile = defaults.outputFile;
    	      this.regionId = defaults.regionId;
    	      this.regions = defaults.regions;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRegionsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder regionId(@Nullable String regionId) {

            this.regionId = regionId;
            return this;
        }
        @CustomType.Setter
        public Builder regions(List<GetRegionsRegion> regions) {
            if (regions == null) {
              throw new MissingRequiredPropertyException("GetRegionsResult", "regions");
            }
            this.regions = regions;
            return this;
        }
        public Builder regions(GetRegionsRegion... regions) {
            return regions(List.of(regions));
        }
        public GetRegionsResult build() {
            final var _resultValue = new GetRegionsResult();
            _resultValue.id = id;
            _resultValue.outputFile = outputFile;
            _resultValue.regionId = regionId;
            _resultValue.regions = regions;
            return _resultValue;
        }
    }
}
