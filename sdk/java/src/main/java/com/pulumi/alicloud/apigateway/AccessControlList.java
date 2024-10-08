// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.apigateway.AccessControlListArgs;
import com.pulumi.alicloud.apigateway.inputs.AccessControlListState;
import com.pulumi.alicloud.apigateway.outputs.AccessControlListAclEntry;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a Api Gateway Access Control List resource. Access control list.
 * 
 * For information about Api Gateway Access Control List and how to use it, see [What is Access Control List](https://www.alibabacloud.com/help/en/api-gateway/developer-reference/api-cloudapi-2016-07-14-createaccesscontrollist).
 * 
 * &gt; **NOTE:** Available since v1.224.0.
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
 * import com.pulumi.alicloud.apigateway.Instance;
 * import com.pulumi.alicloud.apigateway.InstanceArgs;
 * import com.pulumi.alicloud.apigateway.AccessControlList;
 * import com.pulumi.alicloud.apigateway.AccessControlListArgs;
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
 *         final var name = config.get("name").orElse("terraform_example");
 *         var defaultxywS8c = new Instance("defaultxywS8c", InstanceArgs.builder()
 *             .instanceName(name)
 *             .instanceSpec("api.s1.small")
 *             .httpsPolicy("HTTPS2_TLS1_0")
 *             .zoneId("cn-hangzhou-MAZ6")
 *             .paymentType("PayAsYouGo")
 *             .build());
 * 
 *         var default_ = new AccessControlList("default", AccessControlListArgs.builder()
 *             .accessControlListName(name)
 *             .addressIpVersion("ipv4")
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
 * Api Gateway Access Control List can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:apigateway/accessControlList:AccessControlList example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:apigateway/accessControlList:AccessControlList")
public class AccessControlList extends com.pulumi.resources.CustomResource {
    /**
     * Access control list name.
     * 
     */
    @Export(name="accessControlListName", refs={String.class}, tree="[0]")
    private Output<String> accessControlListName;

    /**
     * @return Access control list name.
     * 
     */
    public Output<String> accessControlListName() {
        return this.accessControlListName;
    }
    /**
     * Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `acl_entrys` below.
     * **NOTE:** Field &#39;acl_entrys&#39; has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource &#39;alicloud_api_gateway_acl_entry_attachment&#39;.
     * 
     * @deprecated
     * Field &#39;acl_entrys&#39; has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource &#39;alicloud_api_gateway_acl_entry_attachment&#39;.
     * 
     */
    @Deprecated /* Field 'acl_entrys' has been deprecated from provider version v1.228.0, and it will be removed in the future version. Please use the new resource 'alicloud_api_gateway_acl_entry_attachment'. */
    @Export(name="aclEntrys", refs={List.class,AccessControlListAclEntry.class}, tree="[0,1]")
    private Output<List<AccessControlListAclEntry>> aclEntrys;

    /**
     * @return Information list of access control policies. You can add at most 50 IP addresses or CIDR blocks to an ACL in each call. If the IP address or CIDR block that you want to add to an ACL already exists, the IP address or CIDR block is not added. The entries that you add must be CIDR blocks. See `acl_entrys` below.
     * **NOTE:** Field &#39;acl_entrys&#39; has been deprecated from provider version 1.228.0, and it will be removed in the future version. Please use the new resource &#39;alicloud_api_gateway_acl_entry_attachment&#39;.
     * 
     */
    public Output<List<AccessControlListAclEntry>> aclEntrys() {
        return this.aclEntrys;
    }
    /**
     * The IP version. Valid values: ipv4 and ipv6.
     * 
     */
    @Export(name="addressIpVersion", refs={String.class}, tree="[0]")
    private Output<String> addressIpVersion;

    /**
     * @return The IP version. Valid values: ipv4 and ipv6.
     * 
     */
    public Output<String> addressIpVersion() {
        return this.addressIpVersion;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessControlList(java.lang.String name) {
        this(name, AccessControlListArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessControlList(java.lang.String name, AccessControlListArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessControlList(java.lang.String name, AccessControlListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apigateway/accessControlList:AccessControlList", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AccessControlList(java.lang.String name, Output<java.lang.String> id, @Nullable AccessControlListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apigateway/accessControlList:AccessControlList", name, state, makeResourceOptions(options, id), false);
    }

    private static AccessControlListArgs makeArgs(AccessControlListArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccessControlListArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "aclEntrys"
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
    public static AccessControlList get(java.lang.String name, Output<java.lang.String> id, @Nullable AccessControlListState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessControlList(name, id, state, options);
    }
}
