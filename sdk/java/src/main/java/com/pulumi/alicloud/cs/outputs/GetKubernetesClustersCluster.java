// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.alicloud.cs.outputs.GetKubernetesClustersClusterConnections;
import com.pulumi.alicloud.cs.outputs.GetKubernetesClustersClusterLogConfig;
import com.pulumi.alicloud.cs.outputs.GetKubernetesClustersClusterMasterNode;
import com.pulumi.alicloud.cs.outputs.GetKubernetesClustersClusterWorkerNode;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKubernetesClustersCluster {
    /**
     * @return The ID of availability zone.
     * 
     */
    private String availabilityZone;
    private String clusterNetworkType;
    /**
     * @return Map of kubernetes cluster connection information. It contains several attributes to `Block Connections`.
     * 
     */
    private GetKubernetesClustersClusterConnections connections;
    /**
     * @return ID of the node.
     * 
     */
    private String id;
    /**
     * @return The ID of node image.
     * 
     */
    private String imageId;
    /**
     * @return The keypair of ssh login cluster node, you have to create it first.
     * 
     */
    private String keyName;
    /**
     * @return A list of one element containing information about the associated log store. It contains the following attributes:
     * 
     */
    private List<GetKubernetesClustersClusterLogConfig> logConfigs;
    private Boolean masterAutoRenew;
    private Integer masterAutoRenewPeriod;
    /**
     * @return The system disk category of master node.
     * 
     */
    private String masterDiskCategory;
    /**
     * @return The system disk size of master node.
     * 
     */
    private Integer masterDiskSize;
    private String masterInstanceChargeType;
    /**
     * @return The instance type of master node.
     * 
     */
    private List<String> masterInstanceTypes;
    /**
     * @return List of cluster master nodes. It contains several attributes to `Block Nodes`.
     * 
     */
    private List<GetKubernetesClustersClusterMasterNode> masterNodes;
    private Integer masterPeriod;
    private String masterPeriodUnit;
    /**
     * @return Node name.
     * 
     */
    private String name;
    /**
     * @return The ID of nat gateway used to launch kubernetes cluster.
     * 
     */
    private String natGatewayId;
    /**
     * @return The network mask used on pods for each node.
     * 
     */
    private Integer nodeCidrMask;
    private String podCidr;
    /**
     * @return The ID of security group where the current cluster worker node is located.
     * 
     */
    private String securityGroupId;
    private String serviceCidr;
    /**
     * @return Whether internet load balancer for API Server is created
     * 
     */
    private Boolean slbInternetEnabled;
    /**
     * @return The ID of VPC where the current cluster is located.
     * 
     */
    private String vpcId;
    /**
     * @return The ID of VSwitches where the current cluster is located.
     * 
     */
    private List<String> vswitchIds;
    private Boolean workerAutoRenew;
    private Integer workerAutoRenewPeriod;
    /**
     * @return The data disk size of worker node.
     * 
     */
    private String workerDataDiskCategory;
    /**
     * @return The data disk category of worker node.
     * 
     */
    private Integer workerDataDiskSize;
    /**
     * @return The system disk category of worker node.
     * 
     */
    private String workerDiskCategory;
    /**
     * @return The system disk size of worker node.
     * 
     */
    private Integer workerDiskSize;
    private String workerInstanceChargeType;
    /**
     * @return The instance type of worker node.
     * 
     */
    private List<String> workerInstanceTypes;
    /**
     * @return List of cluster worker nodes. It contains several attributes to `Block Nodes`.
     * 
     */
    private List<GetKubernetesClustersClusterWorkerNode> workerNodes;
    /**
     * @return The ECS instance node number in the current container cluster.
     * 
     */
    private List<Integer> workerNumbers;
    private Integer workerPeriod;
    private String workerPeriodUnit;

    private GetKubernetesClustersCluster() {}
    /**
     * @return The ID of availability zone.
     * 
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    public String clusterNetworkType() {
        return this.clusterNetworkType;
    }
    /**
     * @return Map of kubernetes cluster connection information. It contains several attributes to `Block Connections`.
     * 
     */
    public GetKubernetesClustersClusterConnections connections() {
        return this.connections;
    }
    /**
     * @return ID of the node.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of node image.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The keypair of ssh login cluster node, you have to create it first.
     * 
     */
    public String keyName() {
        return this.keyName;
    }
    /**
     * @return A list of one element containing information about the associated log store. It contains the following attributes:
     * 
     */
    public List<GetKubernetesClustersClusterLogConfig> logConfigs() {
        return this.logConfigs;
    }
    public Boolean masterAutoRenew() {
        return this.masterAutoRenew;
    }
    public Integer masterAutoRenewPeriod() {
        return this.masterAutoRenewPeriod;
    }
    /**
     * @return The system disk category of master node.
     * 
     */
    public String masterDiskCategory() {
        return this.masterDiskCategory;
    }
    /**
     * @return The system disk size of master node.
     * 
     */
    public Integer masterDiskSize() {
        return this.masterDiskSize;
    }
    public String masterInstanceChargeType() {
        return this.masterInstanceChargeType;
    }
    /**
     * @return The instance type of master node.
     * 
     */
    public List<String> masterInstanceTypes() {
        return this.masterInstanceTypes;
    }
    /**
     * @return List of cluster master nodes. It contains several attributes to `Block Nodes`.
     * 
     */
    public List<GetKubernetesClustersClusterMasterNode> masterNodes() {
        return this.masterNodes;
    }
    public Integer masterPeriod() {
        return this.masterPeriod;
    }
    public String masterPeriodUnit() {
        return this.masterPeriodUnit;
    }
    /**
     * @return Node name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of nat gateway used to launch kubernetes cluster.
     * 
     */
    public String natGatewayId() {
        return this.natGatewayId;
    }
    /**
     * @return The network mask used on pods for each node.
     * 
     */
    public Integer nodeCidrMask() {
        return this.nodeCidrMask;
    }
    public String podCidr() {
        return this.podCidr;
    }
    /**
     * @return The ID of security group where the current cluster worker node is located.
     * 
     */
    public String securityGroupId() {
        return this.securityGroupId;
    }
    public String serviceCidr() {
        return this.serviceCidr;
    }
    /**
     * @return Whether internet load balancer for API Server is created
     * 
     */
    public Boolean slbInternetEnabled() {
        return this.slbInternetEnabled;
    }
    /**
     * @return The ID of VPC where the current cluster is located.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The ID of VSwitches where the current cluster is located.
     * 
     */
    public List<String> vswitchIds() {
        return this.vswitchIds;
    }
    public Boolean workerAutoRenew() {
        return this.workerAutoRenew;
    }
    public Integer workerAutoRenewPeriod() {
        return this.workerAutoRenewPeriod;
    }
    /**
     * @return The data disk size of worker node.
     * 
     */
    public String workerDataDiskCategory() {
        return this.workerDataDiskCategory;
    }
    /**
     * @return The data disk category of worker node.
     * 
     */
    public Integer workerDataDiskSize() {
        return this.workerDataDiskSize;
    }
    /**
     * @return The system disk category of worker node.
     * 
     */
    public String workerDiskCategory() {
        return this.workerDiskCategory;
    }
    /**
     * @return The system disk size of worker node.
     * 
     */
    public Integer workerDiskSize() {
        return this.workerDiskSize;
    }
    public String workerInstanceChargeType() {
        return this.workerInstanceChargeType;
    }
    /**
     * @return The instance type of worker node.
     * 
     */
    public List<String> workerInstanceTypes() {
        return this.workerInstanceTypes;
    }
    /**
     * @return List of cluster worker nodes. It contains several attributes to `Block Nodes`.
     * 
     */
    public List<GetKubernetesClustersClusterWorkerNode> workerNodes() {
        return this.workerNodes;
    }
    /**
     * @return The ECS instance node number in the current container cluster.
     * 
     */
    public List<Integer> workerNumbers() {
        return this.workerNumbers;
    }
    public Integer workerPeriod() {
        return this.workerPeriod;
    }
    public String workerPeriodUnit() {
        return this.workerPeriodUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClustersCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String availabilityZone;
        private String clusterNetworkType;
        private GetKubernetesClustersClusterConnections connections;
        private String id;
        private String imageId;
        private String keyName;
        private List<GetKubernetesClustersClusterLogConfig> logConfigs;
        private Boolean masterAutoRenew;
        private Integer masterAutoRenewPeriod;
        private String masterDiskCategory;
        private Integer masterDiskSize;
        private String masterInstanceChargeType;
        private List<String> masterInstanceTypes;
        private List<GetKubernetesClustersClusterMasterNode> masterNodes;
        private Integer masterPeriod;
        private String masterPeriodUnit;
        private String name;
        private String natGatewayId;
        private Integer nodeCidrMask;
        private String podCidr;
        private String securityGroupId;
        private String serviceCidr;
        private Boolean slbInternetEnabled;
        private String vpcId;
        private List<String> vswitchIds;
        private Boolean workerAutoRenew;
        private Integer workerAutoRenewPeriod;
        private String workerDataDiskCategory;
        private Integer workerDataDiskSize;
        private String workerDiskCategory;
        private Integer workerDiskSize;
        private String workerInstanceChargeType;
        private List<String> workerInstanceTypes;
        private List<GetKubernetesClustersClusterWorkerNode> workerNodes;
        private List<Integer> workerNumbers;
        private Integer workerPeriod;
        private String workerPeriodUnit;
        public Builder() {}
        public Builder(GetKubernetesClustersCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.clusterNetworkType = defaults.clusterNetworkType;
    	      this.connections = defaults.connections;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.keyName = defaults.keyName;
    	      this.logConfigs = defaults.logConfigs;
    	      this.masterAutoRenew = defaults.masterAutoRenew;
    	      this.masterAutoRenewPeriod = defaults.masterAutoRenewPeriod;
    	      this.masterDiskCategory = defaults.masterDiskCategory;
    	      this.masterDiskSize = defaults.masterDiskSize;
    	      this.masterInstanceChargeType = defaults.masterInstanceChargeType;
    	      this.masterInstanceTypes = defaults.masterInstanceTypes;
    	      this.masterNodes = defaults.masterNodes;
    	      this.masterPeriod = defaults.masterPeriod;
    	      this.masterPeriodUnit = defaults.masterPeriodUnit;
    	      this.name = defaults.name;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.nodeCidrMask = defaults.nodeCidrMask;
    	      this.podCidr = defaults.podCidr;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.serviceCidr = defaults.serviceCidr;
    	      this.slbInternetEnabled = defaults.slbInternetEnabled;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchIds = defaults.vswitchIds;
    	      this.workerAutoRenew = defaults.workerAutoRenew;
    	      this.workerAutoRenewPeriod = defaults.workerAutoRenewPeriod;
    	      this.workerDataDiskCategory = defaults.workerDataDiskCategory;
    	      this.workerDataDiskSize = defaults.workerDataDiskSize;
    	      this.workerDiskCategory = defaults.workerDiskCategory;
    	      this.workerDiskSize = defaults.workerDiskSize;
    	      this.workerInstanceChargeType = defaults.workerInstanceChargeType;
    	      this.workerInstanceTypes = defaults.workerInstanceTypes;
    	      this.workerNodes = defaults.workerNodes;
    	      this.workerNumbers = defaults.workerNumbers;
    	      this.workerPeriod = defaults.workerPeriod;
    	      this.workerPeriodUnit = defaults.workerPeriodUnit;
        }

        @CustomType.Setter
        public Builder availabilityZone(String availabilityZone) {
            if (availabilityZone == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "availabilityZone");
            }
            this.availabilityZone = availabilityZone;
            return this;
        }
        @CustomType.Setter
        public Builder clusterNetworkType(String clusterNetworkType) {
            if (clusterNetworkType == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "clusterNetworkType");
            }
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }
        @CustomType.Setter
        public Builder connections(GetKubernetesClustersClusterConnections connections) {
            if (connections == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "connections");
            }
            this.connections = connections;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder imageId(String imageId) {
            if (imageId == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "imageId");
            }
            this.imageId = imageId;
            return this;
        }
        @CustomType.Setter
        public Builder keyName(String keyName) {
            if (keyName == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "keyName");
            }
            this.keyName = keyName;
            return this;
        }
        @CustomType.Setter
        public Builder logConfigs(List<GetKubernetesClustersClusterLogConfig> logConfigs) {
            if (logConfigs == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "logConfigs");
            }
            this.logConfigs = logConfigs;
            return this;
        }
        public Builder logConfigs(GetKubernetesClustersClusterLogConfig... logConfigs) {
            return logConfigs(List.of(logConfigs));
        }
        @CustomType.Setter
        public Builder masterAutoRenew(Boolean masterAutoRenew) {
            if (masterAutoRenew == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "masterAutoRenew");
            }
            this.masterAutoRenew = masterAutoRenew;
            return this;
        }
        @CustomType.Setter
        public Builder masterAutoRenewPeriod(Integer masterAutoRenewPeriod) {
            if (masterAutoRenewPeriod == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "masterAutoRenewPeriod");
            }
            this.masterAutoRenewPeriod = masterAutoRenewPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder masterDiskCategory(String masterDiskCategory) {
            if (masterDiskCategory == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "masterDiskCategory");
            }
            this.masterDiskCategory = masterDiskCategory;
            return this;
        }
        @CustomType.Setter
        public Builder masterDiskSize(Integer masterDiskSize) {
            if (masterDiskSize == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "masterDiskSize");
            }
            this.masterDiskSize = masterDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder masterInstanceChargeType(String masterInstanceChargeType) {
            if (masterInstanceChargeType == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "masterInstanceChargeType");
            }
            this.masterInstanceChargeType = masterInstanceChargeType;
            return this;
        }
        @CustomType.Setter
        public Builder masterInstanceTypes(List<String> masterInstanceTypes) {
            if (masterInstanceTypes == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "masterInstanceTypes");
            }
            this.masterInstanceTypes = masterInstanceTypes;
            return this;
        }
        public Builder masterInstanceTypes(String... masterInstanceTypes) {
            return masterInstanceTypes(List.of(masterInstanceTypes));
        }
        @CustomType.Setter
        public Builder masterNodes(List<GetKubernetesClustersClusterMasterNode> masterNodes) {
            if (masterNodes == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "masterNodes");
            }
            this.masterNodes = masterNodes;
            return this;
        }
        public Builder masterNodes(GetKubernetesClustersClusterMasterNode... masterNodes) {
            return masterNodes(List.of(masterNodes));
        }
        @CustomType.Setter
        public Builder masterPeriod(Integer masterPeriod) {
            if (masterPeriod == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "masterPeriod");
            }
            this.masterPeriod = masterPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder masterPeriodUnit(String masterPeriodUnit) {
            if (masterPeriodUnit == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "masterPeriodUnit");
            }
            this.masterPeriodUnit = masterPeriodUnit;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder natGatewayId(String natGatewayId) {
            if (natGatewayId == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "natGatewayId");
            }
            this.natGatewayId = natGatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder nodeCidrMask(Integer nodeCidrMask) {
            if (nodeCidrMask == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "nodeCidrMask");
            }
            this.nodeCidrMask = nodeCidrMask;
            return this;
        }
        @CustomType.Setter
        public Builder podCidr(String podCidr) {
            if (podCidr == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "podCidr");
            }
            this.podCidr = podCidr;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupId(String securityGroupId) {
            if (securityGroupId == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "securityGroupId");
            }
            this.securityGroupId = securityGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceCidr(String serviceCidr) {
            if (serviceCidr == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "serviceCidr");
            }
            this.serviceCidr = serviceCidr;
            return this;
        }
        @CustomType.Setter
        public Builder slbInternetEnabled(Boolean slbInternetEnabled) {
            if (slbInternetEnabled == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "slbInternetEnabled");
            }
            this.slbInternetEnabled = slbInternetEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchIds(List<String> vswitchIds) {
            if (vswitchIds == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "vswitchIds");
            }
            this.vswitchIds = vswitchIds;
            return this;
        }
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }
        @CustomType.Setter
        public Builder workerAutoRenew(Boolean workerAutoRenew) {
            if (workerAutoRenew == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerAutoRenew");
            }
            this.workerAutoRenew = workerAutoRenew;
            return this;
        }
        @CustomType.Setter
        public Builder workerAutoRenewPeriod(Integer workerAutoRenewPeriod) {
            if (workerAutoRenewPeriod == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerAutoRenewPeriod");
            }
            this.workerAutoRenewPeriod = workerAutoRenewPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder workerDataDiskCategory(String workerDataDiskCategory) {
            if (workerDataDiskCategory == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerDataDiskCategory");
            }
            this.workerDataDiskCategory = workerDataDiskCategory;
            return this;
        }
        @CustomType.Setter
        public Builder workerDataDiskSize(Integer workerDataDiskSize) {
            if (workerDataDiskSize == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerDataDiskSize");
            }
            this.workerDataDiskSize = workerDataDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder workerDiskCategory(String workerDiskCategory) {
            if (workerDiskCategory == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerDiskCategory");
            }
            this.workerDiskCategory = workerDiskCategory;
            return this;
        }
        @CustomType.Setter
        public Builder workerDiskSize(Integer workerDiskSize) {
            if (workerDiskSize == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerDiskSize");
            }
            this.workerDiskSize = workerDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder workerInstanceChargeType(String workerInstanceChargeType) {
            if (workerInstanceChargeType == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerInstanceChargeType");
            }
            this.workerInstanceChargeType = workerInstanceChargeType;
            return this;
        }
        @CustomType.Setter
        public Builder workerInstanceTypes(List<String> workerInstanceTypes) {
            if (workerInstanceTypes == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerInstanceTypes");
            }
            this.workerInstanceTypes = workerInstanceTypes;
            return this;
        }
        public Builder workerInstanceTypes(String... workerInstanceTypes) {
            return workerInstanceTypes(List.of(workerInstanceTypes));
        }
        @CustomType.Setter
        public Builder workerNodes(List<GetKubernetesClustersClusterWorkerNode> workerNodes) {
            if (workerNodes == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerNodes");
            }
            this.workerNodes = workerNodes;
            return this;
        }
        public Builder workerNodes(GetKubernetesClustersClusterWorkerNode... workerNodes) {
            return workerNodes(List.of(workerNodes));
        }
        @CustomType.Setter
        public Builder workerNumbers(List<Integer> workerNumbers) {
            if (workerNumbers == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerNumbers");
            }
            this.workerNumbers = workerNumbers;
            return this;
        }
        public Builder workerNumbers(Integer... workerNumbers) {
            return workerNumbers(List.of(workerNumbers));
        }
        @CustomType.Setter
        public Builder workerPeriod(Integer workerPeriod) {
            if (workerPeriod == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerPeriod");
            }
            this.workerPeriod = workerPeriod;
            return this;
        }
        @CustomType.Setter
        public Builder workerPeriodUnit(String workerPeriodUnit) {
            if (workerPeriodUnit == null) {
              throw new MissingRequiredPropertyException("GetKubernetesClustersCluster", "workerPeriodUnit");
            }
            this.workerPeriodUnit = workerPeriodUnit;
            return this;
        }
        public GetKubernetesClustersCluster build() {
            final var _resultValue = new GetKubernetesClustersCluster();
            _resultValue.availabilityZone = availabilityZone;
            _resultValue.clusterNetworkType = clusterNetworkType;
            _resultValue.connections = connections;
            _resultValue.id = id;
            _resultValue.imageId = imageId;
            _resultValue.keyName = keyName;
            _resultValue.logConfigs = logConfigs;
            _resultValue.masterAutoRenew = masterAutoRenew;
            _resultValue.masterAutoRenewPeriod = masterAutoRenewPeriod;
            _resultValue.masterDiskCategory = masterDiskCategory;
            _resultValue.masterDiskSize = masterDiskSize;
            _resultValue.masterInstanceChargeType = masterInstanceChargeType;
            _resultValue.masterInstanceTypes = masterInstanceTypes;
            _resultValue.masterNodes = masterNodes;
            _resultValue.masterPeriod = masterPeriod;
            _resultValue.masterPeriodUnit = masterPeriodUnit;
            _resultValue.name = name;
            _resultValue.natGatewayId = natGatewayId;
            _resultValue.nodeCidrMask = nodeCidrMask;
            _resultValue.podCidr = podCidr;
            _resultValue.securityGroupId = securityGroupId;
            _resultValue.serviceCidr = serviceCidr;
            _resultValue.slbInternetEnabled = slbInternetEnabled;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchIds = vswitchIds;
            _resultValue.workerAutoRenew = workerAutoRenew;
            _resultValue.workerAutoRenewPeriod = workerAutoRenewPeriod;
            _resultValue.workerDataDiskCategory = workerDataDiskCategory;
            _resultValue.workerDataDiskSize = workerDataDiskSize;
            _resultValue.workerDiskCategory = workerDiskCategory;
            _resultValue.workerDiskSize = workerDiskSize;
            _resultValue.workerInstanceChargeType = workerInstanceChargeType;
            _resultValue.workerInstanceTypes = workerInstanceTypes;
            _resultValue.workerNodes = workerNodes;
            _resultValue.workerNumbers = workerNumbers;
            _resultValue.workerPeriod = workerPeriod;
            _resultValue.workerPeriodUnit = workerPeriodUnit;
            return _resultValue;
        }
    }
}