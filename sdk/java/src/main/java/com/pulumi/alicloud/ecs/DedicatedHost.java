// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.DedicatedHostArgs;
import com.pulumi.alicloud.ecs.inputs.DedicatedHostState;
import com.pulumi.alicloud.ecs.outputs.DedicatedHostNetworkAttribute;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Ecs dedicated host can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ecs/dedicatedHost:DedicatedHost default dh-2zedmxxxx
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/dedicatedHost:DedicatedHost")
public class DedicatedHost extends com.pulumi.resources.CustomResource {
    /**
     * The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
     * 
     */
    @Export(name="actionOnMaintenance", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> actionOnMaintenance;

    /**
     * @return The policy used to migrate the instances from the dedicated host when the dedicated host fails or needs to be repaired online. Valid values: `Migrate`, `Stop`.
     * 
     */
    public Output<Optional<String>> actionOnMaintenance() {
        return Codegen.optional(this.actionOnMaintenance);
    }
    /**
     * Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
     * 
     */
    @Export(name="autoPlacement", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> autoPlacement;

    /**
     * @return Specifies whether to add the dedicated host to the resource pool for automatic deployment. If you do not specify the DedicatedHostId parameter when you create an instance on a dedicated host, Alibaba Cloud automatically selects a dedicated host from the resource pool to host the instance. Valid values: `on`, `off`. Default: `on`.
     * 
     */
    public Output<Optional<String>> autoPlacement() {
        return Codegen.optional(this.autoPlacement);
    }
    /**
     * The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
     * 
     */
    @Export(name="autoReleaseTime", refs={String.class}, tree="[0]")
    private Output<String> autoReleaseTime;

    /**
     * @return The automatic release time of the dedicated host. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
     * 
     */
    public Output<String> autoReleaseTime() {
        return this.autoReleaseTime;
    }
    /**
     * Specifies whether to automatically renew the subscription dedicated host.
     * 
     */
    @Export(name="autoRenew", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoRenew;

    /**
     * @return Specifies whether to automatically renew the subscription dedicated host.
     * 
     */
    public Output<Optional<Boolean>> autoRenew() {
        return Codegen.optional(this.autoRenew);
    }
    /**
     * The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
     * 
     */
    @Export(name="autoRenewPeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> autoRenewPeriod;

    /**
     * @return The auto-renewal period of the dedicated host. Unit: months. Valid values: `1`, `2`, `3`, `6`, and `12`. takes effect and is required only when the AutoRenew parameter is set to true.
     * 
     */
    public Output<Optional<Integer>> autoRenewPeriod() {
        return Codegen.optional(this.autoRenewPeriod);
    }
    /**
     * CPU oversold ratio. Only custom specifications g6s, c6s, r6s support setting the CPU oversold ratio.
     * 
     */
    @Export(name="cpuOverCommitRatio", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> cpuOverCommitRatio;

    /**
     * @return CPU oversold ratio. Only custom specifications g6s, c6s, r6s support setting the CPU oversold ratio.
     * 
     */
    public Output<Optional<Double>> cpuOverCommitRatio() {
        return Codegen.optional(this.cpuOverCommitRatio);
    }
    /**
     * The dedicated host cluster ID to which the dedicated host belongs.
     * 
     */
    @Export(name="dedicatedHostClusterId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dedicatedHostClusterId;

    /**
     * @return The dedicated host cluster ID to which the dedicated host belongs.
     * 
     */
    public Output<Optional<String>> dedicatedHostClusterId() {
        return Codegen.optional(this.dedicatedHostClusterId);
    }
    /**
     * The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * 
     */
    @Export(name="dedicatedHostName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> dedicatedHostName;

    /**
     * @return The name of the dedicated host. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).
     * 
     */
    public Output<Optional<String>> dedicatedHostName() {
        return Codegen.optional(this.dedicatedHostName);
    }
    /**
     * The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](https://www.alibabacloud.com/help/doc-detail/134240.htm) operation to obtain the most recent list of dedicated host types.
     * 
     */
    @Export(name="dedicatedHostType", refs={String.class}, tree="[0]")
    private Output<String> dedicatedHostType;

    /**
     * @return The type of the dedicated host. You can call the [DescribeDedicatedHostTypes](https://www.alibabacloud.com/help/doc-detail/134240.htm) operation to obtain the most recent list of dedicated host types.
     * 
     */
    public Output<String> dedicatedHostType() {
        return this.dedicatedHostType;
    }
    /**
     * The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the dedicated host. The description must be 2 to 256 characters in length and cannot start with http:// or https://.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go. Default: `false`.
     * 
     */
    @Export(name="detailFee", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> detailFee;

    /**
     * @return Specifies whether to return the billing details of the order when the billing method is changed from subscription to pay-as-you-go. Default: `false`.
     * 
     */
    public Output<Optional<Boolean>> detailFee() {
        return Codegen.optional(this.detailFee);
    }
    /**
     * Specifies whether to only validate the request. Default: `false`.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Specifies whether to only validate the request. Default: `false`.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The subscription period of the dedicated host. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
     * 
     */
    @Export(name="expiredTime", refs={String.class}, tree="[0]")
    private Output<String> expiredTime;

    /**
     * @return The subscription period of the dedicated host. The Period parameter takes effect and is required only when the ChargeType parameter is set to PrePaid.
     * 
     */
    public Output<String> expiredTime() {
        return this.expiredTime;
    }
    /**
     * Specify the minimum purchase quantity of a dedicated host.
     * 
     */
    @Export(name="minQuantity", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> minQuantity;

    /**
     * @return Specify the minimum purchase quantity of a dedicated host.
     * 
     */
    public Output<Optional<Integer>> minQuantity() {
        return Codegen.optional(this.minQuantity);
    }
    /**
     * dedicated host network parameters. contains the following attributes:
     * 
     */
    @Export(name="networkAttributes", refs={List.class,DedicatedHostNetworkAttribute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<DedicatedHostNetworkAttribute>> networkAttributes;

    /**
     * @return dedicated host network parameters. contains the following attributes:
     * 
     */
    public Output<Optional<List<DedicatedHostNetworkAttribute>>> networkAttributes() {
        return Codegen.optional(this.networkAttributes);
    }
    /**
     * The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output<String> paymentType;

    /**
     * @return The billing method of the dedicated host. Valid values: `PrePaid`, `PostPaid`. Default: `PostPaid`.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * The ID of the resource group to which the dedicated host belongs.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the dedicated host belongs.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The unit of the subscription period of the dedicated host.
     * 
     */
    @Export(name="saleCycle", refs={String.class}, tree="[0]")
    private Output<String> saleCycle;

    /**
     * @return The unit of the subscription period of the dedicated host.
     * 
     */
    public Output<String> saleCycle() {
        return this.saleCycle;
    }
    /**
     * The status of the dedicated host.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the dedicated host.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,Object>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The zone ID of the dedicated host. This parameter is empty by default. If you do not specify this parameter, the system automatically selects a zone.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The zone ID of the dedicated host. This parameter is empty by default. If you do not specify this parameter, the system automatically selects a zone.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedHost(String name) {
        this(name, DedicatedHostArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedHost(String name, DedicatedHostArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedHost(String name, DedicatedHostArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/dedicatedHost:DedicatedHost", name, args == null ? DedicatedHostArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DedicatedHost(String name, Output<String> id, @Nullable DedicatedHostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/dedicatedHost:DedicatedHost", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static DedicatedHost get(String name, Output<String> id, @Nullable DedicatedHostState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedHost(name, id, state, options);
    }
}