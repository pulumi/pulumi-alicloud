// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterArgs Empty = new ClusterArgs();

    /**
     * The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
     * 
     */
    @Import(name="aclEntryLists")
    private @Nullable Output<List<String>> aclEntryLists;

    /**
     * @return The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
     * 
     */
    public Optional<Output<List<String>>> aclEntryLists() {
        return Optional.ofNullable(this.aclEntryLists);
    }

    /**
     * The alias of MSE Cluster.
     * 
     */
    @Import(name="clusterAliasName")
    private @Nullable Output<String> clusterAliasName;

    /**
     * @return The alias of MSE Cluster.
     * 
     */
    public Optional<Output<String>> clusterAliasName() {
        return Optional.ofNullable(this.clusterAliasName);
    }

    /**
     * The engine specification of MSE Cluster. **NOTE:** From version 1.188.0, `cluster_specification` can be modified. If you were an international user, please use the specification version ending with `_200_c`.Valid values:
     * - Professional Edition
     * - `MSE_SC_1_2_60_c`: 1C2G
     * - `MSE_SC_2_4_60_c`: 2C4G
     * - `MSE_SC_4_8_60_c`: 4C8G
     * - `MSE_SC_8_16_60_c`: 8C16G
     * - `MSE_SC_16_32_60_c`:16C32G
     * - `MSE_SC_1_2_200_c`: 1C2G
     * - `MSE_SC_2_4_200_c`: 2C4G
     * - `MSE_SC_4_8_200_c`: 4C8G
     * - `MSE_SC_8_16_200_c`: 8C16G
     * - `MSE_SC_16_32_200_c`:16C32G
     * - Developer Edition
     * - `MSE_SC_1_2_60_c`: 1C2G
     * - `MSE_SC_2_4_60_c`: 2C4G
     * - `MSE_SC_1_2_200_c`: 1C2G
     * - `MSE_SC_2_4_200_c`: 2C4G
     * - Serverless Edition
     * - `MSE_SC_SERVERLESS`: Available since v1.232.0
     * 
     */
    @Import(name="clusterSpecification", required=true)
    private Output<String> clusterSpecification;

    /**
     * @return The engine specification of MSE Cluster. **NOTE:** From version 1.188.0, `cluster_specification` can be modified. If you were an international user, please use the specification version ending with `_200_c`.Valid values:
     * - Professional Edition
     * - `MSE_SC_1_2_60_c`: 1C2G
     * - `MSE_SC_2_4_60_c`: 2C4G
     * - `MSE_SC_4_8_60_c`: 4C8G
     * - `MSE_SC_8_16_60_c`: 8C16G
     * - `MSE_SC_16_32_60_c`:16C32G
     * - `MSE_SC_1_2_200_c`: 1C2G
     * - `MSE_SC_2_4_200_c`: 2C4G
     * - `MSE_SC_4_8_200_c`: 4C8G
     * - `MSE_SC_8_16_200_c`: 8C16G
     * - `MSE_SC_16_32_200_c`:16C32G
     * - Developer Edition
     * - `MSE_SC_1_2_60_c`: 1C2G
     * - `MSE_SC_2_4_60_c`: 2C4G
     * - `MSE_SC_1_2_200_c`: 1C2G
     * - `MSE_SC_2_4_200_c`: 2C4G
     * - Serverless Edition
     * - `MSE_SC_SERVERLESS`: Available since v1.232.0
     * 
     */
    public Output<String> clusterSpecification() {
        return this.clusterSpecification;
    }

    /**
     * The type of MSE Cluster.
     * 
     */
    @Import(name="clusterType", required=true)
    private Output<String> clusterType;

    /**
     * @return The type of MSE Cluster.
     * 
     */
    public Output<String> clusterType() {
        return this.clusterType;
    }

    /**
     * The version of MSE Cluster. See [details](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createcluster)
     * 
     */
    @Import(name="clusterVersion", required=true)
    private Output<String> clusterVersion;

    /**
     * @return The version of MSE Cluster. See [details](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createcluster)
     * 
     */
    public Output<String> clusterVersion() {
        return this.clusterVersion;
    }

    /**
     * The connection type. Valid values: `slb`,`single_eni`(Available since v1.232.0). If your region is one of `ap-southeast-6、us-west-1、eu-central-1、us-east-1、ap-southeast-1`,and your cluster&#39;s mse_version is `mse_dev`,please use `single_eni`.
     * 
     */
    @Import(name="connectionType")
    private @Nullable Output<String> connectionType;

    /**
     * @return The connection type. Valid values: `slb`,`single_eni`(Available since v1.232.0). If your region is one of `ap-southeast-6、us-west-1、eu-central-1、us-east-1、ap-southeast-1`,and your cluster&#39;s mse_version is `mse_dev`,please use `single_eni`.
     * 
     */
    public Optional<Output<String>> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }

    /**
     * The type of Disk.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    /**
     * @return The type of Disk.
     * 
     */
    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * The count of instance. **NOTE:** From version 1.188.0, `instance_count` can be modified.
     * 
     */
    @Import(name="instanceCount", required=true)
    private Output<Integer> instanceCount;

    /**
     * @return The count of instance. **NOTE:** From version 1.188.0, `instance_count` can be modified.
     * 
     */
    public Output<Integer> instanceCount() {
        return this.instanceCount;
    }

    /**
     * The version of MSE. Valid values: `mse_dev` or `mse_pro` or `mse_serverless`(Available since v1.232.0).
     * 
     */
    @Import(name="mseVersion")
    private @Nullable Output<String> mseVersion;

    /**
     * @return The version of MSE. Valid values: `mse_dev` or `mse_pro` or `mse_serverless`(Available since v1.232.0).
     * 
     */
    public Optional<Output<String>> mseVersion() {
        return Optional.ofNullable(this.mseVersion);
    }

    /**
     * The type of network. Valid values: `privatenet` and `pubnet` and `both`(Available since v1.232.0).
     * 
     */
    @Import(name="netType", required=true)
    private Output<String> netType;

    /**
     * @return The type of network. Valid values: `privatenet` and `pubnet` and `both`(Available since v1.232.0).
     * 
     */
    public Output<String> netType() {
        return this.netType;
    }

    /**
     * Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The specification of private network SLB.
     * 
     */
    @Import(name="privateSlbSpecification")
    private @Nullable Output<String> privateSlbSpecification;

    /**
     * @return The specification of private network SLB.
     * 
     */
    public Optional<Output<String>> privateSlbSpecification() {
        return Optional.ofNullable(this.privateSlbSpecification);
    }

    /**
     * The public network bandwidth.
     * 
     */
    @Import(name="pubNetworkFlow", required=true)
    private Output<String> pubNetworkFlow;

    /**
     * @return The public network bandwidth.
     * 
     */
    public Output<String> pubNetworkFlow() {
        return this.pubNetworkFlow;
    }

    /**
     * The specification of public network SLB. Serverless Instance could ignore this parameter.
     * 
     */
    @Import(name="pubSlbSpecification")
    private @Nullable Output<String> pubSlbSpecification;

    /**
     * @return The specification of public network SLB. Serverless Instance could ignore this parameter.
     * 
     */
    public Optional<Output<String>> pubSlbSpecification() {
        return Optional.ofNullable(this.pubSlbSpecification);
    }

    /**
     * The extended request parameters in the JSON format.
     * 
     */
    @Import(name="requestPars")
    private @Nullable Output<String> requestPars;

    /**
     * @return The extended request parameters in the JSON format.
     * 
     */
    public Optional<Output<String>> requestPars() {
        return Optional.ofNullable(this.requestPars);
    }

    /**
     * The resource group of the resource.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The resource group of the resource.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The tag of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The id of the VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The id of the VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * The id of VSwitch.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The id of VSwitch.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private ClusterArgs() {}

    private ClusterArgs(ClusterArgs $) {
        this.aclEntryLists = $.aclEntryLists;
        this.clusterAliasName = $.clusterAliasName;
        this.clusterSpecification = $.clusterSpecification;
        this.clusterType = $.clusterType;
        this.clusterVersion = $.clusterVersion;
        this.connectionType = $.connectionType;
        this.diskType = $.diskType;
        this.instanceCount = $.instanceCount;
        this.mseVersion = $.mseVersion;
        this.netType = $.netType;
        this.paymentType = $.paymentType;
        this.privateSlbSpecification = $.privateSlbSpecification;
        this.pubNetworkFlow = $.pubNetworkFlow;
        this.pubSlbSpecification = $.pubSlbSpecification;
        this.requestPars = $.requestPars;
        this.resourceGroupId = $.resourceGroupId;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterArgs $;

        public Builder() {
            $ = new ClusterArgs();
        }

        public Builder(ClusterArgs defaults) {
            $ = new ClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclEntryLists The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
         * 
         * @return builder
         * 
         */
        public Builder aclEntryLists(@Nullable Output<List<String>> aclEntryLists) {
            $.aclEntryLists = aclEntryLists;
            return this;
        }

        /**
         * @param aclEntryLists The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
         * 
         * @return builder
         * 
         */
        public Builder aclEntryLists(List<String> aclEntryLists) {
            return aclEntryLists(Output.of(aclEntryLists));
        }

        /**
         * @param aclEntryLists The whitelist. **NOTE:** This attribute is invalid when the value of `pub_network_flow` is `0` and the value of `net_type` is `privatenet`.
         * 
         * @return builder
         * 
         */
        public Builder aclEntryLists(String... aclEntryLists) {
            return aclEntryLists(List.of(aclEntryLists));
        }

        /**
         * @param clusterAliasName The alias of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterAliasName(@Nullable Output<String> clusterAliasName) {
            $.clusterAliasName = clusterAliasName;
            return this;
        }

        /**
         * @param clusterAliasName The alias of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterAliasName(String clusterAliasName) {
            return clusterAliasName(Output.of(clusterAliasName));
        }

        /**
         * @param clusterSpecification The engine specification of MSE Cluster. **NOTE:** From version 1.188.0, `cluster_specification` can be modified. If you were an international user, please use the specification version ending with `_200_c`.Valid values:
         * - Professional Edition
         * - `MSE_SC_1_2_60_c`: 1C2G
         * - `MSE_SC_2_4_60_c`: 2C4G
         * - `MSE_SC_4_8_60_c`: 4C8G
         * - `MSE_SC_8_16_60_c`: 8C16G
         * - `MSE_SC_16_32_60_c`:16C32G
         * - `MSE_SC_1_2_200_c`: 1C2G
         * - `MSE_SC_2_4_200_c`: 2C4G
         * - `MSE_SC_4_8_200_c`: 4C8G
         * - `MSE_SC_8_16_200_c`: 8C16G
         * - `MSE_SC_16_32_200_c`:16C32G
         * - Developer Edition
         * - `MSE_SC_1_2_60_c`: 1C2G
         * - `MSE_SC_2_4_60_c`: 2C4G
         * - `MSE_SC_1_2_200_c`: 1C2G
         * - `MSE_SC_2_4_200_c`: 2C4G
         * - Serverless Edition
         * - `MSE_SC_SERVERLESS`: Available since v1.232.0
         * 
         * @return builder
         * 
         */
        public Builder clusterSpecification(Output<String> clusterSpecification) {
            $.clusterSpecification = clusterSpecification;
            return this;
        }

        /**
         * @param clusterSpecification The engine specification of MSE Cluster. **NOTE:** From version 1.188.0, `cluster_specification` can be modified. If you were an international user, please use the specification version ending with `_200_c`.Valid values:
         * - Professional Edition
         * - `MSE_SC_1_2_60_c`: 1C2G
         * - `MSE_SC_2_4_60_c`: 2C4G
         * - `MSE_SC_4_8_60_c`: 4C8G
         * - `MSE_SC_8_16_60_c`: 8C16G
         * - `MSE_SC_16_32_60_c`:16C32G
         * - `MSE_SC_1_2_200_c`: 1C2G
         * - `MSE_SC_2_4_200_c`: 2C4G
         * - `MSE_SC_4_8_200_c`: 4C8G
         * - `MSE_SC_8_16_200_c`: 8C16G
         * - `MSE_SC_16_32_200_c`:16C32G
         * - Developer Edition
         * - `MSE_SC_1_2_60_c`: 1C2G
         * - `MSE_SC_2_4_60_c`: 2C4G
         * - `MSE_SC_1_2_200_c`: 1C2G
         * - `MSE_SC_2_4_200_c`: 2C4G
         * - Serverless Edition
         * - `MSE_SC_SERVERLESS`: Available since v1.232.0
         * 
         * @return builder
         * 
         */
        public Builder clusterSpecification(String clusterSpecification) {
            return clusterSpecification(Output.of(clusterSpecification));
        }

        /**
         * @param clusterType The type of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(Output<String> clusterType) {
            $.clusterType = clusterType;
            return this;
        }

        /**
         * @param clusterType The type of MSE Cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(String clusterType) {
            return clusterType(Output.of(clusterType));
        }

        /**
         * @param clusterVersion The version of MSE Cluster. See [details](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createcluster)
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(Output<String> clusterVersion) {
            $.clusterVersion = clusterVersion;
            return this;
        }

        /**
         * @param clusterVersion The version of MSE Cluster. See [details](https://www.alibabacloud.com/help/en/mse/developer-reference/api-mse-2019-05-31-createcluster)
         * 
         * @return builder
         * 
         */
        public Builder clusterVersion(String clusterVersion) {
            return clusterVersion(Output.of(clusterVersion));
        }

        /**
         * @param connectionType The connection type. Valid values: `slb`,`single_eni`(Available since v1.232.0). If your region is one of `ap-southeast-6、us-west-1、eu-central-1、us-east-1、ap-southeast-1`,and your cluster&#39;s mse_version is `mse_dev`,please use `single_eni`.
         * 
         * @return builder
         * 
         */
        public Builder connectionType(@Nullable Output<String> connectionType) {
            $.connectionType = connectionType;
            return this;
        }

        /**
         * @param connectionType The connection type. Valid values: `slb`,`single_eni`(Available since v1.232.0). If your region is one of `ap-southeast-6、us-west-1、eu-central-1、us-east-1、ap-southeast-1`,and your cluster&#39;s mse_version is `mse_dev`,please use `single_eni`.
         * 
         * @return builder
         * 
         */
        public Builder connectionType(String connectionType) {
            return connectionType(Output.of(connectionType));
        }

        /**
         * @param diskType The type of Disk.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType The type of Disk.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param instanceCount The count of instance. **NOTE:** From version 1.188.0, `instance_count` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount The count of instance. **NOTE:** From version 1.188.0, `instance_count` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param mseVersion The version of MSE. Valid values: `mse_dev` or `mse_pro` or `mse_serverless`(Available since v1.232.0).
         * 
         * @return builder
         * 
         */
        public Builder mseVersion(@Nullable Output<String> mseVersion) {
            $.mseVersion = mseVersion;
            return this;
        }

        /**
         * @param mseVersion The version of MSE. Valid values: `mse_dev` or `mse_pro` or `mse_serverless`(Available since v1.232.0).
         * 
         * @return builder
         * 
         */
        public Builder mseVersion(String mseVersion) {
            return mseVersion(Output.of(mseVersion));
        }

        /**
         * @param netType The type of network. Valid values: `privatenet` and `pubnet` and `both`(Available since v1.232.0).
         * 
         * @return builder
         * 
         */
        public Builder netType(Output<String> netType) {
            $.netType = netType;
            return this;
        }

        /**
         * @param netType The type of network. Valid values: `privatenet` and `pubnet` and `both`(Available since v1.232.0).
         * 
         * @return builder
         * 
         */
        public Builder netType(String netType) {
            return netType(Output.of(netType));
        }

        /**
         * @param paymentType Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType Payment type: Subscription (prepaid), PayAsYouGo (postpaid). Default PayAsYouGo.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param privateSlbSpecification The specification of private network SLB.
         * 
         * @return builder
         * 
         */
        public Builder privateSlbSpecification(@Nullable Output<String> privateSlbSpecification) {
            $.privateSlbSpecification = privateSlbSpecification;
            return this;
        }

        /**
         * @param privateSlbSpecification The specification of private network SLB.
         * 
         * @return builder
         * 
         */
        public Builder privateSlbSpecification(String privateSlbSpecification) {
            return privateSlbSpecification(Output.of(privateSlbSpecification));
        }

        /**
         * @param pubNetworkFlow The public network bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder pubNetworkFlow(Output<String> pubNetworkFlow) {
            $.pubNetworkFlow = pubNetworkFlow;
            return this;
        }

        /**
         * @param pubNetworkFlow The public network bandwidth.
         * 
         * @return builder
         * 
         */
        public Builder pubNetworkFlow(String pubNetworkFlow) {
            return pubNetworkFlow(Output.of(pubNetworkFlow));
        }

        /**
         * @param pubSlbSpecification The specification of public network SLB. Serverless Instance could ignore this parameter.
         * 
         * @return builder
         * 
         */
        public Builder pubSlbSpecification(@Nullable Output<String> pubSlbSpecification) {
            $.pubSlbSpecification = pubSlbSpecification;
            return this;
        }

        /**
         * @param pubSlbSpecification The specification of public network SLB. Serverless Instance could ignore this parameter.
         * 
         * @return builder
         * 
         */
        public Builder pubSlbSpecification(String pubSlbSpecification) {
            return pubSlbSpecification(Output.of(pubSlbSpecification));
        }

        /**
         * @param requestPars The extended request parameters in the JSON format.
         * 
         * @return builder
         * 
         */
        public Builder requestPars(@Nullable Output<String> requestPars) {
            $.requestPars = requestPars;
            return this;
        }

        /**
         * @param requestPars The extended request parameters in the JSON format.
         * 
         * @return builder
         * 
         */
        public Builder requestPars(String requestPars) {
            return requestPars(Output.of(requestPars));
        }

        /**
         * @param resourceGroupId The resource group of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The resource group of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId The id of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The id of the VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitchId The id of VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The id of VSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public ClusterArgs build() {
            if ($.clusterSpecification == null) {
                throw new MissingRequiredPropertyException("ClusterArgs", "clusterSpecification");
            }
            if ($.clusterType == null) {
                throw new MissingRequiredPropertyException("ClusterArgs", "clusterType");
            }
            if ($.clusterVersion == null) {
                throw new MissingRequiredPropertyException("ClusterArgs", "clusterVersion");
            }
            if ($.instanceCount == null) {
                throw new MissingRequiredPropertyException("ClusterArgs", "instanceCount");
            }
            if ($.netType == null) {
                throw new MissingRequiredPropertyException("ClusterArgs", "netType");
            }
            if ($.pubNetworkFlow == null) {
                throw new MissingRequiredPropertyException("ClusterArgs", "pubNetworkFlow");
            }
            return $;
        }
    }

}
