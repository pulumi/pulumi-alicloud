// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.Ipv6EgressRuleArgs;
import com.pulumi.alicloud.vpc.inputs.Ipv6EgressRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a VPC Ipv6 Egress Rule resource.
 * 
 * For information about VPC Ipv6 Egress Rule and how to use it, see [What is Ipv6 Egress Rule](https://www.alibabacloud.com/help/doc-detail/102200.htm).
 * 
 * &gt; **NOTE:** Available in v1.142.0+.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Ipv6Gateway;
 * import com.pulumi.alicloud.vpc.Ipv6GatewayArgs;
 * import com.pulumi.alicloud.ecs.EcsFunctions;
 * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
 * import com.pulumi.alicloud.vpc.VpcFunctions;
 * import com.pulumi.alicloud.vpc.inputs.GetIpv6AddressesArgs;
 * import com.pulumi.alicloud.vpc.Ipv6EgressRule;
 * import com.pulumi.alicloud.vpc.Ipv6EgressRuleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .vpcName(&#34;example_value&#34;)
 *             .enableIpv6(&#34;true&#34;)
 *             .build());
 * 
 *         var exampleIpv6Gateway = new Ipv6Gateway(&#34;exampleIpv6Gateway&#34;, Ipv6GatewayArgs.builder()        
 *             .ipv6GatewayName(&#34;example_value&#34;)
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         final var defaultInstances = EcsFunctions.getInstances(GetInstancesArgs.builder()
 *             .nameRegex(&#34;ecs_with_ipv6_address&#34;)
 *             .status(&#34;Running&#34;)
 *             .build());
 * 
 *         final var defaultIpv6Addresses = VpcFunctions.getIpv6Addresses(GetIpv6AddressesArgs.builder()
 *             .associatedInstanceId(defaultInstances.applyValue(getInstancesResult -&gt; getInstancesResult.instances()[0].id()))
 *             .status(&#34;Available&#34;)
 *             .build());
 * 
 *         var exampleIpv6EgressRule = new Ipv6EgressRule(&#34;exampleIpv6EgressRule&#34;, Ipv6EgressRuleArgs.builder()        
 *             .instanceId(defaultIpv6Addresses.applyValue(getIpv6AddressesResult -&gt; getIpv6AddressesResult.ids()[0]))
 *             .ipv6EgressRuleName(&#34;example_value&#34;)
 *             .description(&#34;example_value&#34;)
 *             .ipv6GatewayId(exampleIpv6Gateway.id())
 *             .instanceType(&#34;Ipv6Address&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * VPC Ipv6 Egress Rule can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/ipv6EgressRule:Ipv6EgressRule example &lt;ipv6_gateway_id&gt;:&lt;ipv6_egress_rule_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/ipv6EgressRule:Ipv6EgressRule")
public class Ipv6EgressRule extends com.pulumi.resources.CustomResource {
    /**
     * The description of the egress-only rule. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the egress-only rule. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the IPv6 address to which you want to apply the egress-only rule.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The ID of the IPv6 address to which you want to apply the egress-only rule.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The type of instance to which you want to apply the egress-only rule. Valid values: `Ipv6Address`. `Ipv6Address` (default): an IPv6 address.
     * 
     */
    @Export(name="instanceType", type=String.class, parameters={})
    private Output<String> instanceType;

    /**
     * @return The type of instance to which you want to apply the egress-only rule. Valid values: `Ipv6Address`. `Ipv6Address` (default): an IPv6 address.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * The name of the egress-only rule. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="ipv6EgressRuleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipv6EgressRuleName;

    /**
     * @return The name of the egress-only rule. The name must be `2` to `128` characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> ipv6EgressRuleName() {
        return Codegen.optional(this.ipv6EgressRuleName);
    }
    /**
     * The ID of the IPv6 gateway.
     * 
     */
    @Export(name="ipv6GatewayId", type=String.class, parameters={})
    private Output<String> ipv6GatewayId;

    /**
     * @return The ID of the IPv6 gateway.
     * 
     */
    public Output<String> ipv6GatewayId() {
        return this.ipv6GatewayId;
    }
    /**
     * The status of the resource. Valid values: `Available`, `Pending` and `Deleting`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the resource. Valid values: `Available`, `Pending` and `Deleting`.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Ipv6EgressRule(String name) {
        this(name, Ipv6EgressRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Ipv6EgressRule(String name, Ipv6EgressRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Ipv6EgressRule(String name, Ipv6EgressRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/ipv6EgressRule:Ipv6EgressRule", name, args == null ? Ipv6EgressRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Ipv6EgressRule(String name, Output<String> id, @Nullable Ipv6EgressRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/ipv6EgressRule:Ipv6EgressRule", name, state, makeResourceOptions(options, id));
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
    public static Ipv6EgressRule get(String name, Output<String> id, @Nullable Ipv6EgressRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Ipv6EgressRule(name, id, state, options);
    }
}