// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.resourcemanager.PolicyVersionArgs;
import com.pulumi.alicloud.resourcemanager.inputs.PolicyVersionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Resource Manager Policy Version resource.
 * For information about Resource Manager Policy Version and how to use it, see [What is Resource Manager Policy Version](https://www.alibabacloud.com/help/en/doc-detail/116817.htm).
 * 
 * &gt; **NOTE:** Available since v1.84.0.
 * 
 * &gt; **NOTE:** It is not recommended to use this resource management policy version, it is recommended to directly use the policy resource to manage your policy. Please refer to the link for usage resource_manager_policy.
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
 * import com.pulumi.alicloud.resourcemanager.Policy;
 * import com.pulumi.alicloud.resourcemanager.PolicyArgs;
 * import com.pulumi.alicloud.resourcemanager.PolicyVersion;
 * import com.pulumi.alicloud.resourcemanager.PolicyVersionArgs;
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
 *         final var name = config.get("name").orElse("tfexample");
 *         var example = new Policy("example", PolicyArgs.builder()
 *             .policyName(name)
 *             .policyDocument("""
 * 		{
 * 			"Statement": [{
 * 				"Action": ["oss:*"],
 * 				"Effect": "Allow",
 * 				"Resource": ["acs:oss:*:*:*"]
 * 			}],
 * 			"Version": "1"
 * 		}
 *             """)
 *             .build());
 * 
 *         var examplePolicyVersion = new PolicyVersion("examplePolicyVersion", PolicyVersionArgs.builder()
 *             .policyName(example.policyName())
 *             .policyDocument("""
 * 		{
 * 			"Statement": [{
 * 				"Action": ["oss:*"],
 * 				"Effect": "Allow",
 * 				"Resource": ["acs:oss:*:*:myphotos"]
 * 			}],
 * 			"Version": "1"
 * 		}
 *             """)
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
 * Resource Manager Policy Version can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:resourcemanager/policyVersion:PolicyVersion example tftest:v2
 * ```
 * 
 */
@ResourceType(type="alicloud:resourcemanager/policyVersion:PolicyVersion")
public class PolicyVersion extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to set the policy version as the default version. Default to `false`.
     * 
     * @deprecated
     * Field &#39;is_default_version&#39; has been deprecated from provider version 1.90.0
     * 
     */
    @Deprecated /* Field 'is_default_version' has been deprecated from provider version 1.90.0 */
    @Export(name="isDefaultVersion", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isDefaultVersion;

    /**
     * @return Specifies whether to set the policy version as the default version. Default to `false`.
     * 
     */
    public Output<Optional<Boolean>> isDefaultVersion() {
        return Codegen.optional(this.isDefaultVersion);
    }
    /**
     * The content of the policy. The content must be 1 to 2,048 characters in length.
     * 
     */
    @Export(name="policyDocument", refs={String.class}, tree="[0]")
    private Output<String> policyDocument;

    /**
     * @return The content of the policy. The content must be 1 to 2,048 characters in length.
     * 
     */
    public Output<String> policyDocument() {
        return this.policyDocument;
    }
    /**
     * The name of the policy. Name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
     * 
     */
    @Export(name="policyName", refs={String.class}, tree="[0]")
    private Output<String> policyName;

    /**
     * @return The name of the policy. Name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
     * 
     */
    public Output<String> policyName() {
        return this.policyName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyVersion(java.lang.String name) {
        this(name, PolicyVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyVersion(java.lang.String name, PolicyVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyVersion(java.lang.String name, PolicyVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/policyVersion:PolicyVersion", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PolicyVersion(java.lang.String name, Output<java.lang.String> id, @Nullable PolicyVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/policyVersion:PolicyVersion", name, state, makeResourceOptions(options, id), false);
    }

    private static PolicyVersionArgs makeArgs(PolicyVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PolicyVersionArgs.Empty : args;
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
    public static PolicyVersion get(java.lang.String name, Output<java.lang.String> id, @Nullable PolicyVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyVersion(name, id, state, options);
    }
}
