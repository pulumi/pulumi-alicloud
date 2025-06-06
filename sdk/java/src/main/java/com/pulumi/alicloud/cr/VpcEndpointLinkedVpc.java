// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cr.VpcEndpointLinkedVpcArgs;
import com.pulumi.alicloud.cr.inputs.VpcEndpointLinkedVpcState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CR Vpc Endpoint Linked Vpc resource.
 * 
 * For information about CR Vpc Endpoint Linked Vpc and how to use it, see [What is Vpc Endpoint Linked Vpc](https://www.alibabacloud.com/help/en/acr/developer-reference/api-cr-2018-12-01-createinstancevpcendpointlinkedvpc).
 * 
 * &gt; **NOTE:** Available since v1.199.0.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.cr.RegistryEnterpriseInstance;
 * import com.pulumi.alicloud.cr.RegistryEnterpriseInstanceArgs;
 * import com.pulumi.alicloud.cr.VpcEndpointLinkedVpc;
 * import com.pulumi.alicloud.cr.VpcEndpointLinkedVpcArgs;
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
 *         final var config = ctx.config();
 *         final var name = config.get("name").orElse("tf-example");
 *         var defaultInteger = new Integer("defaultInteger", IntegerArgs.builder()
 *             .min(100000)
 *             .max(999999)
 *             .build());
 * 
 *         final var default = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation("VSwitch")
 *             .build());
 * 
 *         var defaultNetwork = new Network("defaultNetwork", NetworkArgs.builder()
 *             .vpcName(String.format("%s-%s", name,defaultInteger.result()))
 *             .cidrBlock("10.4.0.0/16")
 *             .build());
 * 
 *         var defaultSwitch = new Switch("defaultSwitch", SwitchArgs.builder()
 *             .vswitchName(String.format("%s-%s", name,defaultInteger.result()))
 *             .cidrBlock("10.4.0.0/24")
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(default_.zones()[0].id())
 *             .build());
 * 
 *         var defaultRegistryEnterpriseInstance = new RegistryEnterpriseInstance("defaultRegistryEnterpriseInstance", RegistryEnterpriseInstanceArgs.builder()
 *             .paymentType("Subscription")
 *             .period(1)
 *             .renewPeriod(0)
 *             .renewalStatus("ManualRenewal")
 *             .instanceType("Advanced")
 *             .instanceName(String.format("%s-%s", name,defaultInteger.result()))
 *             .build());
 * 
 *         var defaultVpcEndpointLinkedVpc = new VpcEndpointLinkedVpc("defaultVpcEndpointLinkedVpc", VpcEndpointLinkedVpcArgs.builder()
 *             .instanceId(defaultRegistryEnterpriseInstance.id())
 *             .vpcId(defaultNetwork.id())
 *             .vswitchId(defaultSwitch.id())
 *             .moduleName("Registry")
 *             .enableCreateDnsRecordInPvzt(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * CR Vpc Endpoint Linked Vpc can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cr/vpcEndpointLinkedVpc:VpcEndpointLinkedVpc example &lt;instance_id&gt;:&lt;vpc_id&gt;:&lt;vswitch_id&gt;:&lt;module_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cr/vpcEndpointLinkedVpc:VpcEndpointLinkedVpc")
public class VpcEndpointLinkedVpc extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to automatically create an Alibaba Cloud DNS PrivateZone record. Valid Values:
     * 
     */
    @Export(name="enableCreateDnsRecordInPvzt", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableCreateDnsRecordInPvzt;

    /**
     * @return Specifies whether to automatically create an Alibaba Cloud DNS PrivateZone record. Valid Values:
     * 
     */
    public Output<Optional<Boolean>> enableCreateDnsRecordInPvzt() {
        return Codegen.optional(this.enableCreateDnsRecordInPvzt);
    }
    /**
     * The ID of the instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The name of the module that you want to access. Valid Values:
     * - `Registry`: the image repository.
     * - `Chart`: a Helm chart.
     * 
     */
    @Export(name="moduleName", refs={String.class}, tree="[0]")
    private Output<String> moduleName;

    /**
     * @return The name of the module that you want to access. Valid Values:
     * - `Registry`: the image repository.
     * - `Chart`: a Helm chart.
     * 
     */
    public Output<String> moduleName() {
        return this.moduleName;
    }
    /**
     * The status of the Vpc Endpoint Linked Vpc.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the Vpc Endpoint Linked Vpc.
     * 
     */
    public Output<String> status() {
        return this.status;
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
     * The ID of the vSwitch.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return The ID of the vSwitch.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpointLinkedVpc(java.lang.String name) {
        this(name, VpcEndpointLinkedVpcArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointLinkedVpc(java.lang.String name, VpcEndpointLinkedVpcArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointLinkedVpc(java.lang.String name, VpcEndpointLinkedVpcArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cr/vpcEndpointLinkedVpc:VpcEndpointLinkedVpc", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private VpcEndpointLinkedVpc(java.lang.String name, Output<java.lang.String> id, @Nullable VpcEndpointLinkedVpcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cr/vpcEndpointLinkedVpc:VpcEndpointLinkedVpc", name, state, makeResourceOptions(options, id), false);
    }

    private static VpcEndpointLinkedVpcArgs makeArgs(VpcEndpointLinkedVpcArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VpcEndpointLinkedVpcArgs.Empty : args;
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
    public static VpcEndpointLinkedVpc get(java.lang.String name, Output<java.lang.String> id, @Nullable VpcEndpointLinkedVpcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointLinkedVpc(name, id, state, options);
    }
}
