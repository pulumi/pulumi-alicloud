// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBlockedRegionsRegion {
    /**
     * @return The region to which the country belongs.
     * 
     */
    private String continent;
    /**
     * @return National region abbreviation.
     * 
     */
    private String countriesAndRegions;
    /**
     * @return The name of the country and region.
     * 
     */
    private String countriesAndRegionsName;

    private GetBlockedRegionsRegion() {}
    /**
     * @return The region to which the country belongs.
     * 
     */
    public String continent() {
        return this.continent;
    }
    /**
     * @return National region abbreviation.
     * 
     */
    public String countriesAndRegions() {
        return this.countriesAndRegions;
    }
    /**
     * @return The name of the country and region.
     * 
     */
    public String countriesAndRegionsName() {
        return this.countriesAndRegionsName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlockedRegionsRegion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String continent;
        private String countriesAndRegions;
        private String countriesAndRegionsName;
        public Builder() {}
        public Builder(GetBlockedRegionsRegion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continent = defaults.continent;
    	      this.countriesAndRegions = defaults.countriesAndRegions;
    	      this.countriesAndRegionsName = defaults.countriesAndRegionsName;
        }

        @CustomType.Setter
        public Builder continent(String continent) {
            if (continent == null) {
              throw new MissingRequiredPropertyException("GetBlockedRegionsRegion", "continent");
            }
            this.continent = continent;
            return this;
        }
        @CustomType.Setter
        public Builder countriesAndRegions(String countriesAndRegions) {
            if (countriesAndRegions == null) {
              throw new MissingRequiredPropertyException("GetBlockedRegionsRegion", "countriesAndRegions");
            }
            this.countriesAndRegions = countriesAndRegions;
            return this;
        }
        @CustomType.Setter
        public Builder countriesAndRegionsName(String countriesAndRegionsName) {
            if (countriesAndRegionsName == null) {
              throw new MissingRequiredPropertyException("GetBlockedRegionsRegion", "countriesAndRegionsName");
            }
            this.countriesAndRegionsName = countriesAndRegionsName;
            return this;
        }
        public GetBlockedRegionsRegion build() {
            final var _resultValue = new GetBlockedRegionsRegion();
            _resultValue.continent = continent;
            _resultValue.countriesAndRegions = countriesAndRegions;
            _resultValue.countriesAndRegionsName = countriesAndRegionsName;
            return _resultValue;
        }
    }
}
