// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return Whether the required RAM authorization is configured.
     * 
     */
    private Boolean authed;
    private String id;
    /**
     * @return The ID of the instance.
     * 
     */
    private String instanceId;
    /**
     * @return The number of instances.
     * 
     */
    private String instanceNum;
    /**
     * @return Whether the authorized MaxCompute (ODPS) assets.
     * 
     */
    private Boolean odpsSet;
    /**
     * @return Whether the authorized oss assets.
     * 
     */
    private Boolean ossBucketSet;
    /**
     * @return The OSS size of the instance.
     * 
     */
    private String ossSize;
    /**
     * @return The payment type of the resource. Valid values: `Subscription`.
     * 
     */
    private String paymentType;
    /**
     * @return Whether the authorized rds assets.
     * 
     */
    private Boolean rdsSet;
    /**
     * @return The status of the resource.
     * 
     */
    private String status;

    private GetInstancesInstance() {}
    /**
     * @return Whether the required RAM authorization is configured.
     * 
     */
    public Boolean authed() {
        return this.authed;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The number of instances.
     * 
     */
    public String instanceNum() {
        return this.instanceNum;
    }
    /**
     * @return Whether the authorized MaxCompute (ODPS) assets.
     * 
     */
    public Boolean odpsSet() {
        return this.odpsSet;
    }
    /**
     * @return Whether the authorized oss assets.
     * 
     */
    public Boolean ossBucketSet() {
        return this.ossBucketSet;
    }
    /**
     * @return The OSS size of the instance.
     * 
     */
    public String ossSize() {
        return this.ossSize;
    }
    /**
     * @return The payment type of the resource. Valid values: `Subscription`.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return Whether the authorized rds assets.
     * 
     */
    public Boolean rdsSet() {
        return this.rdsSet;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean authed;
        private String id;
        private String instanceId;
        private String instanceNum;
        private Boolean odpsSet;
        private Boolean ossBucketSet;
        private String ossSize;
        private String paymentType;
        private Boolean rdsSet;
        private String status;
        public Builder() {}
        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authed = defaults.authed;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceNum = defaults.instanceNum;
    	      this.odpsSet = defaults.odpsSet;
    	      this.ossBucketSet = defaults.ossBucketSet;
    	      this.ossSize = defaults.ossSize;
    	      this.paymentType = defaults.paymentType;
    	      this.rdsSet = defaults.rdsSet;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder authed(Boolean authed) {
            if (authed == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "authed");
            }
            this.authed = authed;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder instanceNum(String instanceNum) {
            if (instanceNum == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "instanceNum");
            }
            this.instanceNum = instanceNum;
            return this;
        }
        @CustomType.Setter
        public Builder odpsSet(Boolean odpsSet) {
            if (odpsSet == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "odpsSet");
            }
            this.odpsSet = odpsSet;
            return this;
        }
        @CustomType.Setter
        public Builder ossBucketSet(Boolean ossBucketSet) {
            if (ossBucketSet == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "ossBucketSet");
            }
            this.ossBucketSet = ossBucketSet;
            return this;
        }
        @CustomType.Setter
        public Builder ossSize(String ossSize) {
            if (ossSize == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "ossSize");
            }
            this.ossSize = ossSize;
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            if (paymentType == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "paymentType");
            }
            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder rdsSet(Boolean rdsSet) {
            if (rdsSet == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "rdsSet");
            }
            this.rdsSet = rdsSet;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetInstancesInstance", "status");
            }
            this.status = status;
            return this;
        }
        public GetInstancesInstance build() {
            final var _resultValue = new GetInstancesInstance();
            _resultValue.authed = authed;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.instanceNum = instanceNum;
            _resultValue.odpsSet = odpsSet;
            _resultValue.ossBucketSet = ossBucketSet;
            _resultValue.ossSize = ossSize;
            _resultValue.paymentType = paymentType;
            _resultValue.rdsSet = rdsSet;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}