// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cen.PrivateZoneArgs;
import com.pulumi.alicloud.cen.inputs.PrivateZoneState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This topic describes how to configure PrivateZone access.
 * PrivateZone is a VPC-based resolution and management service for private domain names.
 * After you set a PrivateZone access, the Cloud Connect Network (CCN) and Virtual Border Router (VBR) attached to a CEN instance can access the PrivateZone service through CEN.
 * 
 * For information about CEN Private Zone and how to use it, see [Manage CEN Private Zone](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/api-cbn-2017-09-12-routeprivatezoneincentovpc).
 * 
 * &gt; **NOTE:** Available since v1.83.0.
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
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.inputs.GetRegionsArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.cen.Instance;
 * import com.pulumi.alicloud.cen.InstanceArgs;
 * import com.pulumi.alicloud.cen.InstanceAttachment;
 * import com.pulumi.alicloud.cen.InstanceAttachmentArgs;
 * import com.pulumi.alicloud.cen.PrivateZone;
 * import com.pulumi.alicloud.cen.PrivateZoneArgs;
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
 *         final var default = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         var example = new Network("example", NetworkArgs.builder()
 *             .vpcName("tf_example")
 *             .cidrBlock("172.17.3.0/24")
 *             .build());
 * 
 *         var exampleInstance = new Instance("exampleInstance", InstanceArgs.builder()
 *             .cenInstanceName("tf_example")
 *             .description("an example for cen")
 *             .build());
 * 
 *         var exampleInstanceAttachment = new InstanceAttachment("exampleInstanceAttachment", InstanceAttachmentArgs.builder()
 *             .instanceId(exampleInstance.id())
 *             .childInstanceId(example.id())
 *             .childInstanceType("VPC")
 *             .childInstanceRegionId(default_.regions()[0].id())
 *             .build());
 * 
 *         var defaultPrivateZone = new PrivateZone("defaultPrivateZone", PrivateZoneArgs.builder()
 *             .accessRegionId(default_.regions()[0].id())
 *             .cenId(exampleInstanceAttachment.instanceId())
 *             .hostRegionId(default_.regions()[0].id())
 *             .hostVpcId(example.id())
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
 * CEN Private Zone can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cen/privateZone:PrivateZone example cen-abc123456:cn-hangzhou
 * ```
 * 
 */
@ResourceType(type="alicloud:cen/privateZone:PrivateZone")
public class PrivateZone extends com.pulumi.resources.CustomResource {
    /**
     * The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     * 
     */
    @Export(name="accessRegionId", refs={String.class}, tree="[0]")
    private Output<String> accessRegionId;

    /**
     * @return The access region. The access region is the region of the cloud resource that accesses the PrivateZone service through CEN.
     * 
     */
    public Output<String> accessRegionId() {
        return this.accessRegionId;
    }
    /**
     * The ID of the CEN instance.
     * 
     */
    @Export(name="cenId", refs={String.class}, tree="[0]")
    private Output<String> cenId;

    /**
     * @return The ID of the CEN instance.
     * 
     */
    public Output<String> cenId() {
        return this.cenId;
    }
    /**
     * The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
     * 
     */
    @Export(name="hostRegionId", refs={String.class}, tree="[0]")
    private Output<String> hostRegionId;

    /**
     * @return The service region. The service region is the target region of the PrivateZone service to be accessed through CEN.
     * 
     */
    public Output<String> hostRegionId() {
        return this.hostRegionId;
    }
    /**
     * The VPC that belongs to the service region.
     * 
     * -&gt;**NOTE:** The &#34;alicloud.cen.PrivateZone&#34; resource depends on the related &#34;alicloud.cen.InstanceAttachment&#34; resource.
     * 
     */
    @Export(name="hostVpcId", refs={String.class}, tree="[0]")
    private Output<String> hostVpcId;

    /**
     * @return The VPC that belongs to the service region.
     * 
     * -&gt;**NOTE:** The &#34;alicloud.cen.PrivateZone&#34; resource depends on the related &#34;alicloud.cen.InstanceAttachment&#34; resource.
     * 
     */
    public Output<String> hostVpcId() {
        return this.hostVpcId;
    }
    /**
     * The status of the PrivateZone service. Valid values: [&#34;Creating&#34;, &#34;Active&#34;, &#34;Deleting&#34;].
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the PrivateZone service. Valid values: [&#34;Creating&#34;, &#34;Active&#34;, &#34;Deleting&#34;].
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateZone(java.lang.String name) {
        this(name, PrivateZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateZone(java.lang.String name, PrivateZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateZone(java.lang.String name, PrivateZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/privateZone:PrivateZone", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PrivateZone(java.lang.String name, Output<java.lang.String> id, @Nullable PrivateZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cen/privateZone:PrivateZone", name, state, makeResourceOptions(options, id), false);
    }

    private static PrivateZoneArgs makeArgs(PrivateZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PrivateZoneArgs.Empty : args;
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
    public static PrivateZone get(java.lang.String name, Output<java.lang.String> id, @Nullable PrivateZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateZone(name, id, state, options);
    }
}
