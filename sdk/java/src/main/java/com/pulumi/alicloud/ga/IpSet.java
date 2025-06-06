// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ga.IpSetArgs;
import com.pulumi.alicloud.ga.inputs.IpSetState;
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
 * Provides a Global Accelerator (GA) Ip Set resource.
 * 
 * For information about Global Accelerator (GA) Ip Set and how to use it, see [What is Ip Set](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createipsets).
 * 
 * &gt; **NOTE:** Available since v1.113.0.
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
 * import com.pulumi.alicloud.ga.Accelerator;
 * import com.pulumi.alicloud.ga.AcceleratorArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackage;
 * import com.pulumi.alicloud.ga.BandwidthPackageArgs;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachment;
 * import com.pulumi.alicloud.ga.BandwidthPackageAttachmentArgs;
 * import com.pulumi.alicloud.ga.IpSet;
 * import com.pulumi.alicloud.ga.IpSetArgs;
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
 *         final var region = config.get("region").orElse("cn-hangzhou");
 *         var default_ = new Accelerator("default", AcceleratorArgs.builder()
 *             .duration(1)
 *             .autoUseCoupon(true)
 *             .spec("1")
 *             .build());
 * 
 *         var defaultBandwidthPackage = new BandwidthPackage("defaultBandwidthPackage", BandwidthPackageArgs.builder()
 *             .bandwidth(100)
 *             .type("Basic")
 *             .bandwidthType("Basic")
 *             .paymentType("PayAsYouGo")
 *             .billingType("PayBy95")
 *             .ratio(30)
 *             .build());
 * 
 *         var defaultBandwidthPackageAttachment = new BandwidthPackageAttachment("defaultBandwidthPackageAttachment", BandwidthPackageAttachmentArgs.builder()
 *             .acceleratorId(default_.id())
 *             .bandwidthPackageId(defaultBandwidthPackage.id())
 *             .build());
 * 
 *         var example = new IpSet("example", IpSetArgs.builder()
 *             .accelerateRegionId(region)
 *             .bandwidth(5)
 *             .acceleratorId(defaultBandwidthPackageAttachment.acceleratorId())
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
 * Ga Ip Set can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ga/ipSet:IpSet example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ga/ipSet:IpSet")
public class IpSet extends com.pulumi.resources.CustomResource {
    /**
     * The ID of an acceleration region.
     * 
     */
    @Export(name="accelerateRegionId", refs={String.class}, tree="[0]")
    private Output<String> accelerateRegionId;

    /**
     * @return The ID of an acceleration region.
     * 
     */
    public Output<String> accelerateRegionId() {
        return this.accelerateRegionId;
    }
    /**
     * The ID of the Global Accelerator (GA) instance.
     * 
     */
    @Export(name="acceleratorId", refs={String.class}, tree="[0]")
    private Output<String> acceleratorId;

    /**
     * @return The ID of the Global Accelerator (GA) instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }
    /**
     * The bandwidth allocated to the acceleration region.
     * &gt; **NOTE:** The minimum bandwidth of each accelerated region is 2Mbps. The total bandwidth of the acceleration region should be less than or equal to the bandwidth of the basic bandwidth package you purchased.
     * 
     */
    @Export(name="bandwidth", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> bandwidth;

    /**
     * @return The bandwidth allocated to the acceleration region.
     * &gt; **NOTE:** The minimum bandwidth of each accelerated region is 2Mbps. The total bandwidth of the acceleration region should be less than or equal to the bandwidth of the basic bandwidth package you purchased.
     * 
     */
    public Output<Optional<Integer>> bandwidth() {
        return Codegen.optional(this.bandwidth);
    }
    /**
     * The list of accelerated IP addresses in the acceleration region.
     * 
     */
    @Export(name="ipAddressLists", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ipAddressLists;

    /**
     * @return The list of accelerated IP addresses in the acceleration region.
     * 
     */
    public Output<List<String>> ipAddressLists() {
        return this.ipAddressLists;
    }
    /**
     * The IP protocol used by the GA instance. Default value: `IPv4`. Valid values: `IPv4`, `IPv6`, `DUAL_STACK`. **NOTE:** From version 1.220.0, `ip_version` can be set to `DUAL_STACK`.
     * 
     */
    @Export(name="ipVersion", refs={String.class}, tree="[0]")
    private Output<String> ipVersion;

    /**
     * @return The IP protocol used by the GA instance. Default value: `IPv4`. Valid values: `IPv4`, `IPv6`, `DUAL_STACK`. **NOTE:** From version 1.220.0, `ip_version` can be set to `DUAL_STACK`.
     * 
     */
    public Output<String> ipVersion() {
        return this.ipVersion;
    }
    /**
     * The line type of the elastic IP address (EIP) in the acceleration region. Valid values: `BGP`, `BGP_PRO`.
     * 
     */
    @Export(name="ispType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ispType;

    /**
     * @return The line type of the elastic IP address (EIP) in the acceleration region. Valid values: `BGP`, `BGP_PRO`.
     * 
     */
    public Output<Optional<String>> ispType() {
        return Codegen.optional(this.ispType);
    }
    /**
     * The status of the acceleration region.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the acceleration region.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IpSet(java.lang.String name) {
        this(name, IpSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IpSet(java.lang.String name, IpSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IpSet(java.lang.String name, IpSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/ipSet:IpSet", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private IpSet(java.lang.String name, Output<java.lang.String> id, @Nullable IpSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ga/ipSet:IpSet", name, state, makeResourceOptions(options, id), false);
    }

    private static IpSetArgs makeArgs(IpSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IpSetArgs.Empty : args;
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
    public static IpSet get(java.lang.String name, Output<java.lang.String> id, @Nullable IpSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IpSet(name, id, state, options);
    }
}
