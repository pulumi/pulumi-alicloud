// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.graphdatabase.outputs;

import com.pulumi.alicloud.graphdatabase.outputs.GetDbInstancesInstanceDbInstanceIpArray;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDbInstancesInstance {
    /**
     * @return Virtual Private Cloud (vpc connection such as a VPN connection or leased line domain name).
     * 
     */
    private String connectionString;
    /**
     * @return Creation time, which follows the format of `YYYY-MM-DD &#39;T&#39;hh:mm:ssZ`, such as `2011-05-30 T12:11:4Z`.
     * 
     */
    private String createTime;
    /**
     * @return The current kernel image version.
     * 
     */
    private String currentMinorVersion;
    /**
     * @return The category of the db instance.
     * 
     */
    private String dbInstanceCategory;
    /**
     * @return For example, instances can be grouped according to Cpu core count.
     * 
     */
    private String dbInstanceCpu;
    /**
     * @return According to the practical example or notes.
     * 
     */
    private String dbInstanceDescription;
    /**
     * @return The ID of the instance.
     * 
     */
    private String dbInstanceId;
    /**
     * @return IP ADDRESS whitelist for the instance group list.
     * 
     */
    private List<GetDbInstancesInstanceDbInstanceIpArray> dbInstanceIpArrays;
    /**
     * @return Instance memory, which is measured in MB.
     * 
     */
    private String dbInstanceMemory;
    /**
     * @return The network type of the db instance.
     * 
     */
    private String dbInstanceNetworkType;
    /**
     * @return Disk storage type. Valid values: `cloud_essd`, `cloud_ssd`.
     * 
     */
    private String dbInstanceStorageType;
    /**
     * @return The type of the db instance.
     * 
     */
    private String dbInstanceType;
    /**
     * @return The class of the db node.
     * 
     */
    private String dbNodeClass;
    /**
     * @return The count of the db node.
     * 
     */
    private String dbNodeCount;
    /**
     * @return Instance storage space, which is measured in GB.
     * 
     */
    private String dbNodeStorage;
    /**
     * @return Kernel Version. Value range: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
     * 
     */
    private String dbVersion;
    /**
     * @return The instance after it expires time for subscription instance.
     * 
     */
    private String expireTime;
    /**
     * @return The expire status of the db instance.
     * 
     */
    private String expired;
    /**
     * @return The ID of the Db Instance.
     * 
     */
    private String id;
    /**
     * @return The latest kernel image version.
     * 
     */
    private String latestMinorVersion;
    /**
     * @return Instance lock state. Value range: `Unlock`, `ManualLock`, `LockByExpiration`, `LockByRestoration` and `LockByDiskQuota`. `Unlock`: normal. `ManualLock`: the manual trigger lock. `LockByExpiration`: that represents the instance expires automatically lock. `LockByRestoration`: indicates that the instance rollback before auto-lock. `LockByDiskQuota`: that represents the instance space full automatic lock.
     * 
     */
    private String lockMode;
    /**
     * @return An instance is locked the reason.
     * 
     */
    private String lockReason;
    /**
     * @return Instance maintenance time such as `00:00Z-02:00Z`, 0 to 2 points to carry out routine maintenance.
     * 
     */
    private String maintainTime;
    /**
     * @return The master instance ID of the db instance.
     * 
     */
    private String masterDbInstanceId;
    /**
     * @return The paymen type of the resource.
     * 
     */
    private String paymentType;
    /**
     * @return Application Port.
     * 
     */
    private Integer port;
    /**
     * @return The public connection string ID of the resource.
     * 
     */
    private String publicConnectionString;
    /**
     * @return The public port ID of the resource.
     * 
     */
    private Integer publicPort;
    /**
     * @return The array of the readonly db instances.
     * 
     */
    private List<String> readOnlyDbInstanceIds;
    /**
     * @return Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
     * 
     */
    private String status;
    /**
     * @return The vpc id of the db instance.
     * 
     */
    private String vpcId;
    /**
     * @return The vswitch id.
     * 
     */
    private String vswitchId;
    /**
     * @return The zone ID of the resource.
     * 
     */
    private String zoneId;

    private GetDbInstancesInstance() {}
    /**
     * @return Virtual Private Cloud (vpc connection such as a VPN connection or leased line domain name).
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return Creation time, which follows the format of `YYYY-MM-DD &#39;T&#39;hh:mm:ssZ`, such as `2011-05-30 T12:11:4Z`.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The current kernel image version.
     * 
     */
    public String currentMinorVersion() {
        return this.currentMinorVersion;
    }
    /**
     * @return The category of the db instance.
     * 
     */
    public String dbInstanceCategory() {
        return this.dbInstanceCategory;
    }
    /**
     * @return For example, instances can be grouped according to Cpu core count.
     * 
     */
    public String dbInstanceCpu() {
        return this.dbInstanceCpu;
    }
    /**
     * @return According to the practical example or notes.
     * 
     */
    public String dbInstanceDescription() {
        return this.dbInstanceDescription;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * @return IP ADDRESS whitelist for the instance group list.
     * 
     */
    public List<GetDbInstancesInstanceDbInstanceIpArray> dbInstanceIpArrays() {
        return this.dbInstanceIpArrays;
    }
    /**
     * @return Instance memory, which is measured in MB.
     * 
     */
    public String dbInstanceMemory() {
        return this.dbInstanceMemory;
    }
    /**
     * @return The network type of the db instance.
     * 
     */
    public String dbInstanceNetworkType() {
        return this.dbInstanceNetworkType;
    }
    /**
     * @return Disk storage type. Valid values: `cloud_essd`, `cloud_ssd`.
     * 
     */
    public String dbInstanceStorageType() {
        return this.dbInstanceStorageType;
    }
    /**
     * @return The type of the db instance.
     * 
     */
    public String dbInstanceType() {
        return this.dbInstanceType;
    }
    /**
     * @return The class of the db node.
     * 
     */
    public String dbNodeClass() {
        return this.dbNodeClass;
    }
    /**
     * @return The count of the db node.
     * 
     */
    public String dbNodeCount() {
        return this.dbNodeCount;
    }
    /**
     * @return Instance storage space, which is measured in GB.
     * 
     */
    public String dbNodeStorage() {
        return this.dbNodeStorage;
    }
    /**
     * @return Kernel Version. Value range: `1.0` or `1.0-OpenCypher`. `1.0`: represented as gremlin, `1.0-OpenCypher`: said opencypher.
     * 
     */
    public String dbVersion() {
        return this.dbVersion;
    }
    /**
     * @return The instance after it expires time for subscription instance.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return The expire status of the db instance.
     * 
     */
    public String expired() {
        return this.expired;
    }
    /**
     * @return The ID of the Db Instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The latest kernel image version.
     * 
     */
    public String latestMinorVersion() {
        return this.latestMinorVersion;
    }
    /**
     * @return Instance lock state. Value range: `Unlock`, `ManualLock`, `LockByExpiration`, `LockByRestoration` and `LockByDiskQuota`. `Unlock`: normal. `ManualLock`: the manual trigger lock. `LockByExpiration`: that represents the instance expires automatically lock. `LockByRestoration`: indicates that the instance rollback before auto-lock. `LockByDiskQuota`: that represents the instance space full automatic lock.
     * 
     */
    public String lockMode() {
        return this.lockMode;
    }
    /**
     * @return An instance is locked the reason.
     * 
     */
    public String lockReason() {
        return this.lockReason;
    }
    /**
     * @return Instance maintenance time such as `00:00Z-02:00Z`, 0 to 2 points to carry out routine maintenance.
     * 
     */
    public String maintainTime() {
        return this.maintainTime;
    }
    /**
     * @return The master instance ID of the db instance.
     * 
     */
    public String masterDbInstanceId() {
        return this.masterDbInstanceId;
    }
    /**
     * @return The paymen type of the resource.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return Application Port.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The public connection string ID of the resource.
     * 
     */
    public String publicConnectionString() {
        return this.publicConnectionString;
    }
    /**
     * @return The public port ID of the resource.
     * 
     */
    public Integer publicPort() {
        return this.publicPort;
    }
    /**
     * @return The array of the readonly db instances.
     * 
     */
    public List<String> readOnlyDbInstanceIds() {
        return this.readOnlyDbInstanceIds;
    }
    /**
     * @return Instance status. Value range: `Creating`, `Running`, `Deleting`, `Rebooting`, `DBInstanceClassChanging`, `NetAddressCreating` and `NetAddressDeleting`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The vpc id of the db instance.
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
     * @return The zone ID of the resource.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDbInstancesInstance defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectionString;
        private String createTime;
        private String currentMinorVersion;
        private String dbInstanceCategory;
        private String dbInstanceCpu;
        private String dbInstanceDescription;
        private String dbInstanceId;
        private List<GetDbInstancesInstanceDbInstanceIpArray> dbInstanceIpArrays;
        private String dbInstanceMemory;
        private String dbInstanceNetworkType;
        private String dbInstanceStorageType;
        private String dbInstanceType;
        private String dbNodeClass;
        private String dbNodeCount;
        private String dbNodeStorage;
        private String dbVersion;
        private String expireTime;
        private String expired;
        private String id;
        private String latestMinorVersion;
        private String lockMode;
        private String lockReason;
        private String maintainTime;
        private String masterDbInstanceId;
        private String paymentType;
        private Integer port;
        private String publicConnectionString;
        private Integer publicPort;
        private List<String> readOnlyDbInstanceIds;
        private String status;
        private String vpcId;
        private String vswitchId;
        private String zoneId;
        public Builder() {}
        public Builder(GetDbInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.createTime = defaults.createTime;
    	      this.currentMinorVersion = defaults.currentMinorVersion;
    	      this.dbInstanceCategory = defaults.dbInstanceCategory;
    	      this.dbInstanceCpu = defaults.dbInstanceCpu;
    	      this.dbInstanceDescription = defaults.dbInstanceDescription;
    	      this.dbInstanceId = defaults.dbInstanceId;
    	      this.dbInstanceIpArrays = defaults.dbInstanceIpArrays;
    	      this.dbInstanceMemory = defaults.dbInstanceMemory;
    	      this.dbInstanceNetworkType = defaults.dbInstanceNetworkType;
    	      this.dbInstanceStorageType = defaults.dbInstanceStorageType;
    	      this.dbInstanceType = defaults.dbInstanceType;
    	      this.dbNodeClass = defaults.dbNodeClass;
    	      this.dbNodeCount = defaults.dbNodeCount;
    	      this.dbNodeStorage = defaults.dbNodeStorage;
    	      this.dbVersion = defaults.dbVersion;
    	      this.expireTime = defaults.expireTime;
    	      this.expired = defaults.expired;
    	      this.id = defaults.id;
    	      this.latestMinorVersion = defaults.latestMinorVersion;
    	      this.lockMode = defaults.lockMode;
    	      this.lockReason = defaults.lockReason;
    	      this.maintainTime = defaults.maintainTime;
    	      this.masterDbInstanceId = defaults.masterDbInstanceId;
    	      this.paymentType = defaults.paymentType;
    	      this.port = defaults.port;
    	      this.publicConnectionString = defaults.publicConnectionString;
    	      this.publicPort = defaults.publicPort;
    	      this.readOnlyDbInstanceIds = defaults.readOnlyDbInstanceIds;
    	      this.status = defaults.status;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder connectionString(String connectionString) {
            if (connectionString == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "connectionString");
            }
            this.connectionString = connectionString;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder currentMinorVersion(String currentMinorVersion) {
            if (currentMinorVersion == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "currentMinorVersion");
            }
            this.currentMinorVersion = currentMinorVersion;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceCategory(String dbInstanceCategory) {
            if (dbInstanceCategory == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbInstanceCategory");
            }
            this.dbInstanceCategory = dbInstanceCategory;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceCpu(String dbInstanceCpu) {
            if (dbInstanceCpu == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbInstanceCpu");
            }
            this.dbInstanceCpu = dbInstanceCpu;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceDescription(String dbInstanceDescription) {
            if (dbInstanceDescription == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbInstanceDescription");
            }
            this.dbInstanceDescription = dbInstanceDescription;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceId(String dbInstanceId) {
            if (dbInstanceId == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbInstanceId");
            }
            this.dbInstanceId = dbInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceIpArrays(List<GetDbInstancesInstanceDbInstanceIpArray> dbInstanceIpArrays) {
            if (dbInstanceIpArrays == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbInstanceIpArrays");
            }
            this.dbInstanceIpArrays = dbInstanceIpArrays;
            return this;
        }
        public Builder dbInstanceIpArrays(GetDbInstancesInstanceDbInstanceIpArray... dbInstanceIpArrays) {
            return dbInstanceIpArrays(List.of(dbInstanceIpArrays));
        }
        @CustomType.Setter
        public Builder dbInstanceMemory(String dbInstanceMemory) {
            if (dbInstanceMemory == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbInstanceMemory");
            }
            this.dbInstanceMemory = dbInstanceMemory;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceNetworkType(String dbInstanceNetworkType) {
            if (dbInstanceNetworkType == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbInstanceNetworkType");
            }
            this.dbInstanceNetworkType = dbInstanceNetworkType;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceStorageType(String dbInstanceStorageType) {
            if (dbInstanceStorageType == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbInstanceStorageType");
            }
            this.dbInstanceStorageType = dbInstanceStorageType;
            return this;
        }
        @CustomType.Setter
        public Builder dbInstanceType(String dbInstanceType) {
            if (dbInstanceType == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbInstanceType");
            }
            this.dbInstanceType = dbInstanceType;
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeClass(String dbNodeClass) {
            if (dbNodeClass == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbNodeClass");
            }
            this.dbNodeClass = dbNodeClass;
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeCount(String dbNodeCount) {
            if (dbNodeCount == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbNodeCount");
            }
            this.dbNodeCount = dbNodeCount;
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeStorage(String dbNodeStorage) {
            if (dbNodeStorage == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbNodeStorage");
            }
            this.dbNodeStorage = dbNodeStorage;
            return this;
        }
        @CustomType.Setter
        public Builder dbVersion(String dbVersion) {
            if (dbVersion == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "dbVersion");
            }
            this.dbVersion = dbVersion;
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            if (expireTime == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "expireTime");
            }
            this.expireTime = expireTime;
            return this;
        }
        @CustomType.Setter
        public Builder expired(String expired) {
            if (expired == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "expired");
            }
            this.expired = expired;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder latestMinorVersion(String latestMinorVersion) {
            if (latestMinorVersion == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "latestMinorVersion");
            }
            this.latestMinorVersion = latestMinorVersion;
            return this;
        }
        @CustomType.Setter
        public Builder lockMode(String lockMode) {
            if (lockMode == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "lockMode");
            }
            this.lockMode = lockMode;
            return this;
        }
        @CustomType.Setter
        public Builder lockReason(String lockReason) {
            if (lockReason == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "lockReason");
            }
            this.lockReason = lockReason;
            return this;
        }
        @CustomType.Setter
        public Builder maintainTime(String maintainTime) {
            if (maintainTime == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "maintainTime");
            }
            this.maintainTime = maintainTime;
            return this;
        }
        @CustomType.Setter
        public Builder masterDbInstanceId(String masterDbInstanceId) {
            if (masterDbInstanceId == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "masterDbInstanceId");
            }
            this.masterDbInstanceId = masterDbInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            if (paymentType == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "paymentType");
            }
            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder publicConnectionString(String publicConnectionString) {
            if (publicConnectionString == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "publicConnectionString");
            }
            this.publicConnectionString = publicConnectionString;
            return this;
        }
        @CustomType.Setter
        public Builder publicPort(Integer publicPort) {
            if (publicPort == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "publicPort");
            }
            this.publicPort = publicPort;
            return this;
        }
        @CustomType.Setter
        public Builder readOnlyDbInstanceIds(List<String> readOnlyDbInstanceIds) {
            if (readOnlyDbInstanceIds == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "readOnlyDbInstanceIds");
            }
            this.readOnlyDbInstanceIds = readOnlyDbInstanceIds;
            return this;
        }
        public Builder readOnlyDbInstanceIds(String... readOnlyDbInstanceIds) {
            return readOnlyDbInstanceIds(List.of(readOnlyDbInstanceIds));
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchId(String vswitchId) {
            if (vswitchId == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "vswitchId");
            }
            this.vswitchId = vswitchId;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetDbInstancesInstance", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetDbInstancesInstance build() {
            final var _resultValue = new GetDbInstancesInstance();
            _resultValue.connectionString = connectionString;
            _resultValue.createTime = createTime;
            _resultValue.currentMinorVersion = currentMinorVersion;
            _resultValue.dbInstanceCategory = dbInstanceCategory;
            _resultValue.dbInstanceCpu = dbInstanceCpu;
            _resultValue.dbInstanceDescription = dbInstanceDescription;
            _resultValue.dbInstanceId = dbInstanceId;
            _resultValue.dbInstanceIpArrays = dbInstanceIpArrays;
            _resultValue.dbInstanceMemory = dbInstanceMemory;
            _resultValue.dbInstanceNetworkType = dbInstanceNetworkType;
            _resultValue.dbInstanceStorageType = dbInstanceStorageType;
            _resultValue.dbInstanceType = dbInstanceType;
            _resultValue.dbNodeClass = dbNodeClass;
            _resultValue.dbNodeCount = dbNodeCount;
            _resultValue.dbNodeStorage = dbNodeStorage;
            _resultValue.dbVersion = dbVersion;
            _resultValue.expireTime = expireTime;
            _resultValue.expired = expired;
            _resultValue.id = id;
            _resultValue.latestMinorVersion = latestMinorVersion;
            _resultValue.lockMode = lockMode;
            _resultValue.lockReason = lockReason;
            _resultValue.maintainTime = maintainTime;
            _resultValue.masterDbInstanceId = masterDbInstanceId;
            _resultValue.paymentType = paymentType;
            _resultValue.port = port;
            _resultValue.publicConnectionString = publicConnectionString;
            _resultValue.publicPort = publicPort;
            _resultValue.readOnlyDbInstanceIds = readOnlyDbInstanceIds;
            _resultValue.status = status;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchId = vswitchId;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
