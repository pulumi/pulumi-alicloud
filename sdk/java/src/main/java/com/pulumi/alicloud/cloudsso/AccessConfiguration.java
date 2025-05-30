// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cloudsso.AccessConfigurationArgs;
import com.pulumi.alicloud.cloudsso.inputs.AccessConfigurationState;
import com.pulumi.alicloud.cloudsso.outputs.AccessConfigurationPermissionPolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Cloud SSO Access Configuration resource.
 * 
 * For information about Cloud SSO Access Configuration and how to use it, see [What is Access Configuration](https://www.alibabacloud.com/help/en/cloudsso/latest/api-cloudsso-2021-05-15-createaccessconfiguration).
 * 
 * &gt; **NOTE:** Available since v1.145.0.
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
 * import com.pulumi.alicloud.cloudsso.CloudssoFunctions;
 * import com.pulumi.alicloud.cloudsso.inputs.GetDirectoriesArgs;
 * import com.pulumi.alicloud.cloudsso.AccessConfiguration;
 * import com.pulumi.alicloud.cloudsso.AccessConfigurationArgs;
 * import com.pulumi.alicloud.cloudsso.inputs.AccessConfigurationPermissionPolicyArgs;
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
 *         final var default = CloudssoFunctions.getDirectories(GetDirectoriesArgs.builder()
 *             .build());
 * 
 *         var defaultAccessConfiguration = new AccessConfiguration("defaultAccessConfiguration", AccessConfigurationArgs.builder()
 *             .directoryId(default_.directories()[0].id())
 *             .accessConfigurationName(name)
 *             .permissionPolicies(AccessConfigurationPermissionPolicyArgs.builder()
 *                 .permissionPolicyType("Inline")
 *                 .permissionPolicyName(name)
 *                 .permissionPolicyDocument("""
 *     {
 *         "Statement":[
 *       {
 *         "Action":"ecs:Get*",
 *         "Effect":"Allow",
 *         "Resource":[
 *             "*"
 *         ]
 *       }
 *       ],
 *         "Version": "1"
 *     }
 *                 """)
 *                 .build())
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
 * Cloud SSO Access Configuration can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:cloudsso/accessConfiguration:AccessConfiguration example &lt;directory_id&gt;:&lt;access_configuration_id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:cloudsso/accessConfiguration:AccessConfiguration")
public class AccessConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Access Configuration.
     * 
     */
    @Export(name="accessConfigurationId", refs={String.class}, tree="[0]")
    private Output<String> accessConfigurationId;

    /**
     * @return The ID of the Access Configuration.
     * 
     */
    public Output<String> accessConfigurationId() {
        return this.accessConfigurationId;
    }
    /**
     * The name of the access configuration. The name can be up to `32` characters long and can contain letters, digits, and hyphens (-).
     * 
     */
    @Export(name="accessConfigurationName", refs={String.class}, tree="[0]")
    private Output<String> accessConfigurationName;

    /**
     * @return The name of the access configuration. The name can be up to `32` characters long and can contain letters, digits, and hyphens (-).
     * 
     */
    public Output<String> accessConfigurationName() {
        return this.accessConfigurationName;
    }
    /**
     * The description of the access configuration. The description can be up to `1024` characters in length.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the access configuration. The description can be up to `1024` characters in length.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the Directory.
     * 
     */
    @Export(name="directoryId", refs={String.class}, tree="[0]")
    private Output<String> directoryId;

    /**
     * @return The ID of the Directory.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }
    /**
     * This parameter is used to force deletion `permission_policies`. Valid Value: `true`, `false`.
     * 
     * * **NOTE:** The `permission_policies` will be removed automatically when the resource is deleted, please operate with caution. If there are left more permission policies in the access configuration, please remove them before deleting the access configuration.
     * 
     */
    @Export(name="forceRemovePermissionPolicies", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceRemovePermissionPolicies;

    /**
     * @return This parameter is used to force deletion `permission_policies`. Valid Value: `true`, `false`.
     * 
     * * **NOTE:** The `permission_policies` will be removed automatically when the resource is deleted, please operate with caution. If there are left more permission policies in the access configuration, please remove them before deleting the access configuration.
     * 
     */
    public Output<Optional<Boolean>> forceRemovePermissionPolicies() {
        return Codegen.optional(this.forceRemovePermissionPolicies);
    }
    /**
     * The Policy List. See `permission_policies` below.
     * 
     */
    @Export(name="permissionPolicies", refs={List.class,AccessConfigurationPermissionPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccessConfigurationPermissionPolicy>> permissionPolicies;

    /**
     * @return The Policy List. See `permission_policies` below.
     * 
     */
    public Output<Optional<List<AccessConfigurationPermissionPolicy>>> permissionPolicies() {
        return Codegen.optional(this.permissionPolicies);
    }
    /**
     * The RelayState of the Access Configuration, Cloud SSO users use this access configuration to access the RD account, the initial access page address. Must be the Alibaba Cloud console page, the default is the console home page.
     * 
     */
    @Export(name="relayState", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> relayState;

    /**
     * @return The RelayState of the Access Configuration, Cloud SSO users use this access configuration to access the RD account, the initial access page address. Must be the Alibaba Cloud console page, the default is the console home page.
     * 
     */
    public Output<Optional<String>> relayState() {
        return Codegen.optional(this.relayState);
    }
    /**
     * The SessionDuration of the Access Configuration. Unit: Seconds. Valid values: `900` to `43200`.
     * 
     */
    @Export(name="sessionDuration", refs={Integer.class}, tree="[0]")
    private Output<Integer> sessionDuration;

    /**
     * @return The SessionDuration of the Access Configuration. Unit: Seconds. Valid values: `900` to `43200`.
     * 
     */
    public Output<Integer> sessionDuration() {
        return this.sessionDuration;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessConfiguration(java.lang.String name) {
        this(name, AccessConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessConfiguration(java.lang.String name, AccessConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessConfiguration(java.lang.String name, AccessConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudsso/accessConfiguration:AccessConfiguration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private AccessConfiguration(java.lang.String name, Output<java.lang.String> id, @Nullable AccessConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cloudsso/accessConfiguration:AccessConfiguration", name, state, makeResourceOptions(options, id), false);
    }

    private static AccessConfigurationArgs makeArgs(AccessConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AccessConfigurationArgs.Empty : args;
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
    public static AccessConfiguration get(java.lang.String name, Output<java.lang.String> id, @Nullable AccessConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessConfiguration(name, id, state, options);
    }
}
