// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ens.NatGatewayArgs;
import com.pulumi.alicloud.ens.inputs.NatGatewayState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Ens Nat Gateway resource.
 * 
 * Nat gateway of ENS.
 * 
 * For information about Ens Nat Gateway and how to use it, see [What is Nat Gateway](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.227.0.
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
 * import com.pulumi.alicloud.ens.Network;
 * import com.pulumi.alicloud.ens.NetworkArgs;
 * import com.pulumi.alicloud.ens.Vswitch;
 * import com.pulumi.alicloud.ens.VswitchArgs;
 * import com.pulumi.alicloud.ens.NatGateway;
 * import com.pulumi.alicloud.ens.NatGatewayArgs;
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
 *         final var name = config.get("name").orElse("terraform-example");
 *         final var ensRegionId = config.get("ensRegionId").orElse("cn-chenzhou-telecom_unicom_cmcc");
 *         var defaultObbrL7 = new Network("defaultObbrL7", NetworkArgs.builder()
 *             .networkName(name)
 *             .description(name)
 *             .cidrBlock("10.0.0.0/8")
 *             .ensRegionId(ensRegionId)
 *             .build());
 * 
 *         var defaulteFw783 = new Vswitch("defaulteFw783", VswitchArgs.builder()
 *             .cidrBlock("10.0.8.0/24")
 *             .vswitchName(name)
 *             .ensRegionId(defaultObbrL7.ensRegionId())
 *             .networkId(defaultObbrL7.id())
 *             .build());
 * 
 *         var default_ = new NatGateway("default", NatGatewayArgs.builder()
 *             .vswitchId(defaulteFw783.id())
 *             .ensRegionId(defaulteFw783.ensRegionId())
 *             .networkId(defaulteFw783.networkId())
 *             .instanceType("enat.default")
 *             .natName(name)
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
 * Ens Nat Gateway can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ens/natGateway:NatGateway example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ens/natGateway:NatGateway")
public class NatGateway extends com.pulumi.resources.CustomResource {
    /**
     * Creation time. UTC time, in the format of YYYY-MM-DDThh:mm:ssZ.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Creation time. UTC time, in the format of YYYY-MM-DDThh:mm:ssZ.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The ID of the ENS node.
     * 
     */
    @Export(name="ensRegionId", refs={String.class}, tree="[0]")
    private Output<String> ensRegionId;

    /**
     * @return The ID of the ENS node.
     * 
     */
    public Output<String> ensRegionId() {
        return this.ensRegionId;
    }
    /**
     * NAT specifications. Value: `enat.default`.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output<String> instanceType;

    /**
     * @return NAT specifications. Value: `enat.default`.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * The name of the NAT gateway. The length is 1 to 128 characters, but it cannot start with &#39;http:// &#39;or &#39;https.
     * 
     */
    @Export(name="natName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> natName;

    /**
     * @return The name of the NAT gateway. The length is 1 to 128 characters, but it cannot start with &#39;http:// &#39;or &#39;https.
     * 
     */
    public Output<Optional<String>> natName() {
        return Codegen.optional(this.natName);
    }
    /**
     * The network ID.
     * 
     */
    @Export(name="networkId", refs={String.class}, tree="[0]")
    private Output<String> networkId;

    /**
     * @return The network ID.
     * 
     */
    public Output<String> networkId() {
        return this.networkId;
    }
    /**
     * The vSwitch ID.
     * 
     */
    @Export(name="vswitchId", refs={String.class}, tree="[0]")
    private Output<String> vswitchId;

    /**
     * @return The vSwitch ID.
     * 
     */
    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NatGateway(String name) {
        this(name, NatGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NatGateway(String name, NatGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NatGateway(String name, NatGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ens/natGateway:NatGateway", name, args == null ? NatGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NatGateway(String name, Output<String> id, @Nullable NatGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ens/natGateway:NatGateway", name, state, makeResourceOptions(options, id));
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
    public static NatGateway get(String name, Output<String> id, @Nullable NatGatewayState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NatGateway(name, id, state, options);
    }
}