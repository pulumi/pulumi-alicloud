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
 * ## Import
 * 
 * KMS Instance can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:kms/instance:Instance example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:kms/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * Aucillary VPCs used to access this KMS instance. See `bind_vpcs` below.
     * 
     */
    @Export(name="bindVpcs", type=List.class, parameters={InstanceBindVpc.class})
    private Output</* @Nullable */ List<InstanceBindVpc>> bindVpcs;

    /**
     * @return Aucillary VPCs used to access this KMS instance. See `bind_vpcs` below.
     * 
     */
    public Output<Optional<List<InstanceBindVpc>>> bindVpcs() {
        return Codegen.optional(this.bindVpcs);
    }
    /**
     * KMS instance certificate chain in PEM format.
     * 
     */
    @Export(name="caCertificateChainPem", type=String.class, parameters={})
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
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="instanceName", type=String.class, parameters={})
    private Output<String> instanceName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }
    /**
     * Maximum number of stored keys.
     * 
     */
    @Export(name="keyNum", type=Integer.class, parameters={})
    private Output<Integer> keyNum;

    /**
     * @return Maximum number of stored keys.
     * 
     */
    public Output<Integer> keyNum() {
        return this.keyNum;
    }
    /**
     * KMS Instance commodity type (software/hardware). Currently, only version 3 is supported.
     * 
     */
    @Export(name="productVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> productVersion;

    /**
     * @return KMS Instance commodity type (software/hardware). Currently, only version 3 is supported.
     * 
     */
    public Output<Optional<String>> productVersion() {
        return Codegen.optional(this.productVersion);
    }
    /**
     * Automatic renewal period, in months.
     * 
     */
    @Export(name="renewPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> renewPeriod;

    /**
     * @return Automatic renewal period, in months.
     * 
     */
    public Output<Optional<Integer>> renewPeriod() {
        return Codegen.optional(this.renewPeriod);
    }
    /**
     * Renewal options (manual renewal, automatic renewal, no renewal).
     * 
     */
    @Export(name="renewStatus", type=String.class, parameters={})
    private Output</* @Nullable */ String> renewStatus;

    /**
     * @return Renewal options (manual renewal, automatic renewal, no renewal).
     * 
     */
    public Output<Optional<String>> renewStatus() {
        return Codegen.optional(this.renewStatus);
    }
    /**
     * Maximum number of Secrets.
     * 
     */
    @Export(name="secretNum", type=Integer.class, parameters={})
    private Output<Integer> secretNum;

    /**
     * @return Maximum number of Secrets.
     * 
     */
    public Output<Integer> secretNum() {
        return this.secretNum;
    }
    /**
     * The computation performance level of the KMS instance.
     * 
     */
    @Export(name="spec", type=Integer.class, parameters={})
    private Output<Integer> spec;

    /**
     * @return The computation performance level of the KMS instance.
     * 
     */
    public Output<Integer> spec() {
        return this.spec;
    }
    /**
     * Instance status.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Instance status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Instance VPC id.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return Instance VPC id.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The number of managed accesses. The maximum number of VPCs that can access this KMS instance.
     * 
     */
    @Export(name="vpcNum", type=Integer.class, parameters={})
    private Output<Integer> vpcNum;

    /**
     * @return The number of managed accesses. The maximum number of VPCs that can access this KMS instance.
     * 
     */
    public Output<Integer> vpcNum() {
        return this.vpcNum;
    }
    /**
     * Instance bind vswitches.
     * 
     */
    @Export(name="vswitchIds", type=List.class, parameters={String.class})
    private Output<List<String>> vswitchIds;

    /**
     * @return Instance bind vswitches.
     * 
     */
    public Output<List<String>> vswitchIds() {
        return this.vswitchIds;
    }
    /**
     * zone id.
     * 
     */
    @Export(name="zoneIds", type=List.class, parameters={String.class})
    private Output<List<String>> zoneIds;

    /**
     * @return zone id.
     * 
     */
    public Output<List<String>> zoneIds() {
        return this.zoneIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:kms/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:kms/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}