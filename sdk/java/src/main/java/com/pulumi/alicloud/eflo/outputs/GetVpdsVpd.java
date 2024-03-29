// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVpdsVpd {
    /**
     * @return CIDR network segment
     * 
     */
    private String cidr;
    /**
     * @return The creation time of the resource
     * 
     */
    private String createTime;
    /**
     * @return Modification time
     * 
     */
    private String gmtModified;
    /**
     * @return The id of the vpd.
     * 
     */
    private String id;
    /**
     * @return The Resource group id
     * 
     */
    private String resourceGroupId;
    /**
     * @return The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
     * 
     */
    private String status;
    /**
     * @return The id of the vpd.
     * 
     */
    private String vpdId;
    /**
     * @return The Name of the VPD.
     * 
     */
    private String vpdName;

    private GetVpdsVpd() {}
    /**
     * @return CIDR network segment
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    /**
     * @return The creation time of the resource
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Modification time
     * 
     */
    public String gmtModified() {
        return this.gmtModified;
    }
    /**
     * @return The id of the vpd.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Resource group id
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The id of the vpd.
     * 
     */
    public String vpdId() {
        return this.vpdId;
    }
    /**
     * @return The Name of the VPD.
     * 
     */
    public String vpdName() {
        return this.vpdName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpdsVpd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidr;
        private String createTime;
        private String gmtModified;
        private String id;
        private String resourceGroupId;
        private String status;
        private String vpdId;
        private String vpdName;
        public Builder() {}
        public Builder(GetVpdsVpd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.createTime = defaults.createTime;
    	      this.gmtModified = defaults.gmtModified;
    	      this.id = defaults.id;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.status = defaults.status;
    	      this.vpdId = defaults.vpdId;
    	      this.vpdName = defaults.vpdName;
        }

        @CustomType.Setter
        public Builder cidr(String cidr) {
            if (cidr == null) {
              throw new MissingRequiredPropertyException("GetVpdsVpd", "cidr");
            }
            this.cidr = cidr;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetVpdsVpd", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder gmtModified(String gmtModified) {
            if (gmtModified == null) {
              throw new MissingRequiredPropertyException("GetVpdsVpd", "gmtModified");
            }
            this.gmtModified = gmtModified;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetVpdsVpd", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetVpdsVpd", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetVpdsVpd", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder vpdId(String vpdId) {
            if (vpdId == null) {
              throw new MissingRequiredPropertyException("GetVpdsVpd", "vpdId");
            }
            this.vpdId = vpdId;
            return this;
        }
        @CustomType.Setter
        public Builder vpdName(String vpdName) {
            if (vpdName == null) {
              throw new MissingRequiredPropertyException("GetVpdsVpd", "vpdName");
            }
            this.vpdName = vpdName;
            return this;
        }
        public GetVpdsVpd build() {
            final var _resultValue = new GetVpdsVpd();
            _resultValue.cidr = cidr;
            _resultValue.createTime = createTime;
            _resultValue.gmtModified = gmtModified;
            _resultValue.id = id;
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.status = status;
            _resultValue.vpdId = vpdId;
            _resultValue.vpdName = vpdName;
            return _resultValue;
        }
    }
}
