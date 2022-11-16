// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCommonBandwidthPackagesPackagePublicIpAddress {
    private final String allocationId;
    private final String bandwidthPackageIpRelationStatus;
    private final String ipAddress;

    @CustomType.Constructor
    private GetCommonBandwidthPackagesPackagePublicIpAddress(
        @CustomType.Parameter("allocationId") String allocationId,
        @CustomType.Parameter("bandwidthPackageIpRelationStatus") String bandwidthPackageIpRelationStatus,
        @CustomType.Parameter("ipAddress") String ipAddress) {
        this.allocationId = allocationId;
        this.bandwidthPackageIpRelationStatus = bandwidthPackageIpRelationStatus;
        this.ipAddress = ipAddress;
    }

    public String allocationId() {
        return this.allocationId;
    }
    public String bandwidthPackageIpRelationStatus() {
        return this.bandwidthPackageIpRelationStatus;
    }
    public String ipAddress() {
        return this.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCommonBandwidthPackagesPackagePublicIpAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationId;
        private String bandwidthPackageIpRelationStatus;
        private String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCommonBandwidthPackagesPackagePublicIpAddress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.bandwidthPackageIpRelationStatus = defaults.bandwidthPackageIpRelationStatus;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = Objects.requireNonNull(allocationId);
            return this;
        }
        public Builder bandwidthPackageIpRelationStatus(String bandwidthPackageIpRelationStatus) {
            this.bandwidthPackageIpRelationStatus = Objects.requireNonNull(bandwidthPackageIpRelationStatus);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }        public GetCommonBandwidthPackagesPackagePublicIpAddress build() {
            return new GetCommonBandwidthPackagesPackagePublicIpAddress(allocationId, bandwidthPackageIpRelationStatus, ipAddress);
        }
    }
}