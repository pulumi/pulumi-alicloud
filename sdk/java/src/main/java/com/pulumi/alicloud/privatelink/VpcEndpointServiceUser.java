// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.privatelink.VpcEndpointServiceUserArgs;
import com.pulumi.alicloud.privatelink.inputs.VpcEndpointServiceUserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Private Link Vpc Endpoint Service User resource.
 * 
 * Endpoint service user whitelist.
 * 
 * For information about Private Link Vpc Endpoint Service User and how to use it, see [What is Vpc Endpoint Service User](https://www.alibabacloud.com/help/en/privatelink/latest/api-privatelink-2020-04-15-addusertovpcendpointservice).
 * 
 * &gt; **NOTE:** Available since v1.110.0.
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
 * import com.pulumi.alicloud.privatelink.VpcEndpointService;
 * import com.pulumi.alicloud.privatelink.VpcEndpointServiceArgs;
 * import com.pulumi.alicloud.ram.User;
 * import com.pulumi.alicloud.ram.UserArgs;
 * import com.pulumi.alicloud.privatelink.VpcEndpointServiceUser;
 * import com.pulumi.alicloud.privatelink.VpcEndpointServiceUserArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         final var config = ctx.config();
 *         final var name = config.get("name").orElse("tfexampleuser");
 *         var example = new VpcEndpointService("example", VpcEndpointServiceArgs.builder()
 *             .serviceDescription(name)
 *             .connectBandwidth(103)
 *             .autoAcceptConnection(false)
 *             .build());
 * 
 *         var exampleUser = new User("exampleUser", UserArgs.builder()
 *             .name(name)
 *             .displayName("user_display_name")
 *             .mobile("86-18688888888")
 *             .email("hello.uuu}{@literal @}{@code aaa.com")
 *             .comments("yoyoyo")
 *             .build());
 * 
 *         var exampleVpcEndpointServiceUser = new VpcEndpointServiceUser("exampleVpcEndpointServiceUser", VpcEndpointServiceUserArgs.builder()
 *             .serviceId(example.id())
 *             .userId(exampleUser.id())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Private Link Vpc Endpoint Service User can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:privatelink/vpcEndpointServiceUser:VpcEndpointServiceUser example &lt;service_id&gt;:&lt;user_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:privatelink/vpcEndpointServiceUser:VpcEndpointServiceUser")
public class VpcEndpointServiceUser extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The endpoint service ID.
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return The endpoint service ID.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }
    /**
     * The whitelist in the format of ARN.
     * 
     */
    @Export(name="userArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userArn;

    /**
     * @return The whitelist in the format of ARN.
     * 
     */
    public Output<Optional<String>> userArn() {
        return Codegen.optional(this.userArn);
    }
    /**
     * The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The ID of the Alibaba Cloud account in the whitelist of the endpoint service.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpointServiceUser(java.lang.String name) {
        this(name, VpcEndpointServiceUserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointServiceUser(java.lang.String name, VpcEndpointServiceUserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointServiceUser(java.lang.String name, VpcEndpointServiceUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:privatelink/vpcEndpointServiceUser:VpcEndpointServiceUser", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private VpcEndpointServiceUser(java.lang.String name, Output<java.lang.String> id, @Nullable VpcEndpointServiceUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:privatelink/vpcEndpointServiceUser:VpcEndpointServiceUser", name, state, makeResourceOptions(options, id), false);
    }

    private static VpcEndpointServiceUserArgs makeArgs(VpcEndpointServiceUserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? VpcEndpointServiceUserArgs.Empty : args;
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
    public static VpcEndpointServiceUser get(java.lang.String name, Output<java.lang.String> id, @Nullable VpcEndpointServiceUserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointServiceUser(name, id, state, options);
    }
}
