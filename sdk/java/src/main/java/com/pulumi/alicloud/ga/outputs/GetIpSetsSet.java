// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIpSetsSet {
    /**
     * @return The ID of an acceleration region.
     * 
     */
    private String accelerateRegionId;
    /**
     * @return The bandwidth allocated to the acceleration region.
     * 
     */
    private Integer bandwidth;
    /**
     * @return The ID of the Ip Set.
     * 
     */
    private String id;
    /**
     * @return The list of accelerated IP addresses in the acceleration region.
     * 
     */
    private List<String> ipAddressLists;
    /**
     * @return Accelerated area ID.
     * 
     */
    private String ipSetId;
    /**
     * @return The IP protocol used by the GA instance.
     * 
     */
    private String ipVersion;
    /**
     * @return The status of the acceleration region. Valid values: `active`, `deleting`, `init`, `updating`.
     * 
     */
    private String status;

    private GetIpSetsSet() {}
    /**
     * @return The ID of an acceleration region.
     * 
     */
    public String accelerateRegionId() {
        return this.accelerateRegionId;
    }
    /**
     * @return The bandwidth allocated to the acceleration region.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return The ID of the Ip Set.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of accelerated IP addresses in the acceleration region.
     * 
     */
    public List<String> ipAddressLists() {
        return this.ipAddressLists;
    }
    /**
     * @return Accelerated area ID.
     * 
     */
    public String ipSetId() {
        return this.ipSetId;
    }
    /**
     * @return The IP protocol used by the GA instance.
     * 
     */
    public String ipVersion() {
        return this.ipVersion;
    }
    /**
     * @return The status of the acceleration region. Valid values: `active`, `deleting`, `init`, `updating`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpSetsSet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accelerateRegionId;
        private Integer bandwidth;
        private String id;
        private List<String> ipAddressLists;
        private String ipSetId;
        private String ipVersion;
        private String status;
        public Builder() {}
        public Builder(GetIpSetsSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerateRegionId = defaults.accelerateRegionId;
    	      this.bandwidth = defaults.bandwidth;
    	      this.id = defaults.id;
    	      this.ipAddressLists = defaults.ipAddressLists;
    	      this.ipSetId = defaults.ipSetId;
    	      this.ipVersion = defaults.ipVersion;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder accelerateRegionId(String accelerateRegionId) {
            if (accelerateRegionId == null) {
              throw new MissingRequiredPropertyException("GetIpSetsSet", "accelerateRegionId");
            }
            this.accelerateRegionId = accelerateRegionId;
            return this;
        }
        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetIpSetsSet", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpSetsSet", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipAddressLists(List<String> ipAddressLists) {
            if (ipAddressLists == null) {
              throw new MissingRequiredPropertyException("GetIpSetsSet", "ipAddressLists");
            }
            this.ipAddressLists = ipAddressLists;
            return this;
        }
        public Builder ipAddressLists(String... ipAddressLists) {
            return ipAddressLists(List.of(ipAddressLists));
        }
        @CustomType.Setter
        public Builder ipSetId(String ipSetId) {
            if (ipSetId == null) {
              throw new MissingRequiredPropertyException("GetIpSetsSet", "ipSetId");
            }
            this.ipSetId = ipSetId;
            return this;
        }
        @CustomType.Setter
        public Builder ipVersion(String ipVersion) {
            if (ipVersion == null) {
              throw new MissingRequiredPropertyException("GetIpSetsSet", "ipVersion");
            }
            this.ipVersion = ipVersion;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetIpSetsSet", "status");
            }
            this.status = status;
            return this;
        }
        public GetIpSetsSet build() {
            final var _resultValue = new GetIpSetsSet();
            _resultValue.accelerateRegionId = accelerateRegionId;
            _resultValue.bandwidth = bandwidth;
            _resultValue.id = id;
            _resultValue.ipAddressLists = ipAddressLists;
            _resultValue.ipSetId = ipSetId;
            _resultValue.ipVersion = ipVersion;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
