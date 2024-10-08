// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrefixListsListEntry {
    /**
     * @return The CIDR address block of the prefix list.
     * 
     */
    private String cidr;
    /**
     * @return The description of the cidr entry.
     * 
     */
    private String description;

    private GetPrefixListsListEntry() {}
    /**
     * @return The CIDR address block of the prefix list.
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    /**
     * @return The description of the cidr entry.
     * 
     */
    public String description() {
        return this.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrefixListsListEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidr;
        private String description;
        public Builder() {}
        public Builder(GetPrefixListsListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
        }

        @CustomType.Setter
        public Builder cidr(String cidr) {
            if (cidr == null) {
              throw new MissingRequiredPropertyException("GetPrefixListsListEntry", "cidr");
            }
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetPrefixListsListEntry", "description");
            }
            this.description = description;
            return this;
        }
        public GetPrefixListsListEntry build() {
            final var _resultValue = new GetPrefixListsListEntry();
            _resultValue.cidr = cidr;
            _resultValue.description = description;
            return _resultValue;
        }
    }
}
