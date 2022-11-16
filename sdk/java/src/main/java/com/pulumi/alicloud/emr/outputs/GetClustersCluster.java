// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.outputs;

import com.pulumi.alicloud.emr.outputs.GetClustersClusterAccessInfo;
import com.pulumi.alicloud.emr.outputs.GetClustersClusterBootstrapActionList;
import com.pulumi.alicloud.emr.outputs.GetClustersClusterHostGroupList;
import com.pulumi.alicloud.emr.outputs.GetClustersClusterHostPoolInfo;
import com.pulumi.alicloud.emr.outputs.GetClustersClusterRelateClusterInfo;
import com.pulumi.alicloud.emr.outputs.GetClustersClusterSoftwareInfo;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetClustersCluster {
    /**
     * @return Cluster connection information.
     * 
     */
    private final List<GetClustersClusterAccessInfo> accessInfos;
    /**
     * @return Whether flexible expansion is allowed.
     * 
     */
    private final Boolean autoScalingAllowed;
    /**
     * @return Whether to allow expansion by load.
     * 
     */
    private final Boolean autoScalingByLoadAllowed;
    /**
     * @return Whether to enable elastic expansion.
     * 
     */
    private final Boolean autoScalingEnable;
    /**
     * @return Whether to allow the use of elastic scaling bidding instances.
     * 
     */
    private final Boolean autoScalingSpotWithLimitAllowed;
    /**
     * @return List of boot actions.
     * 
     */
    private final List<GetClustersClusterBootstrapActionList> bootstrapActionLists;
    /**
     * @return The result of the boot operation.
     * 
     */
    private final Boolean bootstrapFailed;
    /**
     * @return The ID of the associated cluster.
     * 
     */
    private final String clusterId;
    /**
     * @return The name of the associated cluster.
     * 
     */
    private final String clusterName;
    /**
     * @return Cluster tag, no need to pay attention.
     * 
     */
    private final String createResource;
    /**
     * @return Creation time.
     * 
     */
    private final String createTime;
    /**
     * @return How to create a cluster.
     * 
     */
    private final String createType;
    /**
     * @return The hosting type of the cluster.
     * 
     */
    private final String depositType;
    /**
     * @return High security cluster.
     * 
     */
    private final Boolean easEnable;
    /**
     * @return Timeout time.
     * 
     */
    private final String expiredTime;
    /**
     * @return Additional information for Stack.
     * 
     */
    private final String extraInfo;
    private final Boolean hasUncompletedOrder;
    /**
     * @return High availability cluster.
     * 
     */
    private final Boolean highAvailabilityEnable;
    /**
     * @return List of cluster machine groups.
     * 
     */
    private final List<GetClustersClusterHostGroupList> hostGroupLists;
    /**
     * @return Machine pool information.
     * 
     */
    private final List<GetClustersClusterHostPoolInfo> hostPoolInfos;
    private final String id;
    /**
     * @return The ID of the image used to create the cluster.
     * 
     */
    private final String imageId;
    /**
     * @return Whether to use Hive local Metabase.
     * 
     */
    private final Boolean localMetaDb;
    /**
     * @return The host type of the cluster. The default is ECS.
     * 
     */
    private final String machineType;
    /**
     * @return Metadata type:
     * 
     */
    private final String metaStoreType;
    /**
     * @return Cluster network type.
     * 
     */
    private final String netType;
    /**
     * @return The payment type of the resource.
     * 
     */
    private final String paymentType;
    /**
     * @return The package year and month time of the machine group. The Valid Values : `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`.
     * 
     */
    private final Integer period;
    /**
     * @return The information of the primary cluster associated with the Gateway.
     * 
     */
    private final List<GetClustersClusterRelateClusterInfo> relateClusterInfos;
    /**
     * @return Whether to allow disk expansion:
     * 
     */
    private final Boolean resizeDiskEnable;
    /**
     * @return The time (in seconds) that has been running.
     * 
     */
    private final Integer runningTime;
    /**
     * @return The ID of the security group.
     * 
     */
    private final String securityGroupId;
    /**
     * @return The name of the security group.
     * 
     */
    private final String securityGroupName;
    /**
     * @return Service list.
     * 
     */
    private final List<GetClustersClusterSoftwareInfo> softwareInfos;
    /**
     * @return Cluster startup time.
     * 
     */
    private final String startTime;
    /**
     * @return The cluster status.
     * 
     */
    private final String status;
    /**
     * @return Cluster stop time.
     * 
     */
    private final String stopTime;
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    private final Map<String,Object> tags;
    /**
     * @return Disk type.
     * 
     */
    private final String type;
    /**
     * @return The EMR permission name used.
     * 
     */
    private final String userDefinedEmrEcsRole;
    /**
     * @return The user ID.
     * 
     */
    private final String userId;
    /**
     * @return The VPC ID.
     * 
     */
    private final String vpcId;
    /**
     * @return The vswitch id.
     * 
     */
    private final String vswitchId;
    /**
     * @return The zone ID.
     * 
     */
    private final String zoneId;

    @CustomType.Constructor
    private GetClustersCluster(
        @CustomType.Parameter("accessInfos") List<GetClustersClusterAccessInfo> accessInfos,
        @CustomType.Parameter("autoScalingAllowed") Boolean autoScalingAllowed,
        @CustomType.Parameter("autoScalingByLoadAllowed") Boolean autoScalingByLoadAllowed,
        @CustomType.Parameter("autoScalingEnable") Boolean autoScalingEnable,
        @CustomType.Parameter("autoScalingSpotWithLimitAllowed") Boolean autoScalingSpotWithLimitAllowed,
        @CustomType.Parameter("bootstrapActionLists") List<GetClustersClusterBootstrapActionList> bootstrapActionLists,
        @CustomType.Parameter("bootstrapFailed") Boolean bootstrapFailed,
        @CustomType.Parameter("clusterId") String clusterId,
        @CustomType.Parameter("clusterName") String clusterName,
        @CustomType.Parameter("createResource") String createResource,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("createType") String createType,
        @CustomType.Parameter("depositType") String depositType,
        @CustomType.Parameter("easEnable") Boolean easEnable,
        @CustomType.Parameter("expiredTime") String expiredTime,
        @CustomType.Parameter("extraInfo") String extraInfo,
        @CustomType.Parameter("hasUncompletedOrder") Boolean hasUncompletedOrder,
        @CustomType.Parameter("highAvailabilityEnable") Boolean highAvailabilityEnable,
        @CustomType.Parameter("hostGroupLists") List<GetClustersClusterHostGroupList> hostGroupLists,
        @CustomType.Parameter("hostPoolInfos") List<GetClustersClusterHostPoolInfo> hostPoolInfos,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageId") String imageId,
        @CustomType.Parameter("localMetaDb") Boolean localMetaDb,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("metaStoreType") String metaStoreType,
        @CustomType.Parameter("netType") String netType,
        @CustomType.Parameter("paymentType") String paymentType,
        @CustomType.Parameter("period") Integer period,
        @CustomType.Parameter("relateClusterInfos") List<GetClustersClusterRelateClusterInfo> relateClusterInfos,
        @CustomType.Parameter("resizeDiskEnable") Boolean resizeDiskEnable,
        @CustomType.Parameter("runningTime") Integer runningTime,
        @CustomType.Parameter("securityGroupId") String securityGroupId,
        @CustomType.Parameter("securityGroupName") String securityGroupName,
        @CustomType.Parameter("softwareInfos") List<GetClustersClusterSoftwareInfo> softwareInfos,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("stopTime") String stopTime,
        @CustomType.Parameter("tags") Map<String,Object> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userDefinedEmrEcsRole") String userDefinedEmrEcsRole,
        @CustomType.Parameter("userId") String userId,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("vswitchId") String vswitchId,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.accessInfos = accessInfos;
        this.autoScalingAllowed = autoScalingAllowed;
        this.autoScalingByLoadAllowed = autoScalingByLoadAllowed;
        this.autoScalingEnable = autoScalingEnable;
        this.autoScalingSpotWithLimitAllowed = autoScalingSpotWithLimitAllowed;
        this.bootstrapActionLists = bootstrapActionLists;
        this.bootstrapFailed = bootstrapFailed;
        this.clusterId = clusterId;
        this.clusterName = clusterName;
        this.createResource = createResource;
        this.createTime = createTime;
        this.createType = createType;
        this.depositType = depositType;
        this.easEnable = easEnable;
        this.expiredTime = expiredTime;
        this.extraInfo = extraInfo;
        this.hasUncompletedOrder = hasUncompletedOrder;
        this.highAvailabilityEnable = highAvailabilityEnable;
        this.hostGroupLists = hostGroupLists;
        this.hostPoolInfos = hostPoolInfos;
        this.id = id;
        this.imageId = imageId;
        this.localMetaDb = localMetaDb;
        this.machineType = machineType;
        this.metaStoreType = metaStoreType;
        this.netType = netType;
        this.paymentType = paymentType;
        this.period = period;
        this.relateClusterInfos = relateClusterInfos;
        this.resizeDiskEnable = resizeDiskEnable;
        this.runningTime = runningTime;
        this.securityGroupId = securityGroupId;
        this.securityGroupName = securityGroupName;
        this.softwareInfos = softwareInfos;
        this.startTime = startTime;
        this.status = status;
        this.stopTime = stopTime;
        this.tags = tags;
        this.type = type;
        this.userDefinedEmrEcsRole = userDefinedEmrEcsRole;
        this.userId = userId;
        this.vpcId = vpcId;
        this.vswitchId = vswitchId;
        this.zoneId = zoneId;
    }

    /**
     * @return Cluster connection information.
     * 
     */
    public List<GetClustersClusterAccessInfo> accessInfos() {
        return this.accessInfos;
    }
    /**
     * @return Whether flexible expansion is allowed.
     * 
     */
    public Boolean autoScalingAllowed() {
        return this.autoScalingAllowed;
    }
    /**
     * @return Whether to allow expansion by load.
     * 
     */
    public Boolean autoScalingByLoadAllowed() {
        return this.autoScalingByLoadAllowed;
    }
    /**
     * @return Whether to enable elastic expansion.
     * 
     */
    public Boolean autoScalingEnable() {
        return this.autoScalingEnable;
    }
    /**
     * @return Whether to allow the use of elastic scaling bidding instances.
     * 
     */
    public Boolean autoScalingSpotWithLimitAllowed() {
        return this.autoScalingSpotWithLimitAllowed;
    }
    /**
     * @return List of boot actions.
     * 
     */
    public List<GetClustersClusterBootstrapActionList> bootstrapActionLists() {
        return this.bootstrapActionLists;
    }
    /**
     * @return The result of the boot operation.
     * 
     */
    public Boolean bootstrapFailed() {
        return this.bootstrapFailed;
    }
    /**
     * @return The ID of the associated cluster.
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }
    /**
     * @return The name of the associated cluster.
     * 
     */
    public String clusterName() {
        return this.clusterName;
    }
    /**
     * @return Cluster tag, no need to pay attention.
     * 
     */
    public String createResource() {
        return this.createResource;
    }
    /**
     * @return Creation time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return How to create a cluster.
     * 
     */
    public String createType() {
        return this.createType;
    }
    /**
     * @return The hosting type of the cluster.
     * 
     */
    public String depositType() {
        return this.depositType;
    }
    /**
     * @return High security cluster.
     * 
     */
    public Boolean easEnable() {
        return this.easEnable;
    }
    /**
     * @return Timeout time.
     * 
     */
    public String expiredTime() {
        return this.expiredTime;
    }
    /**
     * @return Additional information for Stack.
     * 
     */
    public String extraInfo() {
        return this.extraInfo;
    }
    public Boolean hasUncompletedOrder() {
        return this.hasUncompletedOrder;
    }
    /**
     * @return High availability cluster.
     * 
     */
    public Boolean highAvailabilityEnable() {
        return this.highAvailabilityEnable;
    }
    /**
     * @return List of cluster machine groups.
     * 
     */
    public List<GetClustersClusterHostGroupList> hostGroupLists() {
        return this.hostGroupLists;
    }
    /**
     * @return Machine pool information.
     * 
     */
    public List<GetClustersClusterHostPoolInfo> hostPoolInfos() {
        return this.hostPoolInfos;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the image used to create the cluster.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return Whether to use Hive local Metabase.
     * 
     */
    public Boolean localMetaDb() {
        return this.localMetaDb;
    }
    /**
     * @return The host type of the cluster. The default is ECS.
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return Metadata type:
     * 
     */
    public String metaStoreType() {
        return this.metaStoreType;
    }
    /**
     * @return Cluster network type.
     * 
     */
    public String netType() {
        return this.netType;
    }
    /**
     * @return The payment type of the resource.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The package year and month time of the machine group. The Valid Values : `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `12`, `24`, `36`.
     * 
     */
    public Integer period() {
        return this.period;
    }
    /**
     * @return The information of the primary cluster associated with the Gateway.
     * 
     */
    public List<GetClustersClusterRelateClusterInfo> relateClusterInfos() {
        return this.relateClusterInfos;
    }
    /**
     * @return Whether to allow disk expansion:
     * 
     */
    public Boolean resizeDiskEnable() {
        return this.resizeDiskEnable;
    }
    /**
     * @return The time (in seconds) that has been running.
     * 
     */
    public Integer runningTime() {
        return this.runningTime;
    }
    /**
     * @return The ID of the security group.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * @return The name of the security group.
     * 
     */
    public String securityGroupName() {
        return this.securityGroupName;
    }
    /**
     * @return Service list.
     * 
     */
    public List<GetClustersClusterSoftwareInfo> softwareInfos() {
        return this.softwareInfos;
    }
    /**
     * @return Cluster startup time.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The cluster status.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Cluster stop time.
     * 
     */
    public String stopTime() {
        return this.stopTime;
    }
    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return Disk type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The EMR permission name used.
     * 
     */
    public String userDefinedEmrEcsRole() {
        return this.userDefinedEmrEcsRole;
    }
    /**
     * @return The user ID.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return The VPC ID.
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
     * @return The zone ID.
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

    public static final class Builder {
        private List<GetClustersClusterAccessInfo> accessInfos;
        private Boolean autoScalingAllowed;
        private Boolean autoScalingByLoadAllowed;
        private Boolean autoScalingEnable;
        private Boolean autoScalingSpotWithLimitAllowed;
        private List<GetClustersClusterBootstrapActionList> bootstrapActionLists;
        private Boolean bootstrapFailed;
        private String clusterId;
        private String clusterName;
        private String createResource;
        private String createTime;
        private String createType;
        private String depositType;
        private Boolean easEnable;
        private String expiredTime;
        private String extraInfo;
        private Boolean hasUncompletedOrder;
        private Boolean highAvailabilityEnable;
        private List<GetClustersClusterHostGroupList> hostGroupLists;
        private List<GetClustersClusterHostPoolInfo> hostPoolInfos;
        private String id;
        private String imageId;
        private Boolean localMetaDb;
        private String machineType;
        private String metaStoreType;
        private String netType;
        private String paymentType;
        private Integer period;
        private List<GetClustersClusterRelateClusterInfo> relateClusterInfos;
        private Boolean resizeDiskEnable;
        private Integer runningTime;
        private String securityGroupId;
        private String securityGroupName;
        private List<GetClustersClusterSoftwareInfo> softwareInfos;
        private String startTime;
        private String status;
        private String stopTime;
        private Map<String,Object> tags;
        private String type;
        private String userDefinedEmrEcsRole;
        private String userId;
        private String vpcId;
        private String vswitchId;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClustersCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessInfos = defaults.accessInfos;
    	      this.autoScalingAllowed = defaults.autoScalingAllowed;
    	      this.autoScalingByLoadAllowed = defaults.autoScalingByLoadAllowed;
    	      this.autoScalingEnable = defaults.autoScalingEnable;
    	      this.autoScalingSpotWithLimitAllowed = defaults.autoScalingSpotWithLimitAllowed;
    	      this.bootstrapActionLists = defaults.bootstrapActionLists;
    	      this.bootstrapFailed = defaults.bootstrapFailed;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.createResource = defaults.createResource;
    	      this.createTime = defaults.createTime;
    	      this.createType = defaults.createType;
    	      this.depositType = defaults.depositType;
    	      this.easEnable = defaults.easEnable;
    	      this.expiredTime = defaults.expiredTime;
    	      this.extraInfo = defaults.extraInfo;
    	      this.hasUncompletedOrder = defaults.hasUncompletedOrder;
    	      this.highAvailabilityEnable = defaults.highAvailabilityEnable;
    	      this.hostGroupLists = defaults.hostGroupLists;
    	      this.hostPoolInfos = defaults.hostPoolInfos;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.localMetaDb = defaults.localMetaDb;
    	      this.machineType = defaults.machineType;
    	      this.metaStoreType = defaults.metaStoreType;
    	      this.netType = defaults.netType;
    	      this.paymentType = defaults.paymentType;
    	      this.period = defaults.period;
    	      this.relateClusterInfos = defaults.relateClusterInfos;
    	      this.resizeDiskEnable = defaults.resizeDiskEnable;
    	      this.runningTime = defaults.runningTime;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.securityGroupName = defaults.securityGroupName;
    	      this.softwareInfos = defaults.softwareInfos;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.stopTime = defaults.stopTime;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.userDefinedEmrEcsRole = defaults.userDefinedEmrEcsRole;
    	      this.userId = defaults.userId;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchId = defaults.vswitchId;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder accessInfos(List<GetClustersClusterAccessInfo> accessInfos) {
            this.accessInfos = Objects.requireNonNull(accessInfos);
            return this;
        }
        public Builder accessInfos(GetClustersClusterAccessInfo... accessInfos) {
            return accessInfos(List.of(accessInfos));
        }
        public Builder autoScalingAllowed(Boolean autoScalingAllowed) {
            this.autoScalingAllowed = Objects.requireNonNull(autoScalingAllowed);
            return this;
        }
        public Builder autoScalingByLoadAllowed(Boolean autoScalingByLoadAllowed) {
            this.autoScalingByLoadAllowed = Objects.requireNonNull(autoScalingByLoadAllowed);
            return this;
        }
        public Builder autoScalingEnable(Boolean autoScalingEnable) {
            this.autoScalingEnable = Objects.requireNonNull(autoScalingEnable);
            return this;
        }
        public Builder autoScalingSpotWithLimitAllowed(Boolean autoScalingSpotWithLimitAllowed) {
            this.autoScalingSpotWithLimitAllowed = Objects.requireNonNull(autoScalingSpotWithLimitAllowed);
            return this;
        }
        public Builder bootstrapActionLists(List<GetClustersClusterBootstrapActionList> bootstrapActionLists) {
            this.bootstrapActionLists = Objects.requireNonNull(bootstrapActionLists);
            return this;
        }
        public Builder bootstrapActionLists(GetClustersClusterBootstrapActionList... bootstrapActionLists) {
            return bootstrapActionLists(List.of(bootstrapActionLists));
        }
        public Builder bootstrapFailed(Boolean bootstrapFailed) {
            this.bootstrapFailed = Objects.requireNonNull(bootstrapFailed);
            return this;
        }
        public Builder clusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder createResource(String createResource) {
            this.createResource = Objects.requireNonNull(createResource);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder createType(String createType) {
            this.createType = Objects.requireNonNull(createType);
            return this;
        }
        public Builder depositType(String depositType) {
            this.depositType = Objects.requireNonNull(depositType);
            return this;
        }
        public Builder easEnable(Boolean easEnable) {
            this.easEnable = Objects.requireNonNull(easEnable);
            return this;
        }
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = Objects.requireNonNull(expiredTime);
            return this;
        }
        public Builder extraInfo(String extraInfo) {
            this.extraInfo = Objects.requireNonNull(extraInfo);
            return this;
        }
        public Builder hasUncompletedOrder(Boolean hasUncompletedOrder) {
            this.hasUncompletedOrder = Objects.requireNonNull(hasUncompletedOrder);
            return this;
        }
        public Builder highAvailabilityEnable(Boolean highAvailabilityEnable) {
            this.highAvailabilityEnable = Objects.requireNonNull(highAvailabilityEnable);
            return this;
        }
        public Builder hostGroupLists(List<GetClustersClusterHostGroupList> hostGroupLists) {
            this.hostGroupLists = Objects.requireNonNull(hostGroupLists);
            return this;
        }
        public Builder hostGroupLists(GetClustersClusterHostGroupList... hostGroupLists) {
            return hostGroupLists(List.of(hostGroupLists));
        }
        public Builder hostPoolInfos(List<GetClustersClusterHostPoolInfo> hostPoolInfos) {
            this.hostPoolInfos = Objects.requireNonNull(hostPoolInfos);
            return this;
        }
        public Builder hostPoolInfos(GetClustersClusterHostPoolInfo... hostPoolInfos) {
            return hostPoolInfos(List.of(hostPoolInfos));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public Builder localMetaDb(Boolean localMetaDb) {
            this.localMetaDb = Objects.requireNonNull(localMetaDb);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder metaStoreType(String metaStoreType) {
            this.metaStoreType = Objects.requireNonNull(metaStoreType);
            return this;
        }
        public Builder netType(String netType) {
            this.netType = Objects.requireNonNull(netType);
            return this;
        }
        public Builder paymentType(String paymentType) {
            this.paymentType = Objects.requireNonNull(paymentType);
            return this;
        }
        public Builder period(Integer period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }
        public Builder relateClusterInfos(List<GetClustersClusterRelateClusterInfo> relateClusterInfos) {
            this.relateClusterInfos = Objects.requireNonNull(relateClusterInfos);
            return this;
        }
        public Builder relateClusterInfos(GetClustersClusterRelateClusterInfo... relateClusterInfos) {
            return relateClusterInfos(List.of(relateClusterInfos));
        }
        public Builder resizeDiskEnable(Boolean resizeDiskEnable) {
            this.resizeDiskEnable = Objects.requireNonNull(resizeDiskEnable);
            return this;
        }
        public Builder runningTime(Integer runningTime) {
            this.runningTime = Objects.requireNonNull(runningTime);
            return this;
        }
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = Objects.requireNonNull(securityGroupId);
            return this;
        }
        public Builder securityGroupName(String securityGroupName) {
            this.securityGroupName = Objects.requireNonNull(securityGroupName);
            return this;
        }
        public Builder softwareInfos(List<GetClustersClusterSoftwareInfo> softwareInfos) {
            this.softwareInfos = Objects.requireNonNull(softwareInfos);
            return this;
        }
        public Builder softwareInfos(GetClustersClusterSoftwareInfo... softwareInfos) {
            return softwareInfos(List.of(softwareInfos));
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder stopTime(String stopTime) {
            this.stopTime = Objects.requireNonNull(stopTime);
            return this;
        }
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userDefinedEmrEcsRole(String userDefinedEmrEcsRole) {
            this.userDefinedEmrEcsRole = Objects.requireNonNull(userDefinedEmrEcsRole);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
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
        }        public GetClustersCluster build() {
            return new GetClustersCluster(accessInfos, autoScalingAllowed, autoScalingByLoadAllowed, autoScalingEnable, autoScalingSpotWithLimitAllowed, bootstrapActionLists, bootstrapFailed, clusterId, clusterName, createResource, createTime, createType, depositType, easEnable, expiredTime, extraInfo, hasUncompletedOrder, highAvailabilityEnable, hostGroupLists, hostPoolInfos, id, imageId, localMetaDb, machineType, metaStoreType, netType, paymentType, period, relateClusterInfos, resizeDiskEnable, runningTime, securityGroupId, securityGroupName, softwareInfos, startTime, status, stopTime, tags, type, userDefinedEmrEcsRole, userId, vpcId, vswitchId, zoneId);
        }
    }
}