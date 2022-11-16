// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.tsdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstance {
    /**
     * @return Auto renew.
     * 
     */
    private final String autoRenew;
    /**
     * @return The cpu core number of instance.
     * 
     */
    private final String cpuNumber;
    /**
     * @return The disk type of instance. `cloud_ssd` refers to SSD disk, `cloud_efficiency` refers to efficiency disk,cloud_essd refers to ESSD PL1 disk.
     * 
     */
    private final String diskCategory;
    /**
     * @return The engine type of instance. Enumerative: `tsdb_tsdb` refers to TSDB, `tsdb_influxdb` refers to TSDB for InfluxDB️.
     * 
     */
    private final String engineType;
    /**
     * @return Instance expiration time.
     * 
     */
    private final Integer expiredTime;
    /**
     * @return The ID of the Instance.
     * 
     */
    private final String id;
    /**
     * @return The alias of the instance.
     * 
     */
    private final String instanceAlias;
    /**
     * @return The specification of the instance.
     * 
     */
    private final String instanceClass;
    /**
     * @return The ID of the instance.
     * 
     */
    private final String instanceId;
    /**
     * @return The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB.
     * 
     */
    private final String instanceStorage;
    /**
     * @return The memory size of instance.
     * 
     */
    private final String memorySize;
    /**
     * @return Instance network type.
     * 
     */
    private final String networkType;
    /**
     * @return The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
     * 
     */
    private final String paymentType;
    /**
     * @return Instance status, enumerative: ACTIVATION,DELETED, CREATING,CLASS_CHANGING,LOCKED.
     * 
     */
    private final String status;
    /**
     * @return The vpc connection address of instance.
     * 
     */
    private final String vpcConnectionAddress;
    /**
     * @return The ID of the virtual private cloud (VPC) that is connected to the instance.
     * 
     */
    private final String vpcId;
    /**
     * @return The vswitch id.
     * 
     */
    private final String vswitchId;
    /**
     * @return The zone ID of the instance.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetInstancesInstance(
        @CustomType.Parameter("autoRenew") String autoRenew,
        @CustomType.Parameter("cpuNumber") String cpuNumber,
        @CustomType.Parameter("diskCategory") String diskCategory,
        @CustomType.Parameter("engineType") String engineType,
        @CustomType.Parameter("expiredTime") Integer expiredTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceAlias") String instanceAlias,
        @CustomType.Parameter("instanceClass") String instanceClass,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("instanceStorage") String instanceStorage,
        @CustomType.Parameter("memorySize") String memorySize,
        @CustomType.Parameter("networkType") String networkType,
        @CustomType.Parameter("paymentType") String paymentType,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("vpcConnectionAddress") String vpcConnectionAddress,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchId") String vswitchId,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.autoRenew = autoRenew;
        this.cpuNumber = cpuNumber;
        this.diskCategory = diskCategory;
        this.engineType = engineType;
        this.expiredTime = expiredTime;
        this.id = id;
        this.instanceAlias = instanceAlias;
        this.instanceClass = instanceClass;
        this.instanceId = instanceId;
        this.instanceStorage = instanceStorage;
        this.memorySize = memorySize;
        this.networkType = networkType;
        this.paymentType = paymentType;
        this.status = status;
        this.vpcConnectionAddress = vpcConnectionAddress;
        this.vpcId = vpcId;
        this.vswitchId = vswitchId;
        this.zoneId = zoneId;
    }

    /**
     * @return Auto renew.
     * 
     */
    public String autoRenew() {
        return this.autoRenew;
    }
    /**
     * @return The cpu core number of instance.
     * 
     */
    public String cpuNumber() {
        return this.cpuNumber;
    }
    /**
     * @return The disk type of instance. `cloud_ssd` refers to SSD disk, `cloud_efficiency` refers to efficiency disk,cloud_essd refers to ESSD PL1 disk.
     * 
     */
    public String diskCategory() {
        return this.diskCategory;
    }
    /**
     * @return The engine type of instance. Enumerative: `tsdb_tsdb` refers to TSDB, `tsdb_influxdb` refers to TSDB for InfluxDB️.
     * 
     */
    public String engineType() {
        return this.engineType;
    }
    /**
     * @return Instance expiration time.
     * 
     */
    public Integer expiredTime() {
        return this.expiredTime;
    }
    /**
     * @return The ID of the Instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The alias of the instance.
     * 
     */
    public String instanceAlias() {
        return this.instanceAlias;
    }
    /**
     * @return The specification of the instance.
     * 
     */
    public String instanceClass() {
        return this.instanceClass;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The storage capacity of the instance. Unit: GB. For example, the value 50 indicates 50 GB.
     * 
     */
    public String instanceStorage() {
        return this.instanceStorage;
    }
    /**
     * @return The memory size of instance.
     * 
     */
    public String memorySize() {
        return this.memorySize;
    }
    /**
     * @return Instance network type.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The billing method. Valid values: `PayAsYouGo` and `Subscription`. The `PayAsYouGo` value indicates the pay-as-you-go method, and the `Subscription` value indicates the subscription method.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return Instance status, enumerative: ACTIVATION,DELETED, CREATING,CLASS_CHANGING,LOCKED.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The vpc connection address of instance.
     * 
     */
    public String vpcConnectionAddress() {
        return this.vpcConnectionAddress;
    }
    /**
     * @return The ID of the virtual private cloud (VPC) that is connected to the instance.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The vswitch id.
     * 
     */
    public String vswitchId() {
        return this.vswitchId;
    }
    /**
     * @return The zone ID of the instance.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoRenew;
        private String cpuNumber;
        private String diskCategory;
        private String engineType;
        private Integer expiredTime;
        private String id;
        private String instanceAlias;
        private String instanceClass;
        private String instanceId;
        private String instanceStorage;
        private String memorySize;
        private String networkType;
        private String paymentType;
        private String status;
        private String vpcConnectionAddress;
        private String vpcId;
        private String vswitchId;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoRenew = defaults.autoRenew;
    	      this.cpuNumber = defaults.cpuNumber;
    	      this.diskCategory = defaults.diskCategory;
    	      this.engineType = defaults.engineType;
    	      this.expiredTime = defaults.expiredTime;
    	      this.id = defaults.id;
    	      this.instanceAlias = defaults.instanceAlias;
    	      this.instanceClass = defaults.instanceClass;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceStorage = defaults.instanceStorage;
    	      this.memorySize = defaults.memorySize;
    	      this.networkType = defaults.networkType;
    	      this.paymentType = defaults.paymentType;
    	      this.status = defaults.status;
    	      this.vpcConnectionAddress = defaults.vpcConnectionAddress;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder autoRenew(String autoRenew) {
            this.autoRenew = Objects.requireNonNull(autoRenew);
            return this;
        }
        public Builder cpuNumber(String cpuNumber) {
            this.cpuNumber = Objects.requireNonNull(cpuNumber);
            return this;
        }
        public Builder diskCategory(String diskCategory) {
            this.diskCategory = Objects.requireNonNull(diskCategory);
            return this;
        }
        public Builder engineType(String engineType) {
            this.engineType = Objects.requireNonNull(engineType);
            return this;
        }
        public Builder expiredTime(Integer expiredTime) {
            this.expiredTime = Objects.requireNonNull(expiredTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceAlias(String instanceAlias) {
            this.instanceAlias = Objects.requireNonNull(instanceAlias);
            return this;
        }
        public Builder instanceClass(String instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceStorage(String instanceStorage) {
            this.instanceStorage = Objects.requireNonNull(instanceStorage);
            return this;
        }
        public Builder memorySize(String memorySize) {
            this.memorySize = Objects.requireNonNull(memorySize);
            return this;
        }
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        public Builder paymentType(String paymentType) {
            this.paymentType = Objects.requireNonNull(paymentType);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder vpcConnectionAddress(String vpcConnectionAddress) {
            this.vpcConnectionAddress = Objects.requireNonNull(vpcConnectionAddress);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vswitchId(String vswitchId) {
            this.vswitchId = Objects.requireNonNull(vswitchId);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetInstancesInstance build() {
            return new GetInstancesInstance(autoRenew, cpuNumber, diskCategory, engineType, expiredTime, id, instanceAlias, instanceClass, instanceId, instanceStorage, memorySize, networkType, paymentType, status, vpcConnectionAddress, vpcId, vswitchId, zoneId);
        }
    }
}