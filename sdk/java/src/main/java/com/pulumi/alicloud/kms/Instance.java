// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.kms.InstanceArgs;
import com.pulumi.alicloud.kms.inputs.InstanceState;
import com.pulumi.alicloud.kms.outputs.InstanceBindVpc;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a KMS Instance resource.
 * 
 * For information about KMS Instance and how to use it, see [What is Instance](https://www.alibabacloud.com/help/zh/key-management-service/latest/kms-instance-management).
 * 
 * &gt; **NOTE:** Available since v1.210.0.
 * 
 * ## Import
 * 
 * KMS Instance can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:kms/instance:Instance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:kms/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Aucillary VPCs used to access this KMS instance See `bind_vpcs` below.
     * 
     */
    @Export(name="bindVpcs", refs={List.class,InstanceBindVpc.class}, tree="[0,1]")
    private Output</* @Nullable */ List<InstanceBindVpc>> bindVpcs;

    /**
     * @return Aucillary VPCs used to access this KMS instance See `bind_vpcs` below.
     * 
     */
    public Output<Optional<List<InstanceBindVpc>>> bindVpcs() {
        return Codegen.optional(this.bindVpcs);
    }
    /**
     * KMS instance certificate chain in PEM format.
     * 
     */
    @Export(name="caCertificateChainPem", refs={String.class}, tree="[0]")
    private Output<String> caCertificateChainPem;

    /**
     * @return KMS instance certificate chain in PEM format.
     * 
     */
    public Output<String> caCertificateChainPem() {
        return this.caCertificateChainPem;
    }
    /**
     * The creation time of the resource.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * (Available since v1.233.1) Instance expiration time.
     * 
     */
    @Export(name="endDate", refs={String.class}, tree="[0]")
    private Output<String> endDate;

    /**
     * @return (Available since v1.233.1) Instance expiration time.
     * 
     */
    public Output<String> endDate() {
        return this.endDate;
    }
    /**
     * Whether to force deletion even without backup.
     * 
     */
    @Export(name="forceDeleteWithoutBackup", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> forceDeleteWithoutBackup;

    /**
     * @return Whether to force deletion even without backup.
     * 
     */
    public Output<Optional<String>> forceDeleteWithoutBackup() {
        return Codegen.optional(this.forceDeleteWithoutBackup);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="instanceName", refs={String.class}, tree="[0]")
    private Output<String> instanceName;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * Maximum number of stored keys. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    @Export(name="keyNum", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> keyNum;

    /**
     * @return Maximum number of stored keys. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    public Output<Optional<Integer>> keyNum() {
        return Codegen.optional(this.keyNum);
    }
    /**
     * Instance Audit Log Switch. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    @Export(name="log", refs={String.class}, tree="[0]")
    private Output<String> log;

    /**
     * @return Instance Audit Log Switch. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    public Output<String> log() {
        return this.log;
    }
    /**
     * Instance log capacity. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    @Export(name="logStorage", refs={Integer.class}, tree="[0]")
    private Output<Integer> logStorage;

    /**
     * @return Instance log capacity. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    public Output<Integer> logStorage() {
        return this.logStorage;
    }
    /**
     * Payment type,valid values:
     * - `Subscription`: Prepaid.
     * - `PayAsYouGo`: Postpaid.
     * 
     */
    @Export(name="paymentType", refs={String.class}, tree="[0]")
    private Output<String> paymentType;

    /**
     * @return Payment type,valid values:
     * - `Subscription`: Prepaid.
     * - `PayAsYouGo`: Postpaid.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }
    /**
     * Purchase cycle, in months. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    @Export(name="period", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> period;

    /**
     * @return Purchase cycle, in months. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    public Output<Optional<Integer>> period() {
        return Codegen.optional(this.period);
    }
    /**
     * KMS Instance commodity type (software/hardware)
     * 
     */
    @Export(name="productVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> productVersion;

    /**
     * @return KMS Instance commodity type (software/hardware)
     * 
     */
    public Output<Optional<String>> productVersion() {
        return Codegen.optional(this.productVersion);
    }
    /**
     * Automatic renewal period, in months. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    @Export(name="renewPeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> renewPeriod;

    /**
     * @return Automatic renewal period, in months. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    public Output<Optional<Integer>> renewPeriod() {
        return Codegen.optional(this.renewPeriod);
    }
    /**
     * Renewal options. Valid values: `AutoRenewal`, `ManualRenewal`. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    @Export(name="renewStatus", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> renewStatus;

    /**
     * @return Renewal options. Valid values: `AutoRenewal`, `ManualRenewal`. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    public Output<Optional<String>> renewStatus() {
        return Codegen.optional(this.renewStatus);
    }
    /**
     * Maximum number of Secrets. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    @Export(name="secretNum", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> secretNum;

    /**
     * @return Maximum number of Secrets. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    public Output<Optional<Integer>> secretNum() {
        return Codegen.optional(this.secretNum);
    }
    /**
     * The computation performance level of the KMS instance. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    @Export(name="spec", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> spec;

    /**
     * @return The computation performance level of the KMS instance. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    public Output<Optional<Integer>> spec() {
        return Codegen.optional(this.spec);
    }
    /**
     * Instance status.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Instance status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Instance VPC id
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return Instance VPC id
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The number of managed accesses. The maximum number of VPCs that can access this KMS instance. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    @Export(name="vpcNum", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> vpcNum;

    /**
     * @return The number of managed accesses. The maximum number of VPCs that can access this KMS instance. The attribute is valid when the attribute `payment_type` is `Subscription`.
     * 
     */
    public Output<Optional<Integer>> vpcNum() {
        return Codegen.optional(this.vpcNum);
    }
    /**
     * Instance bind vswitches
     * 
     */
    @Export(name="vswitchIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> vswitchIds;

    /**
     * @return Instance bind vswitches
     * 
     */
    public Output<List<String>> vswitchIds() {
        return this.vswitchIds;
    }
    /**
     * zone id
     * 
     */
    @Export(name="zoneIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> zoneIds;

    /**
     * @return zone id
     * 
     */
    public Output<List<String>> zoneIds() {
        return this.zoneIds;
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
        super("alicloud:kms/instance:Instance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Instance(java.lang.String name, Output<java.lang.String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:kms/instance:Instance", name, state, makeResourceOptions(options, id), false);
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
