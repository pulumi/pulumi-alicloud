// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRouteEntriesEntryConflict {
    /**
     * @return The destination CIDR block of the route entry to query.
     * 
     */
    private String cidrBlock;
    /**
     * @return ID of the CEN instance.
     * 
     */
    private String instanceId;
    /**
     * @return The type of the CEN child instance.
     * 
     */
    private String instanceType;
    /**
     * @return ID of the region where the conflicted route entry is located.
     * 
     */
    private String regionId;
    /**
     * @return Reasons of exceptions.
     * 
     */
    private String status;

    private GetRouteEntriesEntryConflict() {}
    /**
     * @return The destination CIDR block of the route entry to query.
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return ID of the CEN instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The type of the CEN child instance.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return ID of the region where the conflicted route entry is located.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return Reasons of exceptions.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteEntriesEntryConflict defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidrBlock;
        private String instanceId;
        private String instanceType;
        private String regionId;
        private String status;
        public Builder() {}
        public Builder(GetRouteEntriesEntryConflict defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceType = defaults.instanceType;
    	      this.regionId = defaults.regionId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder cidrBlock(String cidrBlock) {
            if (cidrBlock == null) {
              throw new MissingRequiredPropertyException("GetRouteEntriesEntryConflict", "cidrBlock");
            }
            this.cidrBlock = cidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetRouteEntriesEntryConflict", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(String instanceType) {
            if (instanceType == null) {
              throw new MissingRequiredPropertyException("GetRouteEntriesEntryConflict", "instanceType");
            }
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            if (regionId == null) {
              throw new MissingRequiredPropertyException("GetRouteEntriesEntryConflict", "regionId");
            }
            this.regionId = regionId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetRouteEntriesEntryConflict", "status");
            }
            this.status = status;
            return this;
        }
        public GetRouteEntriesEntryConflict build() {
            final var _resultValue = new GetRouteEntriesEntryConflict();
            _resultValue.cidrBlock = cidrBlock;
            _resultValue.instanceId = instanceId;
            _resultValue.instanceType = instanceType;
            _resultValue.regionId = regionId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}