// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.rds.CustomArgs;
import com.pulumi.alicloud.rds.inputs.CustomState;
import com.pulumi.alicloud.rds.outputs.CustomDataDisk;
import com.pulumi.alicloud.rds.outputs.CustomSystemDisk;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a RDS Custom resource.
 * 
 * Dedicated RDS User host.
 * 
 * For information about RDS Custom and how to use it, see [What is Custom](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.235.0.
 * 
 * ## Import
 * 
 * RDS Custom can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:rds/custom:Custom example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:rds/custom:Custom")
public class Custom extends com.pulumi.resources.CustomResource {
    /**
     * Represents the number of instances created
     * 
     */
    @Export(name="amount", refs={Integer.class}, tree="[0]")
    private Output<Integer> amount;

    /**
     * @return Represents the number of instances created
     * 
     */
    public Output<Integer> amount() {
        return this.amount;
    }
    /**
     * Whether to pay automatically. Value range:
     * 
     */
    @Export(name="autoPay", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoPay;

    /**
     * @return Whether to pay automatically. Value range:
     * 
     */
    public Output<Optional<Boolean>> autoPay() {
        return Codegen.optional(this.autoPay);
    }
    /**
     * Whether the instance is automatically renewed. Valid values: true/false. The default is false.
     * 
     */
    @Export(name="autoRenew", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoRenew;

    /**
     * @return Whether the instance is automatically renewed. Valid values: true/false. The default is false.
     * 
     */
    public Output<Optional<Boolean>> autoRenew() {
        return Codegen.optional(this.autoRenew);
    }
    /**
     * Whether to allow joining the ACK cluster. When this parameter is set to `1`, the created instance can be added to the ACK cluster through The `AttachRCInstances` API to efficiently manage container applications.
     * 
     */
    @Export(name="createMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> createMode;

    /**
     * @return Whether to allow joining the ACK cluster. When this parameter is set to `1`, the created instance can be added to the ACK cluster through The `AttachRCInstances` API to efficiently manage container applications.
     * 
     */
    public Output<Optional<String>> createMode() {
        return Codegen.optional(this.createMode);
    }
    /**
     * Data disk See `data_disk` below.
     * 
     */
    @Export(name="dataDisks", refs={List.class,CustomDataDisk.class}, tree="[0,1]")
    private Output</* @Nullable */ List<CustomDataDisk>> dataDisks;

    /**
     * @return Data disk See `data_disk` below.
     * 
     */
    public Output<Optional<List<CustomDataDisk>>> dataDisks() {
        return Codegen.optional(this.dataDisks);
    }
    /**
     * The ID of the deployment set.
     * 
     */
    @Export(name="deploymentSetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> deploymentSetId;

    /**
     * @return The ID of the deployment set.
     * 
     */
    public Output<Optional<String>> deploymentSetId() {
        return Codegen.optional(this.deploymentSetId);
    }
    /**
     * Instance description. It must be 2 to 256 characters in length and cannot start with http:// or https.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Instance description. It must be 2 to 256 characters in length and cannot start with http:// or https.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Instance configuration type, value range:
     * 
     * &gt; **NOTE:**  This parameter does not need to be uploaded, and the system can automatically determine whether to upgrade or downgrade. If you want to upload, please follow the following logic rules.
     * - `Up` (default): upgrade the instance specification. Please ensure that your account balance is sufficient.
     * - `Down`: Downgrade instance specifications. When the instance type set to InstanceType is lower than the current instance type, set Direction = down.
     * 
     */
    @Export(name="direction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> direction;

    /**
     * @return Instance configuration type, value range:
     * 
     * &gt; **NOTE:**  This parameter does not need to be uploaded, and the system can automatically determine whether to upgrade or downgrade. If you want to upload, please follow the following logic rules.
     * - `Up` (default): upgrade the instance specification. Please ensure that your account balance is sufficient.
     * - `Down`: Downgrade instance specifications. When the instance type set to InstanceType is lower than the current instance type, set Direction = down.
     * 
     */
    public Output<Optional<String>> direction() {
        return Codegen.optional(this.direction);
    }
    /**
     * Whether to pre-check the operation of creating an instance. Valid values:
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Whether to pre-check the operation of creating an instance. Valid values:
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * Whether to forcibly release the running instance. Value: true/false
     * 
     */
    @Export(name="force", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> force;

    /**
     * @return Whether to forcibly release the running instance. Value: true/false
     * 
     */
    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * Whether to force shutdown. Value range:
     * 
     */
    @Export(name="forceStop", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceStop;

    /**
     * @return Whether to force shutdown. Value range:
     * 
     */
    public Output<Optional<Boolean>> forceStop() {
        return Codegen.optional(this.forceStop);
    }
    /**
     * The instance host name.
     * 
     */
    @Export(name="hostName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> hostName;

    /**
     * @return The instance host name.
     * 
     */
    public Output<Optional<String>> hostName() {
        return Codegen.optional(this.hostName);
    }
    /**
     * The ID of the image used by the instance.
     * 
     */
    @Export(name="imageId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> imageId;

    /**
     * @return The ID of the image used by the instance.
     * 
     */
    public Output<Optional<String>> imageId() {
        return Codegen.optional(this.imageId);
    }
    /**
     * The Payment type. Currently, only `Prepaid` (package year and month) types are supported.
     * 
     */
    @Export(name="instanceChargeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instanceChargeType;

    /**
     * @return The Payment type. Currently, only `Prepaid` (package year and month) types are supported.
     * 
     */
    public Output<Optional<String>> instanceChargeType() {
        return Codegen.optional(this.instanceChargeType);
    }
    /**
     * The type of the created RDS Custom dedicated host instance.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output<String> instanceType;

    /**
     * @return The type of the created RDS Custom dedicated host instance.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * Reserved parameters are not supported.
     * 
     */
    @Export(name="internetChargeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> internetChargeType;

    /**
     * @return Reserved parameters are not supported.
     * 
     */
    public Output<Optional<String>> internetChargeType() {
        return Codegen.optional(this.internetChargeType);
    }
    /**
     * Reserved parameters are not supported.
     * 
     */
    @Export(name="internetMaxBandwidthOut", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> internetMaxBandwidthOut;

    /**
     * @return Reserved parameters are not supported.
     * 
     */
    public Output<Optional<Integer>> internetMaxBandwidthOut() {
        return Codegen.optional(this.internetMaxBandwidthOut);
    }
    /**
     * Reserved parameters are not supported.
     * 
     */
    @Export(name="ioOptimized", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ioOptimized;

    /**
     * @return Reserved parameters are not supported.
     * 
     */
    public Output<Optional<String>> ioOptimized() {
        return Codegen.optional(this.ioOptimized);
    }
    /**
     * The key pair name. Only flyer names are supported.
     * 
     */
    @Export(name="keyPairName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyPairName;

    /**
     * @return The key pair name. Only flyer names are supported.
     * 
     */
    public Output<Optional<String>> keyPairName() {
        return Codegen.optional(this.keyPairName);
    }
    /**
     * The account and password of the instance.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return The account and password of the instance.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * Prepaid renewal duration, unit: Month/Year.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> period;

    /**
     * @return Prepaid renewal duration, unit: Month/Year.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * The unit of duration of the year-to-month billing method. Value range:
     * - `Year`: Year
     * - `Month` (default): Month
     * 
     */
    @Export(name="periodUnit", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> periodUnit;

    /**
     * @return The unit of duration of the year-to-month billing method. Value range:
     * - `Year`: Year
     * - `Month` (default): Month
     * 
     */
    public Output<Optional<String>> periodUnit() {
        return Codegen.optional(this.periodUnit);
    }
    /**
     * The region ID. Callable DescribeRegions to get.
     * 
     */
    @Export(name="regionId", refs={String.class}, tree="[0]")
    private Output<String> regionId;

    /**
     * @return The region ID. Callable DescribeRegions to get.
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
    }
    /**
     * The ID of the resource group
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * Reserved parameters are not supported.
     * 
     */
    @Export(name="securityEnhancementStrategy", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> securityEnhancementStrategy;

    /**
     * @return Reserved parameters are not supported.
     * 
     */
    public Output<Optional<String>> securityEnhancementStrategy() {
        return Codegen.optional(this.securityEnhancementStrategy);
    }
    /**
     * Security group list
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return Security group list
     * 
     */
    public Output<Optional<List<String>>> securityGroupIds() {
        return Codegen.optional(this.securityGroupIds);
    }
    /**
     * The status of the resource
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * System disk specifications. See `system_disk` below.
     * 
     */
    @Export(name="systemDisk", refs={CustomSystemDisk.class}, tree="[0]")
    private Output</* @Nullable */ CustomSystemDisk> systemDisk;

    /**
     * @return System disk specifications. See `system_disk` below.
     * 
     */
    public Output<Optional<CustomSystemDisk>> systemDisk() {
        return Codegen.optional(this.systemDisk);
    }
    /**
     * The tag of the resource
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tag of the resource
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the virtual switch. The zone in which the vSwitch is located must correspond to the zone ID entered in ZoneId.
     * 
     * The network type InstanceNetworkType must be VPC.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return The ID of the virtual switch. The zone in which the vSwitch is located must correspond to the zone ID entered in ZoneId.
     * 
     * The network type InstanceNetworkType must be VPC.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }
    /**
     * The zone ID  of the resource
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zoneId;

    /**
     * @return The zone ID  of the resource
     * 
     */
    public Output<Optional<String>> zoneId() {
        return Codegen.optional(this.zoneId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Custom(java.lang.String name) {
        this(name, CustomArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Custom(java.lang.String name, CustomArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Custom(java.lang.String name, CustomArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/custom:Custom", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Custom(java.lang.String name, Output<java.lang.String> id, @Nullable CustomState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:rds/custom:Custom", name, state, makeResourceOptions(options, id), false);
    }

    private static CustomArgs makeArgs(CustomArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? CustomArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Custom get(java.lang.String name, Output<java.lang.String> id, @Nullable CustomState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Custom(name, id, state, options);
    }
}