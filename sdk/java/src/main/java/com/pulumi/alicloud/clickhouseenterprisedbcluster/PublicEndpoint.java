// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.clickhouseenterprisedbcluster;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.clickhouseenterprisedbcluster.PublicEndpointArgs;
import com.pulumi.alicloud.clickhouseenterprisedbcluster.inputs.PublicEndpointState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Click House Enterprise Db Cluster Public Endpoint resource.
 * 
 * ClickHouse enterprise instance public network endpoint.
 * 
 * For information about Click House Enterprise Db Cluster Public Endpoint and how to use it, see [What is Enterprise Db Cluster Public Endpoint](https://next.api.alibabacloud.com/document/clickhouse/2023-05-22/CreateEndpoint).
 * 
 * &gt; **NOTE:** Available since v1.247.0.
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
 * import com.pulumi.alicloud.clickhouseenterprisedbcluster.ClickHouseEnterpriseDbCluster;
 * import com.pulumi.alicloud.clickhouseenterprisedbcluster.ClickHouseEnterpriseDbClusterArgs;
 * import com.pulumi.alicloud.clickhouseenterprisedbcluster.PublicEndpoint;
 * import com.pulumi.alicloud.clickhouseenterprisedbcluster.PublicEndpointArgs;
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
 *         final var regionId = config.get("regionId").orElse("cn-beijing");
 *         final var vswIpRangeI = config.get("vswIpRangeI").orElse("172.16.1.0/24");
 *         final var vpcIpRange = config.get("vpcIpRange").orElse("172.16.0.0/12");
 *         final var zoneIdI = config.get("zoneIdI").orElse("cn-beijing-i");
 *         var defaultktKLuM = new Network("defaultktKLuM", NetworkArgs.builder()
 *             .cidrBlock(vpcIpRange)
 *             .build());
 * 
 *         var defaultTQWN3k = new Switch("defaultTQWN3k", SwitchArgs.builder()
 *             .vpcId(defaultktKLuM.id())
 *             .zoneId(zoneIdI)
 *             .cidrBlock(vswIpRangeI)
 *             .build());
 * 
 *         var defaultaqnt22 = new ClickHouseEnterpriseDbCluster("defaultaqnt22", ClickHouseEnterpriseDbClusterArgs.builder()
 *             .zoneId(zoneIdI)
 *             .vpcId(defaultktKLuM.id())
 *             .scaleMin("8")
 *             .scaleMax("16")
 *             .vswitchId(defaultTQWN3k.id())
 *             .build());
 * 
 *         var default_ = new PublicEndpoint("default", PublicEndpointArgs.builder()
 *             .dbInstanceId(defaultaqnt22.id())
 *             .netType("Public")
 *             .connectionStringPrefix(defaultaqnt22.id())
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
 * Click House Enterprise Db Cluster Public Endpoint can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:clickhouseenterprisedbcluster/publicEndpoint:PublicEndpoint example &lt;db_instance_id&gt;:&lt;net_type&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:clickhouseenterprisedbcluster/publicEndpoint:PublicEndpoint")
public class PublicEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * The public network connection string prefix of the instance.
     * 
     */
    @Export(name="connectionStringPrefix", refs={String.class}, tree="[0]")
    private Output<String> connectionStringPrefix;

    /**
     * @return The public network connection string prefix of the instance.
     * 
     */
    public Output<String> connectionStringPrefix() {
        return this.connectionStringPrefix;
    }
    /**
     * The cluster ID.
     * 
     */
    @Export(name="dbInstanceId", refs={String.class}, tree="[0]")
    private Output<String> dbInstanceId;

    /**
     * @return The cluster ID.
     * 
     */
    public Output<String> dbInstanceId() {
        return this.dbInstanceId;
    }
    /**
     * Network type of the connection address. Valid values:
     * - Public: Public network.
     * 
     */
    @Export(name="netType", refs={String.class}, tree="[0]")
    private Output<String> netType;

    /**
     * @return Network type of the connection address. Valid values:
     * - Public: Public network.
     * 
     */
    public Output<String> netType() {
        return this.netType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublicEndpoint(java.lang.String name) {
        this(name, PublicEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublicEndpoint(java.lang.String name, PublicEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublicEndpoint(java.lang.String name, PublicEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:clickhouseenterprisedbcluster/publicEndpoint:PublicEndpoint", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PublicEndpoint(java.lang.String name, Output<java.lang.String> id, @Nullable PublicEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:clickhouseenterprisedbcluster/publicEndpoint:PublicEndpoint", name, state, makeResourceOptions(options, id), false);
    }

    private static PublicEndpointArgs makeArgs(PublicEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PublicEndpointArgs.Empty : args;
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
    public static PublicEndpoint get(java.lang.String name, Output<java.lang.String> id, @Nullable PublicEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PublicEndpoint(name, id, state, options);
    }
}
