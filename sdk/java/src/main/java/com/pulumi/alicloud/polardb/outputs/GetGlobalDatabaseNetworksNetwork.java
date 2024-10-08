// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.polardb.outputs;

import com.pulumi.alicloud.polardb.outputs.GetGlobalDatabaseNetworksNetworkDbCluster;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGlobalDatabaseNetworksNetwork {
    /**
     * @return The time when the Global Database Network was created. The time is in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    private String createTime;
    /**
     * @return The details of each cluster in the Global Database Network.
     * 
     */
    private List<GetGlobalDatabaseNetworksNetworkDbCluster> dbClusters;
    /**
     * @return The type of the database engine. Only MySQL is supported.
     * 
     */
    private String dbType;
    /**
     * @return The version number of the database engine. Only the 8.0 version is supported.
     * 
     */
    private String dbVersion;
    /**
     * @return The description of the Global Database Network.
     * 
     */
    private String description;
    /**
     * @return The ID of the Global Database Network.
     * 
     */
    private String gdnId;
    /**
     * @return The ID of the Global Database Network.
     * 
     */
    private String id;
    /**
     * @return The status of the Global Database Network. Valid values:
     * 
     */
    private String status;

    private GetGlobalDatabaseNetworksNetwork() {}
    /**
     * @return The time when the Global Database Network was created. The time is in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The details of each cluster in the Global Database Network.
     * 
     */
    public List<GetGlobalDatabaseNetworksNetworkDbCluster> dbClusters() {
        return this.dbClusters;
    }
    /**
     * @return The type of the database engine. Only MySQL is supported.
     * 
     */
    public String dbType() {
        return this.dbType;
    }
    /**
     * @return The version number of the database engine. Only the 8.0 version is supported.
     * 
     */
    public String dbVersion() {
        return this.dbVersion;
    }
    /**
     * @return The description of the Global Database Network.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Global Database Network.
     * 
     */
    public String gdnId() {
        return this.gdnId;
    }
    /**
     * @return The ID of the Global Database Network.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The status of the Global Database Network. Valid values:
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalDatabaseNetworksNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private List<GetGlobalDatabaseNetworksNetworkDbCluster> dbClusters;
        private String dbType;
        private String dbVersion;
        private String description;
        private String gdnId;
        private String id;
        private String status;
        public Builder() {}
        public Builder(GetGlobalDatabaseNetworksNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.dbClusters = defaults.dbClusters;
    	      this.dbType = defaults.dbType;
    	      this.dbVersion = defaults.dbVersion;
    	      this.description = defaults.description;
    	      this.gdnId = defaults.gdnId;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetGlobalDatabaseNetworksNetwork", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder dbClusters(List<GetGlobalDatabaseNetworksNetworkDbCluster> dbClusters) {
            if (dbClusters == null) {
              throw new MissingRequiredPropertyException("GetGlobalDatabaseNetworksNetwork", "dbClusters");
            }
            this.dbClusters = dbClusters;
            return this;
        }
        public Builder dbClusters(GetGlobalDatabaseNetworksNetworkDbCluster... dbClusters) {
            return dbClusters(List.of(dbClusters));
        }
        @CustomType.Setter
        public Builder dbType(String dbType) {
            if (dbType == null) {
              throw new MissingRequiredPropertyException("GetGlobalDatabaseNetworksNetwork", "dbType");
            }
            this.dbType = dbType;
            return this;
        }
        @CustomType.Setter
        public Builder dbVersion(String dbVersion) {
            if (dbVersion == null) {
              throw new MissingRequiredPropertyException("GetGlobalDatabaseNetworksNetwork", "dbVersion");
            }
            this.dbVersion = dbVersion;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetGlobalDatabaseNetworksNetwork", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder gdnId(String gdnId) {
            if (gdnId == null) {
              throw new MissingRequiredPropertyException("GetGlobalDatabaseNetworksNetwork", "gdnId");
            }
            this.gdnId = gdnId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGlobalDatabaseNetworksNetwork", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetGlobalDatabaseNetworksNetwork", "status");
            }
            this.status = status;
            return this;
        }
        public GetGlobalDatabaseNetworksNetwork build() {
            final var _resultValue = new GetGlobalDatabaseNetworksNetwork();
            _resultValue.createTime = createTime;
            _resultValue.dbClusters = dbClusters;
            _resultValue.dbType = dbType;
            _resultValue.dbVersion = dbVersion;
            _resultValue.description = description;
            _resultValue.gdnId = gdnId;
            _resultValue.id = id;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
