// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.gpdb.ConnectionArgs;
import com.pulumi.alicloud.gpdb.inputs.ConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a connection resource to allocate an Internet connection string for instance.
 * 
 * &gt; **NOTE:** Available since v1.48.0.
 * 
 * &gt; **NOTE:** Each instance will allocate a intranet connection string automatically and its prefix is instance ID.
 *  To avoid unnecessary conflict, please specified a internet connection prefix before applying the resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.resourcemanager.ResourcemanagerFunctions;
 * import com.pulumi.alicloud.resourcemanager.inputs.GetResourceGroupsArgs;
 * import com.pulumi.alicloud.gpdb.GpdbFunctions;
 * import com.pulumi.alicloud.gpdb.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.VpcFunctions;
 * import com.pulumi.alicloud.vpc.inputs.GetNetworksArgs;
 * import com.pulumi.alicloud.vpc.inputs.GetSwitchesArgs;
 * import com.pulumi.alicloud.gpdb.Instance;
 * import com.pulumi.alicloud.gpdb.InstanceArgs;
 * import com.pulumi.alicloud.gpdb.inputs.InstanceIpWhitelistArgs;
 * import com.pulumi.alicloud.gpdb.Connection;
 * import com.pulumi.alicloud.gpdb.ConnectionArgs;
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
 *         final var default = ResourcemanagerFunctions.getResourceGroups(GetResourceGroupsArgs.builder()
 *             .build());
 * 
 *         final var defaultGetZones = GpdbFunctions.getZones(GetZonesArgs.builder()
 *             .build());
 * 
 *         final var defaultGetNetworks = VpcFunctions.getNetworks(GetNetworksArgs.builder()
 *             .nameRegex("^default-NODELETING$")
 *             .build());
 * 
 *         final var defaultGetSwitches = VpcFunctions.getSwitches(GetSwitchesArgs.builder()
 *             .vpcId(defaultGetNetworks.ids()[0])
 *             .zoneId(defaultGetZones.ids()[0])
 *             .build());
 * 
 *         var defaultInstance = new Instance("defaultInstance", InstanceArgs.builder()
 *             .dbInstanceCategory("HighAvailability")
 *             .dbInstanceClass("gpdb.group.segsdx1")
 *             .dbInstanceMode("StorageElastic")
 *             .description(name)
 *             .engine("gpdb")
 *             .engineVersion("6.0")
 *             .zoneId(defaultGetZones.ids()[0])
 *             .instanceNetworkType("VPC")
 *             .instanceSpec("2C16G")
 *             .paymentType("PayAsYouGo")
 *             .segStorageType("cloud_essd")
 *             .segNodeNum(4)
 *             .storageSize(50)
 *             .vpcId(defaultGetNetworks.ids()[0])
 *             .vswitchId(defaultGetSwitches.ids()[0])
 *             .ipWhitelists(InstanceIpWhitelistArgs.builder()
 *                 .securityIpList("127.0.0.1")
 *                 .build())
 *             .build());
 * 
 *         var defaultConnection = new Connection("defaultConnection", ConnectionArgs.builder()
 *             .instanceId(defaultInstance.id())
 *             .connectionPrefix("exampelcon")
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
 * AnalyticDB for PostgreSQL&#39;s connection can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:gpdb/connection:Connection example abc12345678
 * ```
 * 
 */
@ResourceType(type="alicloud:gpdb/connection:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to &lt;instance_id&gt; + &#39;-tf&#39;.
     * 
     */
    @Export(name="connectionPrefix", refs={String.class}, tree="[0]")
    private Output<String> connectionPrefix;

    /**
     * @return Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to &lt;instance_id&gt; + &#39;-tf&#39;.
     * 
     */
    public Output<String> connectionPrefix() {
        return this.connectionPrefix;
    }
    /**
     * Connection instance string.
     * 
     */
    @Export(name="connectionString", refs={String.class}, tree="[0]")
    private Output<String> connectionString;

    /**
     * @return Connection instance string.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * The Id of instance that can run database.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The Id of instance that can run database.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The ip address of connection string.
     * 
     */
    @Export(name="ipAddress", refs={String.class}, tree="[0]")
    private Output<String> ipAddress;

    /**
     * @return The ip address of connection string.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }
    /**
     * Internet connection port. Valid value: [3200-3999]. Default to 3306.
     * 
     */
    @Export(name="port", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> port;

    /**
     * @return Internet connection port. Valid value: [3200-3999]. Default to 3306.
     * 
     */
    public Output<Optional<String>> port() {
        return Codegen.optional(this.port);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(java.lang.String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(java.lang.String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(java.lang.String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/connection:Connection", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Connection(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gpdb/connection:Connection", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectionArgs makeArgs(ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectionArgs.Empty : args;
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
    public static Connection get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
