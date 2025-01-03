// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.alb.LoadBalancerArgs;
import com.pulumi.alicloud.alb.inputs.LoadBalancerState;
import com.pulumi.alicloud.alb.outputs.LoadBalancerAccessLogConfig;
import com.pulumi.alicloud.alb.outputs.LoadBalancerLoadBalancerBillingConfig;
import com.pulumi.alicloud.alb.outputs.LoadBalancerModificationProtectionConfig;
import com.pulumi.alicloud.alb.outputs.LoadBalancerZoneMapping;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ALB Load Balancer resource.
 * 
 * For information about ALB Load Balancer and how to use it, see [What is Load Balancer](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-createloadbalancer).
 * 
 * &gt; **NOTE:** Available since v1.132.0.
 * 
 * ## Import
 * 
 * Alb Load Balancer can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:alb/loadBalancer:LoadBalancer example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:alb/loadBalancer:LoadBalancer")
public class LoadBalancer extends com.pulumi.resources.CustomResource {
    /**
     * The configuration of the access log. See `access_log_config` below.
     * 
     */
    @Export(name="accessLogConfig", refs={LoadBalancerAccessLogConfig.class}, tree="[0]")
    private Output</* @Nullable */ LoadBalancerAccessLogConfig> accessLogConfig;

    /**
     * @return The configuration of the access log. See `access_log_config` below.
     * 
     */
    public Output<Optional<LoadBalancerAccessLogConfig>> accessLogConfig() {
        return Codegen.optional(this.accessLogConfig);
    }
    /**
     * The mode in which IP addresses are allocated. Valid values: `Fixed`, `Dynamic`.
     * 
     */
    @Export(name="addressAllocatedMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> addressAllocatedMode;

    /**
     * @return The mode in which IP addresses are allocated. Valid values: `Fixed`, `Dynamic`.
     * 
     */
    public Output<Optional<String>> addressAllocatedMode() {
        return Codegen.optional(this.addressAllocatedMode);
    }
    /**
     * The protocol version. Valid values: `IPv4`, `DualStack`.
     * 
     */
    @Export(name="addressIpVersion", refs={String.class}, tree="[0]")
    private Output<String> addressIpVersion;

    /**
     * @return The protocol version. Valid values: `IPv4`, `DualStack`.
     * 
     */
    public Output<String> addressIpVersion() {
        return this.addressIpVersion;
    }
    /**
     * The type of the address of the ALB instance. Valid values: `Internet`, `Intranet`.
     * 
     */
    @Export(name="addressType", refs={String.class}, tree="[0]")
    private Output<String> addressType;

    /**
     * @return The type of the address of the ALB instance. Valid values: `Internet`, `Intranet`.
     * 
     */
    public Output<String> addressType() {
        return this.addressType;
    }
    /**
     * The ID of the Internet Shared Bandwidth instance that is associated with the Internet-facing ALB instance.
     * 
     */
    @Export(name="bandwidthPackageId", refs={String.class}, tree="[0]")
    private Output<String> bandwidthPackageId;

    /**
     * @return The ID of the Internet Shared Bandwidth instance that is associated with the Internet-facing ALB instance.
     * 
     */
    public Output<String> bandwidthPackageId() {
        return this.bandwidthPackageId;
    }
    /**
     * The time when the resource was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Specifies whether to enable deletion protection. Default value: `false`. Valid values:
     * 
     */
    @Export(name="deletionProtectionEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deletionProtectionEnabled;

    /**
     * @return Specifies whether to enable deletion protection. Default value: `false`. Valid values:
     * 
     */
    public Output<Optional<Boolean>> deletionProtectionEnabled() {
        return Codegen.optional(this.deletionProtectionEnabled);
    }
    /**
     * (Available since v1.158.0) The domain name of the ALB instance.
     * 
     */
    @Export(name="dnsName", refs={String.class}, tree="[0]")
    private Output<String> dnsName;

    /**
     * @return (Available since v1.158.0) The domain name of the ALB instance.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * Specifies whether to perform a dry run. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Specifies whether to perform a dry run. Default value: `false`. Valid values: `true`, `false`.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The address type of the Ipv6 address. Valid values: `Internet`, `Intranet`.
     * 
     */
    @Export(name="ipv6AddressType", refs={String.class}, tree="[0]")
    private Output<String> ipv6AddressType;

    /**
     * @return The address type of the Ipv6 address. Valid values: `Internet`, `Intranet`.
     * 
     */
    public Output<String> ipv6AddressType() {
        return this.ipv6AddressType;
    }
    /**
     * The billing method of the ALB instance. See `load_balancer_billing_config` below.
     * 
     */
    @Export(name="loadBalancerBillingConfig", refs={LoadBalancerLoadBalancerBillingConfig.class}, tree="[0]")
    private Output<LoadBalancerLoadBalancerBillingConfig> loadBalancerBillingConfig;

    /**
     * @return The billing method of the ALB instance. See `load_balancer_billing_config` below.
     * 
     */
    public Output<LoadBalancerLoadBalancerBillingConfig> loadBalancerBillingConfig() {
        return this.loadBalancerBillingConfig;
    }
    /**
     * The edition of the ALB instance. The features and billing rules vary based on the edition of the ALB instance. Valid values: `Basic`, `Standard`, `StandardWithWaf`.
     * 
     */
    @Export(name="loadBalancerEdition", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerEdition;

    /**
     * @return The edition of the ALB instance. The features and billing rules vary based on the edition of the ALB instance. Valid values: `Basic`, `Standard`, `StandardWithWaf`.
     * 
     */
    public Output<String> loadBalancerEdition() {
        return this.loadBalancerEdition;
    }
    /**
     * The name of the ALB instance.
     * 
     */
    @Export(name="loadBalancerName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> loadBalancerName;

    /**
     * @return The name of the ALB instance.
     * 
     */
    public Output<Optional<String>> loadBalancerName() {
        return Codegen.optional(this.loadBalancerName);
    }
    /**
     * The configuration of the read-only mode. See `modification_protection_config` below.
     * 
     */
    @Export(name="modificationProtectionConfig", refs={LoadBalancerModificationProtectionConfig.class}, tree="[0]")
    private Output<LoadBalancerModificationProtectionConfig> modificationProtectionConfig;

    /**
     * @return The configuration of the read-only mode. See `modification_protection_config` below.
     * 
     */
    public Output<LoadBalancerModificationProtectionConfig> modificationProtectionConfig() {
        return this.modificationProtectionConfig;
    }
    /**
     * The ID of the resource group.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * The status of the Load Balancer.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Load Balancer.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the VPC.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The list of zones and vSwitch mappings. You must specify at least two zones. See `zone_mappings` below.
     * 
     */
    @Export(name="zoneMappings", refs={List.class,LoadBalancerZoneMapping.class}, tree="[0,1]")
    private Output<List<LoadBalancerZoneMapping>> zoneMappings;

    /**
     * @return The list of zones and vSwitch mappings. You must specify at least two zones. See `zone_mappings` below.
     * 
     */
    public Output<List<LoadBalancerZoneMapping>> zoneMappings() {
        return this.zoneMappings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadBalancer(java.lang.String name) {
        this(name, LoadBalancerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadBalancer(java.lang.String name, LoadBalancerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadBalancer(java.lang.String name, LoadBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alb/loadBalancer:LoadBalancer", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private LoadBalancer(java.lang.String name, Output<java.lang.String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:alb/loadBalancer:LoadBalancer", name, state, makeResourceOptions(options, id), false);
    }

    private static LoadBalancerArgs makeArgs(LoadBalancerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? LoadBalancerArgs.Empty : args;
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
    public static LoadBalancer get(java.lang.String name, Output<java.lang.String> id, @Nullable LoadBalancerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadBalancer(name, id, state, options);
    }
}
