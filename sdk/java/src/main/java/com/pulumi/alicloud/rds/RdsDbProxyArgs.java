// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds;

import com.pulumi.alicloud.rds.inputs.RdsDbProxyReadOnlyInstanceWeightArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RdsDbProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RdsDbProxyArgs Empty = new RdsDbProxyArgs();

    /**
     * The port number that is associated with the proxy endpoint.
     * 
     */
    @Import(name="dbProxyConnectStringPort")
    private @Nullable Output<Integer> dbProxyConnectStringPort;

    /**
     * @return The port number that is associated with the proxy endpoint.
     * 
     */
    public Optional<Output<Integer>> dbProxyConnectStringPort() {
        return Optional.ofNullable(this.dbProxyConnectStringPort);
    }

    /**
     * The new prefix of the proxy endpoint. Enter a prefix.
     * 
     */
    @Import(name="dbProxyConnectionPrefix")
    private @Nullable Output<String> dbProxyConnectionPrefix;

    /**
     * @return The new prefix of the proxy endpoint. Enter a prefix.
     * 
     */
    public Optional<Output<String>> dbProxyConnectionPrefix() {
        return Optional.ofNullable(this.dbProxyConnectionPrefix);
    }

    /**
     * The read and write attributes of the proxy terminal. Valid values:
     * - ReadWrite: The proxy terminal connects to the primary instance and can receive both read and write requests.
     * - ReadOnly: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.
     * 
     * &gt; **NOTE:** Note This setting causes your instance to restart. Proceed with caution.
     * 
     */
    @Import(name="dbProxyEndpointReadWriteMode")
    private @Nullable Output<String> dbProxyEndpointReadWriteMode;

    /**
     * @return The read and write attributes of the proxy terminal. Valid values:
     * - ReadWrite: The proxy terminal connects to the primary instance and can receive both read and write requests.
     * - ReadOnly: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.
     * 
     * &gt; **NOTE:** Note This setting causes your instance to restart. Proceed with caution.
     * 
     */
    public Optional<Output<String>> dbProxyEndpointReadWriteMode() {
        return Optional.ofNullable(this.dbProxyEndpointReadWriteMode);
    }

    /**
     * The features that you want to enable for the proxy endpoint. If you specify more than one feature, separate the features with semicolons (;). Format: Feature 1:Status;Feature 2:Status;.... Do not add a semicolon (;) at the end of the last value. Valid feature values:
     * - ReadWriteSpliting: read/write splitting.
     * - ConnectionPersist: connection pooling.
     * - TransactionReadSqlRouteOptimizeStatus: transaction splitting.
     *   Valid status values:
     * - 1: enabled.
     * - 0: disabled.
     * 
     * &gt; **NOTE:** Note You must specify this parameter only when the read/write splitting feature is enabled.
     * 
     */
    @Import(name="dbProxyFeatures")
    private @Nullable Output<String> dbProxyFeatures;

    /**
     * @return The features that you want to enable for the proxy endpoint. If you specify more than one feature, separate the features with semicolons (;). Format: Feature 1:Status;Feature 2:Status;.... Do not add a semicolon (;) at the end of the last value. Valid feature values:
     * - ReadWriteSpliting: read/write splitting.
     * - ConnectionPersist: connection pooling.
     * - TransactionReadSqlRouteOptimizeStatus: transaction splitting.
     *   Valid status values:
     * - 1: enabled.
     * - 0: disabled.
     * 
     * &gt; **NOTE:** Note You must specify this parameter only when the read/write splitting feature is enabled.
     * 
     */
    public Optional<Output<String>> dbProxyFeatures() {
        return Optional.ofNullable(this.dbProxyFeatures);
    }

    /**
     * The number of proxy instances that are enabled. Valid values: 1 to 60.
     * 
     */
    @Import(name="dbProxyInstanceNum", required=true)
    private Output<Integer> dbProxyInstanceNum;

    /**
     * @return The number of proxy instances that are enabled. Valid values: 1 to 60.
     * 
     */
    public Output<Integer> dbProxyInstanceNum() {
        return this.dbProxyInstanceNum;
    }

    /**
     * The SSL configuration setting that you want to apply on the instance. Valid values:
     * - Close: disables SSL encryption.
     * - Open: enables SSL encryption or modifies the endpoint that requires SSL encryption.
     * - Update: updates the validity period of the SSL certificate.
     * 
     */
    @Import(name="dbProxySslEnabled")
    private @Nullable Output<String> dbProxySslEnabled;

    /**
     * @return The SSL configuration setting that you want to apply on the instance. Valid values:
     * - Close: disables SSL encryption.
     * - Open: enables SSL encryption or modifies the endpoint that requires SSL encryption.
     * - Update: updates the validity period of the SSL certificate.
     * 
     */
    public Optional<Output<String>> dbProxySslEnabled() {
        return Optional.ofNullable(this.dbProxySslEnabled);
    }

    /**
     * The point in time at which you want to apply the new database proxy settings. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     * 
     */
    @Import(name="effectiveSpecificTime")
    private @Nullable Output<String> effectiveSpecificTime;

    /**
     * @return The point in time at which you want to apply the new database proxy settings. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     * 
     */
    public Optional<Output<String>> effectiveSpecificTime() {
        return Optional.ofNullable(this.effectiveSpecificTime);
    }

    /**
     * When modifying the number of proxy instances,The time when you want to apply the new database proxy settings.Valid values:
     * - Immediate: ApsaraDB RDS immediately applies the new settings.
     * - MaintainTime: ApsaraDB RDS applies the new settings during the maintenance window that you specified. For more information, see Modify the maintenance window.
     * - SpecificTime: ApsaraDB RDS applies the new settings at a specified point in time.
     * 
     * &gt; **NOTE:** Note If you set the EffectiveTime parameter to SpecificTime, you must specify the EffectiveSpecificTime parameter.
     * 
     */
    @Import(name="effectiveTime")
    private @Nullable Output<String> effectiveTime;

    /**
     * @return When modifying the number of proxy instances,The time when you want to apply the new database proxy settings.Valid values:
     * - Immediate: ApsaraDB RDS immediately applies the new settings.
     * - MaintainTime: ApsaraDB RDS applies the new settings during the maintenance window that you specified. For more information, see Modify the maintenance window.
     * - SpecificTime: ApsaraDB RDS applies the new settings at a specified point in time.
     * 
     * &gt; **NOTE:** Note If you set the EffectiveTime parameter to SpecificTime, you must specify the EffectiveSpecificTime parameter.
     * 
     */
    public Optional<Output<String>> effectiveTime() {
        return Optional.ofNullable(this.effectiveTime);
    }

    /**
     * The Id of instance that can run database.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The Id of instance that can run database.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The network type of the instance. Set the value to VPC.
     * 
     */
    @Import(name="instanceNetworkType", required=true)
    private Output<String> instanceNetworkType;

    /**
     * @return The network type of the instance. Set the value to VPC.
     * 
     */
    public Output<String> instanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * The policy that is used to allocate read weights. Valid values:
     * - Standard: ApsaraDB RDS automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.
     * - Custom: You must manually allocate read weights to the instance and its read-only instances.
     * 
     * &gt; **NOTE:** Note If you set the ReadOnlyInstanceDistributionType parameter to Custom, you must specify the ReadOnlyInstanceWeight parameter.
     * 
     */
    @Import(name="readOnlyInstanceDistributionType")
    private @Nullable Output<String> readOnlyInstanceDistributionType;

    /**
     * @return The policy that is used to allocate read weights. Valid values:
     * - Standard: ApsaraDB RDS automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.
     * - Custom: You must manually allocate read weights to the instance and its read-only instances.
     * 
     * &gt; **NOTE:** Note If you set the ReadOnlyInstanceDistributionType parameter to Custom, you must specify the ReadOnlyInstanceWeight parameter.
     * 
     */
    public Optional<Output<String>> readOnlyInstanceDistributionType() {
        return Optional.ofNullable(this.readOnlyInstanceDistributionType);
    }

    /**
     * The maximum latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, ApsaraDB RDS no longer forwards read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained. Unit: seconds. Valid values: 0 to 3600.
     * 
     * &gt; **NOTE:** Note If the instance runs PostgreSQL, you can enable only the read/write splitting feature, which is specified by ReadWriteSpliting.
     * 
     */
    @Import(name="readOnlyInstanceMaxDelayTime")
    private @Nullable Output<Integer> readOnlyInstanceMaxDelayTime;

    /**
     * @return The maximum latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, ApsaraDB RDS no longer forwards read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained. Unit: seconds. Valid values: 0 to 3600.
     * 
     * &gt; **NOTE:** Note If the instance runs PostgreSQL, you can enable only the read/write splitting feature, which is specified by ReadWriteSpliting.
     * 
     */
    public Optional<Output<Integer>> readOnlyInstanceMaxDelayTime() {
        return Optional.ofNullable(this.readOnlyInstanceMaxDelayTime);
    }

    /**
     * A list of the read weights of the instance and its read-only instances.  It contains two sub-fields(instance_id and weight). Read weights increase in increments of 100, and the maximum read weight is 10000. See `read_only_instance_weight` below.
     * 
     */
    @Import(name="readOnlyInstanceWeights")
    private @Nullable Output<List<RdsDbProxyReadOnlyInstanceWeightArgs>> readOnlyInstanceWeights;

    /**
     * @return A list of the read weights of the instance and its read-only instances.  It contains two sub-fields(instance_id and weight). Read weights increase in increments of 100, and the maximum read weight is 10000. See `read_only_instance_weight` below.
     * 
     */
    public Optional<Output<List<RdsDbProxyReadOnlyInstanceWeightArgs>>> readOnlyInstanceWeights() {
        return Optional.ofNullable(this.readOnlyInstanceWeights);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The point in time at which you want to upgrade the database proxy version of the instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     * 
     */
    @Import(name="switchTime")
    private @Nullable Output<String> switchTime;

    /**
     * @return The point in time at which you want to upgrade the database proxy version of the instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
     * 
     */
    public Optional<Output<String>> switchTime() {
        return Optional.ofNullable(this.switchTime);
    }

    /**
     * The time when you want to upgrade the database proxy version of the instance. Valid values:
     * - MaintainTime: ApsaraDB RDS performs the upgrade during the maintenance window that you specified. This is the default value. For more information, see Modify the maintenance window.
     * - Immediate: ApsaraDB RDS immediately performs the upgrade.
     * - SpecificTime: ApsaraDB RDS performs the upgrade at a specified point in time.
     * 
     */
    @Import(name="upgradeTime")
    private @Nullable Output<String> upgradeTime;

    /**
     * @return The time when you want to upgrade the database proxy version of the instance. Valid values:
     * - MaintainTime: ApsaraDB RDS performs the upgrade during the maintenance window that you specified. This is the default value. For more information, see Modify the maintenance window.
     * - Immediate: ApsaraDB RDS immediately performs the upgrade.
     * - SpecificTime: ApsaraDB RDS performs the upgrade at a specified point in time.
     * 
     */
    public Optional<Output<String>> upgradeTime() {
        return Optional.ofNullable(this.upgradeTime);
    }

    /**
     * The ID of the virtual private cloud (VPC) to which the instance belongs.
     * 
     */
    @Import(name="vpcId", required=true)
    private Output<String> vpcId;

    /**
     * @return The ID of the virtual private cloud (VPC) to which the instance belongs.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     * The ID of the vSwitch that is associated with the specified VPC.
     * 
     */
    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    /**
     * @return The ID of the vSwitch that is associated with the specified VPC.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    private RdsDbProxyArgs() {}

    private RdsDbProxyArgs(RdsDbProxyArgs $) {
        this.dbProxyConnectStringPort = $.dbProxyConnectStringPort;
        this.dbProxyConnectionPrefix = $.dbProxyConnectionPrefix;
        this.dbProxyEndpointReadWriteMode = $.dbProxyEndpointReadWriteMode;
        this.dbProxyFeatures = $.dbProxyFeatures;
        this.dbProxyInstanceNum = $.dbProxyInstanceNum;
        this.dbProxySslEnabled = $.dbProxySslEnabled;
        this.effectiveSpecificTime = $.effectiveSpecificTime;
        this.effectiveTime = $.effectiveTime;
        this.instanceId = $.instanceId;
        this.instanceNetworkType = $.instanceNetworkType;
        this.readOnlyInstanceDistributionType = $.readOnlyInstanceDistributionType;
        this.readOnlyInstanceMaxDelayTime = $.readOnlyInstanceMaxDelayTime;
        this.readOnlyInstanceWeights = $.readOnlyInstanceWeights;
        this.resourceGroupId = $.resourceGroupId;
        this.switchTime = $.switchTime;
        this.upgradeTime = $.upgradeTime;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RdsDbProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RdsDbProxyArgs $;

        public Builder() {
            $ = new RdsDbProxyArgs();
        }

        public Builder(RdsDbProxyArgs defaults) {
            $ = new RdsDbProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbProxyConnectStringPort The port number that is associated with the proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyConnectStringPort(@Nullable Output<Integer> dbProxyConnectStringPort) {
            $.dbProxyConnectStringPort = dbProxyConnectStringPort;
            return this;
        }

        /**
         * @param dbProxyConnectStringPort The port number that is associated with the proxy endpoint.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyConnectStringPort(Integer dbProxyConnectStringPort) {
            return dbProxyConnectStringPort(Output.of(dbProxyConnectStringPort));
        }

        /**
         * @param dbProxyConnectionPrefix The new prefix of the proxy endpoint. Enter a prefix.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyConnectionPrefix(@Nullable Output<String> dbProxyConnectionPrefix) {
            $.dbProxyConnectionPrefix = dbProxyConnectionPrefix;
            return this;
        }

        /**
         * @param dbProxyConnectionPrefix The new prefix of the proxy endpoint. Enter a prefix.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyConnectionPrefix(String dbProxyConnectionPrefix) {
            return dbProxyConnectionPrefix(Output.of(dbProxyConnectionPrefix));
        }

        /**
         * @param dbProxyEndpointReadWriteMode The read and write attributes of the proxy terminal. Valid values:
         * - ReadWrite: The proxy terminal connects to the primary instance and can receive both read and write requests.
         * - ReadOnly: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.
         * 
         * &gt; **NOTE:** Note This setting causes your instance to restart. Proceed with caution.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyEndpointReadWriteMode(@Nullable Output<String> dbProxyEndpointReadWriteMode) {
            $.dbProxyEndpointReadWriteMode = dbProxyEndpointReadWriteMode;
            return this;
        }

        /**
         * @param dbProxyEndpointReadWriteMode The read and write attributes of the proxy terminal. Valid values:
         * - ReadWrite: The proxy terminal connects to the primary instance and can receive both read and write requests.
         * - ReadOnly: The proxy terminal does not connect to the primary instance and can receive only read requests. This is the default value.
         * 
         * &gt; **NOTE:** Note This setting causes your instance to restart. Proceed with caution.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyEndpointReadWriteMode(String dbProxyEndpointReadWriteMode) {
            return dbProxyEndpointReadWriteMode(Output.of(dbProxyEndpointReadWriteMode));
        }

        /**
         * @param dbProxyFeatures The features that you want to enable for the proxy endpoint. If you specify more than one feature, separate the features with semicolons (;). Format: Feature 1:Status;Feature 2:Status;.... Do not add a semicolon (;) at the end of the last value. Valid feature values:
         * - ReadWriteSpliting: read/write splitting.
         * - ConnectionPersist: connection pooling.
         * - TransactionReadSqlRouteOptimizeStatus: transaction splitting.
         *   Valid status values:
         * - 1: enabled.
         * - 0: disabled.
         * 
         * &gt; **NOTE:** Note You must specify this parameter only when the read/write splitting feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyFeatures(@Nullable Output<String> dbProxyFeatures) {
            $.dbProxyFeatures = dbProxyFeatures;
            return this;
        }

        /**
         * @param dbProxyFeatures The features that you want to enable for the proxy endpoint. If you specify more than one feature, separate the features with semicolons (;). Format: Feature 1:Status;Feature 2:Status;.... Do not add a semicolon (;) at the end of the last value. Valid feature values:
         * - ReadWriteSpliting: read/write splitting.
         * - ConnectionPersist: connection pooling.
         * - TransactionReadSqlRouteOptimizeStatus: transaction splitting.
         *   Valid status values:
         * - 1: enabled.
         * - 0: disabled.
         * 
         * &gt; **NOTE:** Note You must specify this parameter only when the read/write splitting feature is enabled.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyFeatures(String dbProxyFeatures) {
            return dbProxyFeatures(Output.of(dbProxyFeatures));
        }

        /**
         * @param dbProxyInstanceNum The number of proxy instances that are enabled. Valid values: 1 to 60.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyInstanceNum(Output<Integer> dbProxyInstanceNum) {
            $.dbProxyInstanceNum = dbProxyInstanceNum;
            return this;
        }

        /**
         * @param dbProxyInstanceNum The number of proxy instances that are enabled. Valid values: 1 to 60.
         * 
         * @return builder
         * 
         */
        public Builder dbProxyInstanceNum(Integer dbProxyInstanceNum) {
            return dbProxyInstanceNum(Output.of(dbProxyInstanceNum));
        }

        /**
         * @param dbProxySslEnabled The SSL configuration setting that you want to apply on the instance. Valid values:
         * - Close: disables SSL encryption.
         * - Open: enables SSL encryption or modifies the endpoint that requires SSL encryption.
         * - Update: updates the validity period of the SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder dbProxySslEnabled(@Nullable Output<String> dbProxySslEnabled) {
            $.dbProxySslEnabled = dbProxySslEnabled;
            return this;
        }

        /**
         * @param dbProxySslEnabled The SSL configuration setting that you want to apply on the instance. Valid values:
         * - Close: disables SSL encryption.
         * - Open: enables SSL encryption or modifies the endpoint that requires SSL encryption.
         * - Update: updates the validity period of the SSL certificate.
         * 
         * @return builder
         * 
         */
        public Builder dbProxySslEnabled(String dbProxySslEnabled) {
            return dbProxySslEnabled(Output.of(dbProxySslEnabled));
        }

        /**
         * @param effectiveSpecificTime The point in time at which you want to apply the new database proxy settings. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * @return builder
         * 
         */
        public Builder effectiveSpecificTime(@Nullable Output<String> effectiveSpecificTime) {
            $.effectiveSpecificTime = effectiveSpecificTime;
            return this;
        }

        /**
         * @param effectiveSpecificTime The point in time at which you want to apply the new database proxy settings. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * @return builder
         * 
         */
        public Builder effectiveSpecificTime(String effectiveSpecificTime) {
            return effectiveSpecificTime(Output.of(effectiveSpecificTime));
        }

        /**
         * @param effectiveTime When modifying the number of proxy instances,The time when you want to apply the new database proxy settings.Valid values:
         * - Immediate: ApsaraDB RDS immediately applies the new settings.
         * - MaintainTime: ApsaraDB RDS applies the new settings during the maintenance window that you specified. For more information, see Modify the maintenance window.
         * - SpecificTime: ApsaraDB RDS applies the new settings at a specified point in time.
         * 
         * &gt; **NOTE:** Note If you set the EffectiveTime parameter to SpecificTime, you must specify the EffectiveSpecificTime parameter.
         * 
         * @return builder
         * 
         */
        public Builder effectiveTime(@Nullable Output<String> effectiveTime) {
            $.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * @param effectiveTime When modifying the number of proxy instances,The time when you want to apply the new database proxy settings.Valid values:
         * - Immediate: ApsaraDB RDS immediately applies the new settings.
         * - MaintainTime: ApsaraDB RDS applies the new settings during the maintenance window that you specified. For more information, see Modify the maintenance window.
         * - SpecificTime: ApsaraDB RDS applies the new settings at a specified point in time.
         * 
         * &gt; **NOTE:** Note If you set the EffectiveTime parameter to SpecificTime, you must specify the EffectiveSpecificTime parameter.
         * 
         * @return builder
         * 
         */
        public Builder effectiveTime(String effectiveTime) {
            return effectiveTime(Output.of(effectiveTime));
        }

        /**
         * @param instanceId The Id of instance that can run database.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The Id of instance that can run database.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instanceNetworkType The network type of the instance. Set the value to VPC.
         * 
         * @return builder
         * 
         */
        public Builder instanceNetworkType(Output<String> instanceNetworkType) {
            $.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * @param instanceNetworkType The network type of the instance. Set the value to VPC.
         * 
         * @return builder
         * 
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            return instanceNetworkType(Output.of(instanceNetworkType));
        }

        /**
         * @param readOnlyInstanceDistributionType The policy that is used to allocate read weights. Valid values:
         * - Standard: ApsaraDB RDS automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.
         * - Custom: You must manually allocate read weights to the instance and its read-only instances.
         * 
         * &gt; **NOTE:** Note If you set the ReadOnlyInstanceDistributionType parameter to Custom, you must specify the ReadOnlyInstanceWeight parameter.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyInstanceDistributionType(@Nullable Output<String> readOnlyInstanceDistributionType) {
            $.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
            return this;
        }

        /**
         * @param readOnlyInstanceDistributionType The policy that is used to allocate read weights. Valid values:
         * - Standard: ApsaraDB RDS automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.
         * - Custom: You must manually allocate read weights to the instance and its read-only instances.
         * 
         * &gt; **NOTE:** Note If you set the ReadOnlyInstanceDistributionType parameter to Custom, you must specify the ReadOnlyInstanceWeight parameter.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
            return readOnlyInstanceDistributionType(Output.of(readOnlyInstanceDistributionType));
        }

        /**
         * @param readOnlyInstanceMaxDelayTime The maximum latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, ApsaraDB RDS no longer forwards read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained. Unit: seconds. Valid values: 0 to 3600.
         * 
         * &gt; **NOTE:** Note If the instance runs PostgreSQL, you can enable only the read/write splitting feature, which is specified by ReadWriteSpliting.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyInstanceMaxDelayTime(@Nullable Output<Integer> readOnlyInstanceMaxDelayTime) {
            $.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
            return this;
        }

        /**
         * @param readOnlyInstanceMaxDelayTime The maximum latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the threshold that you specified, ApsaraDB RDS no longer forwards read requests to the read-only instance. If you do not specify this parameter, the default value of this parameter is retained. Unit: seconds. Valid values: 0 to 3600.
         * 
         * &gt; **NOTE:** Note If the instance runs PostgreSQL, you can enable only the read/write splitting feature, which is specified by ReadWriteSpliting.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyInstanceMaxDelayTime(Integer readOnlyInstanceMaxDelayTime) {
            return readOnlyInstanceMaxDelayTime(Output.of(readOnlyInstanceMaxDelayTime));
        }

        /**
         * @param readOnlyInstanceWeights A list of the read weights of the instance and its read-only instances.  It contains two sub-fields(instance_id and weight). Read weights increase in increments of 100, and the maximum read weight is 10000. See `read_only_instance_weight` below.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyInstanceWeights(@Nullable Output<List<RdsDbProxyReadOnlyInstanceWeightArgs>> readOnlyInstanceWeights) {
            $.readOnlyInstanceWeights = readOnlyInstanceWeights;
            return this;
        }

        /**
         * @param readOnlyInstanceWeights A list of the read weights of the instance and its read-only instances.  It contains two sub-fields(instance_id and weight). Read weights increase in increments of 100, and the maximum read weight is 10000. See `read_only_instance_weight` below.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyInstanceWeights(List<RdsDbProxyReadOnlyInstanceWeightArgs> readOnlyInstanceWeights) {
            return readOnlyInstanceWeights(Output.of(readOnlyInstanceWeights));
        }

        /**
         * @param readOnlyInstanceWeights A list of the read weights of the instance and its read-only instances.  It contains two sub-fields(instance_id and weight). Read weights increase in increments of 100, and the maximum read weight is 10000. See `read_only_instance_weight` below.
         * 
         * @return builder
         * 
         */
        public Builder readOnlyInstanceWeights(RdsDbProxyReadOnlyInstanceWeightArgs... readOnlyInstanceWeights) {
            return readOnlyInstanceWeights(List.of(readOnlyInstanceWeights));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param switchTime The point in time at which you want to upgrade the database proxy version of the instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * @return builder
         * 
         */
        public Builder switchTime(@Nullable Output<String> switchTime) {
            $.switchTime = switchTime;
            return this;
        }

        /**
         * @param switchTime The point in time at which you want to upgrade the database proxy version of the instance. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * 
         * @return builder
         * 
         */
        public Builder switchTime(String switchTime) {
            return switchTime(Output.of(switchTime));
        }

        /**
         * @param upgradeTime The time when you want to upgrade the database proxy version of the instance. Valid values:
         * - MaintainTime: ApsaraDB RDS performs the upgrade during the maintenance window that you specified. This is the default value. For more information, see Modify the maintenance window.
         * - Immediate: ApsaraDB RDS immediately performs the upgrade.
         * - SpecificTime: ApsaraDB RDS performs the upgrade at a specified point in time.
         * 
         * @return builder
         * 
         */
        public Builder upgradeTime(@Nullable Output<String> upgradeTime) {
            $.upgradeTime = upgradeTime;
            return this;
        }

        /**
         * @param upgradeTime The time when you want to upgrade the database proxy version of the instance. Valid values:
         * - MaintainTime: ApsaraDB RDS performs the upgrade during the maintenance window that you specified. This is the default value. For more information, see Modify the maintenance window.
         * - Immediate: ApsaraDB RDS immediately performs the upgrade.
         * - SpecificTime: ApsaraDB RDS performs the upgrade at a specified point in time.
         * 
         * @return builder
         * 
         */
        public Builder upgradeTime(String upgradeTime) {
            return upgradeTime(Output.of(upgradeTime));
        }

        /**
         * @param vpcId The ID of the virtual private cloud (VPC) to which the instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the virtual private cloud (VPC) to which the instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitchId The ID of the vSwitch that is associated with the specified VPC.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the vSwitch that is associated with the specified VPC.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public RdsDbProxyArgs build() {
            if ($.dbProxyInstanceNum == null) {
                throw new MissingRequiredPropertyException("RdsDbProxyArgs", "dbProxyInstanceNum");
            }
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("RdsDbProxyArgs", "instanceId");
            }
            if ($.instanceNetworkType == null) {
                throw new MissingRequiredPropertyException("RdsDbProxyArgs", "instanceNetworkType");
            }
            if ($.vpcId == null) {
                throw new MissingRequiredPropertyException("RdsDbProxyArgs", "vpcId");
            }
            if ($.vswitchId == null) {
                throw new MissingRequiredPropertyException("RdsDbProxyArgs", "vswitchId");
            }
            return $;
        }
    }

}