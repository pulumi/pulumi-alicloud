// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dts.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSynchronizationJobsJob {
    /**
     * @return Start time in Unix timestamp format.
     * 
     */
    private String checkpoint;
    private String createTime;
    /**
     * @return Whether to execute DTS supports schema migration, full data migration, or full-data initialization.
     * 
     */
    private Boolean dataInitialization;
    /**
     * @return Whether to perform incremental data migration for migration types or synchronization.
     * 
     */
    private Boolean dataSynchronization;
    /**
     * @return Migration object, in the format of JSON strings. For detailed definition instructions, please refer to [the description of migration, synchronization or subscription objects](https://help.aliyun.com/document_detail/209545.html).
     * 
     */
    private String dbList;
    /**
     * @return The name of migrate the database.
     * 
     */
    private String destinationEndpointDataBaseName;
    /**
     * @return The type of destination database. Valid values: `ADB20`, `ADB30`, `AS400`, `DATAHUB`, `DB2`, `GREENPLUM`, `KAFKA`, `MONGODB`, `MSSQL`, `MySQL`, `ORACLE`, `PolarDB`, `POLARDBX20`, `POLARDB_O`, `PostgreSQL`.
     * 
     */
    private String destinationEndpointEngineName;
    /**
     * @return The ID of destination instance.
     * 
     */
    private String destinationEndpointInstanceId;
    /**
     * @return The type of destination instance. Valid values: `ads`, `CEN`, `DATAHUB`, `DG`, `ECS`, `EXPRESS`, `GREENPLUM`, `MONGODB`, `OTHER`, `PolarDB`, `POLARDBX20`, `RDS`.
     * 
     */
    private String destinationEndpointInstanceType;
    /**
     * @return The ip of source endpoint.
     * 
     */
    private String destinationEndpointIp;
    /**
     * @return The SID of Oracle database.
     * 
     */
    private String destinationEndpointOracleSid;
    /**
     * @return The port of source endpoint.
     * 
     */
    private String destinationEndpointPort;
    /**
     * @return The region of destination instance.
     * 
     */
    private String destinationEndpointRegion;
    /**
     * @return The username of database account.
     * 
     */
    private String destinationEndpointUserName;
    private String dtsInstanceId;
    private String dtsJobId;
    /**
     * @return The name of synchronization job.
     * 
     */
    private String dtsJobName;
    private String expireTime;
    /**
     * @return The ID of synchronizing instance. It&#39;s the ID of resource `alicloud.dts.SynchronizationInstance`.
     * 
     */
    private String id;
    /**
     * @return The name of migrate the database.
     * 
     */
    private String sourceEndpointDatabaseName;
    /**
     * @return The type of source database. Valid values: `AS400`, `DB2`, `DMSPOLARDB`, `HBASE`, `MONGODB`, `MSSQL`, `MySQL`, `ORACLE`, `PolarDB`, `POLARDBX20`, `POLARDB_O`, `POSTGRESQL`, `TERADATA`.
     * 
     */
    private String sourceEndpointEngineName;
    /**
     * @return The ID of source instance.
     * 
     */
    private String sourceEndpointInstanceId;
    /**
     * @return The type of source instance. Valid values: `CEN`, `DG`, `DISTRIBUTED_DMSLOGICDB`, `ECS`, `EXPRESS`, `MONGODB`, `OTHER`, `PolarDB`, `POLARDBX20`, `RDS`.
     * 
     */
    private String sourceEndpointInstanceType;
    /**
     * @return The ip of source endpoint.
     * 
     */
    private String sourceEndpointIp;
    /**
     * @return The SID of Oracle database.
     * 
     */
    private String sourceEndpointOracleSid;
    /**
     * @return The Alibaba Cloud account ID to which the source instance belongs.
     * 
     */
    private String sourceEndpointOwnerId;
    /**
     * @return The port of source endpoint.
     * 
     */
    private String sourceEndpointPort;
    /**
     * @return The region of source instance.
     * 
     */
    private String sourceEndpointRegion;
    /**
     * @return The name of the role configured for the cloud account to which the source instance belongs.
     * 
     */
    private String sourceEndpointRole;
    /**
     * @return The username of database account.
     * 
     */
    private String sourceEndpointUserName;
    /**
     * @return The status of the resource. Valid values: `Synchronizing`, `Suspending`. You can stop the task by specifying `Suspending` and start the task by specifying `Synchronizing`.
     * 
     */
    private String status;
    /**
     * @return Whether to perform a database table structure to migrate or initialization values include:
     * 
     */
    private Boolean structureInitialization;
    /**
     * @return Synchronization direction. Valid values: `Forward`, `Reverse`. Only when the property `sync_architecture` of the `alicloud.dts.SynchronizationInstance` was `bidirectional` this parameter should be passed, otherwise this parameter should not be specified.
     * 
     */
    private String synchronizationDirection;

    private GetSynchronizationJobsJob() {}
    /**
     * @return Start time in Unix timestamp format.
     * 
     */
    public String checkpoint() {
        return this.checkpoint;
    }
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Whether to execute DTS supports schema migration, full data migration, or full-data initialization.
     * 
     */
    public Boolean dataInitialization() {
        return this.dataInitialization;
    }
    /**
     * @return Whether to perform incremental data migration for migration types or synchronization.
     * 
     */
    public Boolean dataSynchronization() {
        return this.dataSynchronization;
    }
    /**
     * @return Migration object, in the format of JSON strings. For detailed definition instructions, please refer to [the description of migration, synchronization or subscription objects](https://help.aliyun.com/document_detail/209545.html).
     * 
     */
    public String dbList() {
        return this.dbList;
    }
    /**
     * @return The name of migrate the database.
     * 
     */
    public String destinationEndpointDataBaseName() {
        return this.destinationEndpointDataBaseName;
    }
    /**
     * @return The type of destination database. Valid values: `ADB20`, `ADB30`, `AS400`, `DATAHUB`, `DB2`, `GREENPLUM`, `KAFKA`, `MONGODB`, `MSSQL`, `MySQL`, `ORACLE`, `PolarDB`, `POLARDBX20`, `POLARDB_O`, `PostgreSQL`.
     * 
     */
    public String destinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }
    /**
     * @return The ID of destination instance.
     * 
     */
    public String destinationEndpointInstanceId() {
        return this.destinationEndpointInstanceId;
    }
    /**
     * @return The type of destination instance. Valid values: `ads`, `CEN`, `DATAHUB`, `DG`, `ECS`, `EXPRESS`, `GREENPLUM`, `MONGODB`, `OTHER`, `PolarDB`, `POLARDBX20`, `RDS`.
     * 
     */
    public String destinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }
    /**
     * @return The ip of source endpoint.
     * 
     */
    public String destinationEndpointIp() {
        return this.destinationEndpointIp;
    }
    /**
     * @return The SID of Oracle database.
     * 
     */
    public String destinationEndpointOracleSid() {
        return this.destinationEndpointOracleSid;
    }
    /**
     * @return The port of source endpoint.
     * 
     */
    public String destinationEndpointPort() {
        return this.destinationEndpointPort;
    }
    /**
     * @return The region of destination instance.
     * 
     */
    public String destinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }
    /**
     * @return The username of database account.
     * 
     */
    public String destinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }
    public String dtsInstanceId() {
        return this.dtsInstanceId;
    }
    public String dtsJobId() {
        return this.dtsJobId;
    }
    /**
     * @return The name of synchronization job.
     * 
     */
    public String dtsJobName() {
        return this.dtsJobName;
    }
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * @return The ID of synchronizing instance. It&#39;s the ID of resource `alicloud.dts.SynchronizationInstance`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of migrate the database.
     * 
     */
    public String sourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }
    /**
     * @return The type of source database. Valid values: `AS400`, `DB2`, `DMSPOLARDB`, `HBASE`, `MONGODB`, `MSSQL`, `MySQL`, `ORACLE`, `PolarDB`, `POLARDBX20`, `POLARDB_O`, `POSTGRESQL`, `TERADATA`.
     * 
     */
    public String sourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }
    /**
     * @return The ID of source instance.
     * 
     */
    public String sourceEndpointInstanceId() {
        return this.sourceEndpointInstanceId;
    }
    /**
     * @return The type of source instance. Valid values: `CEN`, `DG`, `DISTRIBUTED_DMSLOGICDB`, `ECS`, `EXPRESS`, `MONGODB`, `OTHER`, `PolarDB`, `POLARDBX20`, `RDS`.
     * 
     */
    public String sourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }
    /**
     * @return The ip of source endpoint.
     * 
     */
    public String sourceEndpointIp() {
        return this.sourceEndpointIp;
    }
    /**
     * @return The SID of Oracle database.
     * 
     */
    public String sourceEndpointOracleSid() {
        return this.sourceEndpointOracleSid;
    }
    /**
     * @return The Alibaba Cloud account ID to which the source instance belongs.
     * 
     */
    public String sourceEndpointOwnerId() {
        return this.sourceEndpointOwnerId;
    }
    /**
     * @return The port of source endpoint.
     * 
     */
    public String sourceEndpointPort() {
        return this.sourceEndpointPort;
    }
    /**
     * @return The region of source instance.
     * 
     */
    public String sourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }
    /**
     * @return The name of the role configured for the cloud account to which the source instance belongs.
     * 
     */
    public String sourceEndpointRole() {
        return this.sourceEndpointRole;
    }
    /**
     * @return The username of database account.
     * 
     */
    public String sourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }
    /**
     * @return The status of the resource. Valid values: `Synchronizing`, `Suspending`. You can stop the task by specifying `Suspending` and start the task by specifying `Synchronizing`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Whether to perform a database table structure to migrate or initialization values include:
     * 
     */
    public Boolean structureInitialization() {
        return this.structureInitialization;
    }
    /**
     * @return Synchronization direction. Valid values: `Forward`, `Reverse`. Only when the property `sync_architecture` of the `alicloud.dts.SynchronizationInstance` was `bidirectional` this parameter should be passed, otherwise this parameter should not be specified.
     * 
     */
    public String synchronizationDirection() {
        return this.synchronizationDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSynchronizationJobsJob defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String checkpoint;
        private String createTime;
        private Boolean dataInitialization;
        private Boolean dataSynchronization;
        private String dbList;
        private String destinationEndpointDataBaseName;
        private String destinationEndpointEngineName;
        private String destinationEndpointInstanceId;
        private String destinationEndpointInstanceType;
        private String destinationEndpointIp;
        private String destinationEndpointOracleSid;
        private String destinationEndpointPort;
        private String destinationEndpointRegion;
        private String destinationEndpointUserName;
        private String dtsInstanceId;
        private String dtsJobId;
        private String dtsJobName;
        private String expireTime;
        private String id;
        private String sourceEndpointDatabaseName;
        private String sourceEndpointEngineName;
        private String sourceEndpointInstanceId;
        private String sourceEndpointInstanceType;
        private String sourceEndpointIp;
        private String sourceEndpointOracleSid;
        private String sourceEndpointOwnerId;
        private String sourceEndpointPort;
        private String sourceEndpointRegion;
        private String sourceEndpointRole;
        private String sourceEndpointUserName;
        private String status;
        private Boolean structureInitialization;
        private String synchronizationDirection;
        public Builder() {}
        public Builder(GetSynchronizationJobsJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpoint = defaults.checkpoint;
    	      this.createTime = defaults.createTime;
    	      this.dataInitialization = defaults.dataInitialization;
    	      this.dataSynchronization = defaults.dataSynchronization;
    	      this.dbList = defaults.dbList;
    	      this.destinationEndpointDataBaseName = defaults.destinationEndpointDataBaseName;
    	      this.destinationEndpointEngineName = defaults.destinationEndpointEngineName;
    	      this.destinationEndpointInstanceId = defaults.destinationEndpointInstanceId;
    	      this.destinationEndpointInstanceType = defaults.destinationEndpointInstanceType;
    	      this.destinationEndpointIp = defaults.destinationEndpointIp;
    	      this.destinationEndpointOracleSid = defaults.destinationEndpointOracleSid;
    	      this.destinationEndpointPort = defaults.destinationEndpointPort;
    	      this.destinationEndpointRegion = defaults.destinationEndpointRegion;
    	      this.destinationEndpointUserName = defaults.destinationEndpointUserName;
    	      this.dtsInstanceId = defaults.dtsInstanceId;
    	      this.dtsJobId = defaults.dtsJobId;
    	      this.dtsJobName = defaults.dtsJobName;
    	      this.expireTime = defaults.expireTime;
    	      this.id = defaults.id;
    	      this.sourceEndpointDatabaseName = defaults.sourceEndpointDatabaseName;
    	      this.sourceEndpointEngineName = defaults.sourceEndpointEngineName;
    	      this.sourceEndpointInstanceId = defaults.sourceEndpointInstanceId;
    	      this.sourceEndpointInstanceType = defaults.sourceEndpointInstanceType;
    	      this.sourceEndpointIp = defaults.sourceEndpointIp;
    	      this.sourceEndpointOracleSid = defaults.sourceEndpointOracleSid;
    	      this.sourceEndpointOwnerId = defaults.sourceEndpointOwnerId;
    	      this.sourceEndpointPort = defaults.sourceEndpointPort;
    	      this.sourceEndpointRegion = defaults.sourceEndpointRegion;
    	      this.sourceEndpointRole = defaults.sourceEndpointRole;
    	      this.sourceEndpointUserName = defaults.sourceEndpointUserName;
    	      this.status = defaults.status;
    	      this.structureInitialization = defaults.structureInitialization;
    	      this.synchronizationDirection = defaults.synchronizationDirection;
        }

        @CustomType.Setter
        public Builder checkpoint(String checkpoint) {
            if (checkpoint == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "checkpoint");
            }
            this.checkpoint = checkpoint;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder dataInitialization(Boolean dataInitialization) {
            if (dataInitialization == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "dataInitialization");
            }
            this.dataInitialization = dataInitialization;
            return this;
        }
        @CustomType.Setter
        public Builder dataSynchronization(Boolean dataSynchronization) {
            if (dataSynchronization == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "dataSynchronization");
            }
            this.dataSynchronization = dataSynchronization;
            return this;
        }
        @CustomType.Setter
        public Builder dbList(String dbList) {
            if (dbList == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "dbList");
            }
            this.dbList = dbList;
            return this;
        }
        @CustomType.Setter
        public Builder destinationEndpointDataBaseName(String destinationEndpointDataBaseName) {
            if (destinationEndpointDataBaseName == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "destinationEndpointDataBaseName");
            }
            this.destinationEndpointDataBaseName = destinationEndpointDataBaseName;
            return this;
        }
        @CustomType.Setter
        public Builder destinationEndpointEngineName(String destinationEndpointEngineName) {
            if (destinationEndpointEngineName == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "destinationEndpointEngineName");
            }
            this.destinationEndpointEngineName = destinationEndpointEngineName;
            return this;
        }
        @CustomType.Setter
        public Builder destinationEndpointInstanceId(String destinationEndpointInstanceId) {
            if (destinationEndpointInstanceId == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "destinationEndpointInstanceId");
            }
            this.destinationEndpointInstanceId = destinationEndpointInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder destinationEndpointInstanceType(String destinationEndpointInstanceType) {
            if (destinationEndpointInstanceType == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "destinationEndpointInstanceType");
            }
            this.destinationEndpointInstanceType = destinationEndpointInstanceType;
            return this;
        }
        @CustomType.Setter
        public Builder destinationEndpointIp(String destinationEndpointIp) {
            if (destinationEndpointIp == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "destinationEndpointIp");
            }
            this.destinationEndpointIp = destinationEndpointIp;
            return this;
        }
        @CustomType.Setter
        public Builder destinationEndpointOracleSid(String destinationEndpointOracleSid) {
            if (destinationEndpointOracleSid == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "destinationEndpointOracleSid");
            }
            this.destinationEndpointOracleSid = destinationEndpointOracleSid;
            return this;
        }
        @CustomType.Setter
        public Builder destinationEndpointPort(String destinationEndpointPort) {
            if (destinationEndpointPort == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "destinationEndpointPort");
            }
            this.destinationEndpointPort = destinationEndpointPort;
            return this;
        }
        @CustomType.Setter
        public Builder destinationEndpointRegion(String destinationEndpointRegion) {
            if (destinationEndpointRegion == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "destinationEndpointRegion");
            }
            this.destinationEndpointRegion = destinationEndpointRegion;
            return this;
        }
        @CustomType.Setter
        public Builder destinationEndpointUserName(String destinationEndpointUserName) {
            if (destinationEndpointUserName == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "destinationEndpointUserName");
            }
            this.destinationEndpointUserName = destinationEndpointUserName;
            return this;
        }
        @CustomType.Setter
        public Builder dtsInstanceId(String dtsInstanceId) {
            if (dtsInstanceId == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "dtsInstanceId");
            }
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder dtsJobId(String dtsJobId) {
            if (dtsJobId == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "dtsJobId");
            }
            this.dtsJobId = dtsJobId;
            return this;
        }
        @CustomType.Setter
        public Builder dtsJobName(String dtsJobName) {
            if (dtsJobName == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "dtsJobName");
            }
            this.dtsJobName = dtsJobName;
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            if (expireTime == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "expireTime");
            }
            this.expireTime = expireTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
            if (sourceEndpointDatabaseName == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointDatabaseName");
            }
            this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            if (sourceEndpointEngineName == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointEngineName");
            }
            this.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointInstanceId(String sourceEndpointInstanceId) {
            if (sourceEndpointInstanceId == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointInstanceId");
            }
            this.sourceEndpointInstanceId = sourceEndpointInstanceId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointInstanceType(String sourceEndpointInstanceType) {
            if (sourceEndpointInstanceType == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointInstanceType");
            }
            this.sourceEndpointInstanceType = sourceEndpointInstanceType;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointIp(String sourceEndpointIp) {
            if (sourceEndpointIp == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointIp");
            }
            this.sourceEndpointIp = sourceEndpointIp;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointOracleSid(String sourceEndpointOracleSid) {
            if (sourceEndpointOracleSid == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointOracleSid");
            }
            this.sourceEndpointOracleSid = sourceEndpointOracleSid;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointOwnerId(String sourceEndpointOwnerId) {
            if (sourceEndpointOwnerId == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointOwnerId");
            }
            this.sourceEndpointOwnerId = sourceEndpointOwnerId;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointPort(String sourceEndpointPort) {
            if (sourceEndpointPort == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointPort");
            }
            this.sourceEndpointPort = sourceEndpointPort;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            if (sourceEndpointRegion == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointRegion");
            }
            this.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointRole(String sourceEndpointRole) {
            if (sourceEndpointRole == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointRole");
            }
            this.sourceEndpointRole = sourceEndpointRole;
            return this;
        }
        @CustomType.Setter
        public Builder sourceEndpointUserName(String sourceEndpointUserName) {
            if (sourceEndpointUserName == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "sourceEndpointUserName");
            }
            this.sourceEndpointUserName = sourceEndpointUserName;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder structureInitialization(Boolean structureInitialization) {
            if (structureInitialization == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "structureInitialization");
            }
            this.structureInitialization = structureInitialization;
            return this;
        }
        @CustomType.Setter
        public Builder synchronizationDirection(String synchronizationDirection) {
            if (synchronizationDirection == null) {
              throw new MissingRequiredPropertyException("GetSynchronizationJobsJob", "synchronizationDirection");
            }
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }
        public GetSynchronizationJobsJob build() {
            final var _resultValue = new GetSynchronizationJobsJob();
            _resultValue.checkpoint = checkpoint;
            _resultValue.createTime = createTime;
            _resultValue.dataInitialization = dataInitialization;
            _resultValue.dataSynchronization = dataSynchronization;
            _resultValue.dbList = dbList;
            _resultValue.destinationEndpointDataBaseName = destinationEndpointDataBaseName;
            _resultValue.destinationEndpointEngineName = destinationEndpointEngineName;
            _resultValue.destinationEndpointInstanceId = destinationEndpointInstanceId;
            _resultValue.destinationEndpointInstanceType = destinationEndpointInstanceType;
            _resultValue.destinationEndpointIp = destinationEndpointIp;
            _resultValue.destinationEndpointOracleSid = destinationEndpointOracleSid;
            _resultValue.destinationEndpointPort = destinationEndpointPort;
            _resultValue.destinationEndpointRegion = destinationEndpointRegion;
            _resultValue.destinationEndpointUserName = destinationEndpointUserName;
            _resultValue.dtsInstanceId = dtsInstanceId;
            _resultValue.dtsJobId = dtsJobId;
            _resultValue.dtsJobName = dtsJobName;
            _resultValue.expireTime = expireTime;
            _resultValue.id = id;
            _resultValue.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
            _resultValue.sourceEndpointEngineName = sourceEndpointEngineName;
            _resultValue.sourceEndpointInstanceId = sourceEndpointInstanceId;
            _resultValue.sourceEndpointInstanceType = sourceEndpointInstanceType;
            _resultValue.sourceEndpointIp = sourceEndpointIp;
            _resultValue.sourceEndpointOracleSid = sourceEndpointOracleSid;
            _resultValue.sourceEndpointOwnerId = sourceEndpointOwnerId;
            _resultValue.sourceEndpointPort = sourceEndpointPort;
            _resultValue.sourceEndpointRegion = sourceEndpointRegion;
            _resultValue.sourceEndpointRole = sourceEndpointRole;
            _resultValue.sourceEndpointUserName = sourceEndpointUserName;
            _resultValue.status = status;
            _resultValue.structureInitialization = structureInitialization;
            _resultValue.synchronizationDirection = synchronizationDirection;
            return _resultValue;
        }
    }
}
