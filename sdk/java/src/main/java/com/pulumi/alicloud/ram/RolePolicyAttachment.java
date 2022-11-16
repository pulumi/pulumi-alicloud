// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.RolePolicyAttachmentArgs;
import com.pulumi.alicloud.ram.inputs.RolePolicyAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a RAM Role attachment resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ram.Role;
 * import com.pulumi.alicloud.ram.RoleArgs;
 * import com.pulumi.alicloud.ram.Policy;
 * import com.pulumi.alicloud.ram.PolicyArgs;
 * import com.pulumi.alicloud.ram.RolePolicyAttachment;
 * import com.pulumi.alicloud.ram.RolePolicyAttachmentArgs;
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
 *         var role = new Role(&#34;role&#34;, RoleArgs.builder()        
 *             .document(&#34;&#34;&#34;
 *     {
 *       &#34;Statement&#34;: [
 *         {
 *           &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *           &#34;Effect&#34;: &#34;Allow&#34;,
 *           &#34;Principal&#34;: {
 *             &#34;Service&#34;: [
 *               &#34;apigateway.aliyuncs.com&#34;, 
 *               &#34;ecs.aliyuncs.com&#34;
 *             ]
 *           }
 *         }
 *       ],
 *       &#34;Version&#34;: &#34;1&#34;
 *     }
 *             &#34;&#34;&#34;)
 *             .description(&#34;this is a role test.&#34;)
 *             .force(true)
 *             .build());
 * 
 *         var policy = new Policy(&#34;policy&#34;, PolicyArgs.builder()        
 *             .document(&#34;&#34;&#34;
 *   {
 *     &#34;Statement&#34;: [
 *       {
 *         &#34;Action&#34;: [
 *           &#34;oss:ListObjects&#34;,
 *           &#34;oss:GetObject&#34;
 *         ],
 *         &#34;Effect&#34;: &#34;Allow&#34;,
 *         &#34;Resource&#34;: [
 *           &#34;acs:oss:*:*:mybucket&#34;,
 *           &#34;acs:oss:*:*:mybucket/*&#34;
 *         ]
 *       }
 *     ],
 *       &#34;Version&#34;: &#34;1&#34;
 *   }
 *             &#34;&#34;&#34;)
 *             .description(&#34;this is a policy test&#34;)
 *             .force(true)
 *             .build());
 * 
 *         var attach = new RolePolicyAttachment(&#34;attach&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyName(policy.name())
 *             .policyType(policy.type())
 *             .roleName(role.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * RAM Role Policy attachment can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:ram/rolePolicyAttachment:RolePolicyAttachment example role:my-policy:Custom:my-role
 * ```
 * 
 */
@ResourceType(type="alicloud:ram/rolePolicyAttachment:RolePolicyAttachment")
public class RolePolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    /**
     * @return Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }
    /**
     * Type of the RAM policy. It must be `Custom` or `System`.
     * 
     */
    @Export(name="policyType", type=String.class, parameters={})
    private Output<String> policyType;

    /**
     * @return Type of the RAM policy. It must be `Custom` or `System`.
     * 
     */
    public Output<String> policyType() {
        return this.policyType;
    }
    /**
     * Name of the RAM Role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="roleName", type=String.class, parameters={})
    private Output<String> roleName;

    /**
     * @return Name of the RAM Role. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;, &#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RolePolicyAttachment(String name) {
        this(name, RolePolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RolePolicyAttachment(String name, RolePolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RolePolicyAttachment(String name, RolePolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/rolePolicyAttachment:RolePolicyAttachment", name, args == null ? RolePolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RolePolicyAttachment(String name, Output<String> id, @Nullable RolePolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/rolePolicyAttachment:RolePolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static RolePolicyAttachment get(String name, Output<String> id, @Nullable RolePolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RolePolicyAttachment(name, id, state, options);
    }
}