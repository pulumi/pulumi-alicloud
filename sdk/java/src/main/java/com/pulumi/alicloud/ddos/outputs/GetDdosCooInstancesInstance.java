// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDdosCooInstancesInstance {
    /**
     * @return The instance&#39;s elastic defend bandwidth.
     * 
     */
    private Integer bandwidth;
    /**
     * @return The instance&#39;s base defend bandwidth.
     * 
     */
    private Integer baseBandwidth;
    /**
     * @return The creation time of the instance.
     * 
     */
    private Integer createTime;
    /**
     * @return The debt status of the instance.
     * 
     */
    private Integer debtStatus;
    /**
     * @return The instance&#39;s count of domain retransmission config.
     * 
     */
    private Integer domainCount;
    /**
     * @return The edition of the instance.
     * 
     */
    private Integer edition;
    /**
     * @return The enabled of the instance.
     * 
     */
    private Integer enabled;
    /**
     * @return The expiry time of the instance.
     * 
     */
    private Integer expireTime;
    /**
     * @return The instance&#39;s id.
     * 
     */
    private String id;
    /**
     * @return The ip mode of the instance.
     * 
     */
    private String ipMode;
    /**
     * @return The ip version of the instance.
     * 
     */
    private String ipVersion;
    /**
     * @return The instance&#39;s remark.
     * 
     */
    private String name;
    /**
     * @return The instance&#39;s count of port retransmission config.
     * 
     */
    private Integer portCount;
    /**
     * @return The remark of the instance.
     * 
     */
    private String remark;
    /**
     * @return The instance&#39;s business bandwidth.
     * 
     */
    private Integer serviceBandwidth;
    /**
     * @return The status of the instance.
     * 
     */
    private Integer status;

    private GetDdosCooInstancesInstance() {}
    /**
     * @return The instance&#39;s elastic defend bandwidth.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return The instance&#39;s base defend bandwidth.
     * 
     */
    public Integer baseBandwidth() {
        return this.baseBandwidth;
    }
    /**
     * @return The creation time of the instance.
     * 
     */
    public Integer createTime() {
        return this.createTime;
    }
    /**
     * @return The debt status of the instance.
     * 
     */
    public Integer debtStatus() {
        return this.debtStatus;
    }
    /**
     * @return The instance&#39;s count of domain retransmission config.
     * 
     */
    public Integer domainCount() {
        return this.domainCount;
    }
    /**
     * @return The edition of the instance.
     * 
     */
    public Integer edition() {
        return this.edition;
    }
    /**
     * @return The enabled of the instance.
     * 
     */
    public Integer enabled() {
        return this.enabled;
    }
    /**
     * @return The expiry time of the instance.
     * 
     */
    public Integer expireTime() {
        return this.expireTime;
    }
    /**
     * @return The instance&#39;s id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ip mode of the instance.
     * 
     */
    public String ipMode() {
        return this.ipMode;
    }
    /**
     * @return The ip version of the instance.
     * 
     */
    public String ipVersion() {
        return this.ipVersion;
    }
    /**
     * @return The instance&#39;s remark.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The instance&#39;s count of port retransmission config.
     * 
     */
    public Integer portCount() {
        return this.portCount;
    }
    /**
     * @return The remark of the instance.
     * 
     */
    public String remark() {
        return this.remark;
    }
    /**
     * @return The instance&#39;s business bandwidth.
     * 
     */
    public Integer serviceBandwidth() {
        return this.serviceBandwidth;
    }
    /**
     * @return The status of the instance.
     * 
     */
    public Integer status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDdosCooInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer bandwidth;
        private Integer baseBandwidth;
        private Integer createTime;
        private Integer debtStatus;
        private Integer domainCount;
        private Integer edition;
        private Integer enabled;
        private Integer expireTime;
        private String id;
        private String ipMode;
        private String ipVersion;
        private String name;
        private Integer portCount;
        private String remark;
        private Integer serviceBandwidth;
        private Integer status;
        public Builder() {}
        public Builder(GetDdosCooInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.baseBandwidth = defaults.baseBandwidth;
    	      this.createTime = defaults.createTime;
    	      this.debtStatus = defaults.debtStatus;
    	      this.domainCount = defaults.domainCount;
    	      this.edition = defaults.edition;
    	      this.enabled = defaults.enabled;
    	      this.expireTime = defaults.expireTime;
    	      this.id = defaults.id;
    	      this.ipMode = defaults.ipMode;
    	      this.ipVersion = defaults.ipVersion;
    	      this.name = defaults.name;
    	      this.portCount = defaults.portCount;
    	      this.remark = defaults.remark;
    	      this.serviceBandwidth = defaults.serviceBandwidth;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder baseBandwidth(Integer baseBandwidth) {
            if (baseBandwidth == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "baseBandwidth");
            }
            this.baseBandwidth = baseBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(Integer createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder debtStatus(Integer debtStatus) {
            if (debtStatus == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "debtStatus");
            }
            this.debtStatus = debtStatus;
            return this;
        }
        @CustomType.Setter
        public Builder domainCount(Integer domainCount) {
            if (domainCount == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "domainCount");
            }
            this.domainCount = domainCount;
            return this;
        }
        @CustomType.Setter
        public Builder edition(Integer edition) {
            if (edition == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "edition");
            }
            this.edition = edition;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(Integer enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(Integer expireTime) {
            if (expireTime == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "expireTime");
            }
            this.expireTime = expireTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipMode(String ipMode) {
            if (ipMode == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "ipMode");
            }
            this.ipMode = ipMode;
            return this;
        }
        @CustomType.Setter
        public Builder ipVersion(String ipVersion) {
            if (ipVersion == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "ipVersion");
            }
            this.ipVersion = ipVersion;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder portCount(Integer portCount) {
            if (portCount == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "portCount");
            }
            this.portCount = portCount;
            return this;
        }
        @CustomType.Setter
        public Builder remark(String remark) {
            if (remark == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "remark");
            }
            this.remark = remark;
            return this;
        }
        @CustomType.Setter
        public Builder serviceBandwidth(Integer serviceBandwidth) {
            if (serviceBandwidth == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "serviceBandwidth");
            }
            this.serviceBandwidth = serviceBandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder status(Integer status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDdosCooInstancesInstance", "status");
            }
            this.status = status;
            return this;
        }
        public GetDdosCooInstancesInstance build() {
            final var _resultValue = new GetDdosCooInstancesInstance();
            _resultValue.bandwidth = bandwidth;
            _resultValue.baseBandwidth = baseBandwidth;
            _resultValue.createTime = createTime;
            _resultValue.debtStatus = debtStatus;
            _resultValue.domainCount = domainCount;
            _resultValue.edition = edition;
            _resultValue.enabled = enabled;
            _resultValue.expireTime = expireTime;
            _resultValue.id = id;
            _resultValue.ipMode = ipMode;
            _resultValue.ipVersion = ipVersion;
            _resultValue.name = name;
            _resultValue.portCount = portCount;
            _resultValue.remark = remark;
            _resultValue.serviceBandwidth = serviceBandwidth;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
