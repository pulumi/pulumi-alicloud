// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.mongodb.PrivateSrvNetworkAddressArgs;
import com.pulumi.alicloud.mongodb.inputs.PrivateSrvNetworkAddressState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Mongo D B Private Srv Network Address resource.
 * 
 * Private network SRV highly available link address.
 * 
 * For information about Mongo D B Private Srv Network Address and how to use it, see [What is Private Srv Network Address](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.240.0.
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
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.mongodb.Instance;
 * import com.pulumi.alicloud.mongodb.InstanceArgs;
 * import com.pulumi.alicloud.mongodb.PrivateSrvNetworkAddress;
 * import com.pulumi.alicloud.mongodb.PrivateSrvNetworkAddressArgs;
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
 *         final var zoneId = config.get("zoneId").orElse("cn-shanghai-b");
 *         final var regionId = config.get("regionId").orElse("cn-shanghai");
 *         var defaultie35CW = new Network("defaultie35CW", NetworkArgs.builder()
 *             .cidrBlock("10.0.0.0/8")
 *             .vpcName(name)
 *             .build());
 * 
 *         var defaultg0DCAR = new Switch("defaultg0DCAR", SwitchArgs.builder()
 *             .vpcId(defaultie35CW.id())
 *             .zoneId(zoneId)
 *             .cidrBlock("10.0.0.0/24")
 *             .build());
 * 
 *         var defaultHrZmxC = new Instance("defaultHrZmxC", InstanceArgs.builder()
 *             .engineVersion("4.4")
 *             .storageType("cloud_essd1")
 *             .vswitchId(defaultg0DCAR.id())
 *             .dbInstanceStorage(20)
 *             .vpcId(defaultie35CW.id())
 *             .dbInstanceClass("mdb.shard.4x.large.d")
 *             .storageEngine("WiredTiger")
 *             .networkType("VPC")
 *             .zoneId(zoneId)
 *             .build());
 * 
 *         var default_ = new PrivateSrvNetworkAddress("default", PrivateSrvNetworkAddressArgs.builder()
 *             .dbInstanceId(defaultHrZmxC.id())
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
 * Mongo D B Private Srv Network Address can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:mongodb/privateSrvNetworkAddress:PrivateSrvNetworkAddress example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:mongodb/privateSrvNetworkAddress:PrivateSrvNetworkAddress")
public class PrivateSrvNetworkAddress extends com.pulumi.resources.CustomResource {
    /**
     * The instance ID.
     * 
     */
    @Export(name="dbInstanceId", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceId;

    /**
     * @return The instance ID.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * Private network SRV highly available connection address
     * 
     */
    @Export(name="privateSrvConnectionStringUri", refs={String.class}, tree="[0]")
    private Output<String> privateSrvConnectionStringUri;

    /**
     * @return Private network SRV highly available connection address
     * 
     */
    public Output<String> privateSrvConnectionStringUri() {
        return this.privateSrvConnectionStringUri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PrivateSrvNetworkAddress(java.lang.String name) {
        this(name, PrivateSrvNetworkAddressArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PrivateSrvNetworkAddress(java.lang.String name, PrivateSrvNetworkAddressArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateSrvNetworkAddress(java.lang.String name, PrivateSrvNetworkAddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mongodb/privateSrvNetworkAddress:PrivateSrvNetworkAddress", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PrivateSrvNetworkAddress(java.lang.String name, Output<java.lang.String> id, @Nullable PrivateSrvNetworkAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:mongodb/privateSrvNetworkAddress:PrivateSrvNetworkAddress", name, state, makeResourceOptions(options, id), false);
    }

    private static PrivateSrvNetworkAddressArgs makeArgs(PrivateSrvNetworkAddressArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PrivateSrvNetworkAddressArgs.Empty : args;
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
    public static PrivateSrvNetworkAddress get(java.lang.String name, Output<java.lang.String> id, @Nullable PrivateSrvNetworkAddressState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PrivateSrvNetworkAddress(name, id, state, options);
    }
}
