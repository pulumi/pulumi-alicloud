// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb.outputs;

import com.pulumi.alicloud.polardb.outputs.GetClustersClusterDbNode;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClustersCluster {
    /**
     * @return Billing method. Value options: `PostPaid` for Pay-As-You-Go and `PrePaid` for subscription.
     * 
     */
    private String chargeType;
    /**
     * @return PolarDB cluster connection string.
     * 
     */
    private String connectionString;
    /**
     * @return The create_time of the db_nodes.
     * 
     */
    private String createTime;
    /**
     * @return The db_node_class of the db_nodes.
     * 
     */
    private String dbNodeClass;
    /**
     * @return The DBNodeNumber of the PolarDB cluster.
     * 
     */
    private Integer dbNodeNumber;
    /**
     * @return The DBNodes of the PolarDB cluster.
     * 
     */
    private List<GetClustersClusterDbNode> dbNodes;
    /**
     * @return Database type. Options are `MySQL`, `Oracle` and `PostgreSQL`. If no value is specified, all types are returned.
     * 
     */
    private String dbType;
    /**
     * @return The DBVersion of the PolarDB cluster.
     * 
     */
    private String dbVersion;
    /**
     * @return The DeleteLock of the PolarDB cluster.
     * 
     */
    private Integer deleteLock;
    /**
     * @return The description of the PolarDB cluster.
     * 
     */
    private String description;
    /**
     * @return Database type. Options are `MySQL`, `Oracle` and `PostgreSQL`. If no value is specified, all types are returned.
     * 
     */
    private String engine;
    /**
     * @return Expiration time. Pay-As-You-Go clusters never expire.
     * 
     */
    private String expireTime;
    /**
     * @return The expired of the PolarDB cluster.
     * 
     */
    private String expired;
    /**
     * @return The ID of the PolarDB cluster.
     * 
     */
    private String id;
    /**
     * @return The LockMode of the PolarDB cluster.
     * 
     */
    private String lockMode;
    /**
     * @return The DBClusterNetworkType of the PolarDB cluster.
     * 
     */
    private String networkType;
    /**
     * @return PolarDB cluster connection port.
     * 
     */
    private String port;
    /**
     * @return The region_id of the db_nodes.
     * 
     */
    private String regionId;
    /**
     * @return status of the cluster.
     * 
     */
    private String status;
    /**
     * @return The StorageUsed of the PolarDB cluster.
     * 
     */
    private Integer storageUsed;
    /**
     * @return ID of the VPC the cluster belongs to.
     * 
     */
    private String vpcId;
    /**
     * @return The zone_id of the db_nodes.
     * 
     */
    private String zoneId;

    private GetClustersCluster() {}
    /**
     * @return Billing method. Value options: `PostPaid` for Pay-As-You-Go and `PrePaid` for subscription.
     * 
     */
    public String chargeType() {
        return this.chargeType;
    }
    /**
     * @return PolarDB cluster connection string.
     * 
     */
    public String connectionString() {
        return this.connectionString;
    }
    /**
     * @return The create_time of the db_nodes.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The db_node_class of the db_nodes.
     * 
     */
    public String dbNodeClass() {
        return this.dbNodeClass;
    }
    /**
     * @return The DBNodeNumber of the PolarDB cluster.
     * 
     */
    public Integer dbNodeNumber() {
        return this.dbNodeNumber;
    }
    /**
     * @return The DBNodes of the PolarDB cluster.
     * 
     */
    public List<GetClustersClusterDbNode> dbNodes() {
        return this.dbNodes;
    }
    /**
     * @return Database type. Options are `MySQL`, `Oracle` and `PostgreSQL`. If no value is specified, all types are returned.
     * 
     */
    public String dbType() {
        return this.dbType;
    }
    /**
     * @return The DBVersion of the PolarDB cluster.
     * 
     */
    public String dbVersion() {
        return this.dbVersion;
    }
    /**
     * @return The DeleteLock of the PolarDB cluster.
     * 
     */
    public Integer deleteLock() {
        return this.deleteLock;
    }
    /**
     * @return The description of the PolarDB cluster.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Database type. Options are `MySQL`, `Oracle` and `PostgreSQL`. If no value is specified, all types are returned.
     * 
     */
    public String engine() {
        return this.engine;
    }
    /**
     * @return Expiration time. Pay-As-You-Go clusters never expire.
     * 
     */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return The expired of the PolarDB cluster.
     * 
     */
    public String expired() {
        return this.expired;
    }
    /**
     * @return The ID of the PolarDB cluster.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The LockMode of the PolarDB cluster.
     * 
     */
    public String lockMode() {
        return this.lockMode;
    }
    /**
     * @return The DBClusterNetworkType of the PolarDB cluster.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return PolarDB cluster connection port.
     * 
     */
    public String port() {
        return this.port;
    }
    /**
     * @return The region_id of the db_nodes.
     * 
     */
    public String regionId() {
        return this.regionId;
    }
    /**
     * @return status of the cluster.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The StorageUsed of the PolarDB cluster.
     * 
     */
    public Integer storageUsed() {
        return this.storageUsed;
    }
    /**
     * @return ID of the VPC the cluster belongs to.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The zone_id of the db_nodes.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClustersCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String chargeType;
        private String connectionString;
        private String createTime;
        private String dbNodeClass;
        private Integer dbNodeNumber;
        private List<GetClustersClusterDbNode> dbNodes;
        private String dbType;
        private String dbVersion;
        private Integer deleteLock;
        private String description;
        private String engine;
        private String expireTime;
        private String expired;
        private String id;
        private String lockMode;
        private String networkType;
        private String port;
        private String regionId;
        private String status;
        private Integer storageUsed;
        private String vpcId;
        private String zoneId;
        public Builder() {}
        public Builder(GetClustersCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chargeType = defaults.chargeType;
    	      this.connectionString = defaults.connectionString;
    	      this.createTime = defaults.createTime;
    	      this.dbNodeClass = defaults.dbNodeClass;
    	      this.dbNodeNumber = defaults.dbNodeNumber;
    	      this.dbNodes = defaults.dbNodes;
    	      this.dbType = defaults.dbType;
    	      this.dbVersion = defaults.dbVersion;
    	      this.deleteLock = defaults.deleteLock;
    	      this.description = defaults.description;
    	      this.engine = defaults.engine;
    	      this.expireTime = defaults.expireTime;
    	      this.expired = defaults.expired;
    	      this.id = defaults.id;
    	      this.lockMode = defaults.lockMode;
    	      this.networkType = defaults.networkType;
    	      this.port = defaults.port;
    	      this.regionId = defaults.regionId;
    	      this.status = defaults.status;
    	      this.storageUsed = defaults.storageUsed;
    	      this.vpcId = defaults.vpcId;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder chargeType(String chargeType) {
            if (chargeType == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "chargeType");
            }
            this.chargeType = chargeType;
            return this;
        }
        @CustomType.Setter
        public Builder connectionString(String connectionString) {
            if (connectionString == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "connectionString");
            }
            this.connectionString = connectionString;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeClass(String dbNodeClass) {
            if (dbNodeClass == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "dbNodeClass");
            }
            this.dbNodeClass = dbNodeClass;
            return this;
        }
        @CustomType.Setter
        public Builder dbNodeNumber(Integer dbNodeNumber) {
            if (dbNodeNumber == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "dbNodeNumber");
            }
            this.dbNodeNumber = dbNodeNumber;
            return this;
        }
        @CustomType.Setter
        public Builder dbNodes(List<GetClustersClusterDbNode> dbNodes) {
            if (dbNodes == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "dbNodes");
            }
            this.dbNodes = dbNodes;
            return this;
        }
        public Builder dbNodes(GetClustersClusterDbNode... dbNodes) {
            return dbNodes(List.of(dbNodes));
        }
        @CustomType.Setter
        public Builder dbType(String dbType) {
            if (dbType == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "dbType");
            }
            this.dbType = dbType;
            return this;
        }
        @CustomType.Setter
        public Builder dbVersion(String dbVersion) {
            if (dbVersion == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "dbVersion");
            }
            this.dbVersion = dbVersion;
            return this;
        }
        @CustomType.Setter
        public Builder deleteLock(Integer deleteLock) {
            if (deleteLock == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "deleteLock");
            }
            this.deleteLock = deleteLock;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder engine(String engine) {
            if (engine == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "engine");
            }
            this.engine = engine;
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            if (expireTime == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "expireTime");
            }
            this.expireTime = expireTime;
            return this;
        }
        @CustomType.Setter
        public Builder expired(String expired) {
            if (expired == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "expired");
            }
            this.expired = expired;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lockMode(String lockMode) {
            if (lockMode == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "lockMode");
            }
            this.lockMode = lockMode;
            return this;
        }
        @CustomType.Setter
        public Builder networkType(String networkType) {
            if (networkType == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "networkType");
            }
            this.networkType = networkType;
            return this;
        }
        @CustomType.Setter
        public Builder port(String port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder regionId(String regionId) {
            if (regionId == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "regionId");
            }
            this.regionId = regionId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder storageUsed(Integer storageUsed) {
            if (storageUsed == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "storageUsed");
            }
            this.storageUsed = storageUsed;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(String zoneId) {
            if (zoneId == null) {
              throw new MissingRequiredPropertyException("GetClustersCluster", "zoneId");
            }
            this.zoneId = zoneId;
            return this;
        }
        public GetClustersCluster build() {
            final var _resultValue = new GetClustersCluster();
            _resultValue.chargeType = chargeType;
            _resultValue.connectionString = connectionString;
            _resultValue.createTime = createTime;
            _resultValue.dbNodeClass = dbNodeClass;
            _resultValue.dbNodeNumber = dbNodeNumber;
            _resultValue.dbNodes = dbNodes;
            _resultValue.dbType = dbType;
            _resultValue.dbVersion = dbVersion;
            _resultValue.deleteLock = deleteLock;
            _resultValue.description = description;
            _resultValue.engine = engine;
            _resultValue.expireTime = expireTime;
            _resultValue.expired = expired;
            _resultValue.id = id;
            _resultValue.lockMode = lockMode;
            _resultValue.networkType = networkType;
            _resultValue.port = port;
            _resultValue.regionId = regionId;
            _resultValue.status = status;
            _resultValue.storageUsed = storageUsed;
            _resultValue.vpcId = vpcId;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}