// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.servicemesh.UserPermissionArgs;
import com.pulumi.alicloud.servicemesh.inputs.UserPermissionState;
import com.pulumi.alicloud.servicemesh.outputs.UserPermissionPermission;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Service Mesh UserPermission resource.
 * 
 * For information about Service Mesh User Permission and how to use it, see [What is User Permission](https://help.aliyun.com/document_detail/171622.html).
 * 
 * &gt; **NOTE:** Available in v1.174.0+.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.servicemesh.ServicemeshFunctions;
 * import com.pulumi.alicloud.servicemesh.inputs.GetVersionsArgs;
 * import com.pulumi.alicloud.AlicloudFunctions;
 * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
 * import com.pulumi.alicloud.vpc.VpcFunctions;
 * import com.pulumi.alicloud.cloudconnect.inputs.GetNetworksArgs;
 * import com.pulumi.alicloud.vpc.inputs.GetSwitchesArgs;
 * import com.pulumi.alicloud.ram.User;
 * import com.pulumi.alicloud.servicemesh.ServiceMesh;
 * import com.pulumi.alicloud.servicemesh.ServiceMeshArgs;
 * import com.pulumi.alicloud.servicemesh.inputs.ServiceMeshNetworkArgs;
 * import com.pulumi.alicloud.servicemesh.inputs.ServiceMeshLoadBalancerArgs;
 * import com.pulumi.alicloud.servicemesh.UserPermission;
 * import com.pulumi.alicloud.servicemesh.UserPermissionArgs;
 * import com.pulumi.alicloud.servicemesh.inputs.UserPermissionPermissionArgs;
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
 *         final var name = config.get(&#34;name&#34;).orElse(&#34;servicemesh&#34;);
 *         final var defaultVersions = ServicemeshFunctions.getVersions(GetVersionsArgs.builder()
 *             .edition(&#34;Default&#34;)
 *             .build());
 * 
 *         final var defaultZones = AlicloudFunctions.getZones(GetZonesArgs.builder()
 *             .availableResourceCreation(&#34;VSwitch&#34;)
 *             .build());
 * 
 *         final var defaultNetworks = VpcFunctions.getNetworks(GetNetworksArgs.builder()
 *             .nameRegex(&#34;default-NODELETING&#34;)
 *             .build());
 * 
 *         final var defaultSwitches = VpcFunctions.getSwitches(GetSwitchesArgs.builder()
 *             .vpcId(defaultNetworks.applyValue(getNetworksResult -&gt; getNetworksResult.ids()[0]))
 *             .zoneId(defaultZones.applyValue(getZonesResult -&gt; getZonesResult.zones()[0].id()))
 *             .build());
 * 
 *         var defaultUser = new User(&#34;defaultUser&#34;);
 * 
 *         var default1 = new ServiceMesh(&#34;default1&#34;, ServiceMeshArgs.builder()        
 *             .serviceMeshName(name)
 *             .edition(&#34;Default&#34;)
 *             .version(defaultVersions.applyValue(getVersionsResult -&gt; getVersionsResult.versions()[0].version()))
 *             .clusterSpec(&#34;standard&#34;)
 *             .network(ServiceMeshNetworkArgs.builder()
 *                 .vpcId(defaultNetworks.applyValue(getNetworksResult -&gt; getNetworksResult.ids()[0]))
 *                 .vswitcheList(defaultSwitches.applyValue(getSwitchesResult -&gt; getSwitchesResult.ids()[0]))
 *                 .build())
 *             .loadBalancer(ServiceMeshLoadBalancerArgs.builder()
 *                 .pilotPublicEip(false)
 *                 .apiServerPublicEip(false)
 *                 .build())
 *             .build());
 * 
 *         var example = new UserPermission(&#34;example&#34;, UserPermissionArgs.builder()        
 *             .subAccountUserId(defaultUser.id())
 *             .permissions(UserPermissionPermissionArgs.builder()
 *                 .roleName(&#34;istio-admin&#34;)
 *                 .serviceMeshId(default1.id())
 *                 .roleType(&#34;custom&#34;)
 *                 .isCustom(true)
 *                 .isRamRole(false)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service Mesh User Permission can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:servicemesh/userPermission:UserPermission example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:servicemesh/userPermission:UserPermission")
public class UserPermission extends com.pulumi.resources.CustomResource {
    /**
     * List of permissions. **Warning:** The list requires the full amount of permission information to be passed. Adding permissions means adding items to the list, and deleting them or inputting nothing means removing items. See the following `Block permissions`.
     * 
     */
    @Export(name="permissions", type=List.class, parameters={UserPermissionPermission.class})
    private Output<List<UserPermissionPermission>> permissions;

    /**
     * @return List of permissions. **Warning:** The list requires the full amount of permission information to be passed. Adding permissions means adding items to the list, and deleting them or inputting nothing means removing items. See the following `Block permissions`.
     * 
     */
    public Output<List<UserPermissionPermission>> permissions() {
        return this.permissions;
    }
    /**
     * The configuration of the Load Balancer. See the following `Block load_balancer`.
     * 
     */
    @Export(name="subAccountUserId", type=String.class, parameters={})
    private Output<String> subAccountUserId;

    /**
     * @return The configuration of the Load Balancer. See the following `Block load_balancer`.
     * 
     */
    public Output<String> subAccountUserId() {
        return this.subAccountUserId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserPermission(String name) {
        this(name, UserPermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserPermission(String name, UserPermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserPermission(String name, UserPermissionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:servicemesh/userPermission:UserPermission", name, args == null ? UserPermissionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserPermission(String name, Output<String> id, @Nullable UserPermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:servicemesh/userPermission:UserPermission", name, state, makeResourceOptions(options, id));
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
    public static UserPermission get(String name, Output<String> id, @Nullable UserPermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserPermission(name, id, state, options);
    }
}