// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.amqp.InstanceArgs;
import com.pulumi.alicloud.amqp.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Amqp Instance can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:amqp/instance:Instance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:amqp/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Renewal method. Automatic renewal: true; Manual renewal: false. When RenewalStatus has a value, the value of RenewalStatus shall prevail.
     * 
     */
    @Export(name="autoRenew", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoRenew;

    /**
     * @return Renewal method. Automatic renewal: true; Manual renewal: false. When RenewalStatus has a value, the value of RenewalStatus shall prevail.
     * 
     */
    public Output<Optional<Boolean>> autoRenew() {
        return Codegen.optional(this.autoRenew);
    }
    /**
     * OrderCreateTime.
     * 
     */
    @Export(name="createTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> createTime;

    /**
     * @return OrderCreateTime.
     * 
     */
    public Output<Integer> createTime() {
        return this.createTime;
    }
    /**
     * The instance name.
     * 
     */
    @Export(name="instanceName", refs={String.class}, tree="[0]")
    private Output<String> instanceName;

    /**
     * @return The instance name.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * Instance type. Valid values:
     * - professional: professional Edition
     * - enterprise: enterprise Edition
     * - vip: Platinum Edition.
     * - serverless: Serverless Edition.
     * &gt; **NOTE:** There should not set the `instance_type` parameter when creating a serverless instance. Only need to set `payment_type = &#34;PayAsYouGo&#34;` and `serverless_charge_type = &#34;onDemand&#34;`.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output<String> instanceType;

    /**
     * @return Instance type. Valid values:
     * - professional: professional Edition
     * - enterprise: enterprise Edition
     * - vip: Platinum Edition.
     * - serverless: Serverless Edition.
     * &gt; **NOTE:** There should not set the `instance_type` parameter when creating a serverless instance. Only need to set `payment_type = &#34;PayAsYouGo&#34;` and `serverless_charge_type = &#34;onDemand&#34;`.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * The maximum number of connections, according to the value given on the purchase page of the cloud message queue RabbitMQ version console.
     * 
     */
    @Export(name="maxConnections", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxConnections;

    /**
     * @return The maximum number of connections, according to the value given on the purchase page of the cloud message queue RabbitMQ version console.
     * 
     */
    public Output<Integer> maxConnections() {
        return this.maxConnections;
    }
    /**
     * Peak TPS traffic of the public network, which must be a multiple of 128, unit: times per second.
     * 
     */
    @Export(name="maxEipTps", refs={String.class}, tree="[0]")
    private Output<String> maxEipTps;

    /**
     * @return Peak TPS traffic of the public network, which must be a multiple of 128, unit: times per second.
     * 
     */
    public Output<String> maxEipTps() {
        return this.maxEipTps;
    }
    /**
     * Configure the private network TPS traffic peak, please set the value according to the cloud message queue RabbitMQ version of the console purchase page given.
     * 
     */
    @Export(name="maxTps", refs={String.class}, tree="[0]")
    private Output<String> maxTps;

    /**
     * @return Configure the private network TPS traffic peak, please set the value according to the cloud message queue RabbitMQ version of the console purchase page given.
     * 
     */
    public Output<String> maxTps() {
        return this.maxTps;
    }
    /**
     * This parameter must be provided while you change the instance specification. Type of instance lifting and lowering:
     * - Upgrade: Upgrade
     * - Downgrade: Downgrading.
     * 
     */
    @Export(name="modifyType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> modifyType;

    /**
     * @return This parameter must be provided while you change the instance specification. Type of instance lifting and lowering:
     * - Upgrade: Upgrade
     * - Downgrade: Downgrading.
     * 
     */
    public Output<Optional<String>> modifyType() {
        return Codegen.optional(this.modifyType);
    }
    /**
     * The Payment type. Valid value:
     * - Subscription: Pre-paid.
     * - PayAsYouGo: Post-paid, and for serverless Edition.
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output<String> paymentType;

    /**
     * @return The Payment type. Valid value:
     * - Subscription: Pre-paid.
     * - PayAsYouGo: Post-paid, and for serverless Edition.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * Prepayment cycle, unit: periodCycle. This parameter is valid when PaymentType is set to Subscription.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> period;

    /**
     * @return Prepayment cycle, unit: periodCycle. This parameter is valid when PaymentType is set to Subscription.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * Prepaid cycle units. Value: Month, Year.
     * 
     */
    @Export(name="periodCycle", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> periodCycle;

    /**
     * @return Prepaid cycle units. Value: Month, Year.
     * 
     */
    public Output<Optional<String>> periodCycle() {
        return Codegen.optional(this.periodCycle);
    }
    /**
     * Configure the maximum number of queues. The value range is as follows:  Professional version:[50,1000], minimum modification step size is 5  Enterprise Edition:[200,6000], minimum modification step size is 100  Platinum version:[10000,80000], minimum modification step size is 100.
     * 
     */
    @Export(name="queueCapacity", refs={String.class}, tree="[0]")
    private Output<String> queueCapacity;

    /**
     * @return Configure the maximum number of queues. The value range is as follows:  Professional version:[50,1000], minimum modification step size is 5  Enterprise Edition:[200,6000], minimum modification step size is 100  Platinum version:[10000,80000], minimum modification step size is 100.
     * 
     */
    public Output<String> queueCapacity() {
        return this.queueCapacity;
    }
    /**
     * The number of automatic renewal cycles.
     * 
     */
    @Export(name="renewalDuration", refs={Integer.class}, tree="[0]")
    private Output<Integer> renewalDuration;

    /**
     * @return The number of automatic renewal cycles.
     * 
     */
    public Output<Integer> renewalDuration() {
        return this.renewalDuration;
    }
    /**
     * Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years.
     * 
     */
    @Export(name="renewalDurationUnit", refs={String.class}, tree="[0]")
    private Output<String> renewalDurationUnit;

    /**
     * @return Auto-Renewal Cycle Unit Values Include: Month: Month. Year: Years.
     * 
     */
    public Output<String> renewalDurationUnit() {
        return this.renewalDurationUnit;
    }
    /**
     * The renewal status. Value: AutoRenewal: automatic renewal. ManualRenewal: manual renewal. NotRenewal: no renewal.
     * 
     */
    @Export(name="renewalStatus", refs={String.class}, tree="[0]")
    private Output<String> renewalStatus;

    /**
     * @return The renewal status. Value: AutoRenewal: automatic renewal. ManualRenewal: manual renewal. NotRenewal: no renewal.
     * 
     */
    public Output<String> renewalStatus() {
        return this.renewalStatus;
    }
    /**
     * The billing type of the serverless instance. Value: onDemand.
     * 
     */
    @Export(name="serverlessChargeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serverlessChargeType;

    /**
     * @return The billing type of the serverless instance. Value: onDemand.
     * 
     */
    public Output<Optional<String>> serverlessChargeType() {
        return Codegen.optional(this.serverlessChargeType);
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Configure the message storage space. Unit: GB. The value is as follows:  Professional Edition and Enterprise Edition: Fixed to 0. Description A value of 0 indicates that the Professional Edition and Enterprise Edition instances do not charge storage fees, but do not have storage space. Platinum version example: m × 100, where the value range of m is [7,28].
     * 
     */
    @Export(name="storageSize", refs={String.class}, tree="[0]")
    private Output<String> storageSize;

    /**
     * @return Configure the message storage space. Unit: GB. The value is as follows:  Professional Edition and Enterprise Edition: Fixed to 0. Description A value of 0 indicates that the Professional Edition and Enterprise Edition instances do not charge storage fees, but do not have storage space. Platinum version example: m × 100, where the value range of m is [7,28].
     * 
     */
    public Output<String> storageSize() {
        return this.storageSize;
    }
    /**
     * Whether to support public network.
     * 
     */
    @Export(name="supportEip", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> supportEip;

    /**
     * @return Whether to support public network.
     * 
     */
    public Output<Optional<Boolean>> supportEip() {
        return Codegen.optional(this.supportEip);
    }
    /**
     * Whether to activate the message trace function. The values are as follows:  true: Enable message trace function false: message trace function is not enabled Description The Platinum Edition instance provides the 15-day message trace function free of charge. The trace function can only be enabled and the trace storage duration can only be set to 15 days. For instances of other specifications, you can enable or disable the trace function.
     * 
     */
    @Export(name="supportTracing", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> supportTracing;

    /**
     * @return Whether to activate the message trace function. The values are as follows:  true: Enable message trace function false: message trace function is not enabled Description The Platinum Edition instance provides the 15-day message trace function free of charge. The trace function can only be enabled and the trace storage duration can only be set to 15 days. For instances of other specifications, you can enable or disable the trace function.
     * 
     */
    public Output<Boolean> supportTracing() {
        return this.supportTracing;
    }
    /**
     * Configure the storage duration of message traces. Unit: Days. The value is as follows:  3:3 days 7:7 days 15:15 days This parameter is valid when SupportTracing is true.
     * 
     */
    @Export(name="tracingStorageTime", refs={Integer.class}, tree="[0]")
    private Output<Integer> tracingStorageTime;

    /**
     * @return Configure the storage duration of message traces. Unit: Days. The value is as follows:  3:3 days 7:7 days 15:15 days This parameter is valid when SupportTracing is true.
     * 
     */
    public Output<Integer> tracingStorageTime() {
        return this.tracingStorageTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(java.lang.String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(java.lang.String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(java.lang.String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:amqp/instance:Instance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Instance(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:amqp/instance:Instance", name, state, makeResourceOptions(options, id), false);
    }

    private static InstanceArgs makeArgs(InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InstanceArgs.Empty : args;
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
    public static Instance get(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
