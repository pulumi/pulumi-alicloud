// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.TransitRouterMulticastDomainSourceArgs;
import com.pulumi.alicloud.cen.inputs.TransitRouterMulticastDomainSourceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cen Transit Router Multicast Domain Source resource.
 * 
 * For information about Cen Transit Router Multicast Domain Source and how to use it, see [What is Transit Router Multicast Domain Source](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-cbn-2017-09-12-registertransitroutermulticastgroupsources).
 * 
 * &gt; **NOTE:** Available since v1.195.0.
 * 
 * ## Import
 * 
 * Cen Transit Router Multicast Domain Source can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cen/transitRouterMulticastDomainSource:TransitRouterMulticastDomainSource example &lt;transit_router_multicast_domain_id&gt;:&lt;group_ip_address&gt;:&lt;network_interface_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/transitRouterMulticastDomainSource:TransitRouterMulticastDomainSource")
public class TransitRouterMulticastDomainSource extends com.pulumi.resources.CustomResource {
    /**
     * The IP address of the multicast group to which the multicast source belongs. Value range: **224.0.0.1** to **239.255.255.254**. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you.
     * 
     */
    @Export(name="groupIpAddress", refs={String.class}, tree="[0]")
    private Output<String> groupIpAddress;

    /**
     * @return The IP address of the multicast group to which the multicast source belongs. Value range: **224.0.0.1** to **239.255.255.254**. If the multicast group you specified does not exist in the current multicast domain, the system will automatically create a new multicast group for you.
     * 
     */
    public Output<String> groupIpAddress() {
        return this.groupIpAddress;
    }
    /**
     * ENI ID of the multicast source.
     * 
     */
    @Export(name="networkInterfaceId", refs={String.class}, tree="[0]")
    private Output<String> networkInterfaceId;

    /**
     * @return ENI ID of the multicast source.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
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
     * The ID of the multicast domain to which the multicast source belongs.
     * 
     */
    @Export(name="transitRouterMulticastDomainId", refs={String.class}, tree="[0]")
    private Output<String> transitRouterMulticastDomainId;

    /**
     * @return The ID of the multicast domain to which the multicast source belongs.
     * 
     */
    public Output<String> transitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }
    /**
     * The VPC to which the ENI of the multicast source belongs. This field is mandatory for VPCs that is owned by another accounts.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The VPC to which the ENI of the multicast source belongs. This field is mandatory for VPCs that is owned by another accounts.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitRouterMulticastDomainSource(java.lang.String name) {
        this(name, TransitRouterMulticastDomainSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitRouterMulticastDomainSource(java.lang.String name, TransitRouterMulticastDomainSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitRouterMulticastDomainSource(java.lang.String name, TransitRouterMulticastDomainSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterMulticastDomainSource:TransitRouterMulticastDomainSource", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TransitRouterMulticastDomainSource(java.lang.String name, Output<java.lang.String> id, @Nullable TransitRouterMulticastDomainSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/transitRouterMulticastDomainSource:TransitRouterMulticastDomainSource", name, state, makeResourceOptions(options, id), false);
    }

    private static TransitRouterMulticastDomainSourceArgs makeArgs(TransitRouterMulticastDomainSourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TransitRouterMulticastDomainSourceArgs.Empty : args;
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
    public static TransitRouterMulticastDomainSource get(java.lang.String name, Output<java.lang.String> id, @Nullable TransitRouterMulticastDomainSourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitRouterMulticastDomainSource(name, id, state, options);
    }
}
