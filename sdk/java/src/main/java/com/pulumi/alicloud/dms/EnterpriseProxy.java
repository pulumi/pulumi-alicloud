// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dms.EnterpriseProxyArgs;
import com.pulumi.alicloud.dms.inputs.EnterpriseProxyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DMS Enterprise Proxy resource.
 * 
 * For information about DMS Enterprise Proxy and how to use it, see [What is Proxy](https://next.api.alibabacloud.com/document/dms-enterprise/2018-11-01/CreateProxy).
 * 
 * &gt; **NOTE:** Available since v1.188.0.
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
 * import com.pulumi.alicloud.dms.DmsFunctions;
 * import com.pulumi.alicloud.dms.inputs.GetUserTenantsArgs;
 * import com.pulumi.alicloud.rds.RdsFunctions;
 * import com.pulumi.alicloud.rds.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.rds.inputs.GetInstanceClassesArgs;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.vpc.Switch;
 * import com.pulumi.alicloud.vpc.SwitchArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import com.pulumi.alicloud.rds.Instance;
 * import com.pulumi.alicloud.rds.InstanceArgs;
 * import com.pulumi.alicloud.rds.Account;
 * import com.pulumi.alicloud.rds.AccountArgs;
 * import com.pulumi.alicloud.dms.EnterpriseInstance;
 * import com.pulumi.alicloud.dms.EnterpriseInstanceArgs;
 * import com.pulumi.alicloud.dms.EnterpriseProxy;
 * import com.pulumi.alicloud.dms.EnterpriseProxyArgs;
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
 *         final var current = AlicloudFunctions.getAccount(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference);
 * 
 *         final var default = AlicloudFunctions.getRegions(GetRegionsArgs.builder()
 *             .current(true)
 *             .build());
 * 
 *         final var defaultGetUserTenants = DmsFunctions.getUserTenants(GetUserTenantsArgs.builder()
 *             .status("ACTIVE")
 *             .build());
 * 
 *         final var defaultGetZones = RdsFunctions.getZones(GetZonesArgs.builder()
 *             .engine("MySQL")
 *             .engineVersion("8.0")
 *             .instanceChargeType("PostPaid")
 *             .category("HighAvailability")
 *             .dbInstanceStorageType("cloud_essd")
 *             .build());
 * 
 *         final var defaultGetInstanceClasses = RdsFunctions.getInstanceClasses(GetInstanceClassesArgs.builder()
 *             .zoneId(defaultGetZones.zones()[1].id())
 *             .engine("MySQL")
 *             .engineVersion("8.0")
 *             .category("HighAvailability")
 *             .dbInstanceStorageType("cloud_essd")
 *             .instanceChargeType("PostPaid")
 *             .build());
 * 
 *         var defaultNetwork = new Network("defaultNetwork", NetworkArgs.builder()
 *             .vpcName(name)
 *             .cidrBlock("10.4.0.0/16")
 *             .build());
 * 
 *         var defaultSwitch = new Switch("defaultSwitch", SwitchArgs.builder()
 *             .vswitchName(name)
 *             .cidrBlock("10.4.0.0/24")
 *             .vpcId(defaultNetwork.id())
 *             .zoneId(defaultGetZones.zones()[1].id())
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup("defaultSecurityGroup", SecurityGroupArgs.builder()
 *             .name(name)
 *             .vpcId(defaultNetwork.id())
 *             .build());
 * 
 *         var defaultInstance = new Instance("defaultInstance", InstanceArgs.builder()
 *             .engine("MySQL")
 *             .engineVersion("8.0")
 *             .dbInstanceStorageType("cloud_essd")
 *             .instanceType(defaultGetInstanceClasses.instanceClasses()[0].instanceClass())
 *             .instanceStorage(defaultGetInstanceClasses.instanceClasses()[0].storageRange().min())
 *             .vswitchId(defaultSwitch.id())
 *             .instanceName(name)
 *             .securityIps(            
 *                 "100.104.5.0/24",
 *                 "192.168.0.6")
 *             .tags(Map.ofEntries(
 *                 Map.entry("Created", "TF"),
 *                 Map.entry("For", "example")
 *             ))
 *             .build());
 * 
 *         var defaultAccount = new Account("defaultAccount", AccountArgs.builder()
 *             .dbInstanceId(defaultInstance.id())
 *             .accountName("tfexamplename")
 *             .accountPassword("Example12345")
 *             .accountType("Normal")
 *             .build());
 * 
 *         var defaultEnterpriseInstance = new EnterpriseInstance("defaultEnterpriseInstance", EnterpriseInstanceArgs.builder()
 *             .tid(defaultGetUserTenants.ids()[0])
 *             .instanceType("mysql")
 *             .instanceSource("RDS")
 *             .networkType("VPC")
 *             .envType("dev")
 *             .host(defaultInstance.connectionString())
 *             .port(3306)
 *             .databaseUser(defaultAccount.accountName())
 *             .databasePassword(defaultAccount.accountPassword())
 *             .instanceName(name)
 *             .dbaUid(current.id())
 *             .safeRule("自由操作")
 *             .queryTimeout(60)
 *             .exportTimeout(600)
 *             .ecsRegion(default_.regions()[0].id())
 *             .build());
 * 
 *         var defaultEnterpriseProxy = new EnterpriseProxy("defaultEnterpriseProxy", EnterpriseProxyArgs.builder()
 *             .instanceId(defaultEnterpriseInstance.instanceId())
 *             .password("Example12345")
 *             .username("tfexamplename")
 *             .tid(defaultGetUserTenants.ids()[0])
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
 * DMS Enterprise Proxy can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:dms/enterpriseProxy:EnterpriseProxy example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:dms/enterpriseProxy:EnterpriseProxy")
public class EnterpriseProxy extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the database instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The ID of the database instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The password of the database account.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return The password of the database account.
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * The ID of the tenant.
     * 
     */
    @Export(name="tid", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> tid;

    /**
     * @return The ID of the tenant.
     * 
     */
    public Output<Optional<String>> tid() {
        return Codegen.optional(this.tid);
    }
    /**
     * The username of the database account.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The username of the database account.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EnterpriseProxy(java.lang.String name) {
        this(name, EnterpriseProxyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EnterpriseProxy(java.lang.String name, EnterpriseProxyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EnterpriseProxy(java.lang.String name, EnterpriseProxyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dms/enterpriseProxy:EnterpriseProxy", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private EnterpriseProxy(java.lang.String name, Output<java.lang.String> id, @Nullable EnterpriseProxyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:dms/enterpriseProxy:EnterpriseProxy", name, state, makeResourceOptions(options, id), false);
    }

    private static EnterpriseProxyArgs makeArgs(EnterpriseProxyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EnterpriseProxyArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password",
                "username"
            ))
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
    public static EnterpriseProxy get(java.lang.String name, Output<java.lang.String> id, @Nullable EnterpriseProxyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EnterpriseProxy(name, id, state, options);
    }
}
